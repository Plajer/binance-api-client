package com.binance.api.client.domain.savings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 12.04.2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedSaving {

    private String asset;
    private boolean canTransfer;
    private long createTimestamp;
    private long duration;
    private long endTime;
    private String interest;
    private String interestRate;
    private long lot;
    private long positionId;
    private String projectId;
    private String redeemDate;
    private String status;
    private String type;

}
