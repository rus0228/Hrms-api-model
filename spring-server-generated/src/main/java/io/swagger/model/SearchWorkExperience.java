package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchWorkExperienceData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchWorkExperience
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SearchWorkExperience   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("data")
  private SearchWorkExperienceData data = null;

  @JsonProperty("errorCode")
  private Object errorCode = null;

  @JsonProperty("errorMessage")
  private Object errorMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("result")
  private Boolean result = true;

  public SearchWorkExperience code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchWorkExperience data(SearchWorkExperienceData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SearchWorkExperienceData getData() {
    return data;
  }

  public void setData(SearchWorkExperienceData data) {
    this.data = data;
  }

  public SearchWorkExperience errorCode(Object errorCode) {
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

  public SearchWorkExperience errorMessage(Object errorMessage) {
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

  public SearchWorkExperience message(String message) {
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

  public SearchWorkExperience result(Boolean result) {
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
    SearchWorkExperience searchWorkExperience = (SearchWorkExperience) o;
    return Objects.equals(this.code, searchWorkExperience.code) &&
        Objects.equals(this.data, searchWorkExperience.data) &&
        Objects.equals(this.errorCode, searchWorkExperience.errorCode) &&
        Objects.equals(this.errorMessage, searchWorkExperience.errorMessage) &&
        Objects.equals(this.message, searchWorkExperience.message) &&
        Objects.equals(this.result, searchWorkExperience.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, errorCode, errorMessage, message, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchWorkExperience {\n");
    
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
