package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfile;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemStaff;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemTaxRole;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentEffectivePayrollInfoContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItem   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("corporationId")
  private String corporationId = null;

  @JsonProperty("corporationName")
  private String corporationName = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("disabledFreeTaxRuleName")
  private String disabledFreeTaxRuleName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("salaryPlanList")
  private String salaryPlanList = null;

  @JsonProperty("salaryPlans")
  private Object salaryPlans = null;

  @JsonProperty("salaryProfile")
  private CurrentEffectivePayrollInfoContentItemSalaryProfile salaryProfile = null;

  @JsonProperty("staff")
  private CurrentEffectivePayrollInfoContentItemStaff staff = null;

  @JsonProperty("taxExemption")
  private String taxExemption = null;

  @JsonProperty("taxRole")
  private CurrentEffectivePayrollInfoContentItemTaxRole taxRole = null;

  @JsonProperty("totalAmount")
  private String totalAmount = null;

  @JsonProperty("updatedAt")
  private LocalDate updatedAt = null;

  @JsonProperty("workHourType")
  private String workHourType = null;

  public CurrentEffectivePayrollInfoContentItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(example = "36dbfa02cbe54b11a5543d46b5112168", value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CurrentEffectivePayrollInfoContentItem corporationId(String corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * Get corporationId
   * @return corporationId
  **/
  @ApiModelProperty(value = "")
  
    public String getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(String corporationId) {
    this.corporationId = corporationId;
  }

  public CurrentEffectivePayrollInfoContentItem corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(value = "")
  
    public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public CurrentEffectivePayrollInfoContentItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2020-08-04T08:02:26.000+0000", value = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CurrentEffectivePayrollInfoContentItem disabledFreeTaxRuleName(String disabledFreeTaxRuleName) {
    this.disabledFreeTaxRuleName = disabledFreeTaxRuleName;
    return this;
  }

  /**
   * Get disabledFreeTaxRuleName
   * @return disabledFreeTaxRuleName
  **/
  @ApiModelProperty(value = "")
  
    public String getDisabledFreeTaxRuleName() {
    return disabledFreeTaxRuleName;
  }

  public void setDisabledFreeTaxRuleName(String disabledFreeTaxRuleName) {
    this.disabledFreeTaxRuleName = disabledFreeTaxRuleName;
  }

  public CurrentEffectivePayrollInfoContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "dd3116d7-5a9b-4f74-ad4f-2326e48bf084", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentEffectivePayrollInfoContentItem salaryPlanList(String salaryPlanList) {
    this.salaryPlanList = salaryPlanList;
    return this;
  }

  /**
   * Get salaryPlanList
   * @return salaryPlanList
  **/
  @ApiModelProperty(value = "")
  
    public String getSalaryPlanList() {
    return salaryPlanList;
  }

  public void setSalaryPlanList(String salaryPlanList) {
    this.salaryPlanList = salaryPlanList;
  }

  public CurrentEffectivePayrollInfoContentItem salaryPlans(Object salaryPlans) {
    this.salaryPlans = salaryPlans;
    return this;
  }

  /**
   * Get salaryPlans
   * @return salaryPlans
  **/
  @ApiModelProperty(value = "")
  
    public Object getSalaryPlans() {
    return salaryPlans;
  }

  public void setSalaryPlans(Object salaryPlans) {
    this.salaryPlans = salaryPlans;
  }

  public CurrentEffectivePayrollInfoContentItem salaryProfile(CurrentEffectivePayrollInfoContentItemSalaryProfile salaryProfile) {
    this.salaryProfile = salaryProfile;
    return this;
  }

  /**
   * Get salaryProfile
   * @return salaryProfile
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfile getSalaryProfile() {
    return salaryProfile;
  }

  public void setSalaryProfile(CurrentEffectivePayrollInfoContentItemSalaryProfile salaryProfile) {
    this.salaryProfile = salaryProfile;
  }

  public CurrentEffectivePayrollInfoContentItem staff(CurrentEffectivePayrollInfoContentItemStaff staff) {
    this.staff = staff;
    return this;
  }

  /**
   * Get staff
   * @return staff
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemStaff getStaff() {
    return staff;
  }

  public void setStaff(CurrentEffectivePayrollInfoContentItemStaff staff) {
    this.staff = staff;
  }

  public CurrentEffectivePayrollInfoContentItem taxExemption(String taxExemption) {
    this.taxExemption = taxExemption;
    return this;
  }

  /**
   * Get taxExemption
   * @return taxExemption
  **/
  @ApiModelProperty(value = "")
  
    public String getTaxExemption() {
    return taxExemption;
  }

  public void setTaxExemption(String taxExemption) {
    this.taxExemption = taxExemption;
  }

  public CurrentEffectivePayrollInfoContentItem taxRole(CurrentEffectivePayrollInfoContentItemTaxRole taxRole) {
    this.taxRole = taxRole;
    return this;
  }

  /**
   * Get taxRole
   * @return taxRole
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemTaxRole getTaxRole() {
    return taxRole;
  }

  public void setTaxRole(CurrentEffectivePayrollInfoContentItemTaxRole taxRole) {
    this.taxRole = taxRole;
  }

  public CurrentEffectivePayrollInfoContentItem totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CurrentEffectivePayrollInfoContentItem updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CurrentEffectivePayrollInfoContentItem workHourType(String workHourType) {
    this.workHourType = workHourType;
    return this;
  }

  /**
   * Get workHourType
   * @return workHourType
  **/
  @ApiModelProperty(value = "")
  
    public String getWorkHourType() {
    return workHourType;
  }

  public void setWorkHourType(String workHourType) {
    this.workHourType = workHourType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItem currentEffectivePayrollInfoContentItem = (CurrentEffectivePayrollInfoContentItem) o;
    return Objects.equals(this.companyId, currentEffectivePayrollInfoContentItem.companyId) &&
        Objects.equals(this.corporationId, currentEffectivePayrollInfoContentItem.corporationId) &&
        Objects.equals(this.corporationName, currentEffectivePayrollInfoContentItem.corporationName) &&
        Objects.equals(this.createdAt, currentEffectivePayrollInfoContentItem.createdAt) &&
        Objects.equals(this.disabledFreeTaxRuleName, currentEffectivePayrollInfoContentItem.disabledFreeTaxRuleName) &&
        Objects.equals(this.id, currentEffectivePayrollInfoContentItem.id) &&
        Objects.equals(this.salaryPlanList, currentEffectivePayrollInfoContentItem.salaryPlanList) &&
        Objects.equals(this.salaryPlans, currentEffectivePayrollInfoContentItem.salaryPlans) &&
        Objects.equals(this.salaryProfile, currentEffectivePayrollInfoContentItem.salaryProfile) &&
        Objects.equals(this.staff, currentEffectivePayrollInfoContentItem.staff) &&
        Objects.equals(this.taxExemption, currentEffectivePayrollInfoContentItem.taxExemption) &&
        Objects.equals(this.taxRole, currentEffectivePayrollInfoContentItem.taxRole) &&
        Objects.equals(this.totalAmount, currentEffectivePayrollInfoContentItem.totalAmount) &&
        Objects.equals(this.updatedAt, currentEffectivePayrollInfoContentItem.updatedAt) &&
        Objects.equals(this.workHourType, currentEffectivePayrollInfoContentItem.workHourType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, corporationId, corporationName, createdAt, disabledFreeTaxRuleName, id, salaryPlanList, salaryPlans, salaryProfile, staff, taxExemption, taxRole, totalAmount, updatedAt, workHourType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItem {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    disabledFreeTaxRuleName: ").append(toIndentedString(disabledFreeTaxRuleName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salaryPlanList: ").append(toIndentedString(salaryPlanList)).append("\n");
    sb.append("    salaryPlans: ").append(toIndentedString(salaryPlans)).append("\n");
    sb.append("    salaryProfile: ").append(toIndentedString(salaryProfile)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    taxExemption: ").append(toIndentedString(taxExemption)).append("\n");
    sb.append("    taxRole: ").append(toIndentedString(taxRole)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workHourType: ").append(toIndentedString(workHourType)).append("\n");
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
