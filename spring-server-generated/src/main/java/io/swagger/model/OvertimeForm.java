package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OvertimeForm
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class OvertimeForm   {
  @JsonProperty("adjustRestHour")
  private BigDecimal adjustRestHour = null;

  @JsonProperty("applyOvertimeHour")
  private BigDecimal applyOvertimeHour = null;

  @JsonProperty("compensation")
  private BigDecimal compensation = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("formSourceDescription")
  private String formSourceDescription = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("overtimeType")
  private String overtimeType = null;

  @JsonProperty("remarks")
  private String remarks = null;

  @JsonProperty("salaryHour")
  private String salaryHour = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("surplusHour")
  private Integer surplusHour = null;

  @JsonProperty("updateOvertimeHour")
  private String updateOvertimeHour = null;

  public OvertimeForm adjustRestHour(BigDecimal adjustRestHour) {
    this.adjustRestHour = adjustRestHour;
    return this;
  }

  /**
   * Get adjustRestHour
   * @return adjustRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAdjustRestHour() {
    return adjustRestHour;
  }

  public void setAdjustRestHour(BigDecimal adjustRestHour) {
    this.adjustRestHour = adjustRestHour;
  }

  public OvertimeForm applyOvertimeHour(BigDecimal applyOvertimeHour) {
    this.applyOvertimeHour = applyOvertimeHour;
    return this;
  }

  /**
   * Get applyOvertimeHour
   * @return applyOvertimeHour
  **/
  @ApiModelProperty(example = "1", value = "")
  
    @Valid
    public BigDecimal getApplyOvertimeHour() {
    return applyOvertimeHour;
  }

  public void setApplyOvertimeHour(BigDecimal applyOvertimeHour) {
    this.applyOvertimeHour = applyOvertimeHour;
  }

  public OvertimeForm compensation(BigDecimal compensation) {
    this.compensation = compensation;
    return this;
  }

  /**
   * Get compensation
   * @return compensation
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getCompensation() {
    return compensation;
  }

  public void setCompensation(BigDecimal compensation) {
    this.compensation = compensation;
  }

  public OvertimeForm departmentName(String departmentName) {
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

  public OvertimeForm endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(example = "1601042880000", value = "")
  
    public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public OvertimeForm formSourceDescription(String formSourceDescription) {
    this.formSourceDescription = formSourceDescription;
    return this;
  }

  /**
   * Get formSourceDescription
   * @return formSourceDescription
  **/
  @ApiModelProperty(example = "HR新增", value = "")
  
    public String getFormSourceDescription() {
    return formSourceDescription;
  }

  public void setFormSourceDescription(String formSourceDescription) {
    this.formSourceDescription = formSourceDescription;
  }

  public OvertimeForm mobileNo(String mobileNo) {
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

  public OvertimeForm overtimeType(String overtimeType) {
    this.overtimeType = overtimeType;
    return this;
  }

  /**
   * Get overtimeType
   * @return overtimeType
  **/
  @ApiModelProperty(example = "STATUTORY", value = "")
  
    public String getOvertimeType() {
    return overtimeType;
  }

  public void setOvertimeType(String overtimeType) {
    this.overtimeType = overtimeType;
  }

  public OvertimeForm remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Get remarks
   * @return remarks
  **/
  @ApiModelProperty(example = "Delayed", value = "")
  
    public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public OvertimeForm salaryHour(String salaryHour) {
    this.salaryHour = salaryHour;
    return this;
  }

  /**
   * Get salaryHour
   * @return salaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getSalaryHour() {
    return salaryHour;
  }

  public void setSalaryHour(String salaryHour) {
    this.salaryHour = salaryHour;
  }

  public OvertimeForm staffId(String staffId) {
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

  public OvertimeForm staffName(String staffName) {
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

  public OvertimeForm staffNo(String staffNo) {
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

  public OvertimeForm startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "1601039280000", value = "")
  
    public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public OvertimeForm surplusHour(Integer surplusHour) {
    this.surplusHour = surplusHour;
    return this;
  }

  /**
   * Get surplusHour
   * @return surplusHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getSurplusHour() {
    return surplusHour;
  }

  public void setSurplusHour(Integer surplusHour) {
    this.surplusHour = surplusHour;
  }

  public OvertimeForm updateOvertimeHour(String updateOvertimeHour) {
    this.updateOvertimeHour = updateOvertimeHour;
    return this;
  }

  /**
   * Get updateOvertimeHour
   * @return updateOvertimeHour
  **/
  @ApiModelProperty(value = "")
  
    public String getUpdateOvertimeHour() {
    return updateOvertimeHour;
  }

  public void setUpdateOvertimeHour(String updateOvertimeHour) {
    this.updateOvertimeHour = updateOvertimeHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OvertimeForm overtimeForm = (OvertimeForm) o;
    return Objects.equals(this.adjustRestHour, overtimeForm.adjustRestHour) &&
        Objects.equals(this.applyOvertimeHour, overtimeForm.applyOvertimeHour) &&
        Objects.equals(this.compensation, overtimeForm.compensation) &&
        Objects.equals(this.departmentName, overtimeForm.departmentName) &&
        Objects.equals(this.endTime, overtimeForm.endTime) &&
        Objects.equals(this.formSourceDescription, overtimeForm.formSourceDescription) &&
        Objects.equals(this.mobileNo, overtimeForm.mobileNo) &&
        Objects.equals(this.overtimeType, overtimeForm.overtimeType) &&
        Objects.equals(this.remarks, overtimeForm.remarks) &&
        Objects.equals(this.salaryHour, overtimeForm.salaryHour) &&
        Objects.equals(this.staffId, overtimeForm.staffId) &&
        Objects.equals(this.staffName, overtimeForm.staffName) &&
        Objects.equals(this.staffNo, overtimeForm.staffNo) &&
        Objects.equals(this.startTime, overtimeForm.startTime) &&
        Objects.equals(this.surplusHour, overtimeForm.surplusHour) &&
        Objects.equals(this.updateOvertimeHour, overtimeForm.updateOvertimeHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustRestHour, applyOvertimeHour, compensation, departmentName, endTime, formSourceDescription, mobileNo, overtimeType, remarks, salaryHour, staffId, staffName, staffNo, startTime, surplusHour, updateOvertimeHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OvertimeForm {\n");
    
    sb.append("    adjustRestHour: ").append(toIndentedString(adjustRestHour)).append("\n");
    sb.append("    applyOvertimeHour: ").append(toIndentedString(applyOvertimeHour)).append("\n");
    sb.append("    compensation: ").append(toIndentedString(compensation)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    formSourceDescription: ").append(toIndentedString(formSourceDescription)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    overtimeType: ").append(toIndentedString(overtimeType)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    salaryHour: ").append(toIndentedString(salaryHour)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    surplusHour: ").append(toIndentedString(surplusHour)).append("\n");
    sb.append("    updateOvertimeHour: ").append(toIndentedString(updateOvertimeHour)).append("\n");
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
