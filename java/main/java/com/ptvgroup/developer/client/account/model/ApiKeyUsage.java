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
import com.ptvgroup.developer.client.account.model.ServiceUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiKeyUsage
 */
@JsonPropertyOrder({
  ApiKeyUsage.JSON_PROPERTY_API_KEY,
  ApiKeyUsage.JSON_PROPERTY_DESCRIPTION,
  ApiKeyUsage.JSON_PROPERTY_DELETED,
  ApiKeyUsage.JSON_PROPERTY_SERVICES,
  ApiKeyUsage.JSON_PROPERTY_TRANSACTIONS,
  ApiKeyUsage.JSON_PROPERTY_REQUESTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T11:23:34.887389Z[Etc/UTC]")
public class ApiKeyUsage {
  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<ServiceUsage> services;

  public static final String JSON_PROPERTY_TRANSACTIONS = "transactions";
  private Double transactions;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private Integer requests;

  public ApiKeyUsage() { 
  }

  public ApiKeyUsage apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The first letters of the API key.
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public ApiKeyUsage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the API key.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ApiKeyUsage deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * True, if the API key has been deleted, false otherwise. Deleted API keys will still be included in usage calculations but cannot be used anymore.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ApiKeyUsage services(List<ServiceUsage> services) {
    this.services = services;
    return this;
  }

  public ApiKeyUsage addServicesItem(ServiceUsage servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * This list contains the usage by service. Only services which have been used in the requested period will be returned.
   * @return services
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceUsage> getServices() {
    return services;
  }


  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServices(List<ServiceUsage> services) {
    this.services = services;
  }


  public ApiKeyUsage transactions(Double transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * Transactions charged by this API key.
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


  public ApiKeyUsage requests(Integer requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Requests sent using this API key.
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
   * Return true if this ApiKeyUsage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyUsage apiKeyUsage = (ApiKeyUsage) o;
    return Objects.equals(this.apiKey, apiKeyUsage.apiKey) &&
        Objects.equals(this.description, apiKeyUsage.description) &&
        Objects.equals(this.deleted, apiKeyUsage.deleted) &&
        Objects.equals(this.services, apiKeyUsage.services) &&
        Objects.equals(this.transactions, apiKeyUsage.transactions) &&
        Objects.equals(this.requests, apiKeyUsage.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, description, deleted, services, transactions, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyUsage {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

    // add `apiKey` to the URL query string
    if (getApiKey() != null) {
      joiner.add(String.format("%sapiKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deleted` to the URL query string
    if (getDeleted() != null) {
      joiner.add(String.format("%sdeleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeleted()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `services` to the URL query string
    if (getServices() != null) {
      for (int i = 0; i < getServices().size(); i++) {
        if (getServices().get(i) != null) {
          joiner.add(getServices().get(i).toUrlQueryString(String.format("%sservices%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

