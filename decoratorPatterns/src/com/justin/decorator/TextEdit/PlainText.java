package com.justin.decorator.TextEdit;

public class PlainText implements TextComponent{
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }
    @Override
    public String display() {
        return text;
    }
}
