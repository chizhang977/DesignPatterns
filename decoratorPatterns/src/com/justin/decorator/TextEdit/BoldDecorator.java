package com.justin.decorator.TextEdit;

public class BoldDecorator extends TextDecorator{

    public BoldDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String display() {
        return "<b>" + textComponent.display() + "</b>";
    }
}
