package com.bftcom.onlinelibrary.interfaces.repositories;

import com.bftcom.onlinelibrary.entities.EBook;
import com.bftcom.onlinelibrary.entities.EGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Интерфейс доступа к данным по книгам
 */
public interface IBookRepository extends JpaRepository<EBook, Long> {
    /**
     * Метод возвращающий список книг по наименованию жанра
     * @param nameBook Наименование книги
     * @param nameGenre Наименование жанра
     * @param nameAuthor Имя автора
     * @param surnameAuthor Фамилия автора
     * @return Список книг по наименованию жанра
     */
    public List<EBook> findAllByNameContainsOrGenre_NameContainsOrAuthor_NameContainsOrAuthor_SurnameContains(String nameBook,
        String nameGenre, String nameAuthor, String surnameAuthor);
}
