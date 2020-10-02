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
 * StaffListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffListItem   {
  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("flexAttributes")
  private Object flexAttributes = null;

  @JsonProperty("fullDepartmentName")
  private String fullDepartmentName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idCardType")
  private String idCardType = null;

  @JsonProperty("jobTitleId")
  private String jobTitleId = null;

  @JsonProperty("jobTitleName")
  private String jobTitleName = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("politicalStatus")
  private Object politicalStatus = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  public StaffListItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public StaffListItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public StaffListItem flexAttributes(Object flexAttributes) {
    this.flexAttributes = flexAttributes;
    return this;
  }

  /**
   * Get flexAttributes
   * @return flexAttributes
  **/
  @ApiModelProperty(value = "")
  
    public Object getFlexAttributes() {
    return flexAttributes;
  }

  public void setFlexAttributes(Object flexAttributes) {
    this.flexAttributes = flexAttributes;
  }

  public StaffListItem fullDepartmentName(String fullDepartmentName) {
    this.fullDepartmentName = fullDepartmentName;
    return this;
  }

  /**
   * Get fullDepartmentName
   * @return fullDepartmentName
  **/
  @ApiModelProperty(value = "")
  
    public String getFullDepartmentName() {
    return fullDepartmentName;
  }

  public void setFullDepartmentName(String fullDepartmentName) {
    this.fullDepartmentName = fullDepartmentName;
  }

  public StaffListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffListItem idCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  /**
   * Get idCardType
   * @return idCardType
  **/
  @ApiModelProperty(value = "")
  
    public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }

  public StaffListItem jobTitleId(String jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Get jobTitleId
   * @return jobTitleId
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(String jobTitleId) {
    this.jobTitleId = jobTitleId;
  }

  public StaffListItem jobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
    return this;
  }

  /**
   * Get jobTitleName
   * @return jobTitleName
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitleName() {
    return jobTitleName;
  }

  public void setJobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
  }

  public StaffListItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public StaffListItem politicalStatus(Object politicalStatus) {
    this.politicalStatus = politicalStatus;
    return this;
  }

  /**
   * Get politicalStatus
   * @return politicalStatus
  **/
  @ApiModelProperty(value = "")
  
    public Object getPoliticalStatus() {
    return politicalStatus;
  }

  public void setPoliticalStatus(Object politicalStatus) {
    this.politicalStatus = politicalStatus;
  }

  public StaffListItem positionId(String positionId) {
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

  public StaffListItem positionName(String positionName) {
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

  public StaffListItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public StaffListItem staffNo(String staffNo) {
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

  public StaffListItem staffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
    return this;
  }

  /**
   * Get staffStatus
   * @return staffStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffStatus() {
    return staffStatus;
  }

  public void setStaffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffListItem staffListItem = (StaffListItem) o;
    return Objects.equals(this.departmentId, staffListItem.departmentId) &&
        Objects.equals(this.departmentName, staffListItem.departmentName) &&
        Objects.equals(this.flexAttributes, staffListItem.flexAttributes) &&
        Objects.equals(this.fullDepartmentName, staffListItem.fullDepartmentName) &&
        Objects.equals(this.id, staffListItem.id) &&
        Objects.equals(this.idCardType, staffListItem.idCardType) &&
        Objects.equals(this.jobTitleId, staffListItem.jobTitleId) &&
        Objects.equals(this.jobTitleName, staffListItem.jobTitleName) &&
        Objects.equals(this.mobileNo, staffListItem.mobileNo) &&
        Objects.equals(this.politicalStatus, staffListItem.politicalStatus) &&
        Objects.equals(this.positionId, staffListItem.positionId) &&
        Objects.equals(this.positionName, staffListItem.positionName) &&
        Objects.equals(this.staffName, staffListItem.staffName) &&
        Objects.equals(this.staffNo, staffListItem.staffNo) &&
        Objects.equals(this.staffStatus, staffListItem.staffStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId, departmentName, flexAttributes, fullDepartmentName, id, idCardType, jobTitleId, jobTitleName, mobileNo, politicalStatus, positionId, positionName, staffName, staffNo, staffStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffListItem {\n");
    
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    flexAttributes: ").append(toIndentedString(flexAttributes)).append("\n");
    sb.append("    fullDepartmentName: ").append(toIndentedString(fullDepartmentName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCardType: ").append(toIndentedString(idCardType)).append("\n");
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
    sb.append("    jobTitleName: ").append(toIndentedString(jobTitleName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    politicalStatus: ").append(toIndentedString(politicalStatus)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
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
