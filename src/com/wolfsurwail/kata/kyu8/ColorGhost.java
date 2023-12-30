package com.wolfsurwail.kata.kyu8;

import java.awt.*;

public class ColorGhost {
    private final String[] colors = {"white", "yellow", "purple", "red"};

    public ColorGhost() {
    }

    public String getColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
