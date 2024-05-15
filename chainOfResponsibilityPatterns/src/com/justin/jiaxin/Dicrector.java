package com.justin.jiaxin;

//总监
class Director extends Manager{
    public Director(String name){
        super(name);
    }

    public void requestApplications(Request request){
        if (request.getRequestType()=="请假" && request.getNumber()<=5)
            System.out.println(this.name+":"+request.getRequestContent()+" 数量："+request.getNumber()+"天，被批准");
        else {
            if (this.superior != null)
                this.superior.requestApplications(request);
        }
    }
}