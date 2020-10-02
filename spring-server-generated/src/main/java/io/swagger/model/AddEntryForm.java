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
 * AddEntryForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AddEntryForm   {
  @JsonProperty("contractType")
  private String contractType = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("expectEntryDate")
  private LocalDate expectEntryDate = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("idCardType")
  private String idCardType = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("sex")
  private String sex = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffType")
  private String staffType = null;

  public AddEntryForm contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
  **/
  @ApiModelProperty(example = "OTHER_CONTRACT", value = "")
  
    public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public AddEntryForm departmentId(String departmentId) {
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

  public AddEntryForm email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "rus0228@outlook.com", value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddEntryForm expectEntryDate(LocalDate expectEntryDate) {
    this.expectEntryDate = expectEntryDate;
    return this;
  }

  /**
   * Get expectEntryDate
   * @return expectEntryDate
  **/
  @ApiModelProperty(example = "Tue Jun 23 00:00:00 GMT 2020", value = "")
  
    @Valid
    public LocalDate getExpectEntryDate() {
    return expectEntryDate;
  }

  public void setExpectEntryDate(LocalDate expectEntryDate) {
    this.expectEntryDate = expectEntryDate;
  }

  public AddEntryForm idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  /**
   * Get idCardNo
   * @return idCardNo
  **/
  @ApiModelProperty(example = "12123", value = "")
  
    public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }

  public AddEntryForm idCardType(String idCardType) {
    this.idCardType = idCardType;
    return this;
  }

  /**
   * Get idCardType
   * @return idCardType
  **/
  @ApiModelProperty(example = "CHINA_PASSPORT", value = "")
  
    public String getIdCardType() {
    return idCardType;
  }

  public void setIdCardType(String idCardType) {
    this.idCardType = idCardType;
  }

  public AddEntryForm mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(example = "18240331746", value = "")
  
    public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public AddEntryForm positionId(String positionId) {
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

  public AddEntryForm sex(String sex) {
    this.sex = sex;
    return this;
  }

  /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(example = "MALE", value = "")
  
    public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public AddEntryForm staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "ye liu", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public AddEntryForm staffType(String staffType) {
    this.staffType = staffType;
    return this;
  }

  /**
   * Get staffType
   * @return staffType
  **/
  @ApiModelProperty(example = "FULLTIME", value = "")
  
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
    AddEntryForm addEntryForm = (AddEntryForm) o;
    return Objects.equals(this.contractType, addEntryForm.contractType) &&
        Objects.equals(this.departmentId, addEntryForm.departmentId) &&
        Objects.equals(this.email, addEntryForm.email) &&
        Objects.equals(this.expectEntryDate, addEntryForm.expectEntryDate) &&
        Objects.equals(this.idCardNo, addEntryForm.idCardNo) &&
        Objects.equals(this.idCardType, addEntryForm.idCardType) &&
        Objects.equals(this.mobile, addEntryForm.mobile) &&
        Objects.equals(this.positionId, addEntryForm.positionId) &&
        Objects.equals(this.sex, addEntryForm.sex) &&
        Objects.equals(this.staffName, addEntryForm.staffName) &&
        Objects.equals(this.staffType, addEntryForm.staffType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractType, departmentId, email, expectEntryDate, idCardNo, idCardType, mobile, positionId, sex, staffName, staffType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEntryForm {\n");
    
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expectEntryDate: ").append(toIndentedString(expectEntryDate)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    idCardType: ").append(toIndentedString(idCardType)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
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
