package com.justin.mediator.country;

public class Test {

    public static void main(String[] args) {


        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setUSA(c1);
        UNSC.setIraq(c2);

        c1.declare("不准研制核武器，否则要发动战争！");
        c2.declare("我们没有核武器，也不怕侵略。");


    }
}


//同事抽象类
abstract class Country {
    //中介引用
    protected UnitedNations unitedNations;
    public Country(UnitedNations unitedNations){
        this.unitedNations = unitedNations;
    }
}
//具体同事类
class USA extends Country {
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息:" + message);
    }
}

class Iraq extends Country {
    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息:" + message);
    }
}

//中介者类
abstract class UnitedNations{
    //声明
    public abstract void declare(String message,Country country);
}

//联合国安理会
class UnitedNationsSecurityCouncil extends UnitedNations{
    private USA countryUSA;
    private Iraq countryIraq;

    public void setUSA(USA value) {
        this.countryUSA = value;
    }

    public void setIraq(Iraq value) {
        this.countryIraq = value;
    }

    public void declare(String message, Country country)
    {
        if (country == this.countryUSA) {
            this.countryIraq.getMessage(message);
        }
        else if (country == this.countryIraq) {
            this.countryUSA.getMessage(message);
        }
    }
}

