package com.example.dataanalysermicroservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // последовательность
    private Long id;

    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement; // тут будем хранить само значение, то которое прислал датчик
    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private MeasurementType measurementType; // тип самого значения

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }

}
