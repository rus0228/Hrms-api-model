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
 * EmployeeCertificate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class EmployeeCertificate   {
  @JsonProperty("certificateName")
  private String certificateName = null;

  @JsonProperty("certificateNumber")
  private String certificateNumber = null;

  @JsonProperty("certificateType")
  private String certificateType = null;

  @JsonProperty("certifyingAuthority")
  private String certifyingAuthority = null;

  @JsonProperty("dateOfDue")
  private LocalDate dateOfDue = null;

  @JsonProperty("dateOfIssue")
  private LocalDate dateOfIssue = null;

  @JsonProperty("grade")
  private String grade = null;

  @JsonProperty("major")
  private String major = null;

  @JsonProperty("recordDate")
  private LocalDate recordDate = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("reminderDate")
  private LocalDate reminderDate = null;

  @JsonProperty("reminderType")
  private String reminderType = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  public EmployeeCertificate certificateName(String certificateName) {
    this.certificateName = certificateName;
    return this;
  }

  /**
   * Get certificateName
   * @return certificateName
  **/
  @ApiModelProperty(value = "")
  
    public String getCertificateName() {
    return certificateName;
  }

  public void setCertificateName(String certificateName) {
    this.certificateName = certificateName;
  }

  public EmployeeCertificate certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * Get certificateNumber
   * @return certificateNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public EmployeeCertificate certificateType(String certificateType) {
    this.certificateType = certificateType;
    return this;
  }

  /**
   * Get certificateType
   * @return certificateType
  **/
  @ApiModelProperty(value = "")
  
    public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(String certificateType) {
    this.certificateType = certificateType;
  }

  public EmployeeCertificate certifyingAuthority(String certifyingAuthority) {
    this.certifyingAuthority = certifyingAuthority;
    return this;
  }

  /**
   * Get certifyingAuthority
   * @return certifyingAuthority
  **/
  @ApiModelProperty(value = "")
  
    public String getCertifyingAuthority() {
    return certifyingAuthority;
  }

  public void setCertifyingAuthority(String certifyingAuthority) {
    this.certifyingAuthority = certifyingAuthority;
  }

  public EmployeeCertificate dateOfDue(LocalDate dateOfDue) {
    this.dateOfDue = dateOfDue;
    return this;
  }

  /**
   * Get dateOfDue
   * @return dateOfDue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getDateOfDue() {
    return dateOfDue;
  }

  public void setDateOfDue(LocalDate dateOfDue) {
    this.dateOfDue = dateOfDue;
  }

  public EmployeeCertificate dateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
    return this;
  }

  /**
   * Get dateOfIssue
   * @return dateOfIssue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(LocalDate dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }

  public EmployeeCertificate grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  
    public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public EmployeeCertificate major(String major) {
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

  public EmployeeCertificate recordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
    return this;
  }

  /**
   * Get recordDate
   * @return recordDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(LocalDate recordDate) {
    this.recordDate = recordDate;
  }

  public EmployeeCertificate remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(value = "")
  
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public EmployeeCertificate reminderDate(LocalDate reminderDate) {
    this.reminderDate = reminderDate;
    return this;
  }

  /**
   * Get reminderDate
   * @return reminderDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getReminderDate() {
    return reminderDate;
  }

  public void setReminderDate(LocalDate reminderDate) {
    this.reminderDate = reminderDate;
  }

  public EmployeeCertificate reminderType(String reminderType) {
    this.reminderType = reminderType;
    return this;
  }

  /**
   * Get reminderType
   * @return reminderType
  **/
  @ApiModelProperty(value = "")
  
    public String getReminderType() {
    return reminderType;
  }

  public void setReminderType(String reminderType) {
    this.reminderType = reminderType;
  }

  public EmployeeCertificate staffId(String staffId) {
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

  public EmployeeCertificate staffName(String staffName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeCertificate employeeCertificate = (EmployeeCertificate) o;
    return Objects.equals(this.certificateName, employeeCertificate.certificateName) &&
        Objects.equals(this.certificateNumber, employeeCertificate.certificateNumber) &&
        Objects.equals(this.certificateType, employeeCertificate.certificateType) &&
        Objects.equals(this.certifyingAuthority, employeeCertificate.certifyingAuthority) &&
        Objects.equals(this.dateOfDue, employeeCertificate.dateOfDue) &&
        Objects.equals(this.dateOfIssue, employeeCertificate.dateOfIssue) &&
        Objects.equals(this.grade, employeeCertificate.grade) &&
        Objects.equals(this.major, employeeCertificate.major) &&
        Objects.equals(this.recordDate, employeeCertificate.recordDate) &&
        Objects.equals(this.remark, employeeCertificate.remark) &&
        Objects.equals(this.reminderDate, employeeCertificate.reminderDate) &&
        Objects.equals(this.reminderType, employeeCertificate.reminderType) &&
        Objects.equals(this.staffId, employeeCertificate.staffId) &&
        Objects.equals(this.staffName, employeeCertificate.staffName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateName, certificateNumber, certificateType, certifyingAuthority, dateOfDue, dateOfIssue, grade, major, recordDate, remark, reminderDate, reminderType, staffId, staffName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCertificate {\n");
    
    sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    certifyingAuthority: ").append(toIndentedString(certifyingAuthority)).append("\n");
    sb.append("    dateOfDue: ").append(toIndentedString(dateOfDue)).append("\n");
    sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    reminderDate: ").append(toIndentedString(reminderDate)).append("\n");
    sb.append("    reminderType: ").append(toIndentedString(reminderType)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
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
