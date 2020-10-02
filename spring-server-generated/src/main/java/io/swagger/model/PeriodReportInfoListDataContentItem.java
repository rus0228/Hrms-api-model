package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PeriodReportInfoListDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class PeriodReportInfoListDataContentItem   {
  @JsonProperty("ADJUST_REST")
  private BigDecimal ADJUST_REST = null;

  @JsonProperty("AFFAIR_LEAVE")
  private BigDecimal AFFAIR_LEAVE = null;

  @JsonProperty("ANNUAL_LEAVE")
  private BigDecimal ANNUAL_LEAVE = null;

  @JsonProperty("FULL_PAY_SICK_LEAVE")
  private BigDecimal FULL_PAY_SICK_LEAVE = null;

  @JsonProperty("FUNERAL_LEAVE")
  private BigDecimal FUNERAL_LEAVE = null;

  @JsonProperty("HOME_LEAVE")
  private BigDecimal HOME_LEAVE = null;

  @JsonProperty("LACTATION_LEAVE")
  private BigDecimal LACTATION_LEAVE = null;

  @JsonProperty("MARITAL_LEAVE")
  private BigDecimal MARITAL_LEAVE = null;

  @JsonProperty("MATERNITY_LEAVE")
  private BigDecimal MATERNITY_LEAVE = null;

  @JsonProperty("OTHER_VACATION")
  private BigDecimal OTHER_VACATION = null;

  @JsonProperty("PAID_SICK_LEAVE")
  private BigDecimal PAID_SICK_LEAVE = null;

  @JsonProperty("PATERNITY_LEAVE")
  private BigDecimal PATERNITY_LEAVE = null;

  @JsonProperty("PRENATAL_CHECK_UP")
  private BigDecimal PRENATAL_CHECK_UP = null;

  @JsonProperty("absenceHours")
  private BigDecimal absenceHours = null;

  @JsonProperty("absenceNumber")
  private BigDecimal absenceNumber = null;

  @JsonProperty("absenceTimes")
  private BigDecimal absenceTimes = null;

  @JsonProperty("actualAttendanceDays")
  private BigDecimal actualAttendanceDays = null;

  @JsonProperty("actualAttendanceHours")
  private BigDecimal actualAttendanceHours = null;

  @JsonProperty("appealTimes")
  private BigDecimal appealTimes = null;

  @JsonProperty("attendanceShift")
  private String attendanceShift = null;

  @JsonProperty("businessTravelDays")
  private BigDecimal businessTravelDays = null;

  @JsonProperty("dayOffDelayHours")
  private BigDecimal dayOffDelayHours = null;

  @JsonProperty("deepNightDuration")
  private BigDecimal deepNightDuration = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("earlyMinutes")
  private BigDecimal earlyMinutes = null;

  @JsonProperty("earlyTimes")
  private BigDecimal earlyTimes = null;

  @JsonProperty("enrollInDate")
  private LocalDate enrollInDate = null;

  @JsonProperty("fieldWorkHours")
  private BigDecimal fieldWorkHours = null;

  @JsonProperty("holidayDelayHours")
  private BigDecimal holidayDelayHours = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lateMinutes")
  private BigDecimal lateMinutes = null;

  @JsonProperty("lateTimes")
  private BigDecimal lateTimes = null;

  @JsonProperty("leaveDate")
  private OffsetDateTime leaveDate = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("normalHour")
  private BigDecimal normalHour = null;

  @JsonProperty("normalToRestHour")
  private BigDecimal normalToRestHour = null;

  @JsonProperty("normalToSalaryHour")
  private BigDecimal normalToSalaryHour = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("restDays")
  private Integer restDays = null;

  @JsonProperty("signInMissingTimes")
  private BigDecimal signInMissingTimes = null;

  @JsonProperty("signOutMissingTimes")
  private BigDecimal signOutMissingTimes = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("statutoryHour")
  private BigDecimal statutoryHour = null;

  @JsonProperty("statutoryToRestHour")
  private BigDecimal statutoryToRestHour = null;

  @JsonProperty("statutoryToSalaryHour")
  private BigDecimal statutoryToSalaryHour = null;

  @JsonProperty("supposedAttendanceDays")
  private Integer supposedAttendanceDays = null;

  @JsonProperty("supposedAttendanceHours")
  private BigDecimal supposedAttendanceHours = null;

  @JsonProperty("updateDate")
  private OffsetDateTime updateDate = null;

  @JsonProperty("weekendHour")
  private BigDecimal weekendHour = null;

  @JsonProperty("weekendToRestHour")
  private BigDecimal weekendToRestHour = null;

  @JsonProperty("weekendToSalaryHour")
  private BigDecimal weekendToSalaryHour = null;

  @JsonProperty("workdayDelayHours")
  private BigDecimal workdayDelayHours = null;

  public PeriodReportInfoListDataContentItem ADJUST_REST(BigDecimal ADJUST_REST) {
    this.ADJUST_REST = ADJUST_REST;
    return this;
  }

  /**
   * Get ADJUST_REST
   * @return ADJUST_REST
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getADJUSTREST() {
    return ADJUST_REST;
  }

  public void setADJUSTREST(BigDecimal ADJUST_REST) {
    this.ADJUST_REST = ADJUST_REST;
  }

  public PeriodReportInfoListDataContentItem AFFAIR_LEAVE(BigDecimal AFFAIR_LEAVE) {
    this.AFFAIR_LEAVE = AFFAIR_LEAVE;
    return this;
  }

  /**
   * Get AFFAIR_LEAVE
   * @return AFFAIR_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAFFAIRLEAVE() {
    return AFFAIR_LEAVE;
  }

  public void setAFFAIRLEAVE(BigDecimal AFFAIR_LEAVE) {
    this.AFFAIR_LEAVE = AFFAIR_LEAVE;
  }

  public PeriodReportInfoListDataContentItem ANNUAL_LEAVE(BigDecimal ANNUAL_LEAVE) {
    this.ANNUAL_LEAVE = ANNUAL_LEAVE;
    return this;
  }

  /**
   * Get ANNUAL_LEAVE
   * @return ANNUAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getANNUALLEAVE() {
    return ANNUAL_LEAVE;
  }

  public void setANNUALLEAVE(BigDecimal ANNUAL_LEAVE) {
    this.ANNUAL_LEAVE = ANNUAL_LEAVE;
  }

  public PeriodReportInfoListDataContentItem FULL_PAY_SICK_LEAVE(BigDecimal FULL_PAY_SICK_LEAVE) {
    this.FULL_PAY_SICK_LEAVE = FULL_PAY_SICK_LEAVE;
    return this;
  }

  /**
   * Get FULL_PAY_SICK_LEAVE
   * @return FULL_PAY_SICK_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getFULLPAYSICKLEAVE() {
    return FULL_PAY_SICK_LEAVE;
  }

  public void setFULLPAYSICKLEAVE(BigDecimal FULL_PAY_SICK_LEAVE) {
    this.FULL_PAY_SICK_LEAVE = FULL_PAY_SICK_LEAVE;
  }

  public PeriodReportInfoListDataContentItem FUNERAL_LEAVE(BigDecimal FUNERAL_LEAVE) {
    this.FUNERAL_LEAVE = FUNERAL_LEAVE;
    return this;
  }

  /**
   * Get FUNERAL_LEAVE
   * @return FUNERAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getFUNERALLEAVE() {
    return FUNERAL_LEAVE;
  }

  public void setFUNERALLEAVE(BigDecimal FUNERAL_LEAVE) {
    this.FUNERAL_LEAVE = FUNERAL_LEAVE;
  }

  public PeriodReportInfoListDataContentItem HOME_LEAVE(BigDecimal HOME_LEAVE) {
    this.HOME_LEAVE = HOME_LEAVE;
    return this;
  }

  /**
   * Get HOME_LEAVE
   * @return HOME_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHOMELEAVE() {
    return HOME_LEAVE;
  }

  public void setHOMELEAVE(BigDecimal HOME_LEAVE) {
    this.HOME_LEAVE = HOME_LEAVE;
  }

  public PeriodReportInfoListDataContentItem LACTATION_LEAVE(BigDecimal LACTATION_LEAVE) {
    this.LACTATION_LEAVE = LACTATION_LEAVE;
    return this;
  }

  /**
   * Get LACTATION_LEAVE
   * @return LACTATION_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getLACTATIONLEAVE() {
    return LACTATION_LEAVE;
  }

  public void setLACTATIONLEAVE(BigDecimal LACTATION_LEAVE) {
    this.LACTATION_LEAVE = LACTATION_LEAVE;
  }

  public PeriodReportInfoListDataContentItem MARITAL_LEAVE(BigDecimal MARITAL_LEAVE) {
    this.MARITAL_LEAVE = MARITAL_LEAVE;
    return this;
  }

  /**
   * Get MARITAL_LEAVE
   * @return MARITAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getMARITALLEAVE() {
    return MARITAL_LEAVE;
  }

  public void setMARITALLEAVE(BigDecimal MARITAL_LEAVE) {
    this.MARITAL_LEAVE = MARITAL_LEAVE;
  }

  public PeriodReportInfoListDataContentItem MATERNITY_LEAVE(BigDecimal MATERNITY_LEAVE) {
    this.MATERNITY_LEAVE = MATERNITY_LEAVE;
    return this;
  }

  /**
   * Get MATERNITY_LEAVE
   * @return MATERNITY_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getMATERNITYLEAVE() {
    return MATERNITY_LEAVE;
  }

  public void setMATERNITYLEAVE(BigDecimal MATERNITY_LEAVE) {
    this.MATERNITY_LEAVE = MATERNITY_LEAVE;
  }

  public PeriodReportInfoListDataContentItem OTHER_VACATION(BigDecimal OTHER_VACATION) {
    this.OTHER_VACATION = OTHER_VACATION;
    return this;
  }

  /**
   * Get OTHER_VACATION
   * @return OTHER_VACATION
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getOTHERVACATION() {
    return OTHER_VACATION;
  }

  public void setOTHERVACATION(BigDecimal OTHER_VACATION) {
    this.OTHER_VACATION = OTHER_VACATION;
  }

  public PeriodReportInfoListDataContentItem PAID_SICK_LEAVE(BigDecimal PAID_SICK_LEAVE) {
    this.PAID_SICK_LEAVE = PAID_SICK_LEAVE;
    return this;
  }

  /**
   * Get PAID_SICK_LEAVE
   * @return PAID_SICK_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getPAIDSICKLEAVE() {
    return PAID_SICK_LEAVE;
  }

  public void setPAIDSICKLEAVE(BigDecimal PAID_SICK_LEAVE) {
    this.PAID_SICK_LEAVE = PAID_SICK_LEAVE;
  }

  public PeriodReportInfoListDataContentItem PATERNITY_LEAVE(BigDecimal PATERNITY_LEAVE) {
    this.PATERNITY_LEAVE = PATERNITY_LEAVE;
    return this;
  }

  /**
   * Get PATERNITY_LEAVE
   * @return PATERNITY_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getPATERNITYLEAVE() {
    return PATERNITY_LEAVE;
  }

  public void setPATERNITYLEAVE(BigDecimal PATERNITY_LEAVE) {
    this.PATERNITY_LEAVE = PATERNITY_LEAVE;
  }

  public PeriodReportInfoListDataContentItem PRENATAL_CHECK_UP(BigDecimal PRENATAL_CHECK_UP) {
    this.PRENATAL_CHECK_UP = PRENATAL_CHECK_UP;
    return this;
  }

  /**
   * Get PRENATAL_CHECK_UP
   * @return PRENATAL_CHECK_UP
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getPRENATALCHECKUP() {
    return PRENATAL_CHECK_UP;
  }

  public void setPRENATALCHECKUP(BigDecimal PRENATAL_CHECK_UP) {
    this.PRENATAL_CHECK_UP = PRENATAL_CHECK_UP;
  }

  public PeriodReportInfoListDataContentItem absenceHours(BigDecimal absenceHours) {
    this.absenceHours = absenceHours;
    return this;
  }

  /**
   * Get absenceHours
   * @return absenceHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAbsenceHours() {
    return absenceHours;
  }

  public void setAbsenceHours(BigDecimal absenceHours) {
    this.absenceHours = absenceHours;
  }

  public PeriodReportInfoListDataContentItem absenceNumber(BigDecimal absenceNumber) {
    this.absenceNumber = absenceNumber;
    return this;
  }

  /**
   * Get absenceNumber
   * @return absenceNumber
  **/
  @ApiModelProperty(example = "12", value = "")
  
    @Valid
    public BigDecimal getAbsenceNumber() {
    return absenceNumber;
  }

  public void setAbsenceNumber(BigDecimal absenceNumber) {
    this.absenceNumber = absenceNumber;
  }

  public PeriodReportInfoListDataContentItem absenceTimes(BigDecimal absenceTimes) {
    this.absenceTimes = absenceTimes;
    return this;
  }

  /**
   * Get absenceTimes
   * @return absenceTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAbsenceTimes() {
    return absenceTimes;
  }

  public void setAbsenceTimes(BigDecimal absenceTimes) {
    this.absenceTimes = absenceTimes;
  }

  public PeriodReportInfoListDataContentItem actualAttendanceDays(BigDecimal actualAttendanceDays) {
    this.actualAttendanceDays = actualAttendanceDays;
    return this;
  }

  /**
   * Get actualAttendanceDays
   * @return actualAttendanceDays
  **/
  @ApiModelProperty(example = "6", value = "")
  
    @Valid
    public BigDecimal getActualAttendanceDays() {
    return actualAttendanceDays;
  }

  public void setActualAttendanceDays(BigDecimal actualAttendanceDays) {
    this.actualAttendanceDays = actualAttendanceDays;
  }

  public PeriodReportInfoListDataContentItem actualAttendanceHours(BigDecimal actualAttendanceHours) {
    this.actualAttendanceHours = actualAttendanceHours;
    return this;
  }

  /**
   * Get actualAttendanceHours
   * @return actualAttendanceHours
  **/
  @ApiModelProperty(example = "144", value = "")
  
    @Valid
    public BigDecimal getActualAttendanceHours() {
    return actualAttendanceHours;
  }

  public void setActualAttendanceHours(BigDecimal actualAttendanceHours) {
    this.actualAttendanceHours = actualAttendanceHours;
  }

  public PeriodReportInfoListDataContentItem appealTimes(BigDecimal appealTimes) {
    this.appealTimes = appealTimes;
    return this;
  }

  /**
   * Get appealTimes
   * @return appealTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getAppealTimes() {
    return appealTimes;
  }

  public void setAppealTimes(BigDecimal appealTimes) {
    this.appealTimes = appealTimes;
  }

  public PeriodReportInfoListDataContentItem attendanceShift(String attendanceShift) {
    this.attendanceShift = attendanceShift;
    return this;
  }

  /**
   * Get attendanceShift
   * @return attendanceShift
  **/
  @ApiModelProperty(value = "")
  
    public String getAttendanceShift() {
    return attendanceShift;
  }

  public void setAttendanceShift(String attendanceShift) {
    this.attendanceShift = attendanceShift;
  }

  public PeriodReportInfoListDataContentItem businessTravelDays(BigDecimal businessTravelDays) {
    this.businessTravelDays = businessTravelDays;
    return this;
  }

  /**
   * Get businessTravelDays
   * @return businessTravelDays
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getBusinessTravelDays() {
    return businessTravelDays;
  }

  public void setBusinessTravelDays(BigDecimal businessTravelDays) {
    this.businessTravelDays = businessTravelDays;
  }

  public PeriodReportInfoListDataContentItem dayOffDelayHours(BigDecimal dayOffDelayHours) {
    this.dayOffDelayHours = dayOffDelayHours;
    return this;
  }

  /**
   * Get dayOffDelayHours
   * @return dayOffDelayHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDayOffDelayHours() {
    return dayOffDelayHours;
  }

  public void setDayOffDelayHours(BigDecimal dayOffDelayHours) {
    this.dayOffDelayHours = dayOffDelayHours;
  }

  public PeriodReportInfoListDataContentItem deepNightDuration(BigDecimal deepNightDuration) {
    this.deepNightDuration = deepNightDuration;
    return this;
  }

  /**
   * Get deepNightDuration
   * @return deepNightDuration
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDeepNightDuration() {
    return deepNightDuration;
  }

  public void setDeepNightDuration(BigDecimal deepNightDuration) {
    this.deepNightDuration = deepNightDuration;
  }

  public PeriodReportInfoListDataContentItem departmentId(String departmentId) {
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

  public PeriodReportInfoListDataContentItem departmentName(String departmentName) {
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

  public PeriodReportInfoListDataContentItem earlyMinutes(BigDecimal earlyMinutes) {
    this.earlyMinutes = earlyMinutes;
    return this;
  }

  /**
   * Get earlyMinutes
   * @return earlyMinutes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getEarlyMinutes() {
    return earlyMinutes;
  }

  public void setEarlyMinutes(BigDecimal earlyMinutes) {
    this.earlyMinutes = earlyMinutes;
  }

  public PeriodReportInfoListDataContentItem earlyTimes(BigDecimal earlyTimes) {
    this.earlyTimes = earlyTimes;
    return this;
  }

  /**
   * Get earlyTimes
   * @return earlyTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getEarlyTimes() {
    return earlyTimes;
  }

  public void setEarlyTimes(BigDecimal earlyTimes) {
    this.earlyTimes = earlyTimes;
  }

  public PeriodReportInfoListDataContentItem enrollInDate(LocalDate enrollInDate) {
    this.enrollInDate = enrollInDate;
    return this;
  }

  /**
   * Get enrollInDate
   * @return enrollInDate
  **/
  @ApiModelProperty(example = "Mon Jul 01 00:00:00 GMT 2019", value = "")
  
    @Valid
    public LocalDate getEnrollInDate() {
    return enrollInDate;
  }

  public void setEnrollInDate(LocalDate enrollInDate) {
    this.enrollInDate = enrollInDate;
  }

  public PeriodReportInfoListDataContentItem fieldWorkHours(BigDecimal fieldWorkHours) {
    this.fieldWorkHours = fieldWorkHours;
    return this;
  }

  /**
   * Get fieldWorkHours
   * @return fieldWorkHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getFieldWorkHours() {
    return fieldWorkHours;
  }

  public void setFieldWorkHours(BigDecimal fieldWorkHours) {
    this.fieldWorkHours = fieldWorkHours;
  }

  public PeriodReportInfoListDataContentItem holidayDelayHours(BigDecimal holidayDelayHours) {
    this.holidayDelayHours = holidayDelayHours;
    return this;
  }

  /**
   * Get holidayDelayHours
   * @return holidayDelayHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getHolidayDelayHours() {
    return holidayDelayHours;
  }

  public void setHolidayDelayHours(BigDecimal holidayDelayHours) {
    this.holidayDelayHours = holidayDelayHours;
  }

  public PeriodReportInfoListDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "6cdf5274-47c1-424b-9e12-193b47ef169f", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PeriodReportInfoListDataContentItem lateMinutes(BigDecimal lateMinutes) {
    this.lateMinutes = lateMinutes;
    return this;
  }

  /**
   * Get lateMinutes
   * @return lateMinutes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getLateMinutes() {
    return lateMinutes;
  }

  public void setLateMinutes(BigDecimal lateMinutes) {
    this.lateMinutes = lateMinutes;
  }

  public PeriodReportInfoListDataContentItem lateTimes(BigDecimal lateTimes) {
    this.lateTimes = lateTimes;
    return this;
  }

  /**
   * Get lateTimes
   * @return lateTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getLateTimes() {
    return lateTimes;
  }

  public void setLateTimes(BigDecimal lateTimes) {
    this.lateTimes = lateTimes;
  }

  public PeriodReportInfoListDataContentItem leaveDate(OffsetDateTime leaveDate) {
    this.leaveDate = leaveDate;
    return this;
  }

  /**
   * Get leaveDate
   * @return leaveDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLeaveDate() {
    return leaveDate;
  }

  public void setLeaveDate(OffsetDateTime leaveDate) {
    this.leaveDate = leaveDate;
  }

  public PeriodReportInfoListDataContentItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(example = "18268128047", value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public PeriodReportInfoListDataContentItem normalHour(BigDecimal normalHour) {
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

  public PeriodReportInfoListDataContentItem normalToRestHour(BigDecimal normalToRestHour) {
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

  public PeriodReportInfoListDataContentItem normalToSalaryHour(BigDecimal normalToSalaryHour) {
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

  public PeriodReportInfoListDataContentItem positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
  **/
  @ApiModelProperty(example = "7fd0ac20-9d44-4395-ae37-1c5498f48400", value = "")
  
    public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public PeriodReportInfoListDataContentItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(example = "结算专员", value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public PeriodReportInfoListDataContentItem remark(String remark) {
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

  public PeriodReportInfoListDataContentItem restDays(Integer restDays) {
    this.restDays = restDays;
    return this;
  }

  /**
   * Get restDays
   * @return restDays
  **/
  @ApiModelProperty(example = "7", value = "")
  
    public Integer getRestDays() {
    return restDays;
  }

  public void setRestDays(Integer restDays) {
    this.restDays = restDays;
  }

  public PeriodReportInfoListDataContentItem signInMissingTimes(BigDecimal signInMissingTimes) {
    this.signInMissingTimes = signInMissingTimes;
    return this;
  }

  /**
   * Get signInMissingTimes
   * @return signInMissingTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getSignInMissingTimes() {
    return signInMissingTimes;
  }

  public void setSignInMissingTimes(BigDecimal signInMissingTimes) {
    this.signInMissingTimes = signInMissingTimes;
  }

  public PeriodReportInfoListDataContentItem signOutMissingTimes(BigDecimal signOutMissingTimes) {
    this.signOutMissingTimes = signOutMissingTimes;
    return this;
  }

  /**
   * Get signOutMissingTimes
   * @return signOutMissingTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getSignOutMissingTimes() {
    return signOutMissingTimes;
  }

  public void setSignOutMissingTimes(BigDecimal signOutMissingTimes) {
    this.signOutMissingTimes = signOutMissingTimes;
  }

  public PeriodReportInfoListDataContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "f2dc64d0-cb7e-479f-b534-3bcbd27d7e41", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public PeriodReportInfoListDataContentItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "郑晴", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public PeriodReportInfoListDataContentItem staffNo(String staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public String getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
  }

  public PeriodReportInfoListDataContentItem statutoryHour(BigDecimal statutoryHour) {
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

  public PeriodReportInfoListDataContentItem statutoryToRestHour(BigDecimal statutoryToRestHour) {
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

  public PeriodReportInfoListDataContentItem statutoryToSalaryHour(BigDecimal statutoryToSalaryHour) {
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

  public PeriodReportInfoListDataContentItem supposedAttendanceDays(Integer supposedAttendanceDays) {
    this.supposedAttendanceDays = supposedAttendanceDays;
    return this;
  }

  /**
   * Get supposedAttendanceDays
   * @return supposedAttendanceDays
  **/
  @ApiModelProperty(example = "23", value = "")
  
    public Integer getSupposedAttendanceDays() {
    return supposedAttendanceDays;
  }

  public void setSupposedAttendanceDays(Integer supposedAttendanceDays) {
    this.supposedAttendanceDays = supposedAttendanceDays;
  }

  public PeriodReportInfoListDataContentItem supposedAttendanceHours(BigDecimal supposedAttendanceHours) {
    this.supposedAttendanceHours = supposedAttendanceHours;
    return this;
  }

  /**
   * Get supposedAttendanceHours
   * @return supposedAttendanceHours
  **/
  @ApiModelProperty(example = "184", value = "")
  
    @Valid
    public BigDecimal getSupposedAttendanceHours() {
    return supposedAttendanceHours;
  }

  public void setSupposedAttendanceHours(BigDecimal supposedAttendanceHours) {
    this.supposedAttendanceHours = supposedAttendanceHours;
  }

  public PeriodReportInfoListDataContentItem updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public PeriodReportInfoListDataContentItem weekendHour(BigDecimal weekendHour) {
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

  public PeriodReportInfoListDataContentItem weekendToRestHour(BigDecimal weekendToRestHour) {
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

  public PeriodReportInfoListDataContentItem weekendToSalaryHour(BigDecimal weekendToSalaryHour) {
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

  public PeriodReportInfoListDataContentItem workdayDelayHours(BigDecimal workdayDelayHours) {
    this.workdayDelayHours = workdayDelayHours;
    return this;
  }

  /**
   * Get workdayDelayHours
   * @return workdayDelayHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWorkdayDelayHours() {
    return workdayDelayHours;
  }

  public void setWorkdayDelayHours(BigDecimal workdayDelayHours) {
    this.workdayDelayHours = workdayDelayHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodReportInfoListDataContentItem periodReportInfoListDataContentItem = (PeriodReportInfoListDataContentItem) o;
    return Objects.equals(this.ADJUST_REST, periodReportInfoListDataContentItem.ADJUST_REST) &&
        Objects.equals(this.AFFAIR_LEAVE, periodReportInfoListDataContentItem.AFFAIR_LEAVE) &&
        Objects.equals(this.ANNUAL_LEAVE, periodReportInfoListDataContentItem.ANNUAL_LEAVE) &&
        Objects.equals(this.FULL_PAY_SICK_LEAVE, periodReportInfoListDataContentItem.FULL_PAY_SICK_LEAVE) &&
        Objects.equals(this.FUNERAL_LEAVE, periodReportInfoListDataContentItem.FUNERAL_LEAVE) &&
        Objects.equals(this.HOME_LEAVE, periodReportInfoListDataContentItem.HOME_LEAVE) &&
        Objects.equals(this.LACTATION_LEAVE, periodReportInfoListDataContentItem.LACTATION_LEAVE) &&
        Objects.equals(this.MARITAL_LEAVE, periodReportInfoListDataContentItem.MARITAL_LEAVE) &&
        Objects.equals(this.MATERNITY_LEAVE, periodReportInfoListDataContentItem.MATERNITY_LEAVE) &&
        Objects.equals(this.OTHER_VACATION, periodReportInfoListDataContentItem.OTHER_VACATION) &&
        Objects.equals(this.PAID_SICK_LEAVE, periodReportInfoListDataContentItem.PAID_SICK_LEAVE) &&
        Objects.equals(this.PATERNITY_LEAVE, periodReportInfoListDataContentItem.PATERNITY_LEAVE) &&
        Objects.equals(this.PRENATAL_CHECK_UP, periodReportInfoListDataContentItem.PRENATAL_CHECK_UP) &&
        Objects.equals(this.absenceHours, periodReportInfoListDataContentItem.absenceHours) &&
        Objects.equals(this.absenceNumber, periodReportInfoListDataContentItem.absenceNumber) &&
        Objects.equals(this.absenceTimes, periodReportInfoListDataContentItem.absenceTimes) &&
        Objects.equals(this.actualAttendanceDays, periodReportInfoListDataContentItem.actualAttendanceDays) &&
        Objects.equals(this.actualAttendanceHours, periodReportInfoListDataContentItem.actualAttendanceHours) &&
        Objects.equals(this.appealTimes, periodReportInfoListDataContentItem.appealTimes) &&
        Objects.equals(this.attendanceShift, periodReportInfoListDataContentItem.attendanceShift) &&
        Objects.equals(this.businessTravelDays, periodReportInfoListDataContentItem.businessTravelDays) &&
        Objects.equals(this.dayOffDelayHours, periodReportInfoListDataContentItem.dayOffDelayHours) &&
        Objects.equals(this.deepNightDuration, periodReportInfoListDataContentItem.deepNightDuration) &&
        Objects.equals(this.departmentId, periodReportInfoListDataContentItem.departmentId) &&
        Objects.equals(this.departmentName, periodReportInfoListDataContentItem.departmentName) &&
        Objects.equals(this.earlyMinutes, periodReportInfoListDataContentItem.earlyMinutes) &&
        Objects.equals(this.earlyTimes, periodReportInfoListDataContentItem.earlyTimes) &&
        Objects.equals(this.enrollInDate, periodReportInfoListDataContentItem.enrollInDate) &&
        Objects.equals(this.fieldWorkHours, periodReportInfoListDataContentItem.fieldWorkHours) &&
        Objects.equals(this.holidayDelayHours, periodReportInfoListDataContentItem.holidayDelayHours) &&
        Objects.equals(this.id, periodReportInfoListDataContentItem.id) &&
        Objects.equals(this.lateMinutes, periodReportInfoListDataContentItem.lateMinutes) &&
        Objects.equals(this.lateTimes, periodReportInfoListDataContentItem.lateTimes) &&
        Objects.equals(this.leaveDate, periodReportInfoListDataContentItem.leaveDate) &&
        Objects.equals(this.mobileNo, periodReportInfoListDataContentItem.mobileNo) &&
        Objects.equals(this.normalHour, periodReportInfoListDataContentItem.normalHour) &&
        Objects.equals(this.normalToRestHour, periodReportInfoListDataContentItem.normalToRestHour) &&
        Objects.equals(this.normalToSalaryHour, periodReportInfoListDataContentItem.normalToSalaryHour) &&
        Objects.equals(this.positionId, periodReportInfoListDataContentItem.positionId) &&
        Objects.equals(this.positionName, periodReportInfoListDataContentItem.positionName) &&
        Objects.equals(this.remark, periodReportInfoListDataContentItem.remark) &&
        Objects.equals(this.restDays, periodReportInfoListDataContentItem.restDays) &&
        Objects.equals(this.signInMissingTimes, periodReportInfoListDataContentItem.signInMissingTimes) &&
        Objects.equals(this.signOutMissingTimes, periodReportInfoListDataContentItem.signOutMissingTimes) &&
        Objects.equals(this.staffId, periodReportInfoListDataContentItem.staffId) &&
        Objects.equals(this.staffName, periodReportInfoListDataContentItem.staffName) &&
        Objects.equals(this.staffNo, periodReportInfoListDataContentItem.staffNo) &&
        Objects.equals(this.statutoryHour, periodReportInfoListDataContentItem.statutoryHour) &&
        Objects.equals(this.statutoryToRestHour, periodReportInfoListDataContentItem.statutoryToRestHour) &&
        Objects.equals(this.statutoryToSalaryHour, periodReportInfoListDataContentItem.statutoryToSalaryHour) &&
        Objects.equals(this.supposedAttendanceDays, periodReportInfoListDataContentItem.supposedAttendanceDays) &&
        Objects.equals(this.supposedAttendanceHours, periodReportInfoListDataContentItem.supposedAttendanceHours) &&
        Objects.equals(this.updateDate, periodReportInfoListDataContentItem.updateDate) &&
        Objects.equals(this.weekendHour, periodReportInfoListDataContentItem.weekendHour) &&
        Objects.equals(this.weekendToRestHour, periodReportInfoListDataContentItem.weekendToRestHour) &&
        Objects.equals(this.weekendToSalaryHour, periodReportInfoListDataContentItem.weekendToSalaryHour) &&
        Objects.equals(this.workdayDelayHours, periodReportInfoListDataContentItem.workdayDelayHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADJUST_REST, AFFAIR_LEAVE, ANNUAL_LEAVE, FULL_PAY_SICK_LEAVE, FUNERAL_LEAVE, HOME_LEAVE, LACTATION_LEAVE, MARITAL_LEAVE, MATERNITY_LEAVE, OTHER_VACATION, PAID_SICK_LEAVE, PATERNITY_LEAVE, PRENATAL_CHECK_UP, absenceHours, absenceNumber, absenceTimes, actualAttendanceDays, actualAttendanceHours, appealTimes, attendanceShift, businessTravelDays, dayOffDelayHours, deepNightDuration, departmentId, departmentName, earlyMinutes, earlyTimes, enrollInDate, fieldWorkHours, holidayDelayHours, id, lateMinutes, lateTimes, leaveDate, mobileNo, normalHour, normalToRestHour, normalToSalaryHour, positionId, positionName, remark, restDays, signInMissingTimes, signOutMissingTimes, staffId, staffName, staffNo, statutoryHour, statutoryToRestHour, statutoryToSalaryHour, supposedAttendanceDays, supposedAttendanceHours, updateDate, weekendHour, weekendToRestHour, weekendToSalaryHour, workdayDelayHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodReportInfoListDataContentItem {\n");
    
    sb.append("    ADJUST_REST: ").append(toIndentedString(ADJUST_REST)).append("\n");
    sb.append("    AFFAIR_LEAVE: ").append(toIndentedString(AFFAIR_LEAVE)).append("\n");
    sb.append("    ANNUAL_LEAVE: ").append(toIndentedString(ANNUAL_LEAVE)).append("\n");
    sb.append("    FULL_PAY_SICK_LEAVE: ").append(toIndentedString(FULL_PAY_SICK_LEAVE)).append("\n");
    sb.append("    FUNERAL_LEAVE: ").append(toIndentedString(FUNERAL_LEAVE)).append("\n");
    sb.append("    HOME_LEAVE: ").append(toIndentedString(HOME_LEAVE)).append("\n");
    sb.append("    LACTATION_LEAVE: ").append(toIndentedString(LACTATION_LEAVE)).append("\n");
    sb.append("    MARITAL_LEAVE: ").append(toIndentedString(MARITAL_LEAVE)).append("\n");
    sb.append("    MATERNITY_LEAVE: ").append(toIndentedString(MATERNITY_LEAVE)).append("\n");
    sb.append("    OTHER_VACATION: ").append(toIndentedString(OTHER_VACATION)).append("\n");
    sb.append("    PAID_SICK_LEAVE: ").append(toIndentedString(PAID_SICK_LEAVE)).append("\n");
    sb.append("    PATERNITY_LEAVE: ").append(toIndentedString(PATERNITY_LEAVE)).append("\n");
    sb.append("    PRENATAL_CHECK_UP: ").append(toIndentedString(PRENATAL_CHECK_UP)).append("\n");
    sb.append("    absenceHours: ").append(toIndentedString(absenceHours)).append("\n");
    sb.append("    absenceNumber: ").append(toIndentedString(absenceNumber)).append("\n");
    sb.append("    absenceTimes: ").append(toIndentedString(absenceTimes)).append("\n");
    sb.append("    actualAttendanceDays: ").append(toIndentedString(actualAttendanceDays)).append("\n");
    sb.append("    actualAttendanceHours: ").append(toIndentedString(actualAttendanceHours)).append("\n");
    sb.append("    appealTimes: ").append(toIndentedString(appealTimes)).append("\n");
    sb.append("    attendanceShift: ").append(toIndentedString(attendanceShift)).append("\n");
    sb.append("    businessTravelDays: ").append(toIndentedString(businessTravelDays)).append("\n");
    sb.append("    dayOffDelayHours: ").append(toIndentedString(dayOffDelayHours)).append("\n");
    sb.append("    deepNightDuration: ").append(toIndentedString(deepNightDuration)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    earlyMinutes: ").append(toIndentedString(earlyMinutes)).append("\n");
    sb.append("    earlyTimes: ").append(toIndentedString(earlyTimes)).append("\n");
    sb.append("    enrollInDate: ").append(toIndentedString(enrollInDate)).append("\n");
    sb.append("    fieldWorkHours: ").append(toIndentedString(fieldWorkHours)).append("\n");
    sb.append("    holidayDelayHours: ").append(toIndentedString(holidayDelayHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lateMinutes: ").append(toIndentedString(lateMinutes)).append("\n");
    sb.append("    lateTimes: ").append(toIndentedString(lateTimes)).append("\n");
    sb.append("    leaveDate: ").append(toIndentedString(leaveDate)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    normalHour: ").append(toIndentedString(normalHour)).append("\n");
    sb.append("    normalToRestHour: ").append(toIndentedString(normalToRestHour)).append("\n");
    sb.append("    normalToSalaryHour: ").append(toIndentedString(normalToSalaryHour)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    restDays: ").append(toIndentedString(restDays)).append("\n");
    sb.append("    signInMissingTimes: ").append(toIndentedString(signInMissingTimes)).append("\n");
    sb.append("    signOutMissingTimes: ").append(toIndentedString(signOutMissingTimes)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    statutoryHour: ").append(toIndentedString(statutoryHour)).append("\n");
    sb.append("    statutoryToRestHour: ").append(toIndentedString(statutoryToRestHour)).append("\n");
    sb.append("    statutoryToSalaryHour: ").append(toIndentedString(statutoryToSalaryHour)).append("\n");
    sb.append("    supposedAttendanceDays: ").append(toIndentedString(supposedAttendanceDays)).append("\n");
    sb.append("    supposedAttendanceHours: ").append(toIndentedString(supposedAttendanceHours)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    weekendHour: ").append(toIndentedString(weekendHour)).append("\n");
    sb.append("    weekendToRestHour: ").append(toIndentedString(weekendToRestHour)).append("\n");
    sb.append("    weekendToSalaryHour: ").append(toIndentedString(weekendToSalaryHour)).append("\n");
    sb.append("    workdayDelayHours: ").append(toIndentedString(workdayDelayHours)).append("\n");
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
