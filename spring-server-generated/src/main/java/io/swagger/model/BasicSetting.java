package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BasicSettingItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicSetting
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BasicSetting   {
  @JsonProperty("data")
  @Valid
  private List<BasicSettingItem> data = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("errorMessageList")
  private Object errorMessageList = null;

  @JsonProperty("errorNumber")
  private String errorNumber = null;

  @JsonProperty("noValidateNumber")
  private String noValidateNumber = null;

  @JsonProperty("result")
  private Boolean result = true;

  @JsonProperty("totalNumber")
  private Long totalNumber = null;

  public BasicSetting data(List<BasicSettingItem> data) {
    this.data = data;
    return this;
  }

  public BasicSetting addDataItem(BasicSettingItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<BasicSettingItem>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<BasicSettingItem> getData() {
    return data;
  }

  public void setData(List<BasicSettingItem> data) {
    this.data = data;
  }

  public BasicSetting errorCode(String errorCode) {
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

  public BasicSetting errorMessage(String errorMessage) {
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

  public BasicSetting errorMessageList(Object errorMessageList) {
    this.errorMessageList = errorMessageList;
    return this;
  }

  /**
   * Get errorMessageList
   * @return errorMessageList
  **/
  @ApiModelProperty(value = "")
  
    public Object getErrorMessageList() {
    return errorMessageList;
  }

  public void setErrorMessageList(Object errorMessageList) {
    this.errorMessageList = errorMessageList;
  }

  public BasicSetting errorNumber(String errorNumber) {
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

  public BasicSetting noValidateNumber(String noValidateNumber) {
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

  public BasicSetting result(Boolean result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public BasicSetting totalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  /**
   * Get totalNumber
   * @return totalNumber
  **/
  @ApiModelProperty(value = "")
  
    public Long getTotalNumber() {
    return totalNumber;
  }

  public void setTotalNumber(Long totalNumber) {
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
    BasicSetting basicSetting = (BasicSetting) o;
    return Objects.equals(this.data, basicSetting.data) &&
        Objects.equals(this.errorCode, basicSetting.errorCode) &&
        Objects.equals(this.errorMessage, basicSetting.errorMessage) &&
        Objects.equals(this.errorMessageList, basicSetting.errorMessageList) &&
        Objects.equals(this.errorNumber, basicSetting.errorNumber) &&
        Objects.equals(this.noValidateNumber, basicSetting.noValidateNumber) &&
        Objects.equals(this.result, basicSetting.result) &&
        Objects.equals(this.totalNumber, basicSetting.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorCode, errorMessage, errorMessageList, errorNumber, noValidateNumber, result, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicSetting {\n");
    
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
