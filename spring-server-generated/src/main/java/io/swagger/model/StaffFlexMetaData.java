package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffFlexMetaDataData;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffFlexMetaData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffFlexMetaData   {
  @JsonProperty("data")
  private StaffFlexMetaDataData data = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("errorMessageList")
  private String errorMessageList = null;

  @JsonProperty("errorNumber")
  private String errorNumber = null;

  @JsonProperty("noValidateNumber")
  private String noValidateNumber = null;

  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("totalNumber")
  private BigDecimal totalNumber = null;

  public StaffFlexMetaData data(StaffFlexMetaDataData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataData getData() {
    return data;
  }

  public void setData(StaffFlexMetaDataData data) {
    this.data = data;
  }

  public StaffFlexMetaData errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public StaffFlexMetaData errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public StaffFlexMetaData errorMessageList(String errorMessageList) {
    this.errorMessageList = errorMessageList;
    return this;
  }

  /**
   * Get errorMessageList
   * @return errorMessageList
  **/
  @ApiModelProperty(value = "")
  
    public String getErrorMessageList() {
    return errorMessageList;
  }

  public void setErrorMessageList(String errorMessageList) {
    this.errorMessageList = errorMessageList;
  }

  public StaffFlexMetaData errorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
    return this;
  }

  /**
   * Get errorNumber
   * @return errorNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
  }

  public StaffFlexMetaData noValidateNumber(String noValidateNumber) {
    this.noValidateNumber = noValidateNumber;
    return this;
  }

  /**
   * Get noValidateNumber
   * @return noValidateNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getNoValidateNumber() {
    return noValidateNumber;
  }

  public void setNoValidateNumber(String noValidateNumber) {
    this.noValidateNumber = noValidateNumber;
  }

  public StaffFlexMetaData result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public StaffFlexMetaData totalNumber(BigDecimal totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * Get totalNumber
   * @return totalNumber
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(BigDecimal totalNumber) {
    this.totalNumber = totalNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffFlexMetaData staffFlexMetaData = (StaffFlexMetaData) o;
    return Objects.equals(this.data, staffFlexMetaData.data) &&
        Objects.equals(this.errorCode, staffFlexMetaData.errorCode) &&
        Objects.equals(this.errorMessage, staffFlexMetaData.errorMessage) &&
        Objects.equals(this.errorMessageList, staffFlexMetaData.errorMessageList) &&
        Objects.equals(this.errorNumber, staffFlexMetaData.errorNumber) &&
        Objects.equals(this.noValidateNumber, staffFlexMetaData.noValidateNumber) &&
        Objects.equals(this.result, staffFlexMetaData.result) &&
        Objects.equals(this.totalNumber, staffFlexMetaData.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorCode, errorMessage, errorMessageList, errorNumber, noValidateNumber, result, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffFlexMetaData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorMessageList: ").append(toIndentedString(errorMessageList)).append("\n");
    sb.append("    errorNumber: ").append(toIndentedString(errorNumber)).append("\n");
    sb.append("    noValidateNumber: ").append(toIndentedString(noValidateNumber)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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
