package com.bftcom.onlinelibrary.interfaces.repositories;

import com.bftcom.onlinelibrary.entities.EAuthor;
import com.bftcom.onlinelibrary.entities.EBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Интерфейс доступа к данным по авторам
 */
public interface IAuthorRepository extends JpaRepository<EAuthor, Long> {
}
