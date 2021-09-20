package com.binance.api.client.domain.savings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Plajer
 * <p>
 * Created at 20.09.2021
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlexibleSavingResponse {

  private String purchaseId;

  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }
}
