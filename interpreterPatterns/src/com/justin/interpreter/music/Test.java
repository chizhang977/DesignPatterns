package com.justin.interpreter.music;

public class Test {

    public static void main(String[] args) {


        PlayContext context = new PlayContext();
        //音乐-上海滩
        System.out.println("音乐-上海滩：");
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

        Expression expression=null;
        //System.out.println(context.getPlayText().length());
        while (context.getPlayText().length() > 0) {
            String str = context.getPlayText().substring(0, 1);
            switch (str) {
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;

            }
            expression.interpret(context);
        }

        System.out.println();


    }
}

//演奏内容
class PlayContext {
    private String playText;
    public String getPlayText(){
        return this.playText;
    }
    public void setPlayText(String value){
        this.playText = value;
    }
}

//抽象表达式类

/**
 * 该代码定义了一个抽象类Expression，其中有一个interpret方法和一个抽象方法excute。
 * interpret方法用于解释执行一段文本。
 * 它首先检查PlayContext对象中的playText是否为空，如果为空则直接返回。
 * 否则，它会从playText中取得第一个字符作为playKey，并将playText截取为从第二个字符开始的子字符串。
 * 然后，它从截取后的playText中取得第一个空格前的子字符串，并将其转换为double类型的playValue。
 * 最后，它调用excute方法，将playKey和playValue作为参数传递给子类进行具体的执行处理。
 * excute方法是一个抽象方法，用于在具体文法子类中实现对playKey和playValue的处理逻辑。
 * 根据不同的playKey和playValue，子类可以执行不同的操作。
 */
abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getPlayText().length() == 0) {
            return;
        }
        else {
            String playKey = context.getPlayText().substring(0, 1);

            context.setPlayText(context.getPlayText().substring(2));

            double playValue = Double.parseDouble(context.getPlayText().substring(0,context.getPlayText().indexOf(" ")));
            context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));

            this.excute(playKey, playValue);
        }
    }
    //抽象方法“执行”，不同的文法子类，有不同的执行处理
    public abstract void excute(String key, double value);
}

//音符类
class Note extends Expression {
    public void excute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(note+" ");
    }
}

//音阶类
class Scale extends Expression {
    public void excute(String key, double value) {
        String scale = "";
        switch ((int)value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
        }
        System.out.print(scale+" ");
    }
}