package com.bftcom.onlinelibrary.services;

import com.bftcom.onlinelibrary.entities.EBook;
import com.bftcom.onlinelibrary.interfaces.repositories.IAuthorRepository;
import com.bftcom.onlinelibrary.interfaces.repositories.IBookRepository;
import com.bftcom.onlinelibrary.interfaces.repositories.IGenreRepository;
import com.bftcom.onlinelibrary.interfaces.services.IBookService;
import com.bftcom.onlinelibrary.models.Book;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements IBookService {

    private final IBookRepository bookRepository;

    public BookServiceImpl(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll().stream().map(Book::new).collect(Collectors.toList());
    }

    @Override
    public Book get(Long id) {
        EBook book = bookRepository.findById(id).get();
        return new Book(book);
    }

    @Override
    public Book add(@NotNull Book book) {
        EBook newBook = new EBook(book);
        newBook = bookRepository.saveAndFlush(newBook);
        book.setId(newBook.getId());
        return book;
    }

    @Override
    public Book update(@NotNull Book book) {
        EBook eBook = bookRepository.findById(book.getId()).get();
        eBook.Update(book);
        bookRepository.saveAndFlush(eBook);
        return book;
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBy(String stringSearch) {
        var books = bookRepository.findAllByNameContainsOrGenre_NameContainsOrAuthor_NameContainsOrAuthor_SurnameContains(stringSearch,
                stringSearch, stringSearch, stringSearch);
        return books.stream().map(Book::new).collect(Collectors.toList());
    }
}
