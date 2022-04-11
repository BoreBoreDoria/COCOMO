package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProjectType {
    USES ("Распространённый", 2.4, 1.05, 2.5, 0.38),
    POL_USES ("Полунезависимый", 3.0, 1.12, 2.5, 0.35),
    INTEGRATE("Встроенный", 3.6, 1.20, 2.5, 0.32);

    String name;
    Double a;
    Double b;
    Double c;
    Double d;
}
