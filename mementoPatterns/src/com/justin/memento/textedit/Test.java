package com.justin.memento.textedit;

import java.util.ArrayList;
import java.util.List;

// 发起人
class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
    }
   // 备忘录
    public static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getText() {
            return text;
        }
    }
}

// 负责人
class Caretaker {
    private final List<TextEditor.Memento> mementoList = new ArrayList<>();

    public void addMemento(TextEditor.Memento memento) {
        mementoList.add(memento);
    }

    public TextEditor.Memento getMemento(int index) {
        return mementoList.get(index);
    }
}

// 测试
public class Test {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setText("Version 1");
        caretaker.addMemento(editor.save());

        editor.setText("Version 2");
        caretaker.addMemento(editor.save());

        editor.setText("Version 3");

        System.out.println("Current Text: " + editor.getText());
        editor.restore(caretaker.getMemento(1));
        System.out.println("Restored to: " + editor.getText());
        editor.restore(caretaker.getMemento(0));
        System.out.println("Restored to: " + editor.getText());
    }
}

