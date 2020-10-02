package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SiMemberPlanListContentItemSiCompanyBenefit;
import io.swagger.model.SiMemberPlanListContentItemSocialInsurance;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiMemberPlanListContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SiMemberPlanListContentItem   {
  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("hfAccountNumber")
  private String hfAccountNumber = null;

  @JsonProperty("hfCompanyBenefit")
  private Object hfCompanyBenefit = null;

  @JsonProperty("hfEndOn")
  private LocalDate hfEndOn = null;

  @JsonProperty("hfName")
  private String hfName = null;

  @JsonProperty("hfPayDepartmentName")
  private String hfPayDepartmentName = null;

  @JsonProperty("hfStartOn")
  private LocalDate hfStartOn = null;

  @JsonProperty("houseFund")
  private String houseFund = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("inLedger")
  private Boolean inLedger = null;

  @JsonProperty("insuranceType")
  private String insuranceType = null;

  @JsonProperty("isLedger")
  private String isLedger = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("siAccountNumber")
  private String siAccountNumber = null;

  @JsonProperty("siCompanyBenefit")
  private SiMemberPlanListContentItemSiCompanyBenefit siCompanyBenefit = null;

  @JsonProperty("siEndOn")
  private String siEndOn = null;

  @JsonProperty("siName")
  private String siName = null;

  @JsonProperty("siPayDepartmentName")
  private String siPayDepartmentName = null;

  @JsonProperty("siStartOn")
  private String siStartOn = null;

  @JsonProperty("socialInsurance")
  private SiMemberPlanListContentItemSocialInsurance socialInsurance = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("year")
  private String year = null;

  public SiMemberPlanListContentItem departmentId(String departmentId) {
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

  public SiMemberPlanListContentItem departmentName(String departmentName) {
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

  public SiMemberPlanListContentItem hfAccountNumber(String hfAccountNumber) {
    this.hfAccountNumber = hfAccountNumber;
    return this;
  }

  /**
   * Get hfAccountNumber
   * @return hfAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getHfAccountNumber() {
    return hfAccountNumber;
  }

  public void setHfAccountNumber(String hfAccountNumber) {
    this.hfAccountNumber = hfAccountNumber;
  }

  public SiMemberPlanListContentItem hfCompanyBenefit(Object hfCompanyBenefit) {
    this.hfCompanyBenefit = hfCompanyBenefit;
    return this;
  }

  /**
   * Get hfCompanyBenefit
   * @return hfCompanyBenefit
  **/
  @ApiModelProperty(value = "")
  
    public Object getHfCompanyBenefit() {
    return hfCompanyBenefit;
  }

  public void setHfCompanyBenefit(Object hfCompanyBenefit) {
    this.hfCompanyBenefit = hfCompanyBenefit;
  }

  public SiMemberPlanListContentItem hfEndOn(LocalDate hfEndOn) {
    this.hfEndOn = hfEndOn;
    return this;
  }

  /**
   * Get hfEndOn
   * @return hfEndOn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getHfEndOn() {
    return hfEndOn;
  }

  public void setHfEndOn(LocalDate hfEndOn) {
    this.hfEndOn = hfEndOn;
  }

  public SiMemberPlanListContentItem hfName(String hfName) {
    this.hfName = hfName;
    return this;
  }

  /**
   * Get hfName
   * @return hfName
  **/
  @ApiModelProperty(value = "")
  
    public String getHfName() {
    return hfName;
  }

  public void setHfName(String hfName) {
    this.hfName = hfName;
  }

  public SiMemberPlanListContentItem hfPayDepartmentName(String hfPayDepartmentName) {
    this.hfPayDepartmentName = hfPayDepartmentName;
    return this;
  }

  /**
   * Get hfPayDepartmentName
   * @return hfPayDepartmentName
  **/
  @ApiModelProperty(value = "")
  
    public String getHfPayDepartmentName() {
    return hfPayDepartmentName;
  }

  public void setHfPayDepartmentName(String hfPayDepartmentName) {
    this.hfPayDepartmentName = hfPayDepartmentName;
  }

  public SiMemberPlanListContentItem hfStartOn(LocalDate hfStartOn) {
    this.hfStartOn = hfStartOn;
    return this;
  }

  /**
   * Get hfStartOn
   * @return hfStartOn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getHfStartOn() {
    return hfStartOn;
  }

  public void setHfStartOn(LocalDate hfStartOn) {
    this.hfStartOn = hfStartOn;
  }

  public SiMemberPlanListContentItem houseFund(String houseFund) {
    this.houseFund = houseFund;
    return this;
  }

  /**
   * Get houseFund
   * @return houseFund
  **/
  @ApiModelProperty(value = "")
  
    public String getHouseFund() {
    return houseFund;
  }

  public void setHouseFund(String houseFund) {
    this.houseFund = houseFund;
  }

  public SiMemberPlanListContentItem idCardNo(String idCardNo) {
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

  public SiMemberPlanListContentItem inLedger(Boolean inLedger) {
    this.inLedger = inLedger;
    return this;
  }

  /**
   * Get inLedger
   * @return inLedger
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isInLedger() {
    return inLedger;
  }

  public void setInLedger(Boolean inLedger) {
    this.inLedger = inLedger;
  }

  public SiMemberPlanListContentItem insuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
    return this;
  }

  /**
   * Get insuranceType
   * @return insuranceType
  **/
  @ApiModelProperty(example = "增员", value = "")
  
    public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }

  public SiMemberPlanListContentItem isLedger(String isLedger) {
    this.isLedger = isLedger;
    return this;
  }

  /**
   * Get isLedger
   * @return isLedger
  **/
  @ApiModelProperty(example = "否", value = "")
  
    public String getIsLedger() {
    return isLedger;
  }

  public void setIsLedger(String isLedger) {
    this.isLedger = isLedger;
  }

  public SiMemberPlanListContentItem month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public SiMemberPlanListContentItem siAccountNumber(String siAccountNumber) {
    this.siAccountNumber = siAccountNumber;
    return this;
  }

  /**
   * Get siAccountNumber
   * @return siAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getSiAccountNumber() {
    return siAccountNumber;
  }

  public void setSiAccountNumber(String siAccountNumber) {
    this.siAccountNumber = siAccountNumber;
  }

  public SiMemberPlanListContentItem siCompanyBenefit(SiMemberPlanListContentItemSiCompanyBenefit siCompanyBenefit) {
    this.siCompanyBenefit = siCompanyBenefit;
    return this;
  }

  /**
   * Get siCompanyBenefit
   * @return siCompanyBenefit
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SiMemberPlanListContentItemSiCompanyBenefit getSiCompanyBenefit() {
    return siCompanyBenefit;
  }

  public void setSiCompanyBenefit(SiMemberPlanListContentItemSiCompanyBenefit siCompanyBenefit) {
    this.siCompanyBenefit = siCompanyBenefit;
  }

  public SiMemberPlanListContentItem siEndOn(String siEndOn) {
    this.siEndOn = siEndOn;
    return this;
  }

  /**
   * Get siEndOn
   * @return siEndOn
  **/
  @ApiModelProperty(value = "")
  
    public String getSiEndOn() {
    return siEndOn;
  }

  public void setSiEndOn(String siEndOn) {
    this.siEndOn = siEndOn;
  }

  public SiMemberPlanListContentItem siName(String siName) {
    this.siName = siName;
    return this;
  }

  /**
   * Get siName
   * @return siName
  **/
  @ApiModelProperty(example = "北京市-社保", value = "")
  
    public String getSiName() {
    return siName;
  }

  public void setSiName(String siName) {
    this.siName = siName;
  }

  public SiMemberPlanListContentItem siPayDepartmentName(String siPayDepartmentName) {
    this.siPayDepartmentName = siPayDepartmentName;
    return this;
  }

  /**
   * Get siPayDepartmentName
   * @return siPayDepartmentName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getSiPayDepartmentName() {
    return siPayDepartmentName;
  }

  public void setSiPayDepartmentName(String siPayDepartmentName) {
    this.siPayDepartmentName = siPayDepartmentName;
  }

  public SiMemberPlanListContentItem siStartOn(String siStartOn) {
    this.siStartOn = siStartOn;
    return this;
  }

  /**
   * Get siStartOn
   * @return siStartOn
  **/
  @ApiModelProperty(example = "2020-07", value = "")
  
    public String getSiStartOn() {
    return siStartOn;
  }

  public void setSiStartOn(String siStartOn) {
    this.siStartOn = siStartOn;
  }

  public SiMemberPlanListContentItem socialInsurance(SiMemberPlanListContentItemSocialInsurance socialInsurance) {
    this.socialInsurance = socialInsurance;
    return this;
  }

  /**
   * Get socialInsurance
   * @return socialInsurance
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SiMemberPlanListContentItemSocialInsurance getSocialInsurance() {
    return socialInsurance;
  }

  public void setSocialInsurance(SiMemberPlanListContentItemSocialInsurance socialInsurance) {
    this.socialInsurance = socialInsurance;
  }

  public SiMemberPlanListContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "044caed7-924e-4275-831f-c8fa03b13406", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public SiMemberPlanListContentItem staffName(String staffName) {
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

  public SiMemberPlanListContentItem userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SiMemberPlanListContentItem year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiMemberPlanListContentItem siMemberPlanListContentItem = (SiMemberPlanListContentItem) o;
    return Objects.equals(this.departmentId, siMemberPlanListContentItem.departmentId) &&
        Objects.equals(this.departmentName, siMemberPlanListContentItem.departmentName) &&
        Objects.equals(this.hfAccountNumber, siMemberPlanListContentItem.hfAccountNumber) &&
        Objects.equals(this.hfCompanyBenefit, siMemberPlanListContentItem.hfCompanyBenefit) &&
        Objects.equals(this.hfEndOn, siMemberPlanListContentItem.hfEndOn) &&
        Objects.equals(this.hfName, siMemberPlanListContentItem.hfName) &&
        Objects.equals(this.hfPayDepartmentName, siMemberPlanListContentItem.hfPayDepartmentName) &&
        Objects.equals(this.hfStartOn, siMemberPlanListContentItem.hfStartOn) &&
        Objects.equals(this.houseFund, siMemberPlanListContentItem.houseFund) &&
        Objects.equals(this.idCardNo, siMemberPlanListContentItem.idCardNo) &&
        Objects.equals(this.inLedger, siMemberPlanListContentItem.inLedger) &&
        Objects.equals(this.insuranceType, siMemberPlanListContentItem.insuranceType) &&
        Objects.equals(this.isLedger, siMemberPlanListContentItem.isLedger) &&
        Objects.equals(this.month, siMemberPlanListContentItem.month) &&
        Objects.equals(this.siAccountNumber, siMemberPlanListContentItem.siAccountNumber) &&
        Objects.equals(this.siCompanyBenefit, siMemberPlanListContentItem.siCompanyBenefit) &&
        Objects.equals(this.siEndOn, siMemberPlanListContentItem.siEndOn) &&
        Objects.equals(this.siName, siMemberPlanListContentItem.siName) &&
        Objects.equals(this.siPayDepartmentName, siMemberPlanListContentItem.siPayDepartmentName) &&
        Objects.equals(this.siStartOn, siMemberPlanListContentItem.siStartOn) &&
        Objects.equals(this.socialInsurance, siMemberPlanListContentItem.socialInsurance) &&
        Objects.equals(this.staffId, siMemberPlanListContentItem.staffId) &&
        Objects.equals(this.staffName, siMemberPlanListContentItem.staffName) &&
        Objects.equals(this.userId, siMemberPlanListContentItem.userId) &&
        Objects.equals(this.year, siMemberPlanListContentItem.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId, departmentName, hfAccountNumber, hfCompanyBenefit, hfEndOn, hfName, hfPayDepartmentName, hfStartOn, houseFund, idCardNo, inLedger, insuranceType, isLedger, month, siAccountNumber, siCompanyBenefit, siEndOn, siName, siPayDepartmentName, siStartOn, socialInsurance, staffId, staffName, userId, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiMemberPlanListContentItem {\n");
    
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    hfAccountNumber: ").append(toIndentedString(hfAccountNumber)).append("\n");
    sb.append("    hfCompanyBenefit: ").append(toIndentedString(hfCompanyBenefit)).append("\n");
    sb.append("    hfEndOn: ").append(toIndentedString(hfEndOn)).append("\n");
    sb.append("    hfName: ").append(toIndentedString(hfName)).append("\n");
    sb.append("    hfPayDepartmentName: ").append(toIndentedString(hfPayDepartmentName)).append("\n");
    sb.append("    hfStartOn: ").append(toIndentedString(hfStartOn)).append("\n");
    sb.append("    houseFund: ").append(toIndentedString(houseFund)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    inLedger: ").append(toIndentedString(inLedger)).append("\n");
    sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
    sb.append("    isLedger: ").append(toIndentedString(isLedger)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    siAccountNumber: ").append(toIndentedString(siAccountNumber)).append("\n");
    sb.append("    siCompanyBenefit: ").append(toIndentedString(siCompanyBenefit)).append("\n");
    sb.append("    siEndOn: ").append(toIndentedString(siEndOn)).append("\n");
    sb.append("    siName: ").append(toIndentedString(siName)).append("\n");
    sb.append("    siPayDepartmentName: ").append(toIndentedString(siPayDepartmentName)).append("\n");
    sb.append("    siStartOn: ").append(toIndentedString(siStartOn)).append("\n");
    sb.append("    socialInsurance: ").append(toIndentedString(socialInsurance)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
