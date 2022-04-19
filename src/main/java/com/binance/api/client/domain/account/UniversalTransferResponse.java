package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 19.04.2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UniversalTransferResponse {

    private String tranId;
    private String clientTranId;

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getClientTranId() {
        return clientTranId;
    }

    public void setClientTranId(String clientTranId) {
        this.clientTranId = clientTranId;
    }
}
