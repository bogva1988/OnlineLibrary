package com.bftcom.onlinelibrary.models;

import com.bftcom.onlinelibrary.entities.EAuthor;
import com.bftcom.onlinelibrary.entities.EBigData;
import com.bftcom.onlinelibrary.entities.EBook;
import com.bftcom.onlinelibrary.entities.EGenre;
import org.jetbrains.annotations.NotNull;

public class Book {

    //region Реализаия полей

    /**
     * Иденификатор
     */
    private Long id;

    /**
     * Имя книги
     */
    private String name;

    /**
     * Описание книги
     */
    private String description;

    /**
     * Объект описывающий жанр книги
     */
    private EGenre genre;

    /**
     * Объект описывающий автора книги
     */
    private EAuthor author;

    /**
     * Объект хранящий контент книги
     */
    private EBigData bookData;

    /**
     * Объект хранящий обложку книги
     */
    private EBigData bookImage;

    //endregion

    public Book (@NotNull EBook book) {
        id = book.getId();
        name = book.getName();
        description = book.getDescription();
        genre = book.getGenre();
        author = book.getAuthor();
        bookData = book.getBookData();
        bookImage = book.getBookImage();
    }

    //region Реализация get/set

    /**
     * Метод возвращающий имя книги
     * @return Занчение имени книги
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задающий значение имени книги
     * @param name Значение имени книги
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращающий описание книги
     * @return Занчение описания книги
     */
    public String getDescription() {
        return description;
    }

    /**
     * Метод задающий значнеие описание книги
     * @param description Значение описания книги
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Метод возвращающий жанр книги
     * @return Значнеие объекта жанр книги
     */
    public EGenre getGenre() {
        return genre;
    }

    /**
     * Метод задающий жанр книги
     * @param genre Значение объекта жанр книги
     */
    public void setGenre(EGenre genre) {
        this.genre = genre;
    }

    /**
     * Метод возвращающий контент книги
     * @return Значение объекта определяющего контент книги
     */
    public EBigData getBookData() {
        return bookData;
    }

    /**
     * Метод задающий значение контент книги
     * @param bookData Значение объекта определяющего контент книги
     */
    public void setBookData(EBigData bookData) {
        this.bookData = bookData;
    }

    /**
     * Метод возвращающий значение объекта определяющего обложку книги
     * @return Значение объекта определяющего обложку книги
     */
    public EBigData getBookImage() {
        return bookImage;
    }

    /**
     * Метод задающий значение контент обложки книги
     * @param bookImage Значение объекта определяющего контент книги
     */
    public void setBookImage(EBigData bookImage) {
        this.bookImage = bookImage;
    }

    /**
     * Метод возвращающий автора книги
     * @return Значнеие объекта автора книги
     */
    public EAuthor getAuthor() {
        return author;
    }

    /**
     * Метод задающий автора книги
     * @param author Значение объекта автора книги
     */
    public void setAuthor(EAuthor author) {
        this.author = author;
    }

    /**
     * Метод возвращающий уникальный идентификатор
     * @return Значение уникального идентификатора
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод задающий значение уникального идентификатора
     * @param id Значение уникального идентификатора
     */
    public void setId(Long id) {
        this.id = id;
    }

    //endregion
}
