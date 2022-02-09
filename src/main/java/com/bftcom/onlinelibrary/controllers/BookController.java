package com.bftcom.onlinelibrary.controllers;

import com.bftcom.onlinelibrary.interfaces.services.IBookService;
import com.bftcom.onlinelibrary.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    private final IBookService bookService;

    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Book> GetAll() {
        return bookService.getAll();
    }

    @GetMapping("/getAllBy")
    @ResponseBody
    public List<Book> GetAllBy(@RequestParam String searchString) {
        return bookService.getAllBy(searchString);
    }

    @PostMapping("/addBook")
    @ResponseBody
    public Book add(@RequestParam Book book) {
        return bookService.add(book);
    }

    @PutMapping("/updateBook")
    @ResponseBody
    public Book update(@RequestParam Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/deleteBook")
    @ResponseBody
    public void delete(@RequestParam Long id) {
        bookService.delete(id);
    }
}
