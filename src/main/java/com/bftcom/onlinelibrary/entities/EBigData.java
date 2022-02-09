package com.bftcom.onlinelibrary.entities;

import javax.persistence.*;

/**
 * Класс сущности описывающий хранилище для больших двоичных объектов
 */
@Entity
@Table(schema = "online_library", name="app_big_data")
public class EBigData {

    // region Реализация полей

    /**
     * Иденификатор
     */
    @Id
    @SequenceGenerator(name = "app_big_data_sequence", sequenceName = "online_library.app_big_data_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_big_data_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Значение двоичного объекта
     */
    @Lob
    @Column(name = "data", nullable = false)
    private byte[] data;

    /**
     * Значение формата
     */
    @Column(name = "format", nullable = false, length = 10)
    private String format;

    // endregion

    // region Реализация get/set

    /**
     * Метод возвращающий значение уникального идентификатор
     * @return Значение уникального идентификатора
     */
    public Long getId() {
        return id;
    }

    /**
     * Метод возвращающий большой двоичный объект
     * @return Массив байтов, представляющий двоичный объект
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Метод задающий значение большого двоичного объекта
     * @param data Значение большого двоичного объекта
     */
    public void setData(byte[] data) {
        this.data = data;
    }

    /**
     * Метод возвращающий формат большого двоичного объекта
     * @return Значение формата большого двоичного объекта
     */
    public String getFormat() {
        return format;
    }

    /**
     * Метод задающий формат большого двоичного объекта
     * @param format Значение формата большого двоичного объекта
     */
    public void setFormat(String format) {
        this.format = format;
    }

    // endregion
}
