package com.bftcom.onlinelibrary.entities;

import com.bftcom.onlinelibrary.models.User;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

/**
 * Класс сущности описывающий пользователя
 */
@Entity
@Table(schema = "online_library", name = "ref_user")
public class EUser {

    //region Реализаия полей

    /**
     * Иденификатор
     */
    @Id
    @SequenceGenerator(name = "ref_user_sequence", sequenceName = "online_library.ref_user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ref_user_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Логин
     */
    @Column(name = "login", nullable = false, length = 150)
    private String login;

    /**
     * Пароль
     */
    @Column(name = "password", nullable = false, length = 150)
    private String password;

    /**
     * Имя пользователя
     */
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    /**
     * Фамилия пользователя
     */
    @Column(name = "surname", nullable = false, length = 150)
    private String surname;

    //endregion

    public EUser() {
    }

    public EUser(@NotNull User user) {
        login = user.getLogin();
        password = user.getPassword();
        name = user.getName();
        surname = user.getSurname();
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
     * Метод возвращающий значение фамилии пользователя
     * @return Значение фамилии пользователя
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод задающий значение фамилии пользователя
     * @param surname Значение фамилии пользователя
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Метод возвращающий значение пароля пользователя
     * @return Значение пароля пользователя
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод задающий значение пароля пользователя
     * @param password Значение пароля пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Метод возвращающий значение логина пользователя
     * @return Значение логина пользователя
     */
    public String getLogin() {
        return login;
    }

    /**
     * Метод задающий значение логина пользователя
     * @param login Значение логина пользователя
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Метод возвращающий имя пользователя
     * @return Значение имени пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод задающий значение имени пользователя
     * @param name Значение имени пользователя
     */
    public void setName(String name) {
        this.name = name;
    }

    //endregion
}
