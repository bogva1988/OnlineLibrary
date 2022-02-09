package com.bftcom.onlinelibrary.services;

import com.bftcom.onlinelibrary.entities.EUser;
import com.bftcom.onlinelibrary.interfaces.repositories.IUserRepository;
import com.bftcom.onlinelibrary.interfaces.services.IAuthService;
import com.bftcom.onlinelibrary.models.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

/**
 * Класс описывающий логику работы авторизации
 */
@Service
public class AuthServiceImpl implements IAuthService {

    /**
     * Объект доступа к данным по пользователю
     */
    private final IUserRepository userRepository;

    /**
     * Конструктор
     * @param userRepository Объект доступа к данным по пользователю
     */
    public AuthServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkAccess(String login, String password) {
        EUser user = userRepository.findByLoginAndPassword(login, password);
        return user != null;
    }

    @Override
    public User register(@NotNull User user) {
        EUser eUser = new EUser(user);
        eUser = userRepository.saveAndFlush(eUser);
        user.setId(eUser.getId());
        return user;
    }
}
