package com.justin.jiaxin;

class Request {
    //申请类别
    private String requestType;
    public String getRequestType(){
        return this.requestType;
    }
    public void setRequestType(String value){
        this.requestType = value;
    }

    //申请内容
    private String requestContent;
    public String getRequestContent(){
        return this.requestContent;
    }
    public void setRequestContent(String value){
        this.requestContent = value;
    }

    //数量
    private int number;
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int value){
        this.number = value;
    }
}
