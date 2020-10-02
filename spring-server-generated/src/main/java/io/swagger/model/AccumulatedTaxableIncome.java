package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccumulatedTaxableIncomeData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccumulatedTaxableIncome
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AccumulatedTaxableIncome   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("data")
  private AccumulatedTaxableIncomeData data = null;

  @JsonProperty("errorResult")
  private Boolean errorResult = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("showType")
  private Boolean showType = null;

  @JsonProperty("url")
  private String url = null;

  public AccumulatedTaxableIncome code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AccumulatedTaxableIncome data(AccumulatedTaxableIncomeData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccumulatedTaxableIncomeData getData() {
    return data;
  }

  public void setData(AccumulatedTaxableIncomeData data) {
    this.data = data;
  }

  public AccumulatedTaxableIncome errorResult(Boolean errorResult) {
    this.errorResult = errorResult;
    return this;
  }

  /**
   * Get errorResult
   * @return errorResult
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isErrorResult() {
    return errorResult;
  }

  public void setErrorResult(Boolean errorResult) {
    this.errorResult = errorResult;
  }

  public AccumulatedTaxableIncome message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AccumulatedTaxableIncome showType(Boolean showType) {
    this.showType = showType;
    return this;
  }

  /**
   * Get showType
   * @return showType
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isShowType() {
    return showType;
  }

  public void setShowType(Boolean showType) {
    this.showType = showType;
  }

  public AccumulatedTaxableIncome url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccumulatedTaxableIncome accumulatedTaxableIncome = (AccumulatedTaxableIncome) o;
    return Objects.equals(this.code, accumulatedTaxableIncome.code) &&
        Objects.equals(this.data, accumulatedTaxableIncome.data) &&
        Objects.equals(this.errorResult, accumulatedTaxableIncome.errorResult) &&
        Objects.equals(this.message, accumulatedTaxableIncome.message) &&
        Objects.equals(this.showType, accumulatedTaxableIncome.showType) &&
        Objects.equals(this.url, accumulatedTaxableIncome.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, errorResult, message, showType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulatedTaxableIncome {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorResult: ").append(toIndentedString(errorResult)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    showType: ").append(toIndentedString(showType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
