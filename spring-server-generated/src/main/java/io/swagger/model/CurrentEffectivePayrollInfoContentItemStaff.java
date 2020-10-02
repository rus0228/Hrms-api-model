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
 * CurrentEffectivePayrollInfoContentItemStaff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemStaff   {
  @JsonProperty("contractType")
  private String contractType = null;

  @JsonProperty("corporationId")
  private String corporationId = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrollInDate")
  private String enrollInDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("idCardType")
  private String idCardType = null;

  @JsonProperty("lastWorkDay")
  private String lastWorkDay = null;

  @JsonProperty("leaveDate")
  private LocalDate leaveDate = null;

  @JsonProperty("legalName")
  private String legalName = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionLevelName")
  private String positionLevelName = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("positiveDate")
  private LocalDate positiveDate = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  @JsonProperty("staffType")
  private String staffType = null;

  public CurrentEffectivePayrollInfoContentItemStaff contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
  **/
  @ApiModelProperty(example = "劳动合同", value = "")
  
    public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public CurrentEffectivePayrollInfoContentItemStaff corporationId(String corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * Get corporationId
   * @return corporationId
  **/
  @ApiModelProperty(value = "")
  
    public String getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(String corporationId) {
    this.corporationId = corporationId;
  }

  public CurrentEffectivePayrollInfoContentItemStaff country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CurrentEffectivePayrollInfoContentItemStaff departmentId(String departmentId) {
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

  public CurrentEffectivePayrollInfoContentItemStaff departmentName(String departmentName) {
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

  public CurrentEffectivePayrollInfoContentItemStaff enrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "2018-07-01T16:00:00.000+0000", value = "")
  
    public String getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public CurrentEffectivePayrollInfoContentItemStaff id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "044caed7-924e-4275-831f-c8fa03b13406", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentEffectivePayrollInfoContentItemStaff idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  /**
   * Get idCardNo
   * @return idCardNo
  **/
  @ApiModelProperty(example = "19820512", value = "")
  
    public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }

  public CurrentEffectivePayrollInfoContentItemStaff idCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  /**
   * Get idCardType
   * @return idCardType
  **/
  @ApiModelProperty(example = "其他", value = "")
  
    public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }

  public CurrentEffectivePayrollInfoContentItemStaff lastWorkDay(String lastWorkDay) {
    this.lastWorkDay = lastWorkDay;
    return this;
  }

  /**
   * Get lastWorkDay
   * @return lastWorkDay
  **/
  @ApiModelProperty(value = "")
  
    public String getLastWorkDay() {
    return lastWorkDay;
  }

  public void setLastWorkDay(String lastWorkDay) {
    this.lastWorkDay = lastWorkDay;
  }

  public CurrentEffectivePayrollInfoContentItemStaff leaveDate(LocalDate leaveDate) {
    this.leaveDate = leaveDate;
    return this;
  }

  /**
   * Get leaveDate
   * @return leaveDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getLeaveDate() {
    return leaveDate;
  }

  public void setLeaveDate(LocalDate leaveDate) {
    this.leaveDate = leaveDate;
  }

  public CurrentEffectivePayrollInfoContentItemStaff legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Get legalName
   * @return legalName
  **/
  @ApiModelProperty(value = "")
  
    public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public CurrentEffectivePayrollInfoContentItemStaff mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "13707313549", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public CurrentEffectivePayrollInfoContentItemStaff positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
  **/
  @ApiModelProperty(example = "a789e212-16e3-4a26-bda6-ebf039d7e0fe", value = "")
  
    public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public CurrentEffectivePayrollInfoContentItemStaff positionLevelName(String positionLevelName) {
    this.positionLevelName = positionLevelName;
    return this;
  }

  /**
   * Get positionLevelName
   * @return positionLevelName
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionLevelName() {
    return positionLevelName;
  }

  public void setPositionLevelName(String positionLevelName) {
    this.positionLevelName = positionLevelName;
  }

  public CurrentEffectivePayrollInfoContentItemStaff positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(example = "校长", value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public CurrentEffectivePayrollInfoContentItemStaff positiveDate(LocalDate positiveDate) {
    this.positiveDate = positiveDate;
    return this;
  }

  /**
   * Get positiveDate
   * @return positiveDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getPositiveDate() {
    return positiveDate;
  }

  public void setPositiveDate(LocalDate positiveDate) {
    this.positiveDate = positiveDate;
  }

  public CurrentEffectivePayrollInfoContentItemStaff sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

  /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(example = "19", value = "")
  
    public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public CurrentEffectivePayrollInfoContentItemStaff sex(String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(value = "")
  
    public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public CurrentEffectivePayrollInfoContentItemStaff staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "颜亮", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public CurrentEffectivePayrollInfoContentItemStaff staffNo(String staffNo) {
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

  public CurrentEffectivePayrollInfoContentItemStaff staffStatus(String staffStatus) {
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

  public CurrentEffectivePayrollInfoContentItemStaff staffType(String staffType) {
    this.staffType = staffType;
    return this;
  }

  /**
   * Get staffType
   * @return staffType
  **/
  @ApiModelProperty(example = "全职", value = "")
  
    public String getStaffType() {
    return staffType;
  }

  public void setStaffType(String staffType) {
    this.staffType = staffType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItemStaff currentEffectivePayrollInfoContentItemStaff = (CurrentEffectivePayrollInfoContentItemStaff) o;
    return Objects.equals(this.contractType, currentEffectivePayrollInfoContentItemStaff.contractType) &&
        Objects.equals(this.corporationId, currentEffectivePayrollInfoContentItemStaff.corporationId) &&
        Objects.equals(this.country, currentEffectivePayrollInfoContentItemStaff.country) &&
        Objects.equals(this.departmentId, currentEffectivePayrollInfoContentItemStaff.departmentId) &&
        Objects.equals(this.departmentName, currentEffectivePayrollInfoContentItemStaff.departmentName) &&
        Objects.equals(this.enrollInDate, currentEffectivePayrollInfoContentItemStaff.enrollInDate) &&
        Objects.equals(this.id, currentEffectivePayrollInfoContentItemStaff.id) &&
        Objects.equals(this.idCardNo, currentEffectivePayrollInfoContentItemStaff.idCardNo) &&
        Objects.equals(this.idCardType, currentEffectivePayrollInfoContentItemStaff.idCardType) &&
        Objects.equals(this.lastWorkDay, currentEffectivePayrollInfoContentItemStaff.lastWorkDay) &&
        Objects.equals(this.leaveDate, currentEffectivePayrollInfoContentItemStaff.leaveDate) &&
        Objects.equals(this.legalName, currentEffectivePayrollInfoContentItemStaff.legalName) &&
        Objects.equals(this.mobileNo, currentEffectivePayrollInfoContentItemStaff.mobileNo) &&
        Objects.equals(this.positionId, currentEffectivePayrollInfoContentItemStaff.positionId) &&
        Objects.equals(this.positionLevelName, currentEffectivePayrollInfoContentItemStaff.positionLevelName) &&
        Objects.equals(this.positionName, currentEffectivePayrollInfoContentItemStaff.positionName) &&
        Objects.equals(this.positiveDate, currentEffectivePayrollInfoContentItemStaff.positiveDate) &&
        Objects.equals(this.sequence, currentEffectivePayrollInfoContentItemStaff.sequence) &&
        Objects.equals(this.sex, currentEffectivePayrollInfoContentItemStaff.sex) &&
        Objects.equals(this.staffName, currentEffectivePayrollInfoContentItemStaff.staffName) &&
        Objects.equals(this.staffNo, currentEffectivePayrollInfoContentItemStaff.staffNo) &&
        Objects.equals(this.staffStatus, currentEffectivePayrollInfoContentItemStaff.staffStatus) &&
        Objects.equals(this.staffType, currentEffectivePayrollInfoContentItemStaff.staffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractType, corporationId, country, departmentId, departmentName, enrollInDate, id, idCardNo, idCardType, lastWorkDay, leaveDate, legalName, mobileNo, positionId, positionLevelName, positionName, positiveDate, sequence, sex, staffName, staffNo, staffStatus, staffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemStaff {\n");
    
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    idCardType: ").append(toIndentedString(idCardType)).append("\n");
    sb.append("    lastWorkDay: ").append(toIndentedString(lastWorkDay)).append("\n");
    sb.append("    leaveDate: ").append(toIndentedString(leaveDate)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionLevelName: ").append(toIndentedString(positionLevelName)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    positiveDate: ").append(toIndentedString(positiveDate)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
    sb.append("    staffType: ").append(toIndentedString(staffType)).append("\n");
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
