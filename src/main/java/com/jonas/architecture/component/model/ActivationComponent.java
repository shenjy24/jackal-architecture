package com.jonas.architecture.component.model;

import com.jonas.architecture.component.ComponentType;
import lombok.Data;

/**
 * @author shenjy
 * @createTime 2022/2/22 15:08
 * @description ActivationComponent
 */
public class ActivationComponent extends BaseComponent {

    public ActivationComponent() {
        super(ComponentType.ACTIVE_DATA);
    }

    /**
     * 激活/复位
     */
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
