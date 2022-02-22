package com.jonas.architecture.component;

/**
 * @author shenjy
 * @createTime 2022/2/22 16:31
 * @description EquipType
 */
public enum EquipType {
    GPIO_DIGITAL("gpio_digital", "供应商的GPIO数字"),
    SD_CARD_READER("sd_card_reader", "读卡器"),
    ;

    private final String code;
    private final String message;

    EquipType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
