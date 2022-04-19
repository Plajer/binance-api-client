package com.binance.api.client.domain.account.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 19.04.2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferResponse {

    private String tranId;

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }
}
