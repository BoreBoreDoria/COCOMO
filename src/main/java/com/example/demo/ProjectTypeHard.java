package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProjectTypeHard {
    USES ("Распространённый", 3.2, 1.05, 2.5, 0.38),
    POL_USES ("Полунезависимый", 3.0, 1.12, 2.5, 0.35),
    INTEGRATE("Встроенный", 2.8, 1.20, 2.5, 0.32);

    String name;
    Double a;
    Double b;
    Double c;
    Double d;
}
