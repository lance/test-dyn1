package com.mycompany.myproject;

import org.dynjs.runtime.DynObject;

import java.util.HashMap;
import java.util.Map;

public class Say {

    private Map<String, Object> map = new HashMap<>();
    private Object object;

    public Say(){

    }

    public void hi(DynObject options){

         System.out.println("Ola!");
         System.out.println(System.getProperty("user.dir"));
    }

}
