package com.jonas.architecture.component.model;

import com.jonas.architecture.component.ComponentType;

/**
 * @author shenjy
 * @createTime 2022/2/22 15:08
 * @description Component存储实体的某些数据，一个实体可以对应多个Component
 */
public abstract class BaseComponent {

    private final ComponentType modelComponentType;

    public BaseComponent(ComponentType modelComponentType) {
        this.modelComponentType = modelComponentType;
    }

    public ComponentType getComponentType() {
        return modelComponentType;
    }

    /**
     * 获取唯一的id
     * @return
     */
    public int getComponentId() {
        return modelComponentType.getIndex();
    }
}
