package com.bftcom.onlinelibrary.interfaces.services;

import com.bftcom.onlinelibrary.models.Book;

import java.util.List;

/**
 * Интерфейс доступа к методам бизнес логики связанной с книгами
 */
public interface IBookService {

    /**
     * Метод возвращающий все книги
     * @return Список книг
     */
    List<Book> getAll();

    /**
     * Метод возвращающий книгу по уникальному идентификатору
     * @param id Значение уникального идентификатора
     * @return Значение объекта книги
     */
    Book get(Long id);

    /**
     * Метод добавляющий новую книгу
     * @param book Значение объекта новой книги
     * @return Значение объекта новой книги
     */
    Book add(Book book);

    /**
     * Метод обновляющий значения(данные) по книге
     * @param book Значение объекта книги с измененными полями
     * @return Значение объекта книги
     */
    Book update(Book book);

    /**
     * Метод удаляющий книгу по уникальному идентификатору
     * @param id Уникальный идентификатор
     */
    void delete(Long id);

    /**
     * Метод возвращающий список книг
     * @param name Наименование
     * @return Список книг
     */
    List<Book> getAllBy(String name);
}
