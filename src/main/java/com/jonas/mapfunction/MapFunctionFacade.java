package com.jonas.mapfunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * 1.根据优惠券类型resourceType，确定查询哪个数据库表
 * 2.根据编码resourceId到对应的数据表里查询优惠券的派发方式grantType和领取规则
 */
public class MapFunctionFacade {

    private final MapFunctionService mapFunctionService;
    private final Map<String, Function<String, String>> functionMap = new HashMap<>();

    public MapFunctionFacade(MapFunctionService mapFunctionService) {
        this.mapFunctionService = mapFunctionService;
        dispatcherInit();
    }

    private void dispatcherInit() {
        functionMap.put("红包", mapFunctionService::redPaper);
        functionMap.put("购物券", mapFunctionService::shopping);
        functionMap.put("qq会员", mapFunctionService::QqVip);
    }

    public String getResult(String resourceType, String resourceId) {
        Function<String, String> function = functionMap.get(resourceType);
        if (null != function) {
            return function.apply(resourceId);
        }
        return "查询不到该优惠券的发放方式";
    }
}
