package com.justin.flyweight.website;

import java.util.Hashtable;

public class WebSiteFactory {
    private Hashtable<String, WebSite> pool = new Hashtable<String, WebSite>();

    public WebSite getWebSiteCategory(String key){
        if(!pool.containsKey(key)){
            pool.put(key, new ConcreteWebSite(key));
        }
        return pool.get(key);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
