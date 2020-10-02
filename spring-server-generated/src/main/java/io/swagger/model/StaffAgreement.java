package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffAgreementData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffAgreement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffAgreement   {
  @JsonProperty("code")
  private Object code = null;

  @JsonProperty("data")
  private StaffAgreementData data = null;

  @JsonProperty("errorCode")
  private Object errorCode = null;

  @JsonProperty("errorMessage")
  private Object errorMessage = null;

  @JsonProperty("result")
  private Boolean result = true;

  public StaffAgreement code(Object code) {
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

  public StaffAgreement data(StaffAgreementData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffAgreementData getData() {
    return data;
  }

  public void setData(StaffAgreementData data) {
    this.data = data;
  }

  public StaffAgreement errorCode(Object errorCode) {
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

  public StaffAgreement errorMessage(Object errorMessage) {
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

  public StaffAgreement result(Boolean result) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffAgreement staffAgreement = (StaffAgreement) o;
    return Objects.equals(this.code, staffAgreement.code) &&
        Objects.equals(this.data, staffAgreement.data) &&
        Objects.equals(this.errorCode, staffAgreement.errorCode) &&
        Objects.equals(this.errorMessage, staffAgreement.errorMessage) &&
        Objects.equals(this.result, staffAgreement.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, errorCode, errorMessage, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAgreement {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
