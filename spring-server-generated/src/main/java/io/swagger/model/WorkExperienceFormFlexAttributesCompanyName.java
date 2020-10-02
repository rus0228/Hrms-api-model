package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkExperienceFormFlexAttributesCompanyName
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class WorkExperienceFormFlexAttributesCompanyName   {
  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("inMain")
  private Boolean inMain = true;

  @JsonProperty("isRequired")
  private Boolean isRequired = true;

  @JsonProperty("isValid")
  private Boolean isValid = true;

  @JsonProperty("maximumValue")
  private Object maximumValue = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("minimumValue")
  private Object minimumValue = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueLength")
  private Long valueLength = null;

  public WorkExperienceFormFlexAttributesCompanyName defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  
    public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public WorkExperienceFormFlexAttributesCompanyName displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public WorkExperienceFormFlexAttributesCompanyName inMain(Boolean inMain) {
    this.inMain = inMain;
    return this;
  }

  /**
   * Get inMain
   * @return inMain
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isInMain() {
    return inMain;
  }

  public void setInMain(Boolean inMain) {
    this.inMain = inMain;
  }

  public WorkExperienceFormFlexAttributesCompanyName isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public WorkExperienceFormFlexAttributesCompanyName isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public WorkExperienceFormFlexAttributesCompanyName maximumValue(Object maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * Get maximumValue
   * @return maximumValue
  **/
  @ApiModelProperty(value = "")
  
    public Object getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Object maximumValue) {
    this.maximumValue = maximumValue;
  }

  public WorkExperienceFormFlexAttributesCompanyName metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public WorkExperienceFormFlexAttributesCompanyName minimumValue(Object minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * Get minimumValue
   * @return minimumValue
  **/
  @ApiModelProperty(value = "")
  
    public Object getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(Object minimumValue) {
    this.minimumValue = minimumValue;
  }

  public WorkExperienceFormFlexAttributesCompanyName type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WorkExperienceFormFlexAttributesCompanyName value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public WorkExperienceFormFlexAttributesCompanyName valueLength(Long valueLength) {
    this.valueLength = valueLength;
    return this;
  }

  /**
   * Get valueLength
   * @return valueLength
  **/
  @ApiModelProperty(value = "")
  
    public Long getValueLength() {
    return valueLength;
  }

  public void setValueLength(Long valueLength) {
    this.valueLength = valueLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkExperienceFormFlexAttributesCompanyName workExperienceFormFlexAttributesCompanyName = (WorkExperienceFormFlexAttributesCompanyName) o;
    return Objects.equals(this.defaultValue, workExperienceFormFlexAttributesCompanyName.defaultValue) &&
        Objects.equals(this.displayName, workExperienceFormFlexAttributesCompanyName.displayName) &&
        Objects.equals(this.inMain, workExperienceFormFlexAttributesCompanyName.inMain) &&
        Objects.equals(this.isRequired, workExperienceFormFlexAttributesCompanyName.isRequired) &&
        Objects.equals(this.isValid, workExperienceFormFlexAttributesCompanyName.isValid) &&
        Objects.equals(this.maximumValue, workExperienceFormFlexAttributesCompanyName.maximumValue) &&
        Objects.equals(this.metaCode, workExperienceFormFlexAttributesCompanyName.metaCode) &&
        Objects.equals(this.minimumValue, workExperienceFormFlexAttributesCompanyName.minimumValue) &&
        Objects.equals(this.type, workExperienceFormFlexAttributesCompanyName.type) &&
        Objects.equals(this.value, workExperienceFormFlexAttributesCompanyName.value) &&
        Objects.equals(this.valueLength, workExperienceFormFlexAttributesCompanyName.valueLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, displayName, inMain, isRequired, isValid, maximumValue, metaCode, minimumValue, type, value, valueLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkExperienceFormFlexAttributesCompanyName {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    inMain: ").append(toIndentedString(inMain)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueLength: ").append(toIndentedString(valueLength)).append("\n");
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
