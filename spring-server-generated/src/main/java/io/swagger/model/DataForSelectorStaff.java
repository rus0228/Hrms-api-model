package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataForSelectorStaff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class DataForSelectorStaff   {
  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrollInDate")
  private LocalDate enrollInDate = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("idCardType")
  private String idCardType = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  public DataForSelectorStaff departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public DataForSelectorStaff departmentName(String departmentName) {
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

  public DataForSelectorStaff enrollInDate(LocalDate enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "Fri Mar 01 00:00:00 GMT 2019", value = "")
  
    @Valid
    public LocalDate getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(LocalDate enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public DataForSelectorStaff idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  /**
   * Get idCardNo
   * @return idCardNo
  **/
  @ApiModelProperty(example = "430124198709192963", value = "")
  
    public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }

  public DataForSelectorStaff idCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  /**
   * Get idCardType
   * @return idCardType
  **/
  @ApiModelProperty(example = "IDENTITY_CARD", value = "")
  
    public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }

  public DataForSelectorStaff mobileNo(String mobileNo) {
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

  public DataForSelectorStaff positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
  **/
  @ApiModelProperty(example = "1c934f3a-e65f-44fe-899a-18a580260e21", value = "")
  
    public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public DataForSelectorStaff positionName(String positionName) {
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

  public DataForSelectorStaff staffId(String staffId) {
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

  public DataForSelectorStaff staffName(String staffName) {
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

  public DataForSelectorStaff staffStatus(String staffStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForSelectorStaff dataForSelectorStaff = (DataForSelectorStaff) o;
    return Objects.equals(this.departmentId, dataForSelectorStaff.departmentId) &&
        Objects.equals(this.departmentName, dataForSelectorStaff.departmentName) &&
        Objects.equals(this.enrollInDate, dataForSelectorStaff.enrollInDate) &&
        Objects.equals(this.idCardNo, dataForSelectorStaff.idCardNo) &&
        Objects.equals(this.idCardType, dataForSelectorStaff.idCardType) &&
        Objects.equals(this.mobileNo, dataForSelectorStaff.mobileNo) &&
        Objects.equals(this.positionId, dataForSelectorStaff.positionId) &&
        Objects.equals(this.positionName, dataForSelectorStaff.positionName) &&
        Objects.equals(this.staffId, dataForSelectorStaff.staffId) &&
        Objects.equals(this.staffName, dataForSelectorStaff.staffName) &&
        Objects.equals(this.staffStatus, dataForSelectorStaff.staffStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId, departmentName, enrollInDate, idCardNo, idCardType, mobileNo, positionId, positionName, staffId, staffName, staffStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForSelectorStaff {\n");
    
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    idCardType: ").append(toIndentedString(idCardType)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
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
