package com.bftcom.onlinelibrary.entities;

import javax.persistence.*;

/**
 * Класс сущности описывающий жанр книги
 */
@Entity
@Table(schema = "online_library", name = "ref_genre")
public class EGenre {

    /**
     * Иденификатор
     */
    @Id
    @SequenceGenerator(name = "ref_genre_sequence", sequenceName = "online_library.ref_genre_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ref_genre_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Наименование жанра книги
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Метод возвращающий значение уникального идентификатор
     * @return Значение уникального идентификатора
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод возвращающий наименование жанра книги
     * @return Значение наименования жанра книги
     */
    public String getName() {
        return name;
    }
}
