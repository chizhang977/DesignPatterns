package com.justin.decorator.TextEdit;

public class ItalicDecorator extends TextDecorator{

    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String display() {
        return "<i>" + textComponent.display() + "</i>";
    }
}
