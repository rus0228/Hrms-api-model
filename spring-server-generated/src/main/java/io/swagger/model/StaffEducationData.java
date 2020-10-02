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
 * StaffEducationData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffEducationData   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("diplomaType")
  private String diplomaType = null;

  @JsonProperty("educationImageId1")
  private String educationImageId1 = null;

  @JsonProperty("educationImageId2")
  private String educationImageId2 = null;

  @JsonProperty("entryDate")
  private OffsetDateTime entryDate = null;

  @JsonProperty("flexAttributes")
  private StaffEducationDataFlexAttributes flexAttributes = null;

  @JsonProperty("graduateDate")
  private OffsetDateTime graduateDate = null;

  @JsonProperty("hasGotDegree")
  private Boolean hasGotDegree = false;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastUpdate")
  private Object lastUpdate = null;

  @JsonProperty("major")
  private String major = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("schoolName")
  private String schoolName = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  public StaffEducationData companyId(String companyId) {
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

  public StaffEducationData createdDate(OffsetDateTime createdDate) {
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

  public StaffEducationData departmentId(String departmentId) {
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

  public StaffEducationData departmentName(String departmentName) {
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

  public StaffEducationData diplomaType(String diplomaType) {
    this.diplomaType = diplomaType;
    return this;
  }

  /**
   * Get diplomaType
   * @return diplomaType
  **/
  @ApiModelProperty(value = "")
  
    public String getDiplomaType() {
    return diplomaType;
  }

  public void setDiplomaType(String diplomaType) {
    this.diplomaType = diplomaType;
  }

  public StaffEducationData educationImageId1(String educationImageId1) {
    this.educationImageId1 = educationImageId1;
    return this;
  }

  /**
   * Get educationImageId1
   * @return educationImageId1
  **/
  @ApiModelProperty(value = "")
  
    public String getEducationImageId1() {
    return educationImageId1;
  }

  public void setEducationImageId1(String educationImageId1) {
    this.educationImageId1 = educationImageId1;
  }

  public StaffEducationData educationImageId2(String educationImageId2) {
    this.educationImageId2 = educationImageId2;
    return this;
  }

  /**
   * Get educationImageId2
   * @return educationImageId2
  **/
  @ApiModelProperty(value = "")
  
    public String getEducationImageId2() {
    return educationImageId2;
  }

  public void setEducationImageId2(String educationImageId2) {
    this.educationImageId2 = educationImageId2;
  }

  public StaffEducationData entryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * Get entryDate
   * @return entryDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
  }

  public StaffEducationData flexAttributes(StaffEducationDataFlexAttributes flexAttributes) {
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

  public StaffEducationData graduateDate(OffsetDateTime graduateDate) {
    this.graduateDate = graduateDate;
    return this;
  }

  /**
   * Get graduateDate
   * @return graduateDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getGraduateDate() {
    return graduateDate;
  }

  public void setGraduateDate(OffsetDateTime graduateDate) {
    this.graduateDate = graduateDate;
  }

  public StaffEducationData hasGotDegree(Boolean hasGotDegree) {
    this.hasGotDegree = hasGotDegree;
    return this;
  }

  /**
   * Get hasGotDegree
   * @return hasGotDegree
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isHasGotDegree() {
    return hasGotDegree;
  }

  public void setHasGotDegree(Boolean hasGotDegree) {
    this.hasGotDegree = hasGotDegree;
  }

  public StaffEducationData id(String id) {
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

  public StaffEducationData lastUpdate(Object lastUpdate) {
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

  public StaffEducationData major(String major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(value = "")
  
    public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public StaffEducationData orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public StaffEducationData positionName(String positionName) {
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

  public StaffEducationData schoolName(String schoolName) {
    this.schoolName = schoolName;
    return this;
  }

  /**
   * Get schoolName
   * @return schoolName
  **/
  @ApiModelProperty(value = "")
  
    public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public StaffEducationData staffId(String staffId) {
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

  public StaffEducationData staffName(String staffName) {
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

  public StaffEducationData staffNo(String staffNo) {
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

  public StaffEducationData staffStatus(String staffStatus) {
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
    StaffEducationData staffEducationData = (StaffEducationData) o;
    return Objects.equals(this.companyId, staffEducationData.companyId) &&
        Objects.equals(this.createdDate, staffEducationData.createdDate) &&
        Objects.equals(this.departmentId, staffEducationData.departmentId) &&
        Objects.equals(this.departmentName, staffEducationData.departmentName) &&
        Objects.equals(this.diplomaType, staffEducationData.diplomaType) &&
        Objects.equals(this.educationImageId1, staffEducationData.educationImageId1) &&
        Objects.equals(this.educationImageId2, staffEducationData.educationImageId2) &&
        Objects.equals(this.entryDate, staffEducationData.entryDate) &&
        Objects.equals(this.flexAttributes, staffEducationData.flexAttributes) &&
        Objects.equals(this.graduateDate, staffEducationData.graduateDate) &&
        Objects.equals(this.hasGotDegree, staffEducationData.hasGotDegree) &&
        Objects.equals(this.id, staffEducationData.id) &&
        Objects.equals(this.lastUpdate, staffEducationData.lastUpdate) &&
        Objects.equals(this.major, staffEducationData.major) &&
        Objects.equals(this.orderNumber, staffEducationData.orderNumber) &&
        Objects.equals(this.positionName, staffEducationData.positionName) &&
        Objects.equals(this.schoolName, staffEducationData.schoolName) &&
        Objects.equals(this.staffId, staffEducationData.staffId) &&
        Objects.equals(this.staffName, staffEducationData.staffName) &&
        Objects.equals(this.staffNo, staffEducationData.staffNo) &&
        Objects.equals(this.staffStatus, staffEducationData.staffStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, createdDate, departmentId, departmentName, diplomaType, educationImageId1, educationImageId2, entryDate, flexAttributes, graduateDate, hasGotDegree, id, lastUpdate, major, orderNumber, positionName, schoolName, staffId, staffName, staffNo, staffStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffEducationData {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    diplomaType: ").append(toIndentedString(diplomaType)).append("\n");
    sb.append("    educationImageId1: ").append(toIndentedString(educationImageId1)).append("\n");
    sb.append("    educationImageId2: ").append(toIndentedString(educationImageId2)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    flexAttributes: ").append(toIndentedString(flexAttributes)).append("\n");
    sb.append("    graduateDate: ").append(toIndentedString(graduateDate)).append("\n");
    sb.append("    hasGotDegree: ").append(toIndentedString(hasGotDegree)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    schoolName: ").append(toIndentedString(schoolName)).append("\n");
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
