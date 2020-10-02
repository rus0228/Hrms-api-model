package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContractInfoData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ContractInfo   {
  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("data")
  private ContractInfoData data = null;

  @JsonProperty("errorCode")
  private Object errorCode = null;

  @JsonProperty("errorMessage")
  private Object errorMessage = null;

  @JsonProperty("message")
  private Object message = null;

  @JsonProperty("result")
  private Boolean result = true;

  public ContractInfo code(Object code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
    public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }

  public ContractInfo data(ContractInfoData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ContractInfoData getData() {
    return data;
  }

  public void setData(ContractInfoData data) {
    this.data = data;
  }

  public ContractInfo errorCode(Object errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  
    public Object getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Object errorCode) {
    this.errorCode = errorCode;
  }

  public ContractInfo errorMessage(Object errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  
    public Object getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(Object errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ContractInfo message(Object message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    public Object getMessage() {
    return message;
  }

  public void setMessage(Object message) {
    this.message = message;
  }

  public ContractInfo result(Boolean result) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractInfo contractInfo = (ContractInfo) o;
    return Objects.equals(this.code, contractInfo.code) &&
        Objects.equals(this.data, contractInfo.data) &&
        Objects.equals(this.errorCode, contractInfo.errorCode) &&
        Objects.equals(this.errorMessage, contractInfo.errorMessage) &&
        Objects.equals(this.message, contractInfo.message) &&
        Objects.equals(this.result, contractInfo.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, errorCode, errorMessage, message, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
