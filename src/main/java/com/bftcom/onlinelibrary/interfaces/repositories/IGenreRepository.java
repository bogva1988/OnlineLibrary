package com.bftcom.onlinelibrary.interfaces.repositories;

import com.bftcom.onlinelibrary.entities.EBook;
import com.bftcom.onlinelibrary.entities.EGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Интерфейс доступа к данным по книжным жанрам
 */
public interface IGenreRepository extends JpaRepository<EGenre, Long> {
}
