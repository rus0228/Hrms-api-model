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
 * CompanyPayslipResultItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyPayslipResultItem   {
  @JsonProperty("accessPrivilege")
  private String accessPrivilege = null;

  @JsonProperty("feedBackNum")
  private String feedBackNum = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("notConfirmNum")
  private Integer notConfirmNum = null;

  @JsonProperty("payslipConfigId")
  private String payslipConfigId = null;

  @JsonProperty("payslipConfigName")
  private String payslipConfigName = null;

  @JsonProperty("publishNum")
  private Integer publishNum = null;

  @JsonProperty("publishedAt")
  private String publishedAt = null;

  @JsonProperty("resourcePublicity")
  private String resourcePublicity = null;

  @JsonProperty("salaryPlanId")
  private String salaryPlanId = null;

  @JsonProperty("staffNum")
  private Integer staffNum = null;

  @JsonProperty("tableCode")
  private String tableCode = null;

  @JsonProperty("year")
  private String year = null;

  public CompanyPayslipResultItem accessPrivilege(String accessPrivilege) {
    this.accessPrivilege = accessPrivilege;
    return this;
  }

  /**
   * Get accessPrivilege
   * @return accessPrivilege
  **/
  @ApiModelProperty(example = "OWNER", value = "")
  
    public String getAccessPrivilege() {
    return accessPrivilege;
  }

  public void setAccessPrivilege(String accessPrivilege) {
    this.accessPrivilege = accessPrivilege;
  }

  public CompanyPayslipResultItem feedBackNum(String feedBackNum) {
    this.feedBackNum = feedBackNum;
    return this;
  }

  /**
   * Get feedBackNum
   * @return feedBackNum
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getFeedBackNum() {
    return feedBackNum;
  }

  public void setFeedBackNum(String feedBackNum) {
    this.feedBackNum = feedBackNum;
  }

  public CompanyPayslipResultItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "24717", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanyPayslipResultItem month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "10", value = "")
  
    public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public CompanyPayslipResultItem notConfirmNum(Integer notConfirmNum) {
    this.notConfirmNum = notConfirmNum;
    return this;
  }

  /**
   * Get notConfirmNum
   * @return notConfirmNum
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getNotConfirmNum() {
    return notConfirmNum;
  }

  public void setNotConfirmNum(Integer notConfirmNum) {
    this.notConfirmNum = notConfirmNum;
  }

  public CompanyPayslipResultItem payslipConfigId(String payslipConfigId) {
    this.payslipConfigId = payslipConfigId;
    return this;
  }

  /**
   * Get payslipConfigId
   * @return payslipConfigId
  **/
  @ApiModelProperty(example = "10833", value = "")
  
    public String getPayslipConfigId() {
    return payslipConfigId;
  }

  public void setPayslipConfigId(String payslipConfigId) {
    this.payslipConfigId = payslipConfigId;
  }

  public CompanyPayslipResultItem payslipConfigName(String payslipConfigName) {
    this.payslipConfigName = payslipConfigName;
    return this;
  }

  /**
   * Get payslipConfigName
   * @return payslipConfigName
  **/
  @ApiModelProperty(example = "杭州艾骊莎薪资核算-默认工资单20200805152843", value = "")
  
    public String getPayslipConfigName() {
    return payslipConfigName;
  }

  public void setPayslipConfigName(String payslipConfigName) {
    this.payslipConfigName = payslipConfigName;
  }

  public CompanyPayslipResultItem publishNum(Integer publishNum) {
    this.publishNum = publishNum;
    return this;
  }

  /**
   * Get publishNum
   * @return publishNum
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPublishNum() {
    return publishNum;
  }

  public void setPublishNum(Integer publishNum) {
    this.publishNum = publishNum;
  }

  public CompanyPayslipResultItem publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
  **/
  @ApiModelProperty(value = "")
  
    public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public CompanyPayslipResultItem resourcePublicity(String resourcePublicity) {
    this.resourcePublicity = resourcePublicity;
    return this;
  }

  /**
   * Get resourcePublicity
   * @return resourcePublicity
  **/
  @ApiModelProperty(example = "PERSONAL", value = "")
  
    public String getResourcePublicity() {
    return resourcePublicity;
  }

  public void setResourcePublicity(String resourcePublicity) {
    this.resourcePublicity = resourcePublicity;
  }

  public CompanyPayslipResultItem salaryPlanId(String salaryPlanId) {
    this.salaryPlanId = salaryPlanId;
    return this;
  }

  /**
   * Get salaryPlanId
   * @return salaryPlanId
  **/
  @ApiModelProperty(example = "10010597", value = "")
  
    public String getSalaryPlanId() {
    return salaryPlanId;
  }

  public void setSalaryPlanId(String salaryPlanId) {
    this.salaryPlanId = salaryPlanId;
  }

  public CompanyPayslipResultItem staffNum(Integer staffNum) {
    this.staffNum = staffNum;
    return this;
  }

  /**
   * Get staffNum
   * @return staffNum
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getStaffNum() {
    return staffNum;
  }

  public void setStaffNum(Integer staffNum) {
    this.staffNum = staffNum;
  }

  public CompanyPayslipResultItem tableCode(String tableCode) {
    this.tableCode = tableCode;
    return this;
  }

  /**
   * Get tableCode
   * @return tableCode
  **/
  @ApiModelProperty(example = "payroll.table.payslip36dbfa02cbe54b11a5543d46b511216810833", value = "")
  
    public String getTableCode() {
    return tableCode;
  }

  public void setTableCode(String tableCode) {
    this.tableCode = tableCode;
  }

  public CompanyPayslipResultItem year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPayslipResultItem companyPayslipResultItem = (CompanyPayslipResultItem) o;
    return Objects.equals(this.accessPrivilege, companyPayslipResultItem.accessPrivilege) &&
        Objects.equals(this.feedBackNum, companyPayslipResultItem.feedBackNum) &&
        Objects.equals(this.id, companyPayslipResultItem.id) &&
        Objects.equals(this.month, companyPayslipResultItem.month) &&
        Objects.equals(this.notConfirmNum, companyPayslipResultItem.notConfirmNum) &&
        Objects.equals(this.payslipConfigId, companyPayslipResultItem.payslipConfigId) &&
        Objects.equals(this.payslipConfigName, companyPayslipResultItem.payslipConfigName) &&
        Objects.equals(this.publishNum, companyPayslipResultItem.publishNum) &&
        Objects.equals(this.publishedAt, companyPayslipResultItem.publishedAt) &&
        Objects.equals(this.resourcePublicity, companyPayslipResultItem.resourcePublicity) &&
        Objects.equals(this.salaryPlanId, companyPayslipResultItem.salaryPlanId) &&
        Objects.equals(this.staffNum, companyPayslipResultItem.staffNum) &&
        Objects.equals(this.tableCode, companyPayslipResultItem.tableCode) &&
        Objects.equals(this.year, companyPayslipResultItem.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPrivilege, feedBackNum, id, month, notConfirmNum, payslipConfigId, payslipConfigName, publishNum, publishedAt, resourcePublicity, salaryPlanId, staffNum, tableCode, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPayslipResultItem {\n");
    
    sb.append("    accessPrivilege: ").append(toIndentedString(accessPrivilege)).append("\n");
    sb.append("    feedBackNum: ").append(toIndentedString(feedBackNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    notConfirmNum: ").append(toIndentedString(notConfirmNum)).append("\n");
    sb.append("    payslipConfigId: ").append(toIndentedString(payslipConfigId)).append("\n");
    sb.append("    payslipConfigName: ").append(toIndentedString(payslipConfigName)).append("\n");
    sb.append("    publishNum: ").append(toIndentedString(publishNum)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    resourcePublicity: ").append(toIndentedString(resourcePublicity)).append("\n");
    sb.append("    salaryPlanId: ").append(toIndentedString(salaryPlanId)).append("\n");
    sb.append("    staffNum: ").append(toIndentedString(staffNum)).append("\n");
    sb.append("    tableCode: ").append(toIndentedString(tableCode)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
