package com.bftcom.onlinelibrary.interfaces.repositories;

import com.bftcom.onlinelibrary.entities.EBigData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Интерфейс доступа к большим бинарным данным
 */
public interface IBigDataRepository extends JpaRepository<EBigData, Long> {
}
