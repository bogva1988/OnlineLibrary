package com.bftcom.onlinelibrary.interfaces.repositories;

import com.bftcom.onlinelibrary.entities.EUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс доступа к данным по пользователям
 */
public interface IUserRepository extends JpaRepository<EUser, Long> {

    /**
     * Поиск пользователя по логину и паролю
     * @param login Логин
     * @param password Пароль
     * @return Объект пользователя
     */
    EUser findByLoginAndPassword(String login, String password);
}
