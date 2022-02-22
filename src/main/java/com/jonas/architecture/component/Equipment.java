package com.jonas.architecture.component;

import com.jonas.architecture.component.model.BaseComponent;
import lombok.Data;

/**
 * @author shenjy
 * @createTime 2022/2/22 16:48
 * @description 实体，包含多种Component数据
 */
@Data
public class Equipment {

    // 设备类型
    private EquipType equipType;

    // 其所拥有的的component的数据
    private BaseComponent[] components;

    public Equipment(EquipType equipType) {
        this.equipType = equipType;
    }

    /**
     * 根据id获取
     *
     * @param componentId
     * @return
     */
    public BaseComponent getComponentById(int componentId) {
        if (this.components == null) {
            return null;
        } else if (componentId < 0) {
            return null;
        } else if (componentId >= this.components.length) {
            return null;
        }
        return this.components[componentId];
    }

    /**
     * 设置某个BaseModelComponent
     *
     * @param component
     */
    public void setBaseComponent(BaseComponent component) {
        if (component == null) {
            return;
        } else if (this.components == null) {
            this.components = new BaseComponent[ComponentType.MAX_NUM()];
        }
        this.components[component.getComponentId()] = component;
    }

    /**
     * 根据ModelComponentType区分
     *
     * @param componentType
     * @return
     */
    public BaseComponent getComponentByType(ComponentType componentType) {
        if (componentType == null) {
            return null;
        }
        return this.getComponentById(componentType.getIndex());
    }
}
