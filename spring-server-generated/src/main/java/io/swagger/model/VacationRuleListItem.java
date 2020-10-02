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
 * VacationRuleListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class VacationRuleListItem   {
  @JsonProperty("calculateType")
  private String calculateType = null;

  @JsonProperty("isAllStaffAvailable")
  private Boolean isAllStaffAvailable = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("ruleId")
  private String ruleId = null;

  @JsonProperty("ruleName")
  private String ruleName = null;

  @JsonProperty("scopeName")
  private String scopeName = null;

  @JsonProperty("settingId")
  private String settingId = null;

  public VacationRuleListItem calculateType(String calculateType) {
    this.calculateType = calculateType;
    return this;
  }

  /**
   * Get calculateType
   * @return calculateType
  **/
  @ApiModelProperty(example = "SCHEDULE_WORKDAY", value = "")
  
    public String getCalculateType() {
    return calculateType;
  }

  public void setCalculateType(String calculateType) {
    this.calculateType = calculateType;
  }

  public VacationRuleListItem isAllStaffAvailable(Boolean isAllStaffAvailable) {
    this.isAllStaffAvailable = isAllStaffAvailable;
    return this;
  }

  /**
   * Get isAllStaffAvailable
   * @return isAllStaffAvailable
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsAllStaffAvailable() {
    return isAllStaffAvailable;
  }

  public void setIsAllStaffAvailable(Boolean isAllStaffAvailable) {
    this.isAllStaffAvailable = isAllStaffAvailable;
  }

  public VacationRuleListItem isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public VacationRuleListItem isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public VacationRuleListItem ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Get ruleId
   * @return ruleId
  **/
  @ApiModelProperty(example = "b31d9f4d-e276-4783-ae39-2899e68e82ad", value = "")
  
    public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public VacationRuleListItem ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * Get ruleName
   * @return ruleName
  **/
  @ApiModelProperty(example = "默认规则", value = "")
  
    public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public VacationRuleListItem scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

  /**
   * Get scopeName
   * @return scopeName
  **/
  @ApiModelProperty(value = "")
  
    public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }

  public VacationRuleListItem settingId(String settingId) {
    this.settingId = settingId;
    return this;
  }

  /**
   * Get settingId
   * @return settingId
  **/
  @ApiModelProperty(value = "")
  
    public String getSettingId() {
    return settingId;
  }

  public void setSettingId(String settingId) {
    this.settingId = settingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacationRuleListItem vacationRuleListItem = (VacationRuleListItem) o;
    return Objects.equals(this.calculateType, vacationRuleListItem.calculateType) &&
        Objects.equals(this.isAllStaffAvailable, vacationRuleListItem.isAllStaffAvailable) &&
        Objects.equals(this.isDefault, vacationRuleListItem.isDefault) &&
        Objects.equals(this.isEnabled, vacationRuleListItem.isEnabled) &&
        Objects.equals(this.ruleId, vacationRuleListItem.ruleId) &&
        Objects.equals(this.ruleName, vacationRuleListItem.ruleName) &&
        Objects.equals(this.scopeName, vacationRuleListItem.scopeName) &&
        Objects.equals(this.settingId, vacationRuleListItem.settingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculateType, isAllStaffAvailable, isDefault, isEnabled, ruleId, ruleName, scopeName, settingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationRuleListItem {\n");
    
    sb.append("    calculateType: ").append(toIndentedString(calculateType)).append("\n");
    sb.append("    isAllStaffAvailable: ").append(toIndentedString(isAllStaffAvailable)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
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
