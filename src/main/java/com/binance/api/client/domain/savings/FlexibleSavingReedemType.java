package com.binance.api.client.domain.savings;

/**
 * @author Plajer
 * <p>
 * Created at 20.09.2021
 */
public enum FlexibleSavingReedemType {

    FAST("FAST"), NORMAL("NORMAL");

    private String name;

    FlexibleSavingReedemType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
