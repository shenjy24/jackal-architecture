package com.jonas.architecture.component;

import com.jonas.architecture.component.model.ActivationComponent;
import com.jonas.architecture.component.model.BaseComponent;
import com.jonas.architecture.component.model.CardReadComponent;
import com.jonas.architecture.component.model.GpioComponent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author shenjy
 * @createTime 2022/2/22 16:29
 * @description ComponentTools
 */
public class ComponentTools {
    /**
     * 设备类型对应
     */
    private static final Map<EquipType, Set<Class<? extends BaseComponent>>> componentMap = new HashMap<>();

    static {
        // 供应商的设备类型
        registerGPIOType();
        // 游戏记录器（读卡器、显示屏）
        registerCardReader(EquipType.SD_CARD_READER);
    }

    /**
     * 注册gpio type
     */
    private static void registerGPIOType() {
        Set<Class<? extends BaseComponent>> componentClasses = componentMap.computeIfAbsent(EquipType.GPIO_DIGITAL, k -> new HashSet<>());
        componentClasses.add(GpioComponent.class);
    }

    /**
     * 注册游戏记录器（读卡器、显示屏）
     *
     * @param equipType 设备类型
     */
    private static void registerCardReader(EquipType equipType) {
        Set<Class<? extends BaseComponent>> componentClasses = componentMap.computeIfAbsent(equipType, k -> new HashSet<>());
        componentClasses.add(ActivationComponent.class);
        componentClasses.add(CardReadComponent.class);
    }

    /**
     * 初始化设备Component数据
     *
     * @param equipment 设备
     */
    public static void initComponent(Equipment equipment) {
        if (equipment == null) {
            return;
        }
        Set<Class<? extends BaseComponent>> classes = componentMap.get(equipment.getEquipType());
        if (classes == null) {
            return;
        }
        for (Class<? extends BaseComponent> clazz : classes) {
            try {
                BaseComponent baseComponent = clazz.newInstance();
                equipment.setBaseComponent(baseComponent);
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
