package com.jonas.architecture.component.model;

import com.jonas.architecture.component.ComponentType;
import lombok.ToString;

/**
 * @author shenjy
 * @createTime 2022/2/22 16:13
 * @description GPIO的数据
 */
@ToString
public class GpioComponent extends BaseComponent {

    public GpioComponent() {
        super(ComponentType.GPIO_DATA);
    }

    /**
     * 输入输出数据存储，包括历史数据
     * GPIO: 0不触发, 1表示触发
     */
    private String ioData = "0";

    //否是输入输出
    private boolean isOutput = false;

    public String getIoData() {
        return ioData;
    }

    public void setIoData(String ioData) {
        this.ioData = ioData;
    }

    public boolean isOutput() {
        return isOutput;
    }

    public void setOutput(boolean output) {
        isOutput = output;
    }
}
