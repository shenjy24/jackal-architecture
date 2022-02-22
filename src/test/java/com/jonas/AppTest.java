package com.jonas;

import com.jonas.architecture.component.ComponentTools;
import com.jonas.architecture.component.ComponentType;
import com.jonas.architecture.component.EquipType;
import com.jonas.architecture.component.Equipment;
import com.jonas.architecture.component.model.GpioComponent;
import org.junit.Test;

public class AppTest {

    @Test
    public void testComponent() {
        Equipment equipment = new Equipment(EquipType.GPIO_DIGITAL);
        ComponentTools.initComponent(equipment);
        //根据ComponentType获取Equipment中对应的Component数据，Component不是与Equipment相关联，而是与EquipType相关联
        GpioComponent component1 = (GpioComponent) equipment.getComponentByType(ComponentType.GPIO_DATA);
        System.out.println(component1);
        //修改数值
        component1.setIoData("1");
        component1.setOutput(true);
        GpioComponent component2 = (GpioComponent) equipment.getComponentByType(ComponentType.GPIO_DATA);
        System.out.println(component2);
    }
}
