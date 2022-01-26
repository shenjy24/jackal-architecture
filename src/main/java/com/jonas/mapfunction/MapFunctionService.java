package com.jonas.mapfunction;

public class MapFunctionService {

    //红包的发放方式
    public String redPaper(String resourceId) {
        return "红包";
    }

    //购物券的发放方式
    public String shopping(String resourceId) {
        return "购物券";
    }

    //qq会员的发放方式
    public String QqVip(String resourceId) {
        return "qq会员";
    }
}
