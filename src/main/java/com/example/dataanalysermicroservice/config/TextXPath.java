package com.example.dataanalysermicroservice.config;

import com.jcabi.xml.XML;
import lombok.RequiredArgsConstructor;

// Класс будет помогать читать из xml'a, он обрабатывает XML файлы

@RequiredArgsConstructor
public final class TextXPath { // final - чтобы не переопределять

    private final XML xml;
    private final String node;


    // с помощью этого мы получаем список нод, который у нас есть
    // то есть список тегов внутри какой-то определенной ноды
    @Override
    public String toString() {
        return this.xml.nodes(this.node)
                .get(0)
                .xpath("text()")
                .get(0);
    }

}
