package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffAgreementListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffAgreementListItem   {
  @JsonProperty("agreementCompanyId")
  private String agreementCompanyId = null;

  @JsonProperty("agreementCompanyName")
  private String agreementCompanyName = null;

  @JsonProperty("beginDate")
  private String beginDate = null;

  @JsonProperty("certificateNum")
  private String certificateNum = null;

  @JsonProperty("closeDate")
  private LocalDate closeDate = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("departmentId")
  private Long departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDeleted")
  private Long isDeleted = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private Long staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("updateTime")
  private OffsetDateTime updateTime = null;

  public StaffAgreementListItem agreementCompanyId(String agreementCompanyId) {
    this.agreementCompanyId = agreementCompanyId;
    return this;
  }

  /**
   * Get agreementCompanyId
   * @return agreementCompanyId
  **/
  @ApiModelProperty(example = "d2822608-d5f4-47dd-9776-9ae2f24c9993", value = "")
  
    public String getAgreementCompanyId() {
    return agreementCompanyId;
  }

  public void setAgreementCompanyId(String agreementCompanyId) {
    this.agreementCompanyId = agreementCompanyId;
  }

  public StaffAgreementListItem agreementCompanyName(String agreementCompanyName) {
    this.agreementCompanyName = agreementCompanyName;
    return this;
  }

  /**
   * Get agreementCompanyName
   * @return agreementCompanyName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getAgreementCompanyName() {
    return agreementCompanyName;
  }

  public void setAgreementCompanyName(String agreementCompanyName) {
    this.agreementCompanyName = agreementCompanyName;
  }

  public StaffAgreementListItem beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   * @return beginDate
  **/
  @ApiModelProperty(example = "1600617600000", value = "")
  
    public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public StaffAgreementListItem certificateNum(String certificateNum) {
    this.certificateNum = certificateNum;
    return this;
  }

  /**
   * Get certificateNum
   * @return certificateNum
  **/
  @ApiModelProperty(example = "430124198709192963", value = "")
  
    public String getCertificateNum() {
    return certificateNum;
  }

  public void setCertificateNum(String certificateNum) {
    this.certificateNum = certificateNum;
  }

  public StaffAgreementListItem closeDate(LocalDate closeDate) {
    this.closeDate = closeDate;
    return this;
  }

  /**
   * Get closeDate
   * @return closeDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getCloseDate() {
    return closeDate;
  }

  public void setCloseDate(LocalDate closeDate) {
    this.closeDate = closeDate;
  }

  public StaffAgreementListItem companyId(String companyId) {
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

  public StaffAgreementListItem createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "1600659549000", value = "")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public StaffAgreementListItem departmentId(Long departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public StaffAgreementListItem departmentName(String departmentName) {
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

  public StaffAgreementListItem endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "1600704000000", value = "")
  
    public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public StaffAgreementListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "315885de-bfe9-4750-95e8-1446dd6c3fb2", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffAgreementListItem isDeleted(Long isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Long isDeleted) {
    this.isDeleted = isDeleted;
  }

  public StaffAgreementListItem number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "1990", value = "")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public StaffAgreementListItem remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(example = "description for new agreement.", value = "")
  
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public StaffAgreementListItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "90fa87af-0b54-46a9-baf7-c6778823d113", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public StaffAgreementListItem staffName(String staffName) {
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

  public StaffAgreementListItem staffNo(Long staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(value = "")
  
    public Long getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(Long staffNo) {
    this.staffNo = staffNo;
  }

  public StaffAgreementListItem staffStatus(String staffStatus) {
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

  public StaffAgreementListItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "SIGNED", value = "")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StaffAgreementListItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "CONFIDENTIALITY", value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public StaffAgreementListItem updateTime(OffsetDateTime updateTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffAgreementListItem staffAgreementListItem = (StaffAgreementListItem) o;
    return Objects.equals(this.agreementCompanyId, staffAgreementListItem.agreementCompanyId) &&
        Objects.equals(this.agreementCompanyName, staffAgreementListItem.agreementCompanyName) &&
        Objects.equals(this.beginDate, staffAgreementListItem.beginDate) &&
        Objects.equals(this.certificateNum, staffAgreementListItem.certificateNum) &&
        Objects.equals(this.closeDate, staffAgreementListItem.closeDate) &&
        Objects.equals(this.companyId, staffAgreementListItem.companyId) &&
        Objects.equals(this.createdDate, staffAgreementListItem.createdDate) &&
        Objects.equals(this.departmentId, staffAgreementListItem.departmentId) &&
        Objects.equals(this.departmentName, staffAgreementListItem.departmentName) &&
        Objects.equals(this.endDate, staffAgreementListItem.endDate) &&
        Objects.equals(this.id, staffAgreementListItem.id) &&
        Objects.equals(this.isDeleted, staffAgreementListItem.isDeleted) &&
        Objects.equals(this.number, staffAgreementListItem.number) &&
        Objects.equals(this.remark, staffAgreementListItem.remark) &&
        Objects.equals(this.staffId, staffAgreementListItem.staffId) &&
        Objects.equals(this.staffName, staffAgreementListItem.staffName) &&
        Objects.equals(this.staffNo, staffAgreementListItem.staffNo) &&
        Objects.equals(this.staffStatus, staffAgreementListItem.staffStatus) &&
        Objects.equals(this.status, staffAgreementListItem.status) &&
        Objects.equals(this.type, staffAgreementListItem.type) &&
        Objects.equals(this.updateTime, staffAgreementListItem.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementCompanyId, agreementCompanyName, beginDate, certificateNum, closeDate, companyId, createdDate, departmentId, departmentName, endDate, id, isDeleted, number, remark, staffId, staffName, staffNo, staffStatus, status, type, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAgreementListItem {\n");
    
    sb.append("    agreementCompanyId: ").append(toIndentedString(agreementCompanyId)).append("\n");
    sb.append("    agreementCompanyName: ").append(toIndentedString(agreementCompanyName)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    certificateNum: ").append(toIndentedString(certificateNum)).append("\n");
    sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
