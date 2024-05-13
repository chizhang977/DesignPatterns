package com.justin.flyweight.website;

public class Client {
    public static void main(String[] args)
    {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite news = factory.getWebSiteCategory("新闻");
        news.use(new User("张三"));

        WebSite news2 = factory.getWebSiteCategory("新闻");
        news2.use(new User("李四"));

        WebSite news3 = factory.getWebSiteCategory("新闻");
        news3.use(new User("王五"));

        WebSite news4 = factory.getWebSiteCategory("博客");
        news4.use(new User("赵六"));

        System.out.println("网站分类总数：" + factory.getWebSiteCount());
    }
}
