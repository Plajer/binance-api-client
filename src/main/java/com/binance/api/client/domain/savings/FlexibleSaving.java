package com.binance.api.client.domain.savings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 20.09.2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleSaving {

  private String annualInterestRate;
  private String asset;
  private String avgAnnualInterestRate;
  private boolean canRedeem;
  private String dailyInterestRate;
  private String freeAmount;
  private String productId;
  private String productName;
  private String redeemingAmount;
  private String todayPurchasedAmount;
  private String totalInterest;

  public String getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(String annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getAvgAnnualInterestRate() {
    return avgAnnualInterestRate;
  }

  public void setAvgAnnualInterestRate(String avgAnnualInterestRate) {
    this.avgAnnualInterestRate = avgAnnualInterestRate;
  }

  public boolean isCanRedeem() {
    return canRedeem;
  }

  public void setCanRedeem(boolean canRedeem) {
    this.canRedeem = canRedeem;
  }

  public String getDailyInterestRate() {
    return dailyInterestRate;
  }

  public void setDailyInterestRate(String dailyInterestRate) {
    this.dailyInterestRate = dailyInterestRate;
  }

  public String getFreeAmount() {
    return freeAmount;
  }

  public void setFreeAmount(String freeAmount) {
    this.freeAmount = freeAmount;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getRedeemingAmount() {
    return redeemingAmount;
  }

  public void setRedeemingAmount(String redeemingAmount) {
    this.redeemingAmount = redeemingAmount;
  }

  public String getTodayPurchasedAmount() {
    return todayPurchasedAmount;
  }

  public void setTodayPurchasedAmount(String todayPurchasedAmount) {
    this.todayPurchasedAmount = todayPurchasedAmount;
  }

  public String getTotalInterest() {
    return totalInterest;
  }

  public void setTotalInterest(String totalInterest) {
    this.totalInterest = totalInterest;
  }
}
