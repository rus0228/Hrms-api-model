package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VacationDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class VacationDataContentItem   {
  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("duration")
  private BigDecimal duration = null;

  @JsonProperty("endHour")
  private OffsetDateTime endHour = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("processCode")
  private String processCode = null;

  @JsonProperty("processType")
  private String processType = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("resourceType")
  private String resourceType = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("startHour")
  private OffsetDateTime startHour = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("statusKey")
  private String statusKey = null;

  @JsonProperty("unit")
  private String unit = null;

  @JsonProperty("updateTime")
  private OffsetDateTime updateTime = null;

  @JsonProperty("vacationId")
  private String vacationId = null;

  @JsonProperty("vacationName")
  private String vacationName = null;

  @JsonProperty("vacationStatus")
  private String vacationStatus = null;

  @JsonProperty("vacationType")
  private String vacationType = null;

  public VacationDataContentItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public VacationDataContentItem duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "24", value = "")
  
    @Valid
    public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public VacationDataContentItem endHour(OffsetDateTime endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * Get endHour
   * @return endHour
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndHour() {
    return endHour;
  }

  public void setEndHour(OffsetDateTime endHour) {
    this.endHour = endHour;
  }

  public VacationDataContentItem endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public VacationDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "6fc9a694-048b-44ee-b96b-80712afc7d84", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacationDataContentItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "18073111159", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public VacationDataContentItem positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public VacationDataContentItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(example = "web讲师", value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public VacationDataContentItem processCode(String processCode) {
    this.processCode = processCode;
    return this;
  }

  /**
   * Get processCode
   * @return processCode
  **/
  @ApiModelProperty(value = "")
  
    public String getProcessCode() {
    return processCode;
  }

  public void setProcessCode(String processCode) {
    this.processCode = processCode;
  }

  public VacationDataContentItem processType(String processType) {
    this.processType = processType;
    return this;
  }

  /**
   * Get processType
   * @return processType
  **/
  @ApiModelProperty(value = "")
  
    public String getProcessType() {
    return processType;
  }

  public void setProcessType(String processType) {
    this.processType = processType;
  }

  public VacationDataContentItem resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  **/
  @ApiModelProperty(example = "HR新增(13567190293)", value = "")
  
    public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public VacationDataContentItem resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  **/
  @ApiModelProperty(example = "INSERT", value = "")
  
    public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public VacationDataContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public VacationDataContentItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "刘杰音", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public VacationDataContentItem staffNo(String staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
  }

  public VacationDataContentItem startHour(OffsetDateTime startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * Get startHour
   * @return startHour
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartHour() {
    return startHour;
  }

  public void setStartHour(OffsetDateTime startHour) {
    this.startHour = startHour;
  }

  public VacationDataContentItem startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public VacationDataContentItem statusKey(String statusKey) {
    this.statusKey = statusKey;
    return this;
  }

  /**
   * Get statusKey
   * @return statusKey
  **/
  @ApiModelProperty(example = "IN_FORCE", value = "")
  
    public String getStatusKey() {
    return statusKey;
  }

  public void setStatusKey(String statusKey) {
    this.statusKey = statusKey;
  }

  public VacationDataContentItem unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(example = "小时", value = "")
  
    public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public VacationDataContentItem updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public VacationDataContentItem vacationId(String vacationId) {
    this.vacationId = vacationId;
    return this;
  }

  /**
   * Get vacationId
   * @return vacationId
  **/
  @ApiModelProperty(value = "")
  
    public String getVacationId() {
    return vacationId;
  }

  public void setVacationId(String vacationId) {
    this.vacationId = vacationId;
  }

  public VacationDataContentItem vacationName(String vacationName) {
    this.vacationName = vacationName;
    return this;
  }

  /**
   * Get vacationName
   * @return vacationName
  **/
  @ApiModelProperty(example = "事假", value = "")
  
    public String getVacationName() {
    return vacationName;
  }

  public void setVacationName(String vacationName) {
    this.vacationName = vacationName;
  }

  public VacationDataContentItem vacationStatus(String vacationStatus) {
    this.vacationStatus = vacationStatus;
    return this;
  }

  /**
   * Get vacationStatus
   * @return vacationStatus
  **/
  @ApiModelProperty(example = "已生效", value = "")
  
    public String getVacationStatus() {
    return vacationStatus;
  }

  public void setVacationStatus(String vacationStatus) {
    this.vacationStatus = vacationStatus;
  }

  public VacationDataContentItem vacationType(String vacationType) {
    this.vacationType = vacationType;
    return this;
  }

  /**
   * Get vacationType
   * @return vacationType
  **/
  @ApiModelProperty(example = "AFFAIR_LEAVE", value = "")
  
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
    VacationDataContentItem vacationDataContentItem = (VacationDataContentItem) o;
    return Objects.equals(this.departmentName, vacationDataContentItem.departmentName) &&
        Objects.equals(this.duration, vacationDataContentItem.duration) &&
        Objects.equals(this.endHour, vacationDataContentItem.endHour) &&
        Objects.equals(this.endTime, vacationDataContentItem.endTime) &&
        Objects.equals(this.id, vacationDataContentItem.id) &&
        Objects.equals(this.mobileNo, vacationDataContentItem.mobileNo) &&
        Objects.equals(this.positionId, vacationDataContentItem.positionId) &&
        Objects.equals(this.positionName, vacationDataContentItem.positionName) &&
        Objects.equals(this.processCode, vacationDataContentItem.processCode) &&
        Objects.equals(this.processType, vacationDataContentItem.processType) &&
        Objects.equals(this.resource, vacationDataContentItem.resource) &&
        Objects.equals(this.resourceType, vacationDataContentItem.resourceType) &&
        Objects.equals(this.staffId, vacationDataContentItem.staffId) &&
        Objects.equals(this.staffName, vacationDataContentItem.staffName) &&
        Objects.equals(this.staffNo, vacationDataContentItem.staffNo) &&
        Objects.equals(this.startHour, vacationDataContentItem.startHour) &&
        Objects.equals(this.startTime, vacationDataContentItem.startTime) &&
        Objects.equals(this.statusKey, vacationDataContentItem.statusKey) &&
        Objects.equals(this.unit, vacationDataContentItem.unit) &&
        Objects.equals(this.updateTime, vacationDataContentItem.updateTime) &&
        Objects.equals(this.vacationId, vacationDataContentItem.vacationId) &&
        Objects.equals(this.vacationName, vacationDataContentItem.vacationName) &&
        Objects.equals(this.vacationStatus, vacationDataContentItem.vacationStatus) &&
        Objects.equals(this.vacationType, vacationDataContentItem.vacationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentName, duration, endHour, endTime, id, mobileNo, positionId, positionName, processCode, processType, resource, resourceType, staffId, staffName, staffNo, startHour, startTime, statusKey, unit, updateTime, vacationId, vacationName, vacationStatus, vacationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationDataContentItem {\n");
    
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    processCode: ").append(toIndentedString(processCode)).append("\n");
    sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    statusKey: ").append(toIndentedString(statusKey)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    vacationId: ").append(toIndentedString(vacationId)).append("\n");
    sb.append("    vacationName: ").append(toIndentedString(vacationName)).append("\n");
    sb.append("    vacationStatus: ").append(toIndentedString(vacationStatus)).append("\n");
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
