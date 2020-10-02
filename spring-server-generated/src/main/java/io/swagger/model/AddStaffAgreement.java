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
 * AddStaffAgreement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AddStaffAgreement   {
  @JsonProperty("agreementCompanyId")
  private String agreementCompanyId = null;

  @JsonProperty("agreementCompanyName")
  private String agreementCompanyName = null;

  @JsonProperty("beginDate")
  private LocalDate beginDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("type")
  private String type = null;

  public AddStaffAgreement agreementCompanyId(String agreementCompanyId) {
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

  public AddStaffAgreement agreementCompanyName(String agreementCompanyName) {
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

  public AddStaffAgreement beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   * @return beginDate
  **/
  @ApiModelProperty(example = "Mon Sep 21 00:00:00 GMT 2020", value = "")
  
    @Valid
    public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public AddStaffAgreement endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "Tue Sep 22 00:00:00 GMT 2020", value = "")
  
    @Valid
    public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public AddStaffAgreement number(String number) {
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

  public AddStaffAgreement remark(String remark) {
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

  public AddStaffAgreement staffId(String staffId) {
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

  public AddStaffAgreement staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "刘杰音（18073111159）", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public AddStaffAgreement type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddStaffAgreement addStaffAgreement = (AddStaffAgreement) o;
    return Objects.equals(this.agreementCompanyId, addStaffAgreement.agreementCompanyId) &&
        Objects.equals(this.agreementCompanyName, addStaffAgreement.agreementCompanyName) &&
        Objects.equals(this.beginDate, addStaffAgreement.beginDate) &&
        Objects.equals(this.endDate, addStaffAgreement.endDate) &&
        Objects.equals(this.number, addStaffAgreement.number) &&
        Objects.equals(this.remark, addStaffAgreement.remark) &&
        Objects.equals(this.staffId, addStaffAgreement.staffId) &&
        Objects.equals(this.staffName, addStaffAgreement.staffName) &&
        Objects.equals(this.type, addStaffAgreement.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementCompanyId, agreementCompanyName, beginDate, endDate, number, remark, staffId, staffName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddStaffAgreement {\n");
    
    sb.append("    agreementCompanyId: ").append(toIndentedString(agreementCompanyId)).append("\n");
    sb.append("    agreementCompanyName: ").append(toIndentedString(agreementCompanyName)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
