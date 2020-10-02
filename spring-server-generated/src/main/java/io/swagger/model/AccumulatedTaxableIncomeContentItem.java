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
 * AccumulatedTaxableIncomeContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AccumulatedTaxableIncomeContentItem   {
  @JsonProperty("accumAllowedDeductedDonation")
  private Integer accumAllowedDeductedDonation = null;

  @JsonProperty("accumChildrenEducation")
  private Integer accumChildrenEducation = null;

  @JsonProperty("accumCommercialHealthInsurance")
  private Integer accumCommercialHealthInsurance = null;

  @JsonProperty("accumContinuingEdu")
  private Integer accumContinuingEdu = null;

  @JsonProperty("accumDeduction")
  private Integer accumDeduction = null;

  @JsonProperty("accumEnterpriseOccupationAnnuity")
  private Integer accumEnterpriseOccupationAnnuity = null;

  @JsonProperty("accumHouseRent")
  private Integer accumHouseRent = null;

  @JsonProperty("accumMonthTax")
  private Integer accumMonthTax = null;

  @JsonProperty("accumMortgage")
  private Integer accumMortgage = null;

  @JsonProperty("accumOther")
  private Integer accumOther = null;

  @JsonProperty("accumOtherDeduction")
  private Integer accumOtherDeduction = null;

  @JsonProperty("accumOthertaxableincome")
  private Integer accumOthertaxableincome = null;

  @JsonProperty("accumPffee")
  private Integer accumPffee = null;

  @JsonProperty("accumSsalary")
  private BigDecimal accumSsalary = null;

  @JsonProperty("accumSsfee")
  private Integer accumSsfee = null;

  @JsonProperty("accumSupportElderly")
  private Integer accumSupportElderly = null;

  @JsonProperty("accumTaxDeferredInsurance")
  private Integer accumTaxDeferredInsurance = null;

  @JsonProperty("accumTaxfreeIncome")
  private Integer accumTaxfreeIncome = null;

  @JsonProperty("corporationId")
  private String corporationId = null;

  @JsonProperty("corporationName")
  private String corporationName = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrollInDate")
  private String enrollInDate = null;

  @JsonProperty("historySalaryPlanId")
  private String historySalaryPlanId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("importActualPaidTax")
  private Boolean importActualPaidTax = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("salaryMonth")
  private Integer salaryMonth = null;

  @JsonProperty("salaryYear")
  private String salaryYear = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("thismonthactuallypaidsalarytax")
  private BigDecimal thismonthactuallypaidsalarytax = null;

  @JsonProperty("thismonthsalarytax")
  private BigDecimal thismonthsalarytax = null;

  @JsonProperty("thismonthshouddeductsalarytax")
  private BigDecimal thismonthshouddeductsalarytax = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  @JsonProperty("year")
  private Integer year = null;

  public AccumulatedTaxableIncomeContentItem accumAllowedDeductedDonation(Integer accumAllowedDeductedDonation) {
    this.accumAllowedDeductedDonation = accumAllowedDeductedDonation;
    return this;
  }

  /**
   * Get accumAllowedDeductedDonation
   * @return accumAllowedDeductedDonation
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumAllowedDeductedDonation() {
    return accumAllowedDeductedDonation;
  }

  public void setAccumAllowedDeductedDonation(Integer accumAllowedDeductedDonation) {
    this.accumAllowedDeductedDonation = accumAllowedDeductedDonation;
  }

  public AccumulatedTaxableIncomeContentItem accumChildrenEducation(Integer accumChildrenEducation) {
    this.accumChildrenEducation = accumChildrenEducation;
    return this;
  }

  /**
   * Get accumChildrenEducation
   * @return accumChildrenEducation
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumChildrenEducation() {
    return accumChildrenEducation;
  }

  public void setAccumChildrenEducation(Integer accumChildrenEducation) {
    this.accumChildrenEducation = accumChildrenEducation;
  }

  public AccumulatedTaxableIncomeContentItem accumCommercialHealthInsurance(Integer accumCommercialHealthInsurance) {
    this.accumCommercialHealthInsurance = accumCommercialHealthInsurance;
    return this;
  }

  /**
   * Get accumCommercialHealthInsurance
   * @return accumCommercialHealthInsurance
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumCommercialHealthInsurance() {
    return accumCommercialHealthInsurance;
  }

  public void setAccumCommercialHealthInsurance(Integer accumCommercialHealthInsurance) {
    this.accumCommercialHealthInsurance = accumCommercialHealthInsurance;
  }

  public AccumulatedTaxableIncomeContentItem accumContinuingEdu(Integer accumContinuingEdu) {
    this.accumContinuingEdu = accumContinuingEdu;
    return this;
  }

  /**
   * Get accumContinuingEdu
   * @return accumContinuingEdu
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumContinuingEdu() {
    return accumContinuingEdu;
  }

  public void setAccumContinuingEdu(Integer accumContinuingEdu) {
    this.accumContinuingEdu = accumContinuingEdu;
  }

  public AccumulatedTaxableIncomeContentItem accumDeduction(Integer accumDeduction) {
    this.accumDeduction = accumDeduction;
    return this;
  }

  /**
   * Get accumDeduction
   * @return accumDeduction
  **/
  @ApiModelProperty(example = "15000", value = "")
  
    public Integer getAccumDeduction() {
    return accumDeduction;
  }

  public void setAccumDeduction(Integer accumDeduction) {
    this.accumDeduction = accumDeduction;
  }

  public AccumulatedTaxableIncomeContentItem accumEnterpriseOccupationAnnuity(Integer accumEnterpriseOccupationAnnuity) {
    this.accumEnterpriseOccupationAnnuity = accumEnterpriseOccupationAnnuity;
    return this;
  }

  /**
   * Get accumEnterpriseOccupationAnnuity
   * @return accumEnterpriseOccupationAnnuity
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumEnterpriseOccupationAnnuity() {
    return accumEnterpriseOccupationAnnuity;
  }

  public void setAccumEnterpriseOccupationAnnuity(Integer accumEnterpriseOccupationAnnuity) {
    this.accumEnterpriseOccupationAnnuity = accumEnterpriseOccupationAnnuity;
  }

  public AccumulatedTaxableIncomeContentItem accumHouseRent(Integer accumHouseRent) {
    this.accumHouseRent = accumHouseRent;
    return this;
  }

  /**
   * Get accumHouseRent
   * @return accumHouseRent
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumHouseRent() {
    return accumHouseRent;
  }

  public void setAccumHouseRent(Integer accumHouseRent) {
    this.accumHouseRent = accumHouseRent;
  }

  public AccumulatedTaxableIncomeContentItem accumMonthTax(Integer accumMonthTax) {
    this.accumMonthTax = accumMonthTax;
    return this;
  }

  /**
   * Get accumMonthTax
   * @return accumMonthTax
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumMonthTax() {
    return accumMonthTax;
  }

  public void setAccumMonthTax(Integer accumMonthTax) {
    this.accumMonthTax = accumMonthTax;
  }

  public AccumulatedTaxableIncomeContentItem accumMortgage(Integer accumMortgage) {
    this.accumMortgage = accumMortgage;
    return this;
  }

  /**
   * Get accumMortgage
   * @return accumMortgage
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumMortgage() {
    return accumMortgage;
  }

  public void setAccumMortgage(Integer accumMortgage) {
    this.accumMortgage = accumMortgage;
  }

  public AccumulatedTaxableIncomeContentItem accumOther(Integer accumOther) {
    this.accumOther = accumOther;
    return this;
  }

  /**
   * Get accumOther
   * @return accumOther
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumOther() {
    return accumOther;
  }

  public void setAccumOther(Integer accumOther) {
    this.accumOther = accumOther;
  }

  public AccumulatedTaxableIncomeContentItem accumOtherDeduction(Integer accumOtherDeduction) {
    this.accumOtherDeduction = accumOtherDeduction;
    return this;
  }

  /**
   * Get accumOtherDeduction
   * @return accumOtherDeduction
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumOtherDeduction() {
    return accumOtherDeduction;
  }

  public void setAccumOtherDeduction(Integer accumOtherDeduction) {
    this.accumOtherDeduction = accumOtherDeduction;
  }

  public AccumulatedTaxableIncomeContentItem accumOthertaxableincome(Integer accumOthertaxableincome) {
    this.accumOthertaxableincome = accumOthertaxableincome;
    return this;
  }

  /**
   * Get accumOthertaxableincome
   * @return accumOthertaxableincome
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumOthertaxableincome() {
    return accumOthertaxableincome;
  }

  public void setAccumOthertaxableincome(Integer accumOthertaxableincome) {
    this.accumOthertaxableincome = accumOthertaxableincome;
  }

  public AccumulatedTaxableIncomeContentItem accumPffee(Integer accumPffee) {
    this.accumPffee = accumPffee;
    return this;
  }

  /**
   * Get accumPffee
   * @return accumPffee
  **/
  @ApiModelProperty(example = "480", value = "")
  
    public Integer getAccumPffee() {
    return accumPffee;
  }

  public void setAccumPffee(Integer accumPffee) {
    this.accumPffee = accumPffee;
  }

  public AccumulatedTaxableIncomeContentItem accumSsalary(BigDecimal accumSsalary) {
    this.accumSsalary = accumSsalary;
    return this;
  }

  /**
   * Get accumSsalary
   * @return accumSsalary
  **/
  @ApiModelProperty(example = "9081.91", value = "")
  
    @Valid
    public BigDecimal getAccumSsalary() {
    return accumSsalary;
  }

  public void setAccumSsalary(BigDecimal accumSsalary) {
    this.accumSsalary = accumSsalary;
  }

  public AccumulatedTaxableIncomeContentItem accumSsfee(Integer accumSsfee) {
    this.accumSsfee = accumSsfee;
    return this;
  }

  /**
   * Get accumSsfee
   * @return accumSsfee
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAccumSsfee() {
    return accumSsfee;
  }

  public void setAccumSsfee(Integer accumSsfee) {
    this.accumSsfee = accumSsfee;
  }

  public AccumulatedTaxableIncomeContentItem accumSupportElderly(Integer accumSupportElderly) {
    this.accumSupportElderly = accumSupportElderly;
    return this;
  }

  /**
   * Get accumSupportElderly
   * @return accumSupportElderly
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumSupportElderly() {
    return accumSupportElderly;
  }

  public void setAccumSupportElderly(Integer accumSupportElderly) {
    this.accumSupportElderly = accumSupportElderly;
  }

  public AccumulatedTaxableIncomeContentItem accumTaxDeferredInsurance(Integer accumTaxDeferredInsurance) {
    this.accumTaxDeferredInsurance = accumTaxDeferredInsurance;
    return this;
  }

  /**
   * Get accumTaxDeferredInsurance
   * @return accumTaxDeferredInsurance
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAccumTaxDeferredInsurance() {
    return accumTaxDeferredInsurance;
  }

  public void setAccumTaxDeferredInsurance(Integer accumTaxDeferredInsurance) {
    this.accumTaxDeferredInsurance = accumTaxDeferredInsurance;
  }

  public AccumulatedTaxableIncomeContentItem accumTaxfreeIncome(Integer accumTaxfreeIncome) {
    this.accumTaxfreeIncome = accumTaxfreeIncome;
    return this;
  }

  /**
   * Get accumTaxfreeIncome
   * @return accumTaxfreeIncome
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAccumTaxfreeIncome() {
    return accumTaxfreeIncome;
  }

  public void setAccumTaxfreeIncome(Integer accumTaxfreeIncome) {
    this.accumTaxfreeIncome = accumTaxfreeIncome;
  }

  public AccumulatedTaxableIncomeContentItem corporationId(String corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * Get corporationId
   * @return corporationId
  **/
  @ApiModelProperty(example = "d2822608-d5f4-47dd-9776-9ae2f24c9993", value = "")
  
    public String getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(String corporationId) {
    this.corporationId = corporationId;
  }

  public AccumulatedTaxableIncomeContentItem corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public AccumulatedTaxableIncomeContentItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2020-09-08T15:25:22.000+0000", value = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AccumulatedTaxableIncomeContentItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "7", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public AccumulatedTaxableIncomeContentItem departmentName(String departmentName) {
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

  public AccumulatedTaxableIncomeContentItem enrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "2020-06-15T16:00:00.000+0000", value = "")
  
    public String getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public AccumulatedTaxableIncomeContentItem historySalaryPlanId(String historySalaryPlanId) {
    this.historySalaryPlanId = historySalaryPlanId;
    return this;
  }

  /**
   * Get historySalaryPlanId
   * @return historySalaryPlanId
  **/
  @ApiModelProperty(example = "23593", value = "")
  
    public String getHistorySalaryPlanId() {
    return historySalaryPlanId;
  }

  public void setHistorySalaryPlanId(String historySalaryPlanId) {
    this.historySalaryPlanId = historySalaryPlanId;
  }

  public AccumulatedTaxableIncomeContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1805256", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccumulatedTaxableIncomeContentItem idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  /**
   * Get idCardNo
   * @return idCardNo
  **/
  @ApiModelProperty(example = "13567190293", value = "")
  
    public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }

  public AccumulatedTaxableIncomeContentItem importActualPaidTax(Boolean importActualPaidTax) {
    this.importActualPaidTax = importActualPaidTax;
    return this;
  }

  /**
   * Get importActualPaidTax
   * @return importActualPaidTax
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isImportActualPaidTax() {
    return importActualPaidTax;
  }

  public void setImportActualPaidTax(Boolean importActualPaidTax) {
    this.importActualPaidTax = importActualPaidTax;
  }

  public AccumulatedTaxableIncomeContentItem mobileNo(String mobileNo) {
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

  public AccumulatedTaxableIncomeContentItem month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "8", value = "")
  
    public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public AccumulatedTaxableIncomeContentItem salaryMonth(Integer salaryMonth) {
    this.salaryMonth = salaryMonth;
    return this;
  }

  /**
   * Get salaryMonth
   * @return salaryMonth
  **/
  @ApiModelProperty(example = "8", value = "")
  
    public Integer getSalaryMonth() {
    return salaryMonth;
  }

  public void setSalaryMonth(Integer salaryMonth) {
    this.salaryMonth = salaryMonth;
  }

  public AccumulatedTaxableIncomeContentItem salaryYear(String salaryYear) {
    this.salaryYear = salaryYear;
    return this;
  }

  /**
   * Get salaryYear
   * @return salaryYear
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public String getSalaryYear() {
    return salaryYear;
  }

  public void setSalaryYear(String salaryYear) {
    this.salaryYear = salaryYear;
  }

  public AccumulatedTaxableIncomeContentItem staffId(String staffId) {
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

  public AccumulatedTaxableIncomeContentItem staffName(String staffName) {
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

  public AccumulatedTaxableIncomeContentItem staffNo(String staffNo) {
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

  public AccumulatedTaxableIncomeContentItem thismonthactuallypaidsalarytax(BigDecimal thismonthactuallypaidsalarytax) {
    this.thismonthactuallypaidsalarytax = thismonthactuallypaidsalarytax;
    return this;
  }

  /**
   * Get thismonthactuallypaidsalarytax
   * @return thismonthactuallypaidsalarytax
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getThismonthactuallypaidsalarytax() {
    return thismonthactuallypaidsalarytax;
  }

  public void setThismonthactuallypaidsalarytax(BigDecimal thismonthactuallypaidsalarytax) {
    this.thismonthactuallypaidsalarytax = thismonthactuallypaidsalarytax;
  }

  public AccumulatedTaxableIncomeContentItem thismonthsalarytax(BigDecimal thismonthsalarytax) {
    this.thismonthsalarytax = thismonthsalarytax;
    return this;
  }

  /**
   * Get thismonthsalarytax
   * @return thismonthsalarytax
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getThismonthsalarytax() {
    return thismonthsalarytax;
  }

  public void setThismonthsalarytax(BigDecimal thismonthsalarytax) {
    this.thismonthsalarytax = thismonthsalarytax;
  }

  public AccumulatedTaxableIncomeContentItem thismonthshouddeductsalarytax(BigDecimal thismonthshouddeductsalarytax) {
    this.thismonthshouddeductsalarytax = thismonthshouddeductsalarytax;
    return this;
  }

  /**
   * Get thismonthshouddeductsalarytax
   * @return thismonthshouddeductsalarytax
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getThismonthshouddeductsalarytax() {
    return thismonthshouddeductsalarytax;
  }

  public void setThismonthshouddeductsalarytax(BigDecimal thismonthshouddeductsalarytax) {
    this.thismonthshouddeductsalarytax = thismonthshouddeductsalarytax;
  }

  public AccumulatedTaxableIncomeContentItem updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2020-09-08T15:25:22.000+0000", value = "")
  
    public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AccumulatedTaxableIncomeContentItem year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
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
    AccumulatedTaxableIncomeContentItem accumulatedTaxableIncomeContentItem = (AccumulatedTaxableIncomeContentItem) o;
    return Objects.equals(this.accumAllowedDeductedDonation, accumulatedTaxableIncomeContentItem.accumAllowedDeductedDonation) &&
        Objects.equals(this.accumChildrenEducation, accumulatedTaxableIncomeContentItem.accumChildrenEducation) &&
        Objects.equals(this.accumCommercialHealthInsurance, accumulatedTaxableIncomeContentItem.accumCommercialHealthInsurance) &&
        Objects.equals(this.accumContinuingEdu, accumulatedTaxableIncomeContentItem.accumContinuingEdu) &&
        Objects.equals(this.accumDeduction, accumulatedTaxableIncomeContentItem.accumDeduction) &&
        Objects.equals(this.accumEnterpriseOccupationAnnuity, accumulatedTaxableIncomeContentItem.accumEnterpriseOccupationAnnuity) &&
        Objects.equals(this.accumHouseRent, accumulatedTaxableIncomeContentItem.accumHouseRent) &&
        Objects.equals(this.accumMonthTax, accumulatedTaxableIncomeContentItem.accumMonthTax) &&
        Objects.equals(this.accumMortgage, accumulatedTaxableIncomeContentItem.accumMortgage) &&
        Objects.equals(this.accumOther, accumulatedTaxableIncomeContentItem.accumOther) &&
        Objects.equals(this.accumOtherDeduction, accumulatedTaxableIncomeContentItem.accumOtherDeduction) &&
        Objects.equals(this.accumOthertaxableincome, accumulatedTaxableIncomeContentItem.accumOthertaxableincome) &&
        Objects.equals(this.accumPffee, accumulatedTaxableIncomeContentItem.accumPffee) &&
        Objects.equals(this.accumSsalary, accumulatedTaxableIncomeContentItem.accumSsalary) &&
        Objects.equals(this.accumSsfee, accumulatedTaxableIncomeContentItem.accumSsfee) &&
        Objects.equals(this.accumSupportElderly, accumulatedTaxableIncomeContentItem.accumSupportElderly) &&
        Objects.equals(this.accumTaxDeferredInsurance, accumulatedTaxableIncomeContentItem.accumTaxDeferredInsurance) &&
        Objects.equals(this.accumTaxfreeIncome, accumulatedTaxableIncomeContentItem.accumTaxfreeIncome) &&
        Objects.equals(this.corporationId, accumulatedTaxableIncomeContentItem.corporationId) &&
        Objects.equals(this.corporationName, accumulatedTaxableIncomeContentItem.corporationName) &&
        Objects.equals(this.createdAt, accumulatedTaxableIncomeContentItem.createdAt) &&
        Objects.equals(this.departmentId, accumulatedTaxableIncomeContentItem.departmentId) &&
        Objects.equals(this.departmentName, accumulatedTaxableIncomeContentItem.departmentName) &&
        Objects.equals(this.enrollInDate, accumulatedTaxableIncomeContentItem.enrollInDate) &&
        Objects.equals(this.historySalaryPlanId, accumulatedTaxableIncomeContentItem.historySalaryPlanId) &&
        Objects.equals(this.id, accumulatedTaxableIncomeContentItem.id) &&
        Objects.equals(this.idCardNo, accumulatedTaxableIncomeContentItem.idCardNo) &&
        Objects.equals(this.importActualPaidTax, accumulatedTaxableIncomeContentItem.importActualPaidTax) &&
        Objects.equals(this.mobileNo, accumulatedTaxableIncomeContentItem.mobileNo) &&
        Objects.equals(this.month, accumulatedTaxableIncomeContentItem.month) &&
        Objects.equals(this.salaryMonth, accumulatedTaxableIncomeContentItem.salaryMonth) &&
        Objects.equals(this.salaryYear, accumulatedTaxableIncomeContentItem.salaryYear) &&
        Objects.equals(this.staffId, accumulatedTaxableIncomeContentItem.staffId) &&
        Objects.equals(this.staffName, accumulatedTaxableIncomeContentItem.staffName) &&
        Objects.equals(this.staffNo, accumulatedTaxableIncomeContentItem.staffNo) &&
        Objects.equals(this.thismonthactuallypaidsalarytax, accumulatedTaxableIncomeContentItem.thismonthactuallypaidsalarytax) &&
        Objects.equals(this.thismonthsalarytax, accumulatedTaxableIncomeContentItem.thismonthsalarytax) &&
        Objects.equals(this.thismonthshouddeductsalarytax, accumulatedTaxableIncomeContentItem.thismonthshouddeductsalarytax) &&
        Objects.equals(this.updatedAt, accumulatedTaxableIncomeContentItem.updatedAt) &&
        Objects.equals(this.year, accumulatedTaxableIncomeContentItem.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumAllowedDeductedDonation, accumChildrenEducation, accumCommercialHealthInsurance, accumContinuingEdu, accumDeduction, accumEnterpriseOccupationAnnuity, accumHouseRent, accumMonthTax, accumMortgage, accumOther, accumOtherDeduction, accumOthertaxableincome, accumPffee, accumSsalary, accumSsfee, accumSupportElderly, accumTaxDeferredInsurance, accumTaxfreeIncome, corporationId, corporationName, createdAt, departmentId, departmentName, enrollInDate, historySalaryPlanId, id, idCardNo, importActualPaidTax, mobileNo, month, salaryMonth, salaryYear, staffId, staffName, staffNo, thismonthactuallypaidsalarytax, thismonthsalarytax, thismonthshouddeductsalarytax, updatedAt, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulatedTaxableIncomeContentItem {\n");
    
    sb.append("    accumAllowedDeductedDonation: ").append(toIndentedString(accumAllowedDeductedDonation)).append("\n");
    sb.append("    accumChildrenEducation: ").append(toIndentedString(accumChildrenEducation)).append("\n");
    sb.append("    accumCommercialHealthInsurance: ").append(toIndentedString(accumCommercialHealthInsurance)).append("\n");
    sb.append("    accumContinuingEdu: ").append(toIndentedString(accumContinuingEdu)).append("\n");
    sb.append("    accumDeduction: ").append(toIndentedString(accumDeduction)).append("\n");
    sb.append("    accumEnterpriseOccupationAnnuity: ").append(toIndentedString(accumEnterpriseOccupationAnnuity)).append("\n");
    sb.append("    accumHouseRent: ").append(toIndentedString(accumHouseRent)).append("\n");
    sb.append("    accumMonthTax: ").append(toIndentedString(accumMonthTax)).append("\n");
    sb.append("    accumMortgage: ").append(toIndentedString(accumMortgage)).append("\n");
    sb.append("    accumOther: ").append(toIndentedString(accumOther)).append("\n");
    sb.append("    accumOtherDeduction: ").append(toIndentedString(accumOtherDeduction)).append("\n");
    sb.append("    accumOthertaxableincome: ").append(toIndentedString(accumOthertaxableincome)).append("\n");
    sb.append("    accumPffee: ").append(toIndentedString(accumPffee)).append("\n");
    sb.append("    accumSsalary: ").append(toIndentedString(accumSsalary)).append("\n");
    sb.append("    accumSsfee: ").append(toIndentedString(accumSsfee)).append("\n");
    sb.append("    accumSupportElderly: ").append(toIndentedString(accumSupportElderly)).append("\n");
    sb.append("    accumTaxDeferredInsurance: ").append(toIndentedString(accumTaxDeferredInsurance)).append("\n");
    sb.append("    accumTaxfreeIncome: ").append(toIndentedString(accumTaxfreeIncome)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    historySalaryPlanId: ").append(toIndentedString(historySalaryPlanId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    importActualPaidTax: ").append(toIndentedString(importActualPaidTax)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    salaryMonth: ").append(toIndentedString(salaryMonth)).append("\n");
    sb.append("    salaryYear: ").append(toIndentedString(salaryYear)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    thismonthactuallypaidsalarytax: ").append(toIndentedString(thismonthactuallypaidsalarytax)).append("\n");
    sb.append("    thismonthsalarytax: ").append(toIndentedString(thismonthsalarytax)).append("\n");
    sb.append("    thismonthshouddeductsalarytax: ").append(toIndentedString(thismonthshouddeductsalarytax)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
