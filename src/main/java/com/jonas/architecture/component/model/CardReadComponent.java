package com.jonas.architecture.component.model;

import com.jonas.architecture.component.ComponentType;

/**
 * @author shenjy
 * @createTime 2022/2/22 16:36
 * @description CardReadComponent
 */
public class CardReadComponent extends BaseComponent {

    public CardReadComponent() {
        super(ComponentType.CARD_READ_DATA);
    }

    /**
     * 从设备中读取的号id
     */
    private String cardId;

    /**
     * 认证结果
     */
    private boolean authSucceed;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public boolean isAuthSucceed() {
        return authSucceed;
    }

    public void setAuthSucceed(boolean authSucceed) {
        this.authSucceed = authSucceed;
    }
}
