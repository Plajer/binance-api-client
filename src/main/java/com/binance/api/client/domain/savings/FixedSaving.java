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

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public boolean isCanTransfer() {
        return canTransfer;
    }

    public void setCanTransfer(boolean canTransfer) {
        this.canTransfer = canTransfer;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public long getLot() {
        return lot;
    }

    public void setLot(long lot) {
        this.lot = lot;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRedeemDate() {
        return redeemDate;
    }

    public void setRedeemDate(String redeemDate) {
        this.redeemDate = redeemDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
