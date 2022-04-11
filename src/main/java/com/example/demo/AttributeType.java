package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AttributeType {
    SECURITY_PO("Требуемая надежность ПО", 0.75,0.88,1.00,1.15,1.40,0),
    BD_VALUE("Размер БД приложения", 0,0.94,1.00,1.08,1.16,0),
    PRODUCT_LEVEL("Сложность продукта", 0.70,0.85,1.00,1.15,1.30,1.65),
    START_PROGRAM("Ограничения быстродействия при выполнении программы", 0,0,1.00,1.11,1.30,1.66),
    MEMORY("Ограничения памяти", 0,0.94,1.00,1.08,1.16,0),
    BD_VALUE("Размер БД приложения", 0,0.94,1.00,1.08,1.16,0),
    BD_VALUE("Размер БД приложения", 0,0.94,1.00,1.08,1.16,0),
    BD_VALUE("Размер БД приложения", 0,0.94,1.00,1.08,1.16,0),
    BD_VALUE("Размер БД приложения", 0,0.94,1.00,1.08,1.16,0);


    String name;
    double v1;
    double v2;
    double v3;
    double v4;
    double v5;
    double v6;
}
