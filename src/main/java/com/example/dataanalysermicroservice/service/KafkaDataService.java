package com.example.dataanalysermicroservice.service;
import com.example.dataanalysermicroservice.model.Data;

         //Сервис, который обрабатывает прочитанные данные

public interface KafkaDataService {

    void handle(Data data);

}
