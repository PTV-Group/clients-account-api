/*
 * Account API
 * With the Account service you can manage your API keys and track their usage. It is important to note that unlike all other APIs, the Account API needs a master API key for authentication. For more details consult the [concept](./concepts/api-key-management-and-usage).
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.account.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UsageByDay
 */
@JsonPropertyOrder({
  UsageByDay.JSON_PROPERTY_DATE,
  UsageByDay.JSON_PROPERTY_TRANSACTIONS,
  UsageByDay.JSON_PROPERTY_REQUESTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T11:23:34.887389Z[Etc/UTC]")
public class UsageByDay {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private Double transactions;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private Integer requests;

  public UsageByDay() { 
  }

  public UsageByDay date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
   * @return date
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public UsageByDay transactions(Double transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * Transactions charged on this day.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTransactions() {
    return transactions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactions(Double transactions) {
    this.transactions = transactions;
  }


  public UsageByDay requests(Integer requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Requests sent on this day.
   * @return requests
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRequests() {
    return requests;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequests(Integer requests) {
    this.requests = requests;
  }


  /**
   * Return true if this UsageByDay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageByDay usageByDay = (UsageByDay) o;
    return Objects.equals(this.date, usageByDay.date) &&
        Objects.equals(this.transactions, usageByDay.transactions) &&
        Objects.equals(this.requests, usageByDay.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, transactions, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageByDay {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `date` to the URL query string
    if (getDate() != null) {
      joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `transactions` to the URL query string
    if (getTransactions() != null) {
      joiner.add(String.format("%stransactions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactions()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `requests` to the URL query string
    if (getRequests() != null) {
      joiner.add(String.format("%srequests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequests()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

