package com.binance.api.client.domain.account;

/**
 * @author Plajer
 * <p>
 * Created at 19.04.2022
 */
public enum FutureAccountTransferType {

    SPOT_TO_USDT_MARGINATED(1), USDT_MARGINATED_TO_SPOT(2), SPOT_TO_COIN_MARGINATED(3), COIN_MARGINATED_TO_USDT(4);

    private int type;

    FutureAccountTransferType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
