package com.bftcom.onlinelibrary.entities;

import com.bftcom.onlinelibrary.models.Book;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

/**
 * Класс сущности описывающий книгу
 */
@Entity
@Table(schema = "online_library", name="app_book")
public class EBook {

    //region Реализаия полей

    /**
     * Иденификатор
     */
    @Id
    @SequenceGenerator(name = "app_book_sequence", sequenceName = "online_library.app_book_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_book_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Имя книги
     */
    @Column(name = "name", nullable = false, length = 300)
    private String name;

    /**
     * Описание книги
     */
    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    /**
     * Объект описывающий жанр книги
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "genre_id", nullable = false)
    private EGenre genre;

    /**
     * Объект описывающий автора книги
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "author_id", nullable = false)
    private EAuthor author;

    /**
     * Объект хранящий контент книги
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_data_id", nullable = true)
    private EBigData bookData;

    /**
     * Объект хранящий обложку книги
     */
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_image_id", nullable = true)
    private EBigData bookImage;

    //endregion

    public EBook() {
    }

    public EBook(@NotNull Book book) {
        name = book.getName();
        description = book.getDescription();
        genre = book.getGenre();
        author = book.getAuthor();
        bookData = book.getBookData();
        bookImage = book.getBookImage();
    }

    //region Реализация get/set

    /**
     * Метод возвращающий значение уникального идентификатор
     * @return Значение уникального идентификатора
     */
    public Long getId() {
        return id;
    }

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

    //endregion

    public void Update(@NotNull Book book) {
        setName(book.getName());
        setDescription(book.getDescription());
        setGenre(book.getGenre());
        setAuthor(book.getAuthor());
        setBookImage(book.getBookImage());
        setBookData(book.getBookData());
    }
}
