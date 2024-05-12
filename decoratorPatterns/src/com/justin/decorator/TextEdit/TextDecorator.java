package com.justin.decorator.TextEdit;

// Decorator: 文本装饰器接口
abstract class TextDecorator implements TextComponent {
    protected TextComponent textComponent; // 在TextDecorator类中声明textComponent为成员变量

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent; // 这里将构造函数参数赋值给成员变量
    }
}
