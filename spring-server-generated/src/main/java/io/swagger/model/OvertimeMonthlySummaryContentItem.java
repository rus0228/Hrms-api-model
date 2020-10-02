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
 * OvertimeMonthlySummaryContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class OvertimeMonthlySummaryContentItem   {
  @JsonProperty("adjustId")
  private String adjustId = null;

  @JsonProperty("adjustRestHour")
  private BigDecimal adjustRestHour = null;

  @JsonProperty("allAdjustRestHour")
  private BigDecimal allAdjustRestHour = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("invalidAdjustRestHour")
  private BigDecimal invalidAdjustRestHour = null;

  @JsonProperty("leaveAdjustRuleId")
  private String leaveAdjustRuleId = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("normalHour")
  private BigDecimal normalHour = null;

  @JsonProperty("normalToExpiredHour")
  private BigDecimal normalToExpiredHour = null;

  @JsonProperty("normalToRestHour")
  private BigDecimal normalToRestHour = null;

  @JsonProperty("normalToSalaryHour")
  private BigDecimal normalToSalaryHour = null;

  @JsonProperty("normalToUnCarriedHour")
  private BigDecimal normalToUnCarriedHour = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("statutoryHour")
  private BigDecimal statutoryHour = null;

  @JsonProperty("statutoryToExpiredHour")
  private BigDecimal statutoryToExpiredHour = null;

  @JsonProperty("statutoryToRestHour")
  private BigDecimal statutoryToRestHour = null;

  @JsonProperty("statutoryToSalaryHour")
  private BigDecimal statutoryToSalaryHour = null;

  @JsonProperty("statutoryToUnCarriedHour")
  private BigDecimal statutoryToUnCarriedHour = null;

  @JsonProperty("totalNormalHour")
  private BigDecimal totalNormalHour = null;

  @JsonProperty("totalNormalSalaryHour")
  private BigDecimal totalNormalSalaryHour = null;

  @JsonProperty("totalStatutoryHour")
  private BigDecimal totalStatutoryHour = null;

  @JsonProperty("totalStatutorySalaryHour")
  private BigDecimal totalStatutorySalaryHour = null;

  @JsonProperty("totalWeekendHour")
  private BigDecimal totalWeekendHour = null;

  @JsonProperty("totalWeekendSalaryHour")
  private BigDecimal totalWeekendSalaryHour = null;

  @JsonProperty("usedAdjustRestHour")
  private BigDecimal usedAdjustRestHour = null;

  @JsonProperty("usedNormalSalaryHour")
  private BigDecimal usedNormalSalaryHour = null;

  @JsonProperty("usedStatutorySalaryHour")
  private BigDecimal usedStatutorySalaryHour = null;

  @JsonProperty("usedWeekendSalaryHour")
  private BigDecimal usedWeekendSalaryHour = null;

  @JsonProperty("weekendHour")
  private BigDecimal weekendHour = null;

  @JsonProperty("weekendToExpiredHour")
  private BigDecimal weekendToExpiredHour = null;

  @JsonProperty("weekendToRestHour")
  private BigDecimal weekendToRestHour = null;

  @JsonProperty("weekendToSalaryHour")
  private BigDecimal weekendToSalaryHour = null;

  @JsonProperty("weekendToUnCarriedHour")
  private BigDecimal weekendToUnCarriedHour = null;

  public OvertimeMonthlySummaryContentItem adjustId(String adjustId) {
    this.adjustId = adjustId;
    return this;
  }

  /**
   * Get adjustId
   * @return adjustId
  **/
  @ApiModelProperty(example = "c5ab57e5-838a-4ce9-8c71-87bf5e6affc1", value = "")
  
    public String getAdjustId() {
    return adjustId;
  }

  public void setAdjustId(String adjustId) {
    this.adjustId = adjustId;
  }

  public OvertimeMonthlySummaryContentItem adjustRestHour(BigDecimal adjustRestHour) {
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

  public OvertimeMonthlySummaryContentItem allAdjustRestHour(BigDecimal allAdjustRestHour) {
    this.allAdjustRestHour = allAdjustRestHour;
    return this;
  }

  /**
   * Get allAdjustRestHour
   * @return allAdjustRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAllAdjustRestHour() {
    return allAdjustRestHour;
  }

  public void setAllAdjustRestHour(BigDecimal allAdjustRestHour) {
    this.allAdjustRestHour = allAdjustRestHour;
  }

  public OvertimeMonthlySummaryContentItem departmentId(String departmentId) {
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

  public OvertimeMonthlySummaryContentItem departmentName(String departmentName) {
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

  public OvertimeMonthlySummaryContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "6abc1b3e-f581-4630-9d02-d87bd203c7a7", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OvertimeMonthlySummaryContentItem invalidAdjustRestHour(BigDecimal invalidAdjustRestHour) {
    this.invalidAdjustRestHour = invalidAdjustRestHour;
    return this;
  }

  /**
   * Get invalidAdjustRestHour
   * @return invalidAdjustRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getInvalidAdjustRestHour() {
    return invalidAdjustRestHour;
  }

  public void setInvalidAdjustRestHour(BigDecimal invalidAdjustRestHour) {
    this.invalidAdjustRestHour = invalidAdjustRestHour;
  }

  public OvertimeMonthlySummaryContentItem leaveAdjustRuleId(String leaveAdjustRuleId) {
    this.leaveAdjustRuleId = leaveAdjustRuleId;
    return this;
  }

  /**
   * Get leaveAdjustRuleId
   * @return leaveAdjustRuleId
  **/
  @ApiModelProperty(example = "01ebeda6-6b37-424a-819e-2bc6b2b31689", value = "")
  
    public String getLeaveAdjustRuleId() {
    return leaveAdjustRuleId;
  }

  public void setLeaveAdjustRuleId(String leaveAdjustRuleId) {
    this.leaveAdjustRuleId = leaveAdjustRuleId;
  }

  public OvertimeMonthlySummaryContentItem mobileNo(String mobileNo) {
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

  public OvertimeMonthlySummaryContentItem month(String month) {
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

  public OvertimeMonthlySummaryContentItem normalHour(BigDecimal normalHour) {
    this.normalHour = normalHour;
    return this;
  }

  /**
   * Get normalHour
   * @return normalHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalHour() {
    return normalHour;
  }

  public void setNormalHour(BigDecimal normalHour) {
    this.normalHour = normalHour;
  }

  public OvertimeMonthlySummaryContentItem normalToExpiredHour(BigDecimal normalToExpiredHour) {
    this.normalToExpiredHour = normalToExpiredHour;
    return this;
  }

  /**
   * Get normalToExpiredHour
   * @return normalToExpiredHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalToExpiredHour() {
    return normalToExpiredHour;
  }

  public void setNormalToExpiredHour(BigDecimal normalToExpiredHour) {
    this.normalToExpiredHour = normalToExpiredHour;
  }

  public OvertimeMonthlySummaryContentItem normalToRestHour(BigDecimal normalToRestHour) {
    this.normalToRestHour = normalToRestHour;
    return this;
  }

  /**
   * Get normalToRestHour
   * @return normalToRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalToRestHour() {
    return normalToRestHour;
  }

  public void setNormalToRestHour(BigDecimal normalToRestHour) {
    this.normalToRestHour = normalToRestHour;
  }

  public OvertimeMonthlySummaryContentItem normalToSalaryHour(BigDecimal normalToSalaryHour) {
    this.normalToSalaryHour = normalToSalaryHour;
    return this;
  }

  /**
   * Get normalToSalaryHour
   * @return normalToSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalToSalaryHour() {
    return normalToSalaryHour;
  }

  public void setNormalToSalaryHour(BigDecimal normalToSalaryHour) {
    this.normalToSalaryHour = normalToSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem normalToUnCarriedHour(BigDecimal normalToUnCarriedHour) {
    this.normalToUnCarriedHour = normalToUnCarriedHour;
    return this;
  }

  /**
   * Get normalToUnCarriedHour
   * @return normalToUnCarriedHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalToUnCarriedHour() {
    return normalToUnCarriedHour;
  }

  public void setNormalToUnCarriedHour(BigDecimal normalToUnCarriedHour) {
    this.normalToUnCarriedHour = normalToUnCarriedHour;
  }

  public OvertimeMonthlySummaryContentItem positionId(String positionId) {
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

  public OvertimeMonthlySummaryContentItem positionName(String positionName) {
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

  public OvertimeMonthlySummaryContentItem staffId(String staffId) {
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

  public OvertimeMonthlySummaryContentItem staffName(String staffName) {
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

  public OvertimeMonthlySummaryContentItem staffNo(String staffNo) {
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

  public OvertimeMonthlySummaryContentItem statutoryHour(BigDecimal statutoryHour) {
    this.statutoryHour = statutoryHour;
    return this;
  }

  /**
   * Get statutoryHour
   * @return statutoryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryHour() {
    return statutoryHour;
  }

  public void setStatutoryHour(BigDecimal statutoryHour) {
    this.statutoryHour = statutoryHour;
  }

  public OvertimeMonthlySummaryContentItem statutoryToExpiredHour(BigDecimal statutoryToExpiredHour) {
    this.statutoryToExpiredHour = statutoryToExpiredHour;
    return this;
  }

  /**
   * Get statutoryToExpiredHour
   * @return statutoryToExpiredHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryToExpiredHour() {
    return statutoryToExpiredHour;
  }

  public void setStatutoryToExpiredHour(BigDecimal statutoryToExpiredHour) {
    this.statutoryToExpiredHour = statutoryToExpiredHour;
  }

  public OvertimeMonthlySummaryContentItem statutoryToRestHour(BigDecimal statutoryToRestHour) {
    this.statutoryToRestHour = statutoryToRestHour;
    return this;
  }

  /**
   * Get statutoryToRestHour
   * @return statutoryToRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryToRestHour() {
    return statutoryToRestHour;
  }

  public void setStatutoryToRestHour(BigDecimal statutoryToRestHour) {
    this.statutoryToRestHour = statutoryToRestHour;
  }

  public OvertimeMonthlySummaryContentItem statutoryToSalaryHour(BigDecimal statutoryToSalaryHour) {
    this.statutoryToSalaryHour = statutoryToSalaryHour;
    return this;
  }

  /**
   * Get statutoryToSalaryHour
   * @return statutoryToSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryToSalaryHour() {
    return statutoryToSalaryHour;
  }

  public void setStatutoryToSalaryHour(BigDecimal statutoryToSalaryHour) {
    this.statutoryToSalaryHour = statutoryToSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem statutoryToUnCarriedHour(BigDecimal statutoryToUnCarriedHour) {
    this.statutoryToUnCarriedHour = statutoryToUnCarriedHour;
    return this;
  }

  /**
   * Get statutoryToUnCarriedHour
   * @return statutoryToUnCarriedHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryToUnCarriedHour() {
    return statutoryToUnCarriedHour;
  }

  public void setStatutoryToUnCarriedHour(BigDecimal statutoryToUnCarriedHour) {
    this.statutoryToUnCarriedHour = statutoryToUnCarriedHour;
  }

  public OvertimeMonthlySummaryContentItem totalNormalHour(BigDecimal totalNormalHour) {
    this.totalNormalHour = totalNormalHour;
    return this;
  }

  /**
   * Get totalNormalHour
   * @return totalNormalHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalNormalHour() {
    return totalNormalHour;
  }

  public void setTotalNormalHour(BigDecimal totalNormalHour) {
    this.totalNormalHour = totalNormalHour;
  }

  public OvertimeMonthlySummaryContentItem totalNormalSalaryHour(BigDecimal totalNormalSalaryHour) {
    this.totalNormalSalaryHour = totalNormalSalaryHour;
    return this;
  }

  /**
   * Get totalNormalSalaryHour
   * @return totalNormalSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalNormalSalaryHour() {
    return totalNormalSalaryHour;
  }

  public void setTotalNormalSalaryHour(BigDecimal totalNormalSalaryHour) {
    this.totalNormalSalaryHour = totalNormalSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem totalStatutoryHour(BigDecimal totalStatutoryHour) {
    this.totalStatutoryHour = totalStatutoryHour;
    return this;
  }

  /**
   * Get totalStatutoryHour
   * @return totalStatutoryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalStatutoryHour() {
    return totalStatutoryHour;
  }

  public void setTotalStatutoryHour(BigDecimal totalStatutoryHour) {
    this.totalStatutoryHour = totalStatutoryHour;
  }

  public OvertimeMonthlySummaryContentItem totalStatutorySalaryHour(BigDecimal totalStatutorySalaryHour) {
    this.totalStatutorySalaryHour = totalStatutorySalaryHour;
    return this;
  }

  /**
   * Get totalStatutorySalaryHour
   * @return totalStatutorySalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalStatutorySalaryHour() {
    return totalStatutorySalaryHour;
  }

  public void setTotalStatutorySalaryHour(BigDecimal totalStatutorySalaryHour) {
    this.totalStatutorySalaryHour = totalStatutorySalaryHour;
  }

  public OvertimeMonthlySummaryContentItem totalWeekendHour(BigDecimal totalWeekendHour) {
    this.totalWeekendHour = totalWeekendHour;
    return this;
  }

  /**
   * Get totalWeekendHour
   * @return totalWeekendHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalWeekendHour() {
    return totalWeekendHour;
  }

  public void setTotalWeekendHour(BigDecimal totalWeekendHour) {
    this.totalWeekendHour = totalWeekendHour;
  }

  public OvertimeMonthlySummaryContentItem totalWeekendSalaryHour(BigDecimal totalWeekendSalaryHour) {
    this.totalWeekendSalaryHour = totalWeekendSalaryHour;
    return this;
  }

  /**
   * Get totalWeekendSalaryHour
   * @return totalWeekendSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getTotalWeekendSalaryHour() {
    return totalWeekendSalaryHour;
  }

  public void setTotalWeekendSalaryHour(BigDecimal totalWeekendSalaryHour) {
    this.totalWeekendSalaryHour = totalWeekendSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem usedAdjustRestHour(BigDecimal usedAdjustRestHour) {
    this.usedAdjustRestHour = usedAdjustRestHour;
    return this;
  }

  /**
   * Get usedAdjustRestHour
   * @return usedAdjustRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getUsedAdjustRestHour() {
    return usedAdjustRestHour;
  }

  public void setUsedAdjustRestHour(BigDecimal usedAdjustRestHour) {
    this.usedAdjustRestHour = usedAdjustRestHour;
  }

  public OvertimeMonthlySummaryContentItem usedNormalSalaryHour(BigDecimal usedNormalSalaryHour) {
    this.usedNormalSalaryHour = usedNormalSalaryHour;
    return this;
  }

  /**
   * Get usedNormalSalaryHour
   * @return usedNormalSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getUsedNormalSalaryHour() {
    return usedNormalSalaryHour;
  }

  public void setUsedNormalSalaryHour(BigDecimal usedNormalSalaryHour) {
    this.usedNormalSalaryHour = usedNormalSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem usedStatutorySalaryHour(BigDecimal usedStatutorySalaryHour) {
    this.usedStatutorySalaryHour = usedStatutorySalaryHour;
    return this;
  }

  /**
   * Get usedStatutorySalaryHour
   * @return usedStatutorySalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getUsedStatutorySalaryHour() {
    return usedStatutorySalaryHour;
  }

  public void setUsedStatutorySalaryHour(BigDecimal usedStatutorySalaryHour) {
    this.usedStatutorySalaryHour = usedStatutorySalaryHour;
  }

  public OvertimeMonthlySummaryContentItem usedWeekendSalaryHour(BigDecimal usedWeekendSalaryHour) {
    this.usedWeekendSalaryHour = usedWeekendSalaryHour;
    return this;
  }

  /**
   * Get usedWeekendSalaryHour
   * @return usedWeekendSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getUsedWeekendSalaryHour() {
    return usedWeekendSalaryHour;
  }

  public void setUsedWeekendSalaryHour(BigDecimal usedWeekendSalaryHour) {
    this.usedWeekendSalaryHour = usedWeekendSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem weekendHour(BigDecimal weekendHour) {
    this.weekendHour = weekendHour;
    return this;
  }

  /**
   * Get weekendHour
   * @return weekendHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendHour() {
    return weekendHour;
  }

  public void setWeekendHour(BigDecimal weekendHour) {
    this.weekendHour = weekendHour;
  }

  public OvertimeMonthlySummaryContentItem weekendToExpiredHour(BigDecimal weekendToExpiredHour) {
    this.weekendToExpiredHour = weekendToExpiredHour;
    return this;
  }

  /**
   * Get weekendToExpiredHour
   * @return weekendToExpiredHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendToExpiredHour() {
    return weekendToExpiredHour;
  }

  public void setWeekendToExpiredHour(BigDecimal weekendToExpiredHour) {
    this.weekendToExpiredHour = weekendToExpiredHour;
  }

  public OvertimeMonthlySummaryContentItem weekendToRestHour(BigDecimal weekendToRestHour) {
    this.weekendToRestHour = weekendToRestHour;
    return this;
  }

  /**
   * Get weekendToRestHour
   * @return weekendToRestHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendToRestHour() {
    return weekendToRestHour;
  }

  public void setWeekendToRestHour(BigDecimal weekendToRestHour) {
    this.weekendToRestHour = weekendToRestHour;
  }

  public OvertimeMonthlySummaryContentItem weekendToSalaryHour(BigDecimal weekendToSalaryHour) {
    this.weekendToSalaryHour = weekendToSalaryHour;
    return this;
  }

  /**
   * Get weekendToSalaryHour
   * @return weekendToSalaryHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendToSalaryHour() {
    return weekendToSalaryHour;
  }

  public void setWeekendToSalaryHour(BigDecimal weekendToSalaryHour) {
    this.weekendToSalaryHour = weekendToSalaryHour;
  }

  public OvertimeMonthlySummaryContentItem weekendToUnCarriedHour(BigDecimal weekendToUnCarriedHour) {
    this.weekendToUnCarriedHour = weekendToUnCarriedHour;
    return this;
  }

  /**
   * Get weekendToUnCarriedHour
   * @return weekendToUnCarriedHour
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendToUnCarriedHour() {
    return weekendToUnCarriedHour;
  }

  public void setWeekendToUnCarriedHour(BigDecimal weekendToUnCarriedHour) {
    this.weekendToUnCarriedHour = weekendToUnCarriedHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OvertimeMonthlySummaryContentItem overtimeMonthlySummaryContentItem = (OvertimeMonthlySummaryContentItem) o;
    return Objects.equals(this.adjustId, overtimeMonthlySummaryContentItem.adjustId) &&
        Objects.equals(this.adjustRestHour, overtimeMonthlySummaryContentItem.adjustRestHour) &&
        Objects.equals(this.allAdjustRestHour, overtimeMonthlySummaryContentItem.allAdjustRestHour) &&
        Objects.equals(this.departmentId, overtimeMonthlySummaryContentItem.departmentId) &&
        Objects.equals(this.departmentName, overtimeMonthlySummaryContentItem.departmentName) &&
        Objects.equals(this.id, overtimeMonthlySummaryContentItem.id) &&
        Objects.equals(this.invalidAdjustRestHour, overtimeMonthlySummaryContentItem.invalidAdjustRestHour) &&
        Objects.equals(this.leaveAdjustRuleId, overtimeMonthlySummaryContentItem.leaveAdjustRuleId) &&
        Objects.equals(this.mobileNo, overtimeMonthlySummaryContentItem.mobileNo) &&
        Objects.equals(this.month, overtimeMonthlySummaryContentItem.month) &&
        Objects.equals(this.normalHour, overtimeMonthlySummaryContentItem.normalHour) &&
        Objects.equals(this.normalToExpiredHour, overtimeMonthlySummaryContentItem.normalToExpiredHour) &&
        Objects.equals(this.normalToRestHour, overtimeMonthlySummaryContentItem.normalToRestHour) &&
        Objects.equals(this.normalToSalaryHour, overtimeMonthlySummaryContentItem.normalToSalaryHour) &&
        Objects.equals(this.normalToUnCarriedHour, overtimeMonthlySummaryContentItem.normalToUnCarriedHour) &&
        Objects.equals(this.positionId, overtimeMonthlySummaryContentItem.positionId) &&
        Objects.equals(this.positionName, overtimeMonthlySummaryContentItem.positionName) &&
        Objects.equals(this.staffId, overtimeMonthlySummaryContentItem.staffId) &&
        Objects.equals(this.staffName, overtimeMonthlySummaryContentItem.staffName) &&
        Objects.equals(this.staffNo, overtimeMonthlySummaryContentItem.staffNo) &&
        Objects.equals(this.statutoryHour, overtimeMonthlySummaryContentItem.statutoryHour) &&
        Objects.equals(this.statutoryToExpiredHour, overtimeMonthlySummaryContentItem.statutoryToExpiredHour) &&
        Objects.equals(this.statutoryToRestHour, overtimeMonthlySummaryContentItem.statutoryToRestHour) &&
        Objects.equals(this.statutoryToSalaryHour, overtimeMonthlySummaryContentItem.statutoryToSalaryHour) &&
        Objects.equals(this.statutoryToUnCarriedHour, overtimeMonthlySummaryContentItem.statutoryToUnCarriedHour) &&
        Objects.equals(this.totalNormalHour, overtimeMonthlySummaryContentItem.totalNormalHour) &&
        Objects.equals(this.totalNormalSalaryHour, overtimeMonthlySummaryContentItem.totalNormalSalaryHour) &&
        Objects.equals(this.totalStatutoryHour, overtimeMonthlySummaryContentItem.totalStatutoryHour) &&
        Objects.equals(this.totalStatutorySalaryHour, overtimeMonthlySummaryContentItem.totalStatutorySalaryHour) &&
        Objects.equals(this.totalWeekendHour, overtimeMonthlySummaryContentItem.totalWeekendHour) &&
        Objects.equals(this.totalWeekendSalaryHour, overtimeMonthlySummaryContentItem.totalWeekendSalaryHour) &&
        Objects.equals(this.usedAdjustRestHour, overtimeMonthlySummaryContentItem.usedAdjustRestHour) &&
        Objects.equals(this.usedNormalSalaryHour, overtimeMonthlySummaryContentItem.usedNormalSalaryHour) &&
        Objects.equals(this.usedStatutorySalaryHour, overtimeMonthlySummaryContentItem.usedStatutorySalaryHour) &&
        Objects.equals(this.usedWeekendSalaryHour, overtimeMonthlySummaryContentItem.usedWeekendSalaryHour) &&
        Objects.equals(this.weekendHour, overtimeMonthlySummaryContentItem.weekendHour) &&
        Objects.equals(this.weekendToExpiredHour, overtimeMonthlySummaryContentItem.weekendToExpiredHour) &&
        Objects.equals(this.weekendToRestHour, overtimeMonthlySummaryContentItem.weekendToRestHour) &&
        Objects.equals(this.weekendToSalaryHour, overtimeMonthlySummaryContentItem.weekendToSalaryHour) &&
        Objects.equals(this.weekendToUnCarriedHour, overtimeMonthlySummaryContentItem.weekendToUnCarriedHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustId, adjustRestHour, allAdjustRestHour, departmentId, departmentName, id, invalidAdjustRestHour, leaveAdjustRuleId, mobileNo, month, normalHour, normalToExpiredHour, normalToRestHour, normalToSalaryHour, normalToUnCarriedHour, positionId, positionName, staffId, staffName, staffNo, statutoryHour, statutoryToExpiredHour, statutoryToRestHour, statutoryToSalaryHour, statutoryToUnCarriedHour, totalNormalHour, totalNormalSalaryHour, totalStatutoryHour, totalStatutorySalaryHour, totalWeekendHour, totalWeekendSalaryHour, usedAdjustRestHour, usedNormalSalaryHour, usedStatutorySalaryHour, usedWeekendSalaryHour, weekendHour, weekendToExpiredHour, weekendToRestHour, weekendToSalaryHour, weekendToUnCarriedHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OvertimeMonthlySummaryContentItem {\n");
    
    sb.append("    adjustId: ").append(toIndentedString(adjustId)).append("\n");
    sb.append("    adjustRestHour: ").append(toIndentedString(adjustRestHour)).append("\n");
    sb.append("    allAdjustRestHour: ").append(toIndentedString(allAdjustRestHour)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invalidAdjustRestHour: ").append(toIndentedString(invalidAdjustRestHour)).append("\n");
    sb.append("    leaveAdjustRuleId: ").append(toIndentedString(leaveAdjustRuleId)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    normalHour: ").append(toIndentedString(normalHour)).append("\n");
    sb.append("    normalToExpiredHour: ").append(toIndentedString(normalToExpiredHour)).append("\n");
    sb.append("    normalToRestHour: ").append(toIndentedString(normalToRestHour)).append("\n");
    sb.append("    normalToSalaryHour: ").append(toIndentedString(normalToSalaryHour)).append("\n");
    sb.append("    normalToUnCarriedHour: ").append(toIndentedString(normalToUnCarriedHour)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    statutoryHour: ").append(toIndentedString(statutoryHour)).append("\n");
    sb.append("    statutoryToExpiredHour: ").append(toIndentedString(statutoryToExpiredHour)).append("\n");
    sb.append("    statutoryToRestHour: ").append(toIndentedString(statutoryToRestHour)).append("\n");
    sb.append("    statutoryToSalaryHour: ").append(toIndentedString(statutoryToSalaryHour)).append("\n");
    sb.append("    statutoryToUnCarriedHour: ").append(toIndentedString(statutoryToUnCarriedHour)).append("\n");
    sb.append("    totalNormalHour: ").append(toIndentedString(totalNormalHour)).append("\n");
    sb.append("    totalNormalSalaryHour: ").append(toIndentedString(totalNormalSalaryHour)).append("\n");
    sb.append("    totalStatutoryHour: ").append(toIndentedString(totalStatutoryHour)).append("\n");
    sb.append("    totalStatutorySalaryHour: ").append(toIndentedString(totalStatutorySalaryHour)).append("\n");
    sb.append("    totalWeekendHour: ").append(toIndentedString(totalWeekendHour)).append("\n");
    sb.append("    totalWeekendSalaryHour: ").append(toIndentedString(totalWeekendSalaryHour)).append("\n");
    sb.append("    usedAdjustRestHour: ").append(toIndentedString(usedAdjustRestHour)).append("\n");
    sb.append("    usedNormalSalaryHour: ").append(toIndentedString(usedNormalSalaryHour)).append("\n");
    sb.append("    usedStatutorySalaryHour: ").append(toIndentedString(usedStatutorySalaryHour)).append("\n");
    sb.append("    usedWeekendSalaryHour: ").append(toIndentedString(usedWeekendSalaryHour)).append("\n");
    sb.append("    weekendHour: ").append(toIndentedString(weekendHour)).append("\n");
    sb.append("    weekendToExpiredHour: ").append(toIndentedString(weekendToExpiredHour)).append("\n");
    sb.append("    weekendToRestHour: ").append(toIndentedString(weekendToRestHour)).append("\n");
    sb.append("    weekendToSalaryHour: ").append(toIndentedString(weekendToSalaryHour)).append("\n");
    sb.append("    weekendToUnCarriedHour: ").append(toIndentedString(weekendToUnCarriedHour)).append("\n");
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
