package com.justin.decorator.TextEdit;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // 创建一个原始文本对象
        TextComponent plainText = new PlainText("Hello, World!");

        // 使用装饰器给文本加粗
        TextComponent boldText = new BoldDecorator(plainText);

        // 进一步使用装饰器给文本添加斜体
        TextComponent italicAndBoldText = new ItalicDecorator(boldText);

        // 输出最终的文本效果
        System.out.println(italicAndBoldText.display()); // 输出: <i><b>Hello, World!</b></i>
    }
}
