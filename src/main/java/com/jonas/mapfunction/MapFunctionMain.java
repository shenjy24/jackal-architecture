package com.jonas.mapfunction;

public class MapFunctionMain {

    public static void main(String[] args) {
        MapFunctionService service = new MapFunctionService();
        MapFunctionFacade facade = new MapFunctionFacade(service);
        System.out.println(facade.getResult("红包", "1"));
    }
}
