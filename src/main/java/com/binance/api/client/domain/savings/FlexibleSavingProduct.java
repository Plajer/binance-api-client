package com.binance.api.client.domain.savings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 20.09.2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleSavingProduct {

  private String asset;
  private String avgAnnualInterestRate;
  private boolean canPurchase;
  private boolean canRedeem;
  private String dailyInterestPerThousand;
  private boolean featured;
  private String minPurchaseAmount;
  private String productId;
  private String purchasedAmount;
  private String status;
  private String upLimit;
  private String upLimitPerUser;

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

  public boolean isCanPurchase() {
    return canPurchase;
  }

  public void setCanPurchase(boolean canPurchase) {
    this.canPurchase = canPurchase;
  }

  public boolean isCanRedeem() {
    return canRedeem;
  }

  public void setCanRedeem(boolean canRedeem) {
    this.canRedeem = canRedeem;
  }

  public String getDailyInterestPerThousand() {
    return dailyInterestPerThousand;
  }

  public void setDailyInterestPerThousand(String dailyInterestPerThousand) {
    this.dailyInterestPerThousand = dailyInterestPerThousand;
  }

  public boolean isFeatured() {
    return featured;
  }

  public void setFeatured(boolean featured) {
    this.featured = featured;
  }

  public String getMinPurchaseAmount() {
    return minPurchaseAmount;
  }

  public void setMinPurchaseAmount(String minPurchaseAmount) {
    this.minPurchaseAmount = minPurchaseAmount;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getPurchasedAmount() {
    return purchasedAmount;
  }

  public void setPurchasedAmount(String purchasedAmount) {
    this.purchasedAmount = purchasedAmount;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getUpLimit() {
    return upLimit;
  }

  public void setUpLimit(String upLimit) {
    this.upLimit = upLimit;
  }

  public String getUpLimitPerUser() {
    return upLimitPerUser;
  }

  public void setUpLimitPerUser(String upLimitPerUser) {
    this.upLimitPerUser = upLimitPerUser;
  }
}
