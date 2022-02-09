package com.bftcom.onlinelibrary.interfaces.services;

import com.bftcom.onlinelibrary.models.User;

/**
 * Интерфейс доступа к методам логики авторизации
 */
public interface IAuthService {

    /**
     * Метод проверяющий наличие доступа
     * @param login Логин
     * @param password Пароль
     * @return Есть доступ или нет
     */
    boolean checkAccess(String login, String password);

    /**
     * Метод добавляющий пользователя
     * @param user Объект пользователя с регистрационными данными
     * @return Возвращает объект пользователя после добавления в БД
     */
    User register (User user);
}
