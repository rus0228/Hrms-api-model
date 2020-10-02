package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SickBillPageContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SickBillPageContentItem   {
  @JsonProperty("belongsToYear")
  private String belongsToYear = null;

  @JsonProperty("canUseDayHour")
  private String canUseDayHour = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("dueDate")
  private String dueDate = null;

  @JsonProperty("enrollInDate")
  private String enrollInDate = null;

  @JsonProperty("enrollWorkYears")
  private BigDecimal enrollWorkYears = null;

  @JsonProperty("hasUseBuckleSalaryDayHour")
  private String hasUseBuckleSalaryDayHour = null;

  @JsonProperty("hasUseBuckleSalaryDays")
  private Integer hasUseBuckleSalaryDays = null;

  @JsonProperty("hasUseBuckleSalaryHours")
  private Integer hasUseBuckleSalaryHours = null;

  @JsonProperty("hasUseDayHour")
  private String hasUseDayHour = null;

  @JsonProperty("hasUseLeaveDays")
  private BigDecimal hasUseLeaveDays = null;

  @JsonProperty("hasUseLeaveHours")
  private BigDecimal hasUseLeaveHours = null;

  @JsonProperty("hasUseTotalLeaveDayHours")
  private String hasUseTotalLeaveDayHours = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isArchiveBill")
  private Boolean isArchiveBill = null;

  @JsonProperty("lastTimeCalculationTime")
  private String lastTimeCalculationTime = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  @JsonProperty("totalLeaveDayHours")
  private String totalLeaveDayHours = null;

  @JsonProperty("totalLeaveDays")
  private Integer totalLeaveDays = null;

  @JsonProperty("totalLeaveHours")
  private BigDecimal totalLeaveHours = null;

  @JsonProperty("updateTime")
  private String updateTime = null;

  @JsonProperty("vacationType")
  private String vacationType = null;

  public SickBillPageContentItem belongsToYear(String belongsToYear) {
    this.belongsToYear = belongsToYear;
    return this;
  }

  /**
   * Get belongsToYear
   * @return belongsToYear
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public String getBelongsToYear() {
    return belongsToYear;
  }

  public void setBelongsToYear(String belongsToYear) {
    this.belongsToYear = belongsToYear;
  }

  public SickBillPageContentItem canUseDayHour(String canUseDayHour) {
    this.canUseDayHour = canUseDayHour;
    return this;
  }

  /**
   * Get canUseDayHour
   * @return canUseDayHour
  **/
  @ApiModelProperty(value = "")
  
    public String getCanUseDayHour() {
    return canUseDayHour;
  }

  public void setCanUseDayHour(String canUseDayHour) {
    this.canUseDayHour = canUseDayHour;
  }

  public SickBillPageContentItem companyId(String companyId) {
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

  public SickBillPageContentItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "21", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public SickBillPageContentItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "行政部", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public SickBillPageContentItem dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "1609344000000", value = "")
  
    public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public SickBillPageContentItem enrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "1561910400000", value = "")
  
    public String getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public SickBillPageContentItem enrollWorkYears(BigDecimal enrollWorkYears) {
    this.enrollWorkYears = enrollWorkYears;
    return this;
  }

  /**
   * Get enrollWorkYears
   * @return enrollWorkYears
  **/
  @ApiModelProperty(example = "1.2", value = "")
  
    @Valid
    public BigDecimal getEnrollWorkYears() {
    return enrollWorkYears;
  }

  public void setEnrollWorkYears(BigDecimal enrollWorkYears) {
    this.enrollWorkYears = enrollWorkYears;
  }

  public SickBillPageContentItem hasUseBuckleSalaryDayHour(String hasUseBuckleSalaryDayHour) {
    this.hasUseBuckleSalaryDayHour = hasUseBuckleSalaryDayHour;
    return this;
  }

  /**
   * Get hasUseBuckleSalaryDayHour
   * @return hasUseBuckleSalaryDayHour
  **/
  @ApiModelProperty(value = "")
  
    public String getHasUseBuckleSalaryDayHour() {
    return hasUseBuckleSalaryDayHour;
  }

  public void setHasUseBuckleSalaryDayHour(String hasUseBuckleSalaryDayHour) {
    this.hasUseBuckleSalaryDayHour = hasUseBuckleSalaryDayHour;
  }

  public SickBillPageContentItem hasUseBuckleSalaryDays(Integer hasUseBuckleSalaryDays) {
    this.hasUseBuckleSalaryDays = hasUseBuckleSalaryDays;
    return this;
  }

  /**
   * Get hasUseBuckleSalaryDays
   * @return hasUseBuckleSalaryDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getHasUseBuckleSalaryDays() {
    return hasUseBuckleSalaryDays;
  }

  public void setHasUseBuckleSalaryDays(Integer hasUseBuckleSalaryDays) {
    this.hasUseBuckleSalaryDays = hasUseBuckleSalaryDays;
  }

  public SickBillPageContentItem hasUseBuckleSalaryHours(Integer hasUseBuckleSalaryHours) {
    this.hasUseBuckleSalaryHours = hasUseBuckleSalaryHours;
    return this;
  }

  /**
   * Get hasUseBuckleSalaryHours
   * @return hasUseBuckleSalaryHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getHasUseBuckleSalaryHours() {
    return hasUseBuckleSalaryHours;
  }

  public void setHasUseBuckleSalaryHours(Integer hasUseBuckleSalaryHours) {
    this.hasUseBuckleSalaryHours = hasUseBuckleSalaryHours;
  }

  public SickBillPageContentItem hasUseDayHour(String hasUseDayHour) {
    this.hasUseDayHour = hasUseDayHour;
    return this;
  }

  /**
   * Get hasUseDayHour
   * @return hasUseDayHour
  **/
  @ApiModelProperty(value = "")
  
    public String getHasUseDayHour() {
    return hasUseDayHour;
  }

  public void setHasUseDayHour(String hasUseDayHour) {
    this.hasUseDayHour = hasUseDayHour;
  }

  public SickBillPageContentItem hasUseLeaveDays(BigDecimal hasUseLeaveDays) {
    this.hasUseLeaveDays = hasUseLeaveDays;
    return this;
  }

  /**
   * Get hasUseLeaveDays
   * @return hasUseLeaveDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseLeaveDays() {
    return hasUseLeaveDays;
  }

  public void setHasUseLeaveDays(BigDecimal hasUseLeaveDays) {
    this.hasUseLeaveDays = hasUseLeaveDays;
  }

  public SickBillPageContentItem hasUseLeaveHours(BigDecimal hasUseLeaveHours) {
    this.hasUseLeaveHours = hasUseLeaveHours;
    return this;
  }

  /**
   * Get hasUseLeaveHours
   * @return hasUseLeaveHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseLeaveHours() {
    return hasUseLeaveHours;
  }

  public void setHasUseLeaveHours(BigDecimal hasUseLeaveHours) {
    this.hasUseLeaveHours = hasUseLeaveHours;
  }

  public SickBillPageContentItem hasUseTotalLeaveDayHours(String hasUseTotalLeaveDayHours) {
    this.hasUseTotalLeaveDayHours = hasUseTotalLeaveDayHours;
    return this;
  }

  /**
   * Get hasUseTotalLeaveDayHours
   * @return hasUseTotalLeaveDayHours
  **/
  @ApiModelProperty(value = "")
  
    public String getHasUseTotalLeaveDayHours() {
    return hasUseTotalLeaveDayHours;
  }

  public void setHasUseTotalLeaveDayHours(String hasUseTotalLeaveDayHours) {
    this.hasUseTotalLeaveDayHours = hasUseTotalLeaveDayHours;
  }

  public SickBillPageContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "b4c71e8d-d6e1-4d29-b478-b97906cb2eab", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SickBillPageContentItem isArchiveBill(Boolean isArchiveBill) {
    this.isArchiveBill = isArchiveBill;
    return this;
  }

  /**
   * Get isArchiveBill
   * @return isArchiveBill
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsArchiveBill() {
    return isArchiveBill;
  }

  public void setIsArchiveBill(Boolean isArchiveBill) {
    this.isArchiveBill = isArchiveBill;
  }

  public SickBillPageContentItem lastTimeCalculationTime(String lastTimeCalculationTime) {
    this.lastTimeCalculationTime = lastTimeCalculationTime;
    return this;
  }

  /**
   * Get lastTimeCalculationTime
   * @return lastTimeCalculationTime
  **/
  @ApiModelProperty(example = "1577808000000", value = "")
  
    public String getLastTimeCalculationTime() {
    return lastTimeCalculationTime;
  }

  public void setLastTimeCalculationTime(String lastTimeCalculationTime) {
    this.lastTimeCalculationTime = lastTimeCalculationTime;
  }

  public SickBillPageContentItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "15388906455", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public SickBillPageContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "6aab1eeb-5a81-4927-8d42-5c83c5d37d1c", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public SickBillPageContentItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "聂晶", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public SickBillPageContentItem staffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
    return this;
  }

  /**
   * Get staffStatus
   * @return staffStatus
  **/
  @ApiModelProperty(example = "IN_SERVICE", value = "")
  
    public String getStaffStatus() {
    return staffStatus;
  }

  public void setStaffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
  }

  public SickBillPageContentItem totalLeaveDayHours(String totalLeaveDayHours) {
    this.totalLeaveDayHours = totalLeaveDayHours;
    return this;
  }

  /**
   * Get totalLeaveDayHours
   * @return totalLeaveDayHours
  **/
  @ApiModelProperty(value = "")
  
    public String getTotalLeaveDayHours() {
    return totalLeaveDayHours;
  }

  public void setTotalLeaveDayHours(String totalLeaveDayHours) {
    this.totalLeaveDayHours = totalLeaveDayHours;
  }

  public SickBillPageContentItem totalLeaveDays(Integer totalLeaveDays) {
    this.totalLeaveDays = totalLeaveDays;
    return this;
  }

  /**
   * Get totalLeaveDays
   * @return totalLeaveDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getTotalLeaveDays() {
    return totalLeaveDays;
  }

  public void setTotalLeaveDays(Integer totalLeaveDays) {
    this.totalLeaveDays = totalLeaveDays;
  }

  public SickBillPageContentItem totalLeaveHours(BigDecimal totalLeaveHours) {
    this.totalLeaveHours = totalLeaveHours;
    return this;
  }

  /**
   * Get totalLeaveHours
   * @return totalLeaveHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalLeaveHours() {
    return totalLeaveHours;
  }

  public void setTotalLeaveHours(BigDecimal totalLeaveHours) {
    this.totalLeaveHours = totalLeaveHours;
  }

  public SickBillPageContentItem updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(example = "1595495405000", value = "")
  
    public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public SickBillPageContentItem vacationType(String vacationType) {
    this.vacationType = vacationType;
    return this;
  }

  /**
   * Get vacationType
   * @return vacationType
  **/
  @ApiModelProperty(example = "SICK_LEAVE", value = "")
  
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
    SickBillPageContentItem sickBillPageContentItem = (SickBillPageContentItem) o;
    return Objects.equals(this.belongsToYear, sickBillPageContentItem.belongsToYear) &&
        Objects.equals(this.canUseDayHour, sickBillPageContentItem.canUseDayHour) &&
        Objects.equals(this.companyId, sickBillPageContentItem.companyId) &&
        Objects.equals(this.departmentId, sickBillPageContentItem.departmentId) &&
        Objects.equals(this.departmentName, sickBillPageContentItem.departmentName) &&
        Objects.equals(this.dueDate, sickBillPageContentItem.dueDate) &&
        Objects.equals(this.enrollInDate, sickBillPageContentItem.enrollInDate) &&
        Objects.equals(this.enrollWorkYears, sickBillPageContentItem.enrollWorkYears) &&
        Objects.equals(this.hasUseBuckleSalaryDayHour, sickBillPageContentItem.hasUseBuckleSalaryDayHour) &&
        Objects.equals(this.hasUseBuckleSalaryDays, sickBillPageContentItem.hasUseBuckleSalaryDays) &&
        Objects.equals(this.hasUseBuckleSalaryHours, sickBillPageContentItem.hasUseBuckleSalaryHours) &&
        Objects.equals(this.hasUseDayHour, sickBillPageContentItem.hasUseDayHour) &&
        Objects.equals(this.hasUseLeaveDays, sickBillPageContentItem.hasUseLeaveDays) &&
        Objects.equals(this.hasUseLeaveHours, sickBillPageContentItem.hasUseLeaveHours) &&
        Objects.equals(this.hasUseTotalLeaveDayHours, sickBillPageContentItem.hasUseTotalLeaveDayHours) &&
        Objects.equals(this.id, sickBillPageContentItem.id) &&
        Objects.equals(this.isArchiveBill, sickBillPageContentItem.isArchiveBill) &&
        Objects.equals(this.lastTimeCalculationTime, sickBillPageContentItem.lastTimeCalculationTime) &&
        Objects.equals(this.mobileNo, sickBillPageContentItem.mobileNo) &&
        Objects.equals(this.staffId, sickBillPageContentItem.staffId) &&
        Objects.equals(this.staffName, sickBillPageContentItem.staffName) &&
        Objects.equals(this.staffStatus, sickBillPageContentItem.staffStatus) &&
        Objects.equals(this.totalLeaveDayHours, sickBillPageContentItem.totalLeaveDayHours) &&
        Objects.equals(this.totalLeaveDays, sickBillPageContentItem.totalLeaveDays) &&
        Objects.equals(this.totalLeaveHours, sickBillPageContentItem.totalLeaveHours) &&
        Objects.equals(this.updateTime, sickBillPageContentItem.updateTime) &&
        Objects.equals(this.vacationType, sickBillPageContentItem.vacationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(belongsToYear, canUseDayHour, companyId, departmentId, departmentName, dueDate, enrollInDate, enrollWorkYears, hasUseBuckleSalaryDayHour, hasUseBuckleSalaryDays, hasUseBuckleSalaryHours, hasUseDayHour, hasUseLeaveDays, hasUseLeaveHours, hasUseTotalLeaveDayHours, id, isArchiveBill, lastTimeCalculationTime, mobileNo, staffId, staffName, staffStatus, totalLeaveDayHours, totalLeaveDays, totalLeaveHours, updateTime, vacationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SickBillPageContentItem {\n");
    
    sb.append("    belongsToYear: ").append(toIndentedString(belongsToYear)).append("\n");
    sb.append("    canUseDayHour: ").append(toIndentedString(canUseDayHour)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    enrollWorkYears: ").append(toIndentedString(enrollWorkYears)).append("\n");
    sb.append("    hasUseBuckleSalaryDayHour: ").append(toIndentedString(hasUseBuckleSalaryDayHour)).append("\n");
    sb.append("    hasUseBuckleSalaryDays: ").append(toIndentedString(hasUseBuckleSalaryDays)).append("\n");
    sb.append("    hasUseBuckleSalaryHours: ").append(toIndentedString(hasUseBuckleSalaryHours)).append("\n");
    sb.append("    hasUseDayHour: ").append(toIndentedString(hasUseDayHour)).append("\n");
    sb.append("    hasUseLeaveDays: ").append(toIndentedString(hasUseLeaveDays)).append("\n");
    sb.append("    hasUseLeaveHours: ").append(toIndentedString(hasUseLeaveHours)).append("\n");
    sb.append("    hasUseTotalLeaveDayHours: ").append(toIndentedString(hasUseTotalLeaveDayHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isArchiveBill: ").append(toIndentedString(isArchiveBill)).append("\n");
    sb.append("    lastTimeCalculationTime: ").append(toIndentedString(lastTimeCalculationTime)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
    sb.append("    totalLeaveDayHours: ").append(toIndentedString(totalLeaveDayHours)).append("\n");
    sb.append("    totalLeaveDays: ").append(toIndentedString(totalLeaveDays)).append("\n");
    sb.append("    totalLeaveHours: ").append(toIndentedString(totalLeaveHours)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
