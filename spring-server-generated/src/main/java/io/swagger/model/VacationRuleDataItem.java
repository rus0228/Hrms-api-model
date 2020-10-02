package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VacationRuleListItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VacationRuleDataItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class VacationRuleDataItem   {
  @JsonProperty("calculationHours")
  private BigDecimal calculationHours = null;

  @JsonProperty("calculationUnit")
  private String calculationUnit = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("leaveName")
  private String leaveName = null;

  @JsonProperty("maximumUnit")
  private String maximumUnit = null;

  @JsonProperty("sexScope")
  private String sexScope = null;

  @JsonProperty("smallestUnit")
  private BigDecimal smallestUnit = null;

  @JsonProperty("standardUnit")
  private String standardUnit = null;

  @JsonProperty("stepUnit")
  private String stepUnit = null;

  @JsonProperty("vacationRuleList")
  @Valid
  private List<VacationRuleListItem> vacationRuleList = null;

  @JsonProperty("vacationType")
  private String vacationType = null;

  public VacationRuleDataItem calculationHours(BigDecimal calculationHours) {
    this.calculationHours = calculationHours;
    return this;
  }

  /**
   * Get calculationHours
   * @return calculationHours
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getCalculationHours() {
    return calculationHours;
  }

  public void setCalculationHours(BigDecimal calculationHours) {
    this.calculationHours = calculationHours;
  }

  public VacationRuleDataItem calculationUnit(String calculationUnit) {
    this.calculationUnit = calculationUnit;
    return this;
  }

  /**
   * Get calculationUnit
   * @return calculationUnit
  **/
  @ApiModelProperty(example = "DAY", value = "")
  
    public String getCalculationUnit() {
    return calculationUnit;
  }

  public void setCalculationUnit(String calculationUnit) {
    this.calculationUnit = calculationUnit;
  }

  public VacationRuleDataItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "a6437374-9ca1-4029-bd85-81c0d14750f6", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacationRuleDataItem isEnabled(Boolean isEnabled) {
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

  public VacationRuleDataItem leaveName(String leaveName) {
    this.leaveName = leaveName;
    return this;
  }

  /**
   * Get leaveName
   * @return leaveName
  **/
  @ApiModelProperty(example = "年假", value = "")
  
    public String getLeaveName() {
    return leaveName;
  }

  public void setLeaveName(String leaveName) {
    this.leaveName = leaveName;
  }

  public VacationRuleDataItem maximumUnit(String maximumUnit) {
    this.maximumUnit = maximumUnit;
    return this;
  }

  /**
   * Get maximumUnit
   * @return maximumUnit
  **/
  @ApiModelProperty(value = "")
  
    public String getMaximumUnit() {
    return maximumUnit;
  }

  public void setMaximumUnit(String maximumUnit) {
    this.maximumUnit = maximumUnit;
  }

  public VacationRuleDataItem sexScope(String sexScope) {
    this.sexScope = sexScope;
    return this;
  }

  /**
   * Get sexScope
   * @return sexScope
  **/
  @ApiModelProperty(value = "")
  
    public String getSexScope() {
    return sexScope;
  }

  public void setSexScope(String sexScope) {
    this.sexScope = sexScope;
  }

  public VacationRuleDataItem smallestUnit(BigDecimal smallestUnit) {
    this.smallestUnit = smallestUnit;
    return this;
  }

  /**
   * Get smallestUnit
   * @return smallestUnit
  **/
  @ApiModelProperty(example = "0.5", value = "")
  
    @Valid
    public BigDecimal getSmallestUnit() {
    return smallestUnit;
  }

  public void setSmallestUnit(BigDecimal smallestUnit) {
    this.smallestUnit = smallestUnit;
  }

  public VacationRuleDataItem standardUnit(String standardUnit) {
    this.standardUnit = standardUnit;
    return this;
  }

  /**
   * Get standardUnit
   * @return standardUnit
  **/
  @ApiModelProperty(example = "DAY", value = "")
  
    public String getStandardUnit() {
    return standardUnit;
  }

  public void setStandardUnit(String standardUnit) {
    this.standardUnit = standardUnit;
  }

  public VacationRuleDataItem stepUnit(String stepUnit) {
    this.stepUnit = stepUnit;
    return this;
  }

  /**
   * Get stepUnit
   * @return stepUnit
  **/
  @ApiModelProperty(value = "")
  
    public String getStepUnit() {
    return stepUnit;
  }

  public void setStepUnit(String stepUnit) {
    this.stepUnit = stepUnit;
  }

  public VacationRuleDataItem vacationRuleList(List<VacationRuleListItem> vacationRuleList) {
    this.vacationRuleList = vacationRuleList;
    return this;
  }

  public VacationRuleDataItem addVacationRuleListItem(VacationRuleListItem vacationRuleListItem) {
    if (this.vacationRuleList == null) {
      this.vacationRuleList = new ArrayList<VacationRuleListItem>();
    }
    this.vacationRuleList.add(vacationRuleListItem);
    return this;
  }

  /**
   * Get vacationRuleList
   * @return vacationRuleList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<VacationRuleListItem> getVacationRuleList() {
    return vacationRuleList;
  }

  public void setVacationRuleList(List<VacationRuleListItem> vacationRuleList) {
    this.vacationRuleList = vacationRuleList;
  }

  public VacationRuleDataItem vacationType(String vacationType) {
    this.vacationType = vacationType;
    return this;
  }

  /**
   * Get vacationType
   * @return vacationType
  **/
  @ApiModelProperty(example = "ANNUAL_LEAVE", value = "")
  
    public String getVacationType() {
    return vacationType;
  }

  public void setVacationType(String vacationType) {
    this.vacationType = vacationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacationRuleDataItem vacationRuleDataItem = (VacationRuleDataItem) o;
    return Objects.equals(this.calculationHours, vacationRuleDataItem.calculationHours) &&
        Objects.equals(this.calculationUnit, vacationRuleDataItem.calculationUnit) &&
        Objects.equals(this.id, vacationRuleDataItem.id) &&
        Objects.equals(this.isEnabled, vacationRuleDataItem.isEnabled) &&
        Objects.equals(this.leaveName, vacationRuleDataItem.leaveName) &&
        Objects.equals(this.maximumUnit, vacationRuleDataItem.maximumUnit) &&
        Objects.equals(this.sexScope, vacationRuleDataItem.sexScope) &&
        Objects.equals(this.smallestUnit, vacationRuleDataItem.smallestUnit) &&
        Objects.equals(this.standardUnit, vacationRuleDataItem.standardUnit) &&
        Objects.equals(this.stepUnit, vacationRuleDataItem.stepUnit) &&
        Objects.equals(this.vacationRuleList, vacationRuleDataItem.vacationRuleList) &&
        Objects.equals(this.vacationType, vacationRuleDataItem.vacationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationHours, calculationUnit, id, isEnabled, leaveName, maximumUnit, sexScope, smallestUnit, standardUnit, stepUnit, vacationRuleList, vacationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationRuleDataItem {\n");
    
    sb.append("    calculationHours: ").append(toIndentedString(calculationHours)).append("\n");
    sb.append("    calculationUnit: ").append(toIndentedString(calculationUnit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    leaveName: ").append(toIndentedString(leaveName)).append("\n");
    sb.append("    maximumUnit: ").append(toIndentedString(maximumUnit)).append("\n");
    sb.append("    sexScope: ").append(toIndentedString(sexScope)).append("\n");
    sb.append("    smallestUnit: ").append(toIndentedString(smallestUnit)).append("\n");
    sb.append("    standardUnit: ").append(toIndentedString(standardUnit)).append("\n");
    sb.append("    stepUnit: ").append(toIndentedString(stepUnit)).append("\n");
    sb.append("    vacationRuleList: ").append(toIndentedString(vacationRuleList)).append("\n");
    sb.append("    vacationType: ").append(toIndentedString(vacationType)).append("\n");
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
