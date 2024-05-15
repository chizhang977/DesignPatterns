package com.justin.jiaxin;

//普通经理
class CommonManager extends Manager{
    public CommonManager(String name){
        super(name);
    }

    public void requestApplications(Request request){
        if (request.getRequestType()=="请假" && request.getNumber()<=2)
            System.out.println(this.name+":"+request.getRequestContent()+" 数量："+request.getNumber()+"天，被批准");
        else {
            if (this.superior != null)
                this.superior.requestApplications(request);
        }
    }
}