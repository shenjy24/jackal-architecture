package com.jonas.architecture.component;

/**
 * @author shenjy
 * @createTime 2022/2/22 15:08
 * @description ComponentType
 */
public enum ComponentType {
    GPIO_DATA(0, "GPIO_DATA", "gpio的数据"),
    CARD_READ_DATA(1, "CARD_READ_DATA", "读卡器的数据"),
    ACTIVE_DATA(2, "ACTIVE_DATA", "激活/复位的数据"),
    ;

    private final int index;
    private final String type;
    private final String message;

    ComponentType(int index, String type, String message) {
        this.type = type;
        this.index = index;
        this.message = message;
    }

    public int getIndex() {
        return index;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public static int MAX_NUM() {
        int maxV = 0;
        for (ComponentType modelComponentType : ComponentType.values()) {
            if (maxV < modelComponentType.index) {
                maxV = modelComponentType.index;
            }
        }
        return maxV + 1;
    }
}
