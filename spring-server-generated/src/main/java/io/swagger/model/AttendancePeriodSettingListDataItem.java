package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttendancePeriodSettingListDataItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AttendancePeriodSettingListDataItem   {
  @JsonProperty("allStaff")
  private Boolean allStaff = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("coverScopeList")
  private String coverScopeList = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("defaultPeriod")
  private Boolean defaultPeriod = null;

  @JsonProperty("departmentScopeList")
  private String departmentScopeList = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("excludeStaffScopeList")
  private String excludeStaffScopeList = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isCover")
  private String isCover = null;

  @JsonProperty("lockDays")
  private String lockDays = null;

  @JsonProperty("lockMonthlyReportType")
  private String lockMonthlyReportType = null;

  @JsonProperty("periodEndDay")
  private String periodEndDay = null;

  @JsonProperty("periodEndMonth")
  private String periodEndMonth = null;

  @JsonProperty("periodName")
  private String periodName = null;

  @JsonProperty("periodStartDay")
  private String periodStartDay = null;

  @JsonProperty("periodStartMonth")
  private String periodStartMonth = null;

  @JsonProperty("positionScopeList")
  private String positionScopeList = null;

  @JsonProperty("scopeStr")
  private String scopeStr = null;

  @JsonProperty("staffTypeScopeList")
  private String staffTypeScopeList = null;

  public AttendancePeriodSettingListDataItem allStaff(Boolean allStaff) {
    this.allStaff = allStaff;
    return this;
  }

  /**
   * Get allStaff
   * @return allStaff
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isAllStaff() {
    return allStaff;
  }

  public void setAllStaff(Boolean allStaff) {
    this.allStaff = allStaff;
  }

  public AttendancePeriodSettingListDataItem companyId(String companyId) {
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

  public AttendancePeriodSettingListDataItem coverScopeList(String coverScopeList) {
    this.coverScopeList = coverScopeList;
    return this;
  }

  /**
   * Get coverScopeList
   * @return coverScopeList
  **/
  @ApiModelProperty(value = "")
  
    public String getCoverScopeList() {
    return coverScopeList;
  }

  public void setCoverScopeList(String coverScopeList) {
    this.coverScopeList = coverScopeList;
  }

  public AttendancePeriodSettingListDataItem createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public AttendancePeriodSettingListDataItem defaultPeriod(Boolean defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
    return this;
  }

  /**
   * Get defaultPeriod
   * @return defaultPeriod
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isDefaultPeriod() {
    return defaultPeriod;
  }

  public void setDefaultPeriod(Boolean defaultPeriod) {
    this.defaultPeriod = defaultPeriod;
  }

  public AttendancePeriodSettingListDataItem departmentScopeList(String departmentScopeList) {
    this.departmentScopeList = departmentScopeList;
    return this;
  }

  /**
   * Get departmentScopeList
   * @return departmentScopeList
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentScopeList() {
    return departmentScopeList;
  }

  public void setDepartmentScopeList(String departmentScopeList) {
    this.departmentScopeList = departmentScopeList;
  }

  public AttendancePeriodSettingListDataItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AttendancePeriodSettingListDataItem excludeStaffScopeList(String excludeStaffScopeList) {
    this.excludeStaffScopeList = excludeStaffScopeList;
    return this;
  }

  /**
   * Get excludeStaffScopeList
   * @return excludeStaffScopeList
  **/
  @ApiModelProperty(value = "")
  
    public String getExcludeStaffScopeList() {
    return excludeStaffScopeList;
  }

  public void setExcludeStaffScopeList(String excludeStaffScopeList) {
    this.excludeStaffScopeList = excludeStaffScopeList;
  }

  public AttendancePeriodSettingListDataItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2328d2b9-d1cb-4047-a847-41d71bdd61af", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttendancePeriodSettingListDataItem isCover(String isCover) {
    this.isCover = isCover;
    return this;
  }

  /**
   * Get isCover
   * @return isCover
  **/
  @ApiModelProperty(value = "")
  
    public String getIsCover() {
    return isCover;
  }

  public void setIsCover(String isCover) {
    this.isCover = isCover;
  }

  public AttendancePeriodSettingListDataItem lockDays(String lockDays) {
    this.lockDays = lockDays;
    return this;
  }

  /**
   * Get lockDays
   * @return lockDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getLockDays() {
    return lockDays;
  }

  public void setLockDays(String lockDays) {
    this.lockDays = lockDays;
  }

  public AttendancePeriodSettingListDataItem lockMonthlyReportType(String lockMonthlyReportType) {
    this.lockMonthlyReportType = lockMonthlyReportType;
    return this;
  }

  /**
   * Get lockMonthlyReportType
   * @return lockMonthlyReportType
  **/
  @ApiModelProperty(example = "MANUAL_LOCK", value = "")
  
    public String getLockMonthlyReportType() {
    return lockMonthlyReportType;
  }

  public void setLockMonthlyReportType(String lockMonthlyReportType) {
    this.lockMonthlyReportType = lockMonthlyReportType;
  }

  public AttendancePeriodSettingListDataItem periodEndDay(String periodEndDay) {
    this.periodEndDay = periodEndDay;
    return this;
  }

  /**
   * Get periodEndDay
   * @return periodEndDay
  **/
  @ApiModelProperty(example = "END_OF_MONTH", value = "")
  
    public String getPeriodEndDay() {
    return periodEndDay;
  }

  public void setPeriodEndDay(String periodEndDay) {
    this.periodEndDay = periodEndDay;
  }

  public AttendancePeriodSettingListDataItem periodEndMonth(String periodEndMonth) {
    this.periodEndMonth = periodEndMonth;
    return this;
  }

  /**
   * Get periodEndMonth
   * @return periodEndMonth
  **/
  @ApiModelProperty(example = "THIS_MONTH", value = "")
  
    public String getPeriodEndMonth() {
    return periodEndMonth;
  }

  public void setPeriodEndMonth(String periodEndMonth) {
    this.periodEndMonth = periodEndMonth;
  }

  public AttendancePeriodSettingListDataItem periodName(String periodName) {
    this.periodName = periodName;
    return this;
  }

  /**
   * Get periodName
   * @return periodName
  **/
  @ApiModelProperty(example = "默认考勤周期", value = "")
  
    public String getPeriodName() {
    return periodName;
  }

  public void setPeriodName(String periodName) {
    this.periodName = periodName;
  }

  public AttendancePeriodSettingListDataItem periodStartDay(String periodStartDay) {
    this.periodStartDay = periodStartDay;
    return this;
  }

  /**
   * Get periodStartDay
   * @return periodStartDay
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public String getPeriodStartDay() {
    return periodStartDay;
  }

  public void setPeriodStartDay(String periodStartDay) {
    this.periodStartDay = periodStartDay;
  }

  public AttendancePeriodSettingListDataItem periodStartMonth(String periodStartMonth) {
    this.periodStartMonth = periodStartMonth;
    return this;
  }

  /**
   * Get periodStartMonth
   * @return periodStartMonth
  **/
  @ApiModelProperty(example = "THIS_MONTH", value = "")
  
    public String getPeriodStartMonth() {
    return periodStartMonth;
  }

  public void setPeriodStartMonth(String periodStartMonth) {
    this.periodStartMonth = periodStartMonth;
  }

  public AttendancePeriodSettingListDataItem positionScopeList(String positionScopeList) {
    this.positionScopeList = positionScopeList;
    return this;
  }

  /**
   * Get positionScopeList
   * @return positionScopeList
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionScopeList() {
    return positionScopeList;
  }

  public void setPositionScopeList(String positionScopeList) {
    this.positionScopeList = positionScopeList;
  }

  public AttendancePeriodSettingListDataItem scopeStr(String scopeStr) {
    this.scopeStr = scopeStr;
    return this;
  }

  /**
   * Get scopeStr
   * @return scopeStr
  **/
  @ApiModelProperty(value = "")
  
    public String getScopeStr() {
    return scopeStr;
  }

  public void setScopeStr(String scopeStr) {
    this.scopeStr = scopeStr;
  }

  public AttendancePeriodSettingListDataItem staffTypeScopeList(String staffTypeScopeList) {
    this.staffTypeScopeList = staffTypeScopeList;
    return this;
  }

  /**
   * Get staffTypeScopeList
   * @return staffTypeScopeList
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffTypeScopeList() {
    return staffTypeScopeList;
  }

  public void setStaffTypeScopeList(String staffTypeScopeList) {
    this.staffTypeScopeList = staffTypeScopeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttendancePeriodSettingListDataItem attendancePeriodSettingListDataItem = (AttendancePeriodSettingListDataItem) o;
    return Objects.equals(this.allStaff, attendancePeriodSettingListDataItem.allStaff) &&
        Objects.equals(this.companyId, attendancePeriodSettingListDataItem.companyId) &&
        Objects.equals(this.coverScopeList, attendancePeriodSettingListDataItem.coverScopeList) &&
        Objects.equals(this.createdDate, attendancePeriodSettingListDataItem.createdDate) &&
        Objects.equals(this.defaultPeriod, attendancePeriodSettingListDataItem.defaultPeriod) &&
        Objects.equals(this.departmentScopeList, attendancePeriodSettingListDataItem.departmentScopeList) &&
        Objects.equals(this.enabled, attendancePeriodSettingListDataItem.enabled) &&
        Objects.equals(this.excludeStaffScopeList, attendancePeriodSettingListDataItem.excludeStaffScopeList) &&
        Objects.equals(this.id, attendancePeriodSettingListDataItem.id) &&
        Objects.equals(this.isCover, attendancePeriodSettingListDataItem.isCover) &&
        Objects.equals(this.lockDays, attendancePeriodSettingListDataItem.lockDays) &&
        Objects.equals(this.lockMonthlyReportType, attendancePeriodSettingListDataItem.lockMonthlyReportType) &&
        Objects.equals(this.periodEndDay, attendancePeriodSettingListDataItem.periodEndDay) &&
        Objects.equals(this.periodEndMonth, attendancePeriodSettingListDataItem.periodEndMonth) &&
        Objects.equals(this.periodName, attendancePeriodSettingListDataItem.periodName) &&
        Objects.equals(this.periodStartDay, attendancePeriodSettingListDataItem.periodStartDay) &&
        Objects.equals(this.periodStartMonth, attendancePeriodSettingListDataItem.periodStartMonth) &&
        Objects.equals(this.positionScopeList, attendancePeriodSettingListDataItem.positionScopeList) &&
        Objects.equals(this.scopeStr, attendancePeriodSettingListDataItem.scopeStr) &&
        Objects.equals(this.staffTypeScopeList, attendancePeriodSettingListDataItem.staffTypeScopeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allStaff, companyId, coverScopeList, createdDate, defaultPeriod, departmentScopeList, enabled, excludeStaffScopeList, id, isCover, lockDays, lockMonthlyReportType, periodEndDay, periodEndMonth, periodName, periodStartDay, periodStartMonth, positionScopeList, scopeStr, staffTypeScopeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendancePeriodSettingListDataItem {\n");
    
    sb.append("    allStaff: ").append(toIndentedString(allStaff)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    coverScopeList: ").append(toIndentedString(coverScopeList)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    defaultPeriod: ").append(toIndentedString(defaultPeriod)).append("\n");
    sb.append("    departmentScopeList: ").append(toIndentedString(departmentScopeList)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    excludeStaffScopeList: ").append(toIndentedString(excludeStaffScopeList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCover: ").append(toIndentedString(isCover)).append("\n");
    sb.append("    lockDays: ").append(toIndentedString(lockDays)).append("\n");
    sb.append("    lockMonthlyReportType: ").append(toIndentedString(lockMonthlyReportType)).append("\n");
    sb.append("    periodEndDay: ").append(toIndentedString(periodEndDay)).append("\n");
    sb.append("    periodEndMonth: ").append(toIndentedString(periodEndMonth)).append("\n");
    sb.append("    periodName: ").append(toIndentedString(periodName)).append("\n");
    sb.append("    periodStartDay: ").append(toIndentedString(periodStartDay)).append("\n");
    sb.append("    periodStartMonth: ").append(toIndentedString(periodStartMonth)).append("\n");
    sb.append("    positionScopeList: ").append(toIndentedString(positionScopeList)).append("\n");
    sb.append("    scopeStr: ").append(toIndentedString(scopeStr)).append("\n");
    sb.append("    staffTypeScopeList: ").append(toIndentedString(staffTypeScopeList)).append("\n");
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
