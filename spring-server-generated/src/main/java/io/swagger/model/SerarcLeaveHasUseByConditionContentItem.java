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
 * SerarcLeaveHasUseByConditionContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SerarcLeaveHasUseByConditionContentItem   {
  @JsonProperty("adjustResetLeaveDayUsed")
  private BigDecimal adjustResetLeaveDayUsed = null;

  @JsonProperty("adjustResetLeaveHourUsed")
  private BigDecimal adjustResetLeaveHourUsed = null;

  @JsonProperty("affairBillId")
  private String affairBillId = null;

  @JsonProperty("annualBillId")
  private String annualBillId = null;

  @JsonProperty("belongsToYear")
  private String belongsToYear = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrollInDate")
  private String enrollInDate = null;

  @JsonProperty("enrollWorkYears")
  private BigDecimal enrollWorkYears = null;

  @JsonProperty("funeralBillId")
  private String funeralBillId = null;

  @JsonProperty("hasUseAffairLeaveDays")
  private BigDecimal hasUseAffairLeaveDays = null;

  @JsonProperty("hasUseAffairLeaveHours")
  private BigDecimal hasUseAffairLeaveHours = null;

  @JsonProperty("hasUseAnnualDays")
  private BigDecimal hasUseAnnualDays = null;

  @JsonProperty("hasUseAnnualHours")
  private BigDecimal hasUseAnnualHours = null;

  @JsonProperty("hasUseBuckleSalaryDays")
  private BigDecimal hasUseBuckleSalaryDays = null;

  @JsonProperty("hasUseBuckleSalaryHours")
  private BigDecimal hasUseBuckleSalaryHours = null;

  @JsonProperty("hasUseFuneralDays")
  private BigDecimal hasUseFuneralDays = null;

  @JsonProperty("hasUseFuneralHours")
  private BigDecimal hasUseFuneralHours = null;

  @JsonProperty("hasUseHomeDays")
  private BigDecimal hasUseHomeDays = null;

  @JsonProperty("hasUseHomeHours")
  private BigDecimal hasUseHomeHours = null;

  @JsonProperty("hasUseLactationDays")
  private BigDecimal hasUseLactationDays = null;

  @JsonProperty("hasUseLactationHours")
  private BigDecimal hasUseLactationHours = null;

  @JsonProperty("hasUseMarriageDays")
  private BigDecimal hasUseMarriageDays = null;

  @JsonProperty("hasUseMarriageHours")
  private BigDecimal hasUseMarriageHours = null;

  @JsonProperty("hasUseMaternityLeaveDays")
  private BigDecimal hasUseMaternityLeaveDays = null;

  @JsonProperty("hasUseMaternityLeaveHours")
  private BigDecimal hasUseMaternityLeaveHours = null;

  @JsonProperty("hasUseOtherDays")
  private BigDecimal hasUseOtherDays = null;

  @JsonProperty("hasUseOtherHours")
  private BigDecimal hasUseOtherHours = null;

  @JsonProperty("hasUsePaternityDays")
  private BigDecimal hasUsePaternityDays = null;

  @JsonProperty("hasUsePaternityHours")
  private BigDecimal hasUsePaternityHours = null;

  @JsonProperty("hasUsePrenatalCheckUpDays")
  private BigDecimal hasUsePrenatalCheckUpDays = null;

  @JsonProperty("hasUsePrenatalCheckUpHours")
  private BigDecimal hasUsePrenatalCheckUpHours = null;

  @JsonProperty("hasUseStatutoryAnnualDays")
  private BigDecimal hasUseStatutoryAnnualDays = null;

  @JsonProperty("hasUseStatutoryAnnualHours")
  private BigDecimal hasUseStatutoryAnnualHours = null;

  @JsonProperty("hasUseWelfareAnnualDays")
  private BigDecimal hasUseWelfareAnnualDays = null;

  @JsonProperty("hasUseWelfareAnnualHours")
  private BigDecimal hasUseWelfareAnnualHours = null;

  @JsonProperty("homeBillId")
  private String homeBillId = null;

  @JsonProperty("lacationBillId")
  private String lacationBillId = null;

  @JsonProperty("leaveUserDefinedEntityList")
  private String leaveUserDefinedEntityList = null;

  @JsonProperty("marriageBillId")
  private String marriageBillId = null;

  @JsonProperty("maternityBillId")
  private String maternityBillId = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("otherBillId")
  private String otherBillId = null;

  @JsonProperty("paternityBillId")
  private String paternityBillId = null;

  @JsonProperty("prenatalCheckUpBillId")
  private String prenatalCheckUpBillId = null;

  @JsonProperty("sickBillId")
  private String sickBillId = null;

  @JsonProperty("sickLeaveDayUsed")
  private Integer sickLeaveDayUsed = null;

  @JsonProperty("sickLeaveHourUsed")
  private Integer sickLeaveHourUsed = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  @JsonProperty("userDefinedNames")
  private String userDefinedNames = null;

  public SerarcLeaveHasUseByConditionContentItem adjustResetLeaveDayUsed(BigDecimal adjustResetLeaveDayUsed) {
    this.adjustResetLeaveDayUsed = adjustResetLeaveDayUsed;
    return this;
  }

  /**
   * Get adjustResetLeaveDayUsed
   * @return adjustResetLeaveDayUsed
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAdjustResetLeaveDayUsed() {
    return adjustResetLeaveDayUsed;
  }

  public void setAdjustResetLeaveDayUsed(BigDecimal adjustResetLeaveDayUsed) {
    this.adjustResetLeaveDayUsed = adjustResetLeaveDayUsed;
  }

  public SerarcLeaveHasUseByConditionContentItem adjustResetLeaveHourUsed(BigDecimal adjustResetLeaveHourUsed) {
    this.adjustResetLeaveHourUsed = adjustResetLeaveHourUsed;
    return this;
  }

  /**
   * Get adjustResetLeaveHourUsed
   * @return adjustResetLeaveHourUsed
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAdjustResetLeaveHourUsed() {
    return adjustResetLeaveHourUsed;
  }

  public void setAdjustResetLeaveHourUsed(BigDecimal adjustResetLeaveHourUsed) {
    this.adjustResetLeaveHourUsed = adjustResetLeaveHourUsed;
  }

  public SerarcLeaveHasUseByConditionContentItem affairBillId(String affairBillId) {
    this.affairBillId = affairBillId;
    return this;
  }

  /**
   * Get affairBillId
   * @return affairBillId
  **/
  @ApiModelProperty(example = "86d578d8-f2b8-4059-b776-b675f4b76f79", value = "")
  
    public String getAffairBillId() {
    return affairBillId;
  }

  public void setAffairBillId(String affairBillId) {
    this.affairBillId = affairBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem annualBillId(String annualBillId) {
    this.annualBillId = annualBillId;
    return this;
  }

  /**
   * Get annualBillId
   * @return annualBillId
  **/
  @ApiModelProperty(example = "3ab9c838-2a99-4116-a134-c709d5c5b5dc", value = "")
  
    public String getAnnualBillId() {
    return annualBillId;
  }

  public void setAnnualBillId(String annualBillId) {
    this.annualBillId = annualBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem belongsToYear(String belongsToYear) {
    this.belongsToYear = belongsToYear;
    return this;
  }

  /**
   * Get belongsToYear
   * @return belongsToYear
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public String getBelongsToYear() {
    return belongsToYear;
  }

  public void setBelongsToYear(String belongsToYear) {
    this.belongsToYear = belongsToYear;
  }

  public SerarcLeaveHasUseByConditionContentItem companyId(String companyId) {
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

  public SerarcLeaveHasUseByConditionContentItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "21", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public SerarcLeaveHasUseByConditionContentItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "行政部", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public SerarcLeaveHasUseByConditionContentItem enrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "1561910400000", value = "")
  
    public String getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(String enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public SerarcLeaveHasUseByConditionContentItem enrollWorkYears(BigDecimal enrollWorkYears) {
    this.enrollWorkYears = enrollWorkYears;
    return this;
  }

  /**
   * Get enrollWorkYears
   * @return enrollWorkYears
  **/
  @ApiModelProperty(example = "1.2", value = "")
  
    @Valid
    public BigDecimal getEnrollWorkYears() {
    return enrollWorkYears;
  }

  public void setEnrollWorkYears(BigDecimal enrollWorkYears) {
    this.enrollWorkYears = enrollWorkYears;
  }

  public SerarcLeaveHasUseByConditionContentItem funeralBillId(String funeralBillId) {
    this.funeralBillId = funeralBillId;
    return this;
  }

  /**
   * Get funeralBillId
   * @return funeralBillId
  **/
  @ApiModelProperty(example = "dd9de69e-ef5a-4ded-aa6f-56143eb5e275", value = "")
  
    public String getFuneralBillId() {
    return funeralBillId;
  }

  public void setFuneralBillId(String funeralBillId) {
    this.funeralBillId = funeralBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseAffairLeaveDays(BigDecimal hasUseAffairLeaveDays) {
    this.hasUseAffairLeaveDays = hasUseAffairLeaveDays;
    return this;
  }

  /**
   * Get hasUseAffairLeaveDays
   * @return hasUseAffairLeaveDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseAffairLeaveDays() {
    return hasUseAffairLeaveDays;
  }

  public void setHasUseAffairLeaveDays(BigDecimal hasUseAffairLeaveDays) {
    this.hasUseAffairLeaveDays = hasUseAffairLeaveDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseAffairLeaveHours(BigDecimal hasUseAffairLeaveHours) {
    this.hasUseAffairLeaveHours = hasUseAffairLeaveHours;
    return this;
  }

  /**
   * Get hasUseAffairLeaveHours
   * @return hasUseAffairLeaveHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseAffairLeaveHours() {
    return hasUseAffairLeaveHours;
  }

  public void setHasUseAffairLeaveHours(BigDecimal hasUseAffairLeaveHours) {
    this.hasUseAffairLeaveHours = hasUseAffairLeaveHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseAnnualDays(BigDecimal hasUseAnnualDays) {
    this.hasUseAnnualDays = hasUseAnnualDays;
    return this;
  }

  /**
   * Get hasUseAnnualDays
   * @return hasUseAnnualDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseAnnualDays() {
    return hasUseAnnualDays;
  }

  public void setHasUseAnnualDays(BigDecimal hasUseAnnualDays) {
    this.hasUseAnnualDays = hasUseAnnualDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseAnnualHours(BigDecimal hasUseAnnualHours) {
    this.hasUseAnnualHours = hasUseAnnualHours;
    return this;
  }

  /**
   * Get hasUseAnnualHours
   * @return hasUseAnnualHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseAnnualHours() {
    return hasUseAnnualHours;
  }

  public void setHasUseAnnualHours(BigDecimal hasUseAnnualHours) {
    this.hasUseAnnualHours = hasUseAnnualHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseBuckleSalaryDays(BigDecimal hasUseBuckleSalaryDays) {
    this.hasUseBuckleSalaryDays = hasUseBuckleSalaryDays;
    return this;
  }

  /**
   * Get hasUseBuckleSalaryDays
   * @return hasUseBuckleSalaryDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseBuckleSalaryDays() {
    return hasUseBuckleSalaryDays;
  }

  public void setHasUseBuckleSalaryDays(BigDecimal hasUseBuckleSalaryDays) {
    this.hasUseBuckleSalaryDays = hasUseBuckleSalaryDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseBuckleSalaryHours(BigDecimal hasUseBuckleSalaryHours) {
    this.hasUseBuckleSalaryHours = hasUseBuckleSalaryHours;
    return this;
  }

  /**
   * Get hasUseBuckleSalaryHours
   * @return hasUseBuckleSalaryHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseBuckleSalaryHours() {
    return hasUseBuckleSalaryHours;
  }

  public void setHasUseBuckleSalaryHours(BigDecimal hasUseBuckleSalaryHours) {
    this.hasUseBuckleSalaryHours = hasUseBuckleSalaryHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseFuneralDays(BigDecimal hasUseFuneralDays) {
    this.hasUseFuneralDays = hasUseFuneralDays;
    return this;
  }

  /**
   * Get hasUseFuneralDays
   * @return hasUseFuneralDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseFuneralDays() {
    return hasUseFuneralDays;
  }

  public void setHasUseFuneralDays(BigDecimal hasUseFuneralDays) {
    this.hasUseFuneralDays = hasUseFuneralDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseFuneralHours(BigDecimal hasUseFuneralHours) {
    this.hasUseFuneralHours = hasUseFuneralHours;
    return this;
  }

  /**
   * Get hasUseFuneralHours
   * @return hasUseFuneralHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseFuneralHours() {
    return hasUseFuneralHours;
  }

  public void setHasUseFuneralHours(BigDecimal hasUseFuneralHours) {
    this.hasUseFuneralHours = hasUseFuneralHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseHomeDays(BigDecimal hasUseHomeDays) {
    this.hasUseHomeDays = hasUseHomeDays;
    return this;
  }

  /**
   * Get hasUseHomeDays
   * @return hasUseHomeDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseHomeDays() {
    return hasUseHomeDays;
  }

  public void setHasUseHomeDays(BigDecimal hasUseHomeDays) {
    this.hasUseHomeDays = hasUseHomeDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseHomeHours(BigDecimal hasUseHomeHours) {
    this.hasUseHomeHours = hasUseHomeHours;
    return this;
  }

  /**
   * Get hasUseHomeHours
   * @return hasUseHomeHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseHomeHours() {
    return hasUseHomeHours;
  }

  public void setHasUseHomeHours(BigDecimal hasUseHomeHours) {
    this.hasUseHomeHours = hasUseHomeHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseLactationDays(BigDecimal hasUseLactationDays) {
    this.hasUseLactationDays = hasUseLactationDays;
    return this;
  }

  /**
   * Get hasUseLactationDays
   * @return hasUseLactationDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseLactationDays() {
    return hasUseLactationDays;
  }

  public void setHasUseLactationDays(BigDecimal hasUseLactationDays) {
    this.hasUseLactationDays = hasUseLactationDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseLactationHours(BigDecimal hasUseLactationHours) {
    this.hasUseLactationHours = hasUseLactationHours;
    return this;
  }

  /**
   * Get hasUseLactationHours
   * @return hasUseLactationHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseLactationHours() {
    return hasUseLactationHours;
  }

  public void setHasUseLactationHours(BigDecimal hasUseLactationHours) {
    this.hasUseLactationHours = hasUseLactationHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseMarriageDays(BigDecimal hasUseMarriageDays) {
    this.hasUseMarriageDays = hasUseMarriageDays;
    return this;
  }

  /**
   * Get hasUseMarriageDays
   * @return hasUseMarriageDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseMarriageDays() {
    return hasUseMarriageDays;
  }

  public void setHasUseMarriageDays(BigDecimal hasUseMarriageDays) {
    this.hasUseMarriageDays = hasUseMarriageDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseMarriageHours(BigDecimal hasUseMarriageHours) {
    this.hasUseMarriageHours = hasUseMarriageHours;
    return this;
  }

  /**
   * Get hasUseMarriageHours
   * @return hasUseMarriageHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseMarriageHours() {
    return hasUseMarriageHours;
  }

  public void setHasUseMarriageHours(BigDecimal hasUseMarriageHours) {
    this.hasUseMarriageHours = hasUseMarriageHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseMaternityLeaveDays(BigDecimal hasUseMaternityLeaveDays) {
    this.hasUseMaternityLeaveDays = hasUseMaternityLeaveDays;
    return this;
  }

  /**
   * Get hasUseMaternityLeaveDays
   * @return hasUseMaternityLeaveDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseMaternityLeaveDays() {
    return hasUseMaternityLeaveDays;
  }

  public void setHasUseMaternityLeaveDays(BigDecimal hasUseMaternityLeaveDays) {
    this.hasUseMaternityLeaveDays = hasUseMaternityLeaveDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseMaternityLeaveHours(BigDecimal hasUseMaternityLeaveHours) {
    this.hasUseMaternityLeaveHours = hasUseMaternityLeaveHours;
    return this;
  }

  /**
   * Get hasUseMaternityLeaveHours
   * @return hasUseMaternityLeaveHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseMaternityLeaveHours() {
    return hasUseMaternityLeaveHours;
  }

  public void setHasUseMaternityLeaveHours(BigDecimal hasUseMaternityLeaveHours) {
    this.hasUseMaternityLeaveHours = hasUseMaternityLeaveHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseOtherDays(BigDecimal hasUseOtherDays) {
    this.hasUseOtherDays = hasUseOtherDays;
    return this;
  }

  /**
   * Get hasUseOtherDays
   * @return hasUseOtherDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseOtherDays() {
    return hasUseOtherDays;
  }

  public void setHasUseOtherDays(BigDecimal hasUseOtherDays) {
    this.hasUseOtherDays = hasUseOtherDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseOtherHours(BigDecimal hasUseOtherHours) {
    this.hasUseOtherHours = hasUseOtherHours;
    return this;
  }

  /**
   * Get hasUseOtherHours
   * @return hasUseOtherHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseOtherHours() {
    return hasUseOtherHours;
  }

  public void setHasUseOtherHours(BigDecimal hasUseOtherHours) {
    this.hasUseOtherHours = hasUseOtherHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUsePaternityDays(BigDecimal hasUsePaternityDays) {
    this.hasUsePaternityDays = hasUsePaternityDays;
    return this;
  }

  /**
   * Get hasUsePaternityDays
   * @return hasUsePaternityDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUsePaternityDays() {
    return hasUsePaternityDays;
  }

  public void setHasUsePaternityDays(BigDecimal hasUsePaternityDays) {
    this.hasUsePaternityDays = hasUsePaternityDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUsePaternityHours(BigDecimal hasUsePaternityHours) {
    this.hasUsePaternityHours = hasUsePaternityHours;
    return this;
  }

  /**
   * Get hasUsePaternityHours
   * @return hasUsePaternityHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUsePaternityHours() {
    return hasUsePaternityHours;
  }

  public void setHasUsePaternityHours(BigDecimal hasUsePaternityHours) {
    this.hasUsePaternityHours = hasUsePaternityHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUsePrenatalCheckUpDays(BigDecimal hasUsePrenatalCheckUpDays) {
    this.hasUsePrenatalCheckUpDays = hasUsePrenatalCheckUpDays;
    return this;
  }

  /**
   * Get hasUsePrenatalCheckUpDays
   * @return hasUsePrenatalCheckUpDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUsePrenatalCheckUpDays() {
    return hasUsePrenatalCheckUpDays;
  }

  public void setHasUsePrenatalCheckUpDays(BigDecimal hasUsePrenatalCheckUpDays) {
    this.hasUsePrenatalCheckUpDays = hasUsePrenatalCheckUpDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUsePrenatalCheckUpHours(BigDecimal hasUsePrenatalCheckUpHours) {
    this.hasUsePrenatalCheckUpHours = hasUsePrenatalCheckUpHours;
    return this;
  }

  /**
   * Get hasUsePrenatalCheckUpHours
   * @return hasUsePrenatalCheckUpHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUsePrenatalCheckUpHours() {
    return hasUsePrenatalCheckUpHours;
  }

  public void setHasUsePrenatalCheckUpHours(BigDecimal hasUsePrenatalCheckUpHours) {
    this.hasUsePrenatalCheckUpHours = hasUsePrenatalCheckUpHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseStatutoryAnnualDays(BigDecimal hasUseStatutoryAnnualDays) {
    this.hasUseStatutoryAnnualDays = hasUseStatutoryAnnualDays;
    return this;
  }

  /**
   * Get hasUseStatutoryAnnualDays
   * @return hasUseStatutoryAnnualDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseStatutoryAnnualDays() {
    return hasUseStatutoryAnnualDays;
  }

  public void setHasUseStatutoryAnnualDays(BigDecimal hasUseStatutoryAnnualDays) {
    this.hasUseStatutoryAnnualDays = hasUseStatutoryAnnualDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseStatutoryAnnualHours(BigDecimal hasUseStatutoryAnnualHours) {
    this.hasUseStatutoryAnnualHours = hasUseStatutoryAnnualHours;
    return this;
  }

  /**
   * Get hasUseStatutoryAnnualHours
   * @return hasUseStatutoryAnnualHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseStatutoryAnnualHours() {
    return hasUseStatutoryAnnualHours;
  }

  public void setHasUseStatutoryAnnualHours(BigDecimal hasUseStatutoryAnnualHours) {
    this.hasUseStatutoryAnnualHours = hasUseStatutoryAnnualHours;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseWelfareAnnualDays(BigDecimal hasUseWelfareAnnualDays) {
    this.hasUseWelfareAnnualDays = hasUseWelfareAnnualDays;
    return this;
  }

  /**
   * Get hasUseWelfareAnnualDays
   * @return hasUseWelfareAnnualDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseWelfareAnnualDays() {
    return hasUseWelfareAnnualDays;
  }

  public void setHasUseWelfareAnnualDays(BigDecimal hasUseWelfareAnnualDays) {
    this.hasUseWelfareAnnualDays = hasUseWelfareAnnualDays;
  }

  public SerarcLeaveHasUseByConditionContentItem hasUseWelfareAnnualHours(BigDecimal hasUseWelfareAnnualHours) {
    this.hasUseWelfareAnnualHours = hasUseWelfareAnnualHours;
    return this;
  }

  /**
   * Get hasUseWelfareAnnualHours
   * @return hasUseWelfareAnnualHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHasUseWelfareAnnualHours() {
    return hasUseWelfareAnnualHours;
  }

  public void setHasUseWelfareAnnualHours(BigDecimal hasUseWelfareAnnualHours) {
    this.hasUseWelfareAnnualHours = hasUseWelfareAnnualHours;
  }

  public SerarcLeaveHasUseByConditionContentItem homeBillId(String homeBillId) {
    this.homeBillId = homeBillId;
    return this;
  }

  /**
   * Get homeBillId
   * @return homeBillId
  **/
  @ApiModelProperty(example = "dabdcc4f-2ce7-42d0-9390-cc84b3394769", value = "")
  
    public String getHomeBillId() {
    return homeBillId;
  }

  public void setHomeBillId(String homeBillId) {
    this.homeBillId = homeBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem lacationBillId(String lacationBillId) {
    this.lacationBillId = lacationBillId;
    return this;
  }

  /**
   * Get lacationBillId
   * @return lacationBillId
  **/
  @ApiModelProperty(example = "4043cb1b-42fe-4f4a-b7dc-16297e7466ed", value = "")
  
    public String getLacationBillId() {
    return lacationBillId;
  }

  public void setLacationBillId(String lacationBillId) {
    this.lacationBillId = lacationBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem leaveUserDefinedEntityList(String leaveUserDefinedEntityList) {
    this.leaveUserDefinedEntityList = leaveUserDefinedEntityList;
    return this;
  }

  /**
   * Get leaveUserDefinedEntityList
   * @return leaveUserDefinedEntityList
  **/
  @ApiModelProperty(example = "[]", value = "")
  
    public String getLeaveUserDefinedEntityList() {
    return leaveUserDefinedEntityList;
  }

  public void setLeaveUserDefinedEntityList(String leaveUserDefinedEntityList) {
    this.leaveUserDefinedEntityList = leaveUserDefinedEntityList;
  }

  public SerarcLeaveHasUseByConditionContentItem marriageBillId(String marriageBillId) {
    this.marriageBillId = marriageBillId;
    return this;
  }

  /**
   * Get marriageBillId
   * @return marriageBillId
  **/
  @ApiModelProperty(example = "8550c942-ce68-4980-ac5e-69c6a9bf0506", value = "")
  
    public String getMarriageBillId() {
    return marriageBillId;
  }

  public void setMarriageBillId(String marriageBillId) {
    this.marriageBillId = marriageBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem maternityBillId(String maternityBillId) {
    this.maternityBillId = maternityBillId;
    return this;
  }

  /**
   * Get maternityBillId
   * @return maternityBillId
  **/
  @ApiModelProperty(example = "37d4c0e5-ad80-48e7-86d1-8cbe7cc1dc99", value = "")
  
    public String getMaternityBillId() {
    return maternityBillId;
  }

  public void setMaternityBillId(String maternityBillId) {
    this.maternityBillId = maternityBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "15388906455", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public SerarcLeaveHasUseByConditionContentItem otherBillId(String otherBillId) {
    this.otherBillId = otherBillId;
    return this;
  }

  /**
   * Get otherBillId
   * @return otherBillId
  **/
  @ApiModelProperty(example = "f77d0f53-de4e-40b0-b3fb-9880b8149f40", value = "")
  
    public String getOtherBillId() {
    return otherBillId;
  }

  public void setOtherBillId(String otherBillId) {
    this.otherBillId = otherBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem paternityBillId(String paternityBillId) {
    this.paternityBillId = paternityBillId;
    return this;
  }

  /**
   * Get paternityBillId
   * @return paternityBillId
  **/
  @ApiModelProperty(example = "adf10b85-dc75-4645-867d-13610fcdf316", value = "")
  
    public String getPaternityBillId() {
    return paternityBillId;
  }

  public void setPaternityBillId(String paternityBillId) {
    this.paternityBillId = paternityBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem prenatalCheckUpBillId(String prenatalCheckUpBillId) {
    this.prenatalCheckUpBillId = prenatalCheckUpBillId;
    return this;
  }

  /**
   * Get prenatalCheckUpBillId
   * @return prenatalCheckUpBillId
  **/
  @ApiModelProperty(example = "3029d4b0-baa6-4ad3-8fdb-e30e9432c0f9", value = "")
  
    public String getPrenatalCheckUpBillId() {
    return prenatalCheckUpBillId;
  }

  public void setPrenatalCheckUpBillId(String prenatalCheckUpBillId) {
    this.prenatalCheckUpBillId = prenatalCheckUpBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem sickBillId(String sickBillId) {
    this.sickBillId = sickBillId;
    return this;
  }

  /**
   * Get sickBillId
   * @return sickBillId
  **/
  @ApiModelProperty(example = "b4c71e8d-d6e1-4d29-b478-b97906cb2eab", value = "")
  
    public String getSickBillId() {
    return sickBillId;
  }

  public void setSickBillId(String sickBillId) {
    this.sickBillId = sickBillId;
  }

  public SerarcLeaveHasUseByConditionContentItem sickLeaveDayUsed(Integer sickLeaveDayUsed) {
    this.sickLeaveDayUsed = sickLeaveDayUsed;
    return this;
  }

  /**
   * Get sickLeaveDayUsed
   * @return sickLeaveDayUsed
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getSickLeaveDayUsed() {
    return sickLeaveDayUsed;
  }

  public void setSickLeaveDayUsed(Integer sickLeaveDayUsed) {
    this.sickLeaveDayUsed = sickLeaveDayUsed;
  }

  public SerarcLeaveHasUseByConditionContentItem sickLeaveHourUsed(Integer sickLeaveHourUsed) {
    this.sickLeaveHourUsed = sickLeaveHourUsed;
    return this;
  }

  /**
   * Get sickLeaveHourUsed
   * @return sickLeaveHourUsed
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getSickLeaveHourUsed() {
    return sickLeaveHourUsed;
  }

  public void setSickLeaveHourUsed(Integer sickLeaveHourUsed) {
    this.sickLeaveHourUsed = sickLeaveHourUsed;
  }

  public SerarcLeaveHasUseByConditionContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "6aab1eeb-5a81-4927-8d42-5c83c5d37d1c", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public SerarcLeaveHasUseByConditionContentItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "聂晶", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public SerarcLeaveHasUseByConditionContentItem staffStatus(String staffStatus) {
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

  public SerarcLeaveHasUseByConditionContentItem userDefinedNames(String userDefinedNames) {
    this.userDefinedNames = userDefinedNames;
    return this;
  }

  /**
   * Get userDefinedNames
   * @return userDefinedNames
  **/
  @ApiModelProperty(example = "[]", value = "")
  
    public String getUserDefinedNames() {
    return userDefinedNames;
  }

  public void setUserDefinedNames(String userDefinedNames) {
    this.userDefinedNames = userDefinedNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerarcLeaveHasUseByConditionContentItem serarcLeaveHasUseByConditionContentItem = (SerarcLeaveHasUseByConditionContentItem) o;
    return Objects.equals(this.adjustResetLeaveDayUsed, serarcLeaveHasUseByConditionContentItem.adjustResetLeaveDayUsed) &&
        Objects.equals(this.adjustResetLeaveHourUsed, serarcLeaveHasUseByConditionContentItem.adjustResetLeaveHourUsed) &&
        Objects.equals(this.affairBillId, serarcLeaveHasUseByConditionContentItem.affairBillId) &&
        Objects.equals(this.annualBillId, serarcLeaveHasUseByConditionContentItem.annualBillId) &&
        Objects.equals(this.belongsToYear, serarcLeaveHasUseByConditionContentItem.belongsToYear) &&
        Objects.equals(this.companyId, serarcLeaveHasUseByConditionContentItem.companyId) &&
        Objects.equals(this.departmentId, serarcLeaveHasUseByConditionContentItem.departmentId) &&
        Objects.equals(this.departmentName, serarcLeaveHasUseByConditionContentItem.departmentName) &&
        Objects.equals(this.enrollInDate, serarcLeaveHasUseByConditionContentItem.enrollInDate) &&
        Objects.equals(this.enrollWorkYears, serarcLeaveHasUseByConditionContentItem.enrollWorkYears) &&
        Objects.equals(this.funeralBillId, serarcLeaveHasUseByConditionContentItem.funeralBillId) &&
        Objects.equals(this.hasUseAffairLeaveDays, serarcLeaveHasUseByConditionContentItem.hasUseAffairLeaveDays) &&
        Objects.equals(this.hasUseAffairLeaveHours, serarcLeaveHasUseByConditionContentItem.hasUseAffairLeaveHours) &&
        Objects.equals(this.hasUseAnnualDays, serarcLeaveHasUseByConditionContentItem.hasUseAnnualDays) &&
        Objects.equals(this.hasUseAnnualHours, serarcLeaveHasUseByConditionContentItem.hasUseAnnualHours) &&
        Objects.equals(this.hasUseBuckleSalaryDays, serarcLeaveHasUseByConditionContentItem.hasUseBuckleSalaryDays) &&
        Objects.equals(this.hasUseBuckleSalaryHours, serarcLeaveHasUseByConditionContentItem.hasUseBuckleSalaryHours) &&
        Objects.equals(this.hasUseFuneralDays, serarcLeaveHasUseByConditionContentItem.hasUseFuneralDays) &&
        Objects.equals(this.hasUseFuneralHours, serarcLeaveHasUseByConditionContentItem.hasUseFuneralHours) &&
        Objects.equals(this.hasUseHomeDays, serarcLeaveHasUseByConditionContentItem.hasUseHomeDays) &&
        Objects.equals(this.hasUseHomeHours, serarcLeaveHasUseByConditionContentItem.hasUseHomeHours) &&
        Objects.equals(this.hasUseLactationDays, serarcLeaveHasUseByConditionContentItem.hasUseLactationDays) &&
        Objects.equals(this.hasUseLactationHours, serarcLeaveHasUseByConditionContentItem.hasUseLactationHours) &&
        Objects.equals(this.hasUseMarriageDays, serarcLeaveHasUseByConditionContentItem.hasUseMarriageDays) &&
        Objects.equals(this.hasUseMarriageHours, serarcLeaveHasUseByConditionContentItem.hasUseMarriageHours) &&
        Objects.equals(this.hasUseMaternityLeaveDays, serarcLeaveHasUseByConditionContentItem.hasUseMaternityLeaveDays) &&
        Objects.equals(this.hasUseMaternityLeaveHours, serarcLeaveHasUseByConditionContentItem.hasUseMaternityLeaveHours) &&
        Objects.equals(this.hasUseOtherDays, serarcLeaveHasUseByConditionContentItem.hasUseOtherDays) &&
        Objects.equals(this.hasUseOtherHours, serarcLeaveHasUseByConditionContentItem.hasUseOtherHours) &&
        Objects.equals(this.hasUsePaternityDays, serarcLeaveHasUseByConditionContentItem.hasUsePaternityDays) &&
        Objects.equals(this.hasUsePaternityHours, serarcLeaveHasUseByConditionContentItem.hasUsePaternityHours) &&
        Objects.equals(this.hasUsePrenatalCheckUpDays, serarcLeaveHasUseByConditionContentItem.hasUsePrenatalCheckUpDays) &&
        Objects.equals(this.hasUsePrenatalCheckUpHours, serarcLeaveHasUseByConditionContentItem.hasUsePrenatalCheckUpHours) &&
        Objects.equals(this.hasUseStatutoryAnnualDays, serarcLeaveHasUseByConditionContentItem.hasUseStatutoryAnnualDays) &&
        Objects.equals(this.hasUseStatutoryAnnualHours, serarcLeaveHasUseByConditionContentItem.hasUseStatutoryAnnualHours) &&
        Objects.equals(this.hasUseWelfareAnnualDays, serarcLeaveHasUseByConditionContentItem.hasUseWelfareAnnualDays) &&
        Objects.equals(this.hasUseWelfareAnnualHours, serarcLeaveHasUseByConditionContentItem.hasUseWelfareAnnualHours) &&
        Objects.equals(this.homeBillId, serarcLeaveHasUseByConditionContentItem.homeBillId) &&
        Objects.equals(this.lacationBillId, serarcLeaveHasUseByConditionContentItem.lacationBillId) &&
        Objects.equals(this.leaveUserDefinedEntityList, serarcLeaveHasUseByConditionContentItem.leaveUserDefinedEntityList) &&
        Objects.equals(this.marriageBillId, serarcLeaveHasUseByConditionContentItem.marriageBillId) &&
        Objects.equals(this.maternityBillId, serarcLeaveHasUseByConditionContentItem.maternityBillId) &&
        Objects.equals(this.mobileNo, serarcLeaveHasUseByConditionContentItem.mobileNo) &&
        Objects.equals(this.otherBillId, serarcLeaveHasUseByConditionContentItem.otherBillId) &&
        Objects.equals(this.paternityBillId, serarcLeaveHasUseByConditionContentItem.paternityBillId) &&
        Objects.equals(this.prenatalCheckUpBillId, serarcLeaveHasUseByConditionContentItem.prenatalCheckUpBillId) &&
        Objects.equals(this.sickBillId, serarcLeaveHasUseByConditionContentItem.sickBillId) &&
        Objects.equals(this.sickLeaveDayUsed, serarcLeaveHasUseByConditionContentItem.sickLeaveDayUsed) &&
        Objects.equals(this.sickLeaveHourUsed, serarcLeaveHasUseByConditionContentItem.sickLeaveHourUsed) &&
        Objects.equals(this.staffId, serarcLeaveHasUseByConditionContentItem.staffId) &&
        Objects.equals(this.staffName, serarcLeaveHasUseByConditionContentItem.staffName) &&
        Objects.equals(this.staffStatus, serarcLeaveHasUseByConditionContentItem.staffStatus) &&
        Objects.equals(this.userDefinedNames, serarcLeaveHasUseByConditionContentItem.userDefinedNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustResetLeaveDayUsed, adjustResetLeaveHourUsed, affairBillId, annualBillId, belongsToYear, companyId, departmentId, departmentName, enrollInDate, enrollWorkYears, funeralBillId, hasUseAffairLeaveDays, hasUseAffairLeaveHours, hasUseAnnualDays, hasUseAnnualHours, hasUseBuckleSalaryDays, hasUseBuckleSalaryHours, hasUseFuneralDays, hasUseFuneralHours, hasUseHomeDays, hasUseHomeHours, hasUseLactationDays, hasUseLactationHours, hasUseMarriageDays, hasUseMarriageHours, hasUseMaternityLeaveDays, hasUseMaternityLeaveHours, hasUseOtherDays, hasUseOtherHours, hasUsePaternityDays, hasUsePaternityHours, hasUsePrenatalCheckUpDays, hasUsePrenatalCheckUpHours, hasUseStatutoryAnnualDays, hasUseStatutoryAnnualHours, hasUseWelfareAnnualDays, hasUseWelfareAnnualHours, homeBillId, lacationBillId, leaveUserDefinedEntityList, marriageBillId, maternityBillId, mobileNo, otherBillId, paternityBillId, prenatalCheckUpBillId, sickBillId, sickLeaveDayUsed, sickLeaveHourUsed, staffId, staffName, staffStatus, userDefinedNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SerarcLeaveHasUseByConditionContentItem {\n");
    
    sb.append("    adjustResetLeaveDayUsed: ").append(toIndentedString(adjustResetLeaveDayUsed)).append("\n");
    sb.append("    adjustResetLeaveHourUsed: ").append(toIndentedString(adjustResetLeaveHourUsed)).append("\n");
    sb.append("    affairBillId: ").append(toIndentedString(affairBillId)).append("\n");
    sb.append("    annualBillId: ").append(toIndentedString(annualBillId)).append("\n");
    sb.append("    belongsToYear: ").append(toIndentedString(belongsToYear)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    enrollWorkYears: ").append(toIndentedString(enrollWorkYears)).append("\n");
    sb.append("    funeralBillId: ").append(toIndentedString(funeralBillId)).append("\n");
    sb.append("    hasUseAffairLeaveDays: ").append(toIndentedString(hasUseAffairLeaveDays)).append("\n");
    sb.append("    hasUseAffairLeaveHours: ").append(toIndentedString(hasUseAffairLeaveHours)).append("\n");
    sb.append("    hasUseAnnualDays: ").append(toIndentedString(hasUseAnnualDays)).append("\n");
    sb.append("    hasUseAnnualHours: ").append(toIndentedString(hasUseAnnualHours)).append("\n");
    sb.append("    hasUseBuckleSalaryDays: ").append(toIndentedString(hasUseBuckleSalaryDays)).append("\n");
    sb.append("    hasUseBuckleSalaryHours: ").append(toIndentedString(hasUseBuckleSalaryHours)).append("\n");
    sb.append("    hasUseFuneralDays: ").append(toIndentedString(hasUseFuneralDays)).append("\n");
    sb.append("    hasUseFuneralHours: ").append(toIndentedString(hasUseFuneralHours)).append("\n");
    sb.append("    hasUseHomeDays: ").append(toIndentedString(hasUseHomeDays)).append("\n");
    sb.append("    hasUseHomeHours: ").append(toIndentedString(hasUseHomeHours)).append("\n");
    sb.append("    hasUseLactationDays: ").append(toIndentedString(hasUseLactationDays)).append("\n");
    sb.append("    hasUseLactationHours: ").append(toIndentedString(hasUseLactationHours)).append("\n");
    sb.append("    hasUseMarriageDays: ").append(toIndentedString(hasUseMarriageDays)).append("\n");
    sb.append("    hasUseMarriageHours: ").append(toIndentedString(hasUseMarriageHours)).append("\n");
    sb.append("    hasUseMaternityLeaveDays: ").append(toIndentedString(hasUseMaternityLeaveDays)).append("\n");
    sb.append("    hasUseMaternityLeaveHours: ").append(toIndentedString(hasUseMaternityLeaveHours)).append("\n");
    sb.append("    hasUseOtherDays: ").append(toIndentedString(hasUseOtherDays)).append("\n");
    sb.append("    hasUseOtherHours: ").append(toIndentedString(hasUseOtherHours)).append("\n");
    sb.append("    hasUsePaternityDays: ").append(toIndentedString(hasUsePaternityDays)).append("\n");
    sb.append("    hasUsePaternityHours: ").append(toIndentedString(hasUsePaternityHours)).append("\n");
    sb.append("    hasUsePrenatalCheckUpDays: ").append(toIndentedString(hasUsePrenatalCheckUpDays)).append("\n");
    sb.append("    hasUsePrenatalCheckUpHours: ").append(toIndentedString(hasUsePrenatalCheckUpHours)).append("\n");
    sb.append("    hasUseStatutoryAnnualDays: ").append(toIndentedString(hasUseStatutoryAnnualDays)).append("\n");
    sb.append("    hasUseStatutoryAnnualHours: ").append(toIndentedString(hasUseStatutoryAnnualHours)).append("\n");
    sb.append("    hasUseWelfareAnnualDays: ").append(toIndentedString(hasUseWelfareAnnualDays)).append("\n");
    sb.append("    hasUseWelfareAnnualHours: ").append(toIndentedString(hasUseWelfareAnnualHours)).append("\n");
    sb.append("    homeBillId: ").append(toIndentedString(homeBillId)).append("\n");
    sb.append("    lacationBillId: ").append(toIndentedString(lacationBillId)).append("\n");
    sb.append("    leaveUserDefinedEntityList: ").append(toIndentedString(leaveUserDefinedEntityList)).append("\n");
    sb.append("    marriageBillId: ").append(toIndentedString(marriageBillId)).append("\n");
    sb.append("    maternityBillId: ").append(toIndentedString(maternityBillId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    otherBillId: ").append(toIndentedString(otherBillId)).append("\n");
    sb.append("    paternityBillId: ").append(toIndentedString(paternityBillId)).append("\n");
    sb.append("    prenatalCheckUpBillId: ").append(toIndentedString(prenatalCheckUpBillId)).append("\n");
    sb.append("    sickBillId: ").append(toIndentedString(sickBillId)).append("\n");
    sb.append("    sickLeaveDayUsed: ").append(toIndentedString(sickLeaveDayUsed)).append("\n");
    sb.append("    sickLeaveHourUsed: ").append(toIndentedString(sickLeaveHourUsed)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
    sb.append("    userDefinedNames: ").append(toIndentedString(userDefinedNames)).append("\n");
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
