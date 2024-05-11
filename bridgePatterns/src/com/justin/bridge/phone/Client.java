package com.justin.bridge.phone;

public class Client {
    public static void main(String[] args)
    {
        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }
}
