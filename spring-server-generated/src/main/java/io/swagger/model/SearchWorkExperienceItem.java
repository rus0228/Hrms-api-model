package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffEducationDataFlexAttributes;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchWorkExperienceItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SearchWorkExperienceItem   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrollDate")
  private OffsetDateTime enrollDate = null;

  @JsonProperty("flexAttributes")
  private StaffEducationDataFlexAttributes flexAttributes = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jobDescription")
  private String jobDescription = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("lastUpdate")
  private Object lastUpdate = null;

  @JsonProperty("orderNumber")
  private Object orderNumber = null;

  @JsonProperty("positionName")
  private Object positionName = null;

  @JsonProperty("quitDate")
  private OffsetDateTime quitDate = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  public SearchWorkExperienceItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public SearchWorkExperienceItem companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public SearchWorkExperienceItem createdDate(OffsetDateTime createdDate) {
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

  public SearchWorkExperienceItem departmentId(String departmentId) {
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

  public SearchWorkExperienceItem departmentName(String departmentName) {
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

  public SearchWorkExperienceItem enrollDate(OffsetDateTime enrollDate) {
    this.enrollDate = enrollDate;
    return this;
  }

  /**
   * Get enrollDate
   * @return enrollDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEnrollDate() {
    return enrollDate;
  }

  public void setEnrollDate(OffsetDateTime enrollDate) {
    this.enrollDate = enrollDate;
  }

  public SearchWorkExperienceItem flexAttributes(StaffEducationDataFlexAttributes flexAttributes) {
    this.flexAttributes = flexAttributes;
    return this;
  }

  /**
   * Get flexAttributes
   * @return flexAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffEducationDataFlexAttributes getFlexAttributes() {
    return flexAttributes;
  }

  public void setFlexAttributes(StaffEducationDataFlexAttributes flexAttributes) {
    this.flexAttributes = flexAttributes;
  }

  public SearchWorkExperienceItem id(String id) {
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

  public SearchWorkExperienceItem jobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
    return this;
  }

  /**
   * Get jobDescription
   * @return jobDescription
  **/
  @ApiModelProperty(value = "")
  
    public String getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  public SearchWorkExperienceItem jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public SearchWorkExperienceItem lastUpdate(Object lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  
    public Object getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Object lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public SearchWorkExperienceItem orderNumber(Object orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  
    public Object getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Object orderNumber) {
    this.orderNumber = orderNumber;
  }

  public SearchWorkExperienceItem positionName(Object positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(value = "")
  
    public Object getPositionName() {
    return positionName;
  }

  public void setPositionName(Object positionName) {
    this.positionName = positionName;
  }

  public SearchWorkExperienceItem quitDate(OffsetDateTime quitDate) {
    this.quitDate = quitDate;
    return this;
  }

  /**
   * Get quitDate
   * @return quitDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getQuitDate() {
    return quitDate;
  }

  public void setQuitDate(OffsetDateTime quitDate) {
    this.quitDate = quitDate;
  }

  public SearchWorkExperienceItem staffId(String staffId) {
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

  public SearchWorkExperienceItem staffName(String staffName) {
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

  public SearchWorkExperienceItem staffNo(String staffNo) {
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

  public SearchWorkExperienceItem staffStatus(String staffStatus) {
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
    SearchWorkExperienceItem searchWorkExperienceItem = (SearchWorkExperienceItem) o;
    return Objects.equals(this.companyId, searchWorkExperienceItem.companyId) &&
        Objects.equals(this.companyName, searchWorkExperienceItem.companyName) &&
        Objects.equals(this.createdDate, searchWorkExperienceItem.createdDate) &&
        Objects.equals(this.departmentId, searchWorkExperienceItem.departmentId) &&
        Objects.equals(this.departmentName, searchWorkExperienceItem.departmentName) &&
        Objects.equals(this.enrollDate, searchWorkExperienceItem.enrollDate) &&
        Objects.equals(this.flexAttributes, searchWorkExperienceItem.flexAttributes) &&
        Objects.equals(this.id, searchWorkExperienceItem.id) &&
        Objects.equals(this.jobDescription, searchWorkExperienceItem.jobDescription) &&
        Objects.equals(this.jobTitle, searchWorkExperienceItem.jobTitle) &&
        Objects.equals(this.lastUpdate, searchWorkExperienceItem.lastUpdate) &&
        Objects.equals(this.orderNumber, searchWorkExperienceItem.orderNumber) &&
        Objects.equals(this.positionName, searchWorkExperienceItem.positionName) &&
        Objects.equals(this.quitDate, searchWorkExperienceItem.quitDate) &&
        Objects.equals(this.staffId, searchWorkExperienceItem.staffId) &&
        Objects.equals(this.staffName, searchWorkExperienceItem.staffName) &&
        Objects.equals(this.staffNo, searchWorkExperienceItem.staffNo) &&
        Objects.equals(this.staffStatus, searchWorkExperienceItem.staffStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, companyName, createdDate, departmentId, departmentName, enrollDate, flexAttributes, id, jobDescription, jobTitle, lastUpdate, orderNumber, positionName, quitDate, staffId, staffName, staffNo, staffStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchWorkExperienceItem {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrollDate: ").append(toIndentedString(enrollDate)).append("\n");
    sb.append("    flexAttributes: ").append(toIndentedString(flexAttributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    quitDate: ").append(toIndentedString(quitDate)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
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
