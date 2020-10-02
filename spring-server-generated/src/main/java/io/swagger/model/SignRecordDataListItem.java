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
 * SignRecordDataListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SignRecordDataListItem   {
  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("applicationStatus")
  private String applicationStatus = null;

  @JsonProperty("attendanceSignDeviceType")
  private String attendanceSignDeviceType = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("dataSourcesDescription")
  private String dataSourcesDescription = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("deviceToken")
  private String deviceToken = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isEffective")
  private Boolean isEffective = null;

  @JsonProperty("isWarning")
  private Boolean isWarning = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("phoneName")
  private String phoneName = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("processStatus")
  private String processStatus = null;

  @JsonProperty("rows")
  private Integer rows = null;

  @JsonProperty("signPlace")
  private String signPlace = null;

  @JsonProperty("signTime")
  private String signTime = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("url")
  private String url = null;

  public SignRecordDataListItem applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SignRecordDataListItem applicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
    return this;
  }

  /**
   * Get applicationStatus
   * @return applicationStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  public SignRecordDataListItem attendanceSignDeviceType(String attendanceSignDeviceType) {
    this.attendanceSignDeviceType = attendanceSignDeviceType;
    return this;
  }

  /**
   * Get attendanceSignDeviceType
   * @return attendanceSignDeviceType
  **/
  @ApiModelProperty(example = "HR_OPERATION", value = "")
  
    public String getAttendanceSignDeviceType() {
    return attendanceSignDeviceType;
  }

  public void setAttendanceSignDeviceType(String attendanceSignDeviceType) {
    this.attendanceSignDeviceType = attendanceSignDeviceType;
  }

  public SignRecordDataListItem companyId(String companyId) {
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

  public SignRecordDataListItem createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "1601023142000", value = "")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public SignRecordDataListItem dataSourcesDescription(String dataSourcesDescription) {
    this.dataSourcesDescription = dataSourcesDescription;
    return this;
  }

  /**
   * Get dataSourcesDescription
   * @return dataSourcesDescription
  **/
  @ApiModelProperty(example = "HR（13567190293）", value = "")
  
    public String getDataSourcesDescription() {
    return dataSourcesDescription;
  }

  public void setDataSourcesDescription(String dataSourcesDescription) {
    this.dataSourcesDescription = dataSourcesDescription;
  }

  public SignRecordDataListItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "7", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public SignRecordDataListItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "财务部", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public SignRecordDataListItem deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }

  /**
   * Get deviceToken
   * @return deviceToken
  **/
  @ApiModelProperty(value = "")
  
    public String getDeviceToken() {
    return deviceToken;
  }

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  public SignRecordDataListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "159f3df5-119f-44dc-94eb-0b48b38e37dc", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SignRecordDataListItem isEffective(Boolean isEffective) {
    this.isEffective = isEffective;
    return this;
  }

  /**
   * Get isEffective
   * @return isEffective
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsEffective() {
    return isEffective;
  }

  public void setIsEffective(Boolean isEffective) {
    this.isEffective = isEffective;
  }

  public SignRecordDataListItem isWarning(Boolean isWarning) {
    this.isWarning = isWarning;
    return this;
  }

  /**
   * Get isWarning
   * @return isWarning
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsWarning() {
    return isWarning;
  }

  public void setIsWarning(Boolean isWarning) {
    this.isWarning = isWarning;
  }

  public SignRecordDataListItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "13567190293", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public SignRecordDataListItem phoneName(String phoneName) {
    this.phoneName = phoneName;
    return this;
  }

  /**
   * Get phoneName
   * @return phoneName
  **/
  @ApiModelProperty(value = "")
  
    public String getPhoneName() {
    return phoneName;
  }

  public void setPhoneName(String phoneName) {
    this.phoneName = phoneName;
  }

  public SignRecordDataListItem positionId(String positionId) {
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

  public SignRecordDataListItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public SignRecordDataListItem processStatus(String processStatus) {
    this.processStatus = processStatus;
    return this;
  }

  /**
   * Get processStatus
   * @return processStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(String processStatus) {
    this.processStatus = processStatus;
  }

  public SignRecordDataListItem rows(Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public SignRecordDataListItem signPlace(String signPlace) {
    this.signPlace = signPlace;
    return this;
  }

  /**
   * Get signPlace
   * @return signPlace
  **/
  @ApiModelProperty(example = "Office-1", value = "")
  
    public String getSignPlace() {
    return signPlace;
  }

  public void setSignPlace(String signPlace) {
    this.signPlace = signPlace;
  }

  public SignRecordDataListItem signTime(String signTime) {
    this.signTime = signTime;
    return this;
  }

  /**
   * Get signTime
   * @return signTime
  **/
  @ApiModelProperty(example = "1601023080000", value = "")
  
    public String getSignTime() {
    return signTime;
  }

  public void setSignTime(String signTime) {
    this.signTime = signTime;
  }

  public SignRecordDataListItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "5a43bd72-6b47-4cd6-b56d-4ed401dc0dca", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public SignRecordDataListItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "盛俊", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public SignRecordDataListItem staffNo(String staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public String getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
  }

  public SignRecordDataListItem url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignRecordDataListItem signRecordDataListItem = (SignRecordDataListItem) o;
    return Objects.equals(this.applicationId, signRecordDataListItem.applicationId) &&
        Objects.equals(this.applicationStatus, signRecordDataListItem.applicationStatus) &&
        Objects.equals(this.attendanceSignDeviceType, signRecordDataListItem.attendanceSignDeviceType) &&
        Objects.equals(this.companyId, signRecordDataListItem.companyId) &&
        Objects.equals(this.createdDate, signRecordDataListItem.createdDate) &&
        Objects.equals(this.dataSourcesDescription, signRecordDataListItem.dataSourcesDescription) &&
        Objects.equals(this.departmentId, signRecordDataListItem.departmentId) &&
        Objects.equals(this.departmentName, signRecordDataListItem.departmentName) &&
        Objects.equals(this.deviceToken, signRecordDataListItem.deviceToken) &&
        Objects.equals(this.id, signRecordDataListItem.id) &&
        Objects.equals(this.isEffective, signRecordDataListItem.isEffective) &&
        Objects.equals(this.isWarning, signRecordDataListItem.isWarning) &&
        Objects.equals(this.mobileNo, signRecordDataListItem.mobileNo) &&
        Objects.equals(this.phoneName, signRecordDataListItem.phoneName) &&
        Objects.equals(this.positionId, signRecordDataListItem.positionId) &&
        Objects.equals(this.positionName, signRecordDataListItem.positionName) &&
        Objects.equals(this.processStatus, signRecordDataListItem.processStatus) &&
        Objects.equals(this.rows, signRecordDataListItem.rows) &&
        Objects.equals(this.signPlace, signRecordDataListItem.signPlace) &&
        Objects.equals(this.signTime, signRecordDataListItem.signTime) &&
        Objects.equals(this.staffId, signRecordDataListItem.staffId) &&
        Objects.equals(this.staffName, signRecordDataListItem.staffName) &&
        Objects.equals(this.staffNo, signRecordDataListItem.staffNo) &&
        Objects.equals(this.url, signRecordDataListItem.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, applicationStatus, attendanceSignDeviceType, companyId, createdDate, dataSourcesDescription, departmentId, departmentName, deviceToken, id, isEffective, isWarning, mobileNo, phoneName, positionId, positionName, processStatus, rows, signPlace, signTime, staffId, staffName, staffNo, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignRecordDataListItem {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
    sb.append("    attendanceSignDeviceType: ").append(toIndentedString(attendanceSignDeviceType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    dataSourcesDescription: ").append(toIndentedString(dataSourcesDescription)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEffective: ").append(toIndentedString(isEffective)).append("\n");
    sb.append("    isWarning: ").append(toIndentedString(isWarning)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    phoneName: ").append(toIndentedString(phoneName)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    signPlace: ").append(toIndentedString(signPlace)).append("\n");
    sb.append("    signTime: ").append(toIndentedString(signTime)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
