package com.bftcom.onlinelibrary.entities;

import javax.persistence.*;

/**
 * Класс сущности описывающий автора
 */
@Entity
@Table(schema = "online_library", name="ref_author")
public class EAuthor {

    //region Реализаия полей

    /**
     * Иденификатор
     */
    @Id
    @SequenceGenerator(name = "ref_author_sequence", sequenceName = "online_library.ref_author_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ref_author_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Имя автора
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Фамилия автора
     */
    @Column(name = "surname", nullable = false)
    private String surname;

    //endregion

    //region Реализация get/set

    /**
     * Метод возвращающий значение уникального идентификатор
     * @return Значение уникального идентификатора
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод возвращающий имя автора
     * @return Значение имени автора
     */
    public String getName() {
        return name;
    }

    /**
     * Метод возвращающий фамилию автора
     * @return Значение фамилии автора
     */
    public String getSurname() {
        return surname;
    }

    //endregion
}
