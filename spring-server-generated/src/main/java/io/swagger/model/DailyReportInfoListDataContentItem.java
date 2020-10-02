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
 * DailyReportInfoListDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class DailyReportInfoListDataContentItem   {
  @JsonProperty("ADJUST_REST")
  private Integer ADJUST_REST = null;

  @JsonProperty("AFFAIR_LEAVE")
  private Integer AFFAIR_LEAVE = null;

  @JsonProperty("ANNUAL_LEAVE")
  private Integer ANNUAL_LEAVE = null;

  @JsonProperty("FULL_PAY_SICK_LEAVE")
  private Integer FULL_PAY_SICK_LEAVE = null;

  @JsonProperty("FUNERAL_LEAVE")
  private Integer FUNERAL_LEAVE = null;

  @JsonProperty("HOME_LEAVE")
  private Integer HOME_LEAVE = null;

  @JsonProperty("LACTATION_LEAVE")
  private Integer LACTATION_LEAVE = null;

  @JsonProperty("MARITAL_LEAVE")
  private Integer MARITAL_LEAVE = null;

  @JsonProperty("MATERNITY_LEAVE")
  private Integer MATERNITY_LEAVE = null;

  @JsonProperty("OTHER_VACATION")
  private Integer OTHER_VACATION = null;

  @JsonProperty("PAID_SICK_LEAVE")
  private Integer PAID_SICK_LEAVE = null;

  @JsonProperty("PATERNITY_LEAVE")
  private Integer PATERNITY_LEAVE = null;

  @JsonProperty("PRENATAL_CHECK_UP")
  private Integer PRENATAL_CHECK_UP = null;

  @JsonProperty("abnormal")
  private Boolean abnormal = null;

  @JsonProperty("absenceHours")
  private BigDecimal absenceHours = null;

  @JsonProperty("absenceTimes")
  private BigDecimal absenceTimes = null;

  @JsonProperty("actualAttendanceHours")
  private BigDecimal actualAttendanceHours = null;

  @JsonProperty("appealTimes")
  private BigDecimal appealTimes = null;

  @JsonProperty("businessTravelDays")
  private BigDecimal businessTravelDays = null;

  @JsonProperty("deepNightHours")
  private BigDecimal deepNightHours = null;

  @JsonProperty("delayDayOffHours")
  private BigDecimal delayDayOffHours = null;

  @JsonProperty("delayHolidayHours")
  private BigDecimal delayHolidayHours = null;

  @JsonProperty("delayWorkdayHours")
  private BigDecimal delayWorkdayHours = null;

  @JsonProperty("departmentId")
  private BigDecimal departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("earlyMinutes")
  private BigDecimal earlyMinutes = null;

  @JsonProperty("earlyTimes")
  private BigDecimal earlyTimes = null;

  @JsonProperty("fieldWorkHours")
  private BigDecimal fieldWorkHours = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isAbsence")
  private Boolean isAbsence = null;

  @JsonProperty("isFixed")
  private Boolean isFixed = null;

  @JsonProperty("lateMinutes")
  private Boolean lateMinutes = null;

  @JsonProperty("lateTimes")
  private BigDecimal lateTimes = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("normalHours")
  private BigDecimal normalHours = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("shiftId")
  private String shiftId = null;

  @JsonProperty("shiftName")
  private String shiftName = null;

  @JsonProperty("shiftType")
  private String shiftType = null;

  @JsonProperty("signDate")
  private LocalDate signDate = null;

  @JsonProperty("signInMissingTimes")
  private Object signInMissingTimes = null;

  @JsonProperty("signOutMissingTimes")
  private BigDecimal signOutMissingTimes = null;

  @JsonProperty("signType")
  private String signType = null;

  @JsonProperty("signTypeExplain")
  private String signTypeExplain = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("statutoryHours")
  private BigDecimal statutoryHours = null;

  @JsonProperty("supposedAttendanceHours")
  private BigDecimal supposedAttendanceHours = null;

  @JsonProperty("updateDate")
  private OffsetDateTime updateDate = null;

  @JsonProperty("weekendHours")
  private BigDecimal weekendHours = null;

  public DailyReportInfoListDataContentItem ADJUST_REST(Integer ADJUST_REST) {
    this.ADJUST_REST = ADJUST_REST;
    return this;
  }

  /**
   * Get ADJUST_REST
   * @return ADJUST_REST
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getADJUSTREST() {
    return ADJUST_REST;
  }

  public void setADJUSTREST(Integer ADJUST_REST) {
    this.ADJUST_REST = ADJUST_REST;
  }

  public DailyReportInfoListDataContentItem AFFAIR_LEAVE(Integer AFFAIR_LEAVE) {
    this.AFFAIR_LEAVE = AFFAIR_LEAVE;
    return this;
  }

  /**
   * Get AFFAIR_LEAVE
   * @return AFFAIR_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAFFAIRLEAVE() {
    return AFFAIR_LEAVE;
  }

  public void setAFFAIRLEAVE(Integer AFFAIR_LEAVE) {
    this.AFFAIR_LEAVE = AFFAIR_LEAVE;
  }

  public DailyReportInfoListDataContentItem ANNUAL_LEAVE(Integer ANNUAL_LEAVE) {
    this.ANNUAL_LEAVE = ANNUAL_LEAVE;
    return this;
  }

  /**
   * Get ANNUAL_LEAVE
   * @return ANNUAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getANNUALLEAVE() {
    return ANNUAL_LEAVE;
  }

  public void setANNUALLEAVE(Integer ANNUAL_LEAVE) {
    this.ANNUAL_LEAVE = ANNUAL_LEAVE;
  }

  public DailyReportInfoListDataContentItem FULL_PAY_SICK_LEAVE(Integer FULL_PAY_SICK_LEAVE) {
    this.FULL_PAY_SICK_LEAVE = FULL_PAY_SICK_LEAVE;
    return this;
  }

  /**
   * Get FULL_PAY_SICK_LEAVE
   * @return FULL_PAY_SICK_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getFULLPAYSICKLEAVE() {
    return FULL_PAY_SICK_LEAVE;
  }

  public void setFULLPAYSICKLEAVE(Integer FULL_PAY_SICK_LEAVE) {
    this.FULL_PAY_SICK_LEAVE = FULL_PAY_SICK_LEAVE;
  }

  public DailyReportInfoListDataContentItem FUNERAL_LEAVE(Integer FUNERAL_LEAVE) {
    this.FUNERAL_LEAVE = FUNERAL_LEAVE;
    return this;
  }

  /**
   * Get FUNERAL_LEAVE
   * @return FUNERAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getFUNERALLEAVE() {
    return FUNERAL_LEAVE;
  }

  public void setFUNERALLEAVE(Integer FUNERAL_LEAVE) {
    this.FUNERAL_LEAVE = FUNERAL_LEAVE;
  }

  public DailyReportInfoListDataContentItem HOME_LEAVE(Integer HOME_LEAVE) {
    this.HOME_LEAVE = HOME_LEAVE;
    return this;
  }

  /**
   * Get HOME_LEAVE
   * @return HOME_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getHOMELEAVE() {
    return HOME_LEAVE;
  }

  public void setHOMELEAVE(Integer HOME_LEAVE) {
    this.HOME_LEAVE = HOME_LEAVE;
  }

  public DailyReportInfoListDataContentItem LACTATION_LEAVE(Integer LACTATION_LEAVE) {
    this.LACTATION_LEAVE = LACTATION_LEAVE;
    return this;
  }

  /**
   * Get LACTATION_LEAVE
   * @return LACTATION_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getLACTATIONLEAVE() {
    return LACTATION_LEAVE;
  }

  public void setLACTATIONLEAVE(Integer LACTATION_LEAVE) {
    this.LACTATION_LEAVE = LACTATION_LEAVE;
  }

  public DailyReportInfoListDataContentItem MARITAL_LEAVE(Integer MARITAL_LEAVE) {
    this.MARITAL_LEAVE = MARITAL_LEAVE;
    return this;
  }

  /**
   * Get MARITAL_LEAVE
   * @return MARITAL_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getMARITALLEAVE() {
    return MARITAL_LEAVE;
  }

  public void setMARITALLEAVE(Integer MARITAL_LEAVE) {
    this.MARITAL_LEAVE = MARITAL_LEAVE;
  }

  public DailyReportInfoListDataContentItem MATERNITY_LEAVE(Integer MATERNITY_LEAVE) {
    this.MATERNITY_LEAVE = MATERNITY_LEAVE;
    return this;
  }

  /**
   * Get MATERNITY_LEAVE
   * @return MATERNITY_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getMATERNITYLEAVE() {
    return MATERNITY_LEAVE;
  }

  public void setMATERNITYLEAVE(Integer MATERNITY_LEAVE) {
    this.MATERNITY_LEAVE = MATERNITY_LEAVE;
  }

  public DailyReportInfoListDataContentItem OTHER_VACATION(Integer OTHER_VACATION) {
    this.OTHER_VACATION = OTHER_VACATION;
    return this;
  }

  /**
   * Get OTHER_VACATION
   * @return OTHER_VACATION
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getOTHERVACATION() {
    return OTHER_VACATION;
  }

  public void setOTHERVACATION(Integer OTHER_VACATION) {
    this.OTHER_VACATION = OTHER_VACATION;
  }

  public DailyReportInfoListDataContentItem PAID_SICK_LEAVE(Integer PAID_SICK_LEAVE) {
    this.PAID_SICK_LEAVE = PAID_SICK_LEAVE;
    return this;
  }

  /**
   * Get PAID_SICK_LEAVE
   * @return PAID_SICK_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPAIDSICKLEAVE() {
    return PAID_SICK_LEAVE;
  }

  public void setPAIDSICKLEAVE(Integer PAID_SICK_LEAVE) {
    this.PAID_SICK_LEAVE = PAID_SICK_LEAVE;
  }

  public DailyReportInfoListDataContentItem PATERNITY_LEAVE(Integer PATERNITY_LEAVE) {
    this.PATERNITY_LEAVE = PATERNITY_LEAVE;
    return this;
  }

  /**
   * Get PATERNITY_LEAVE
   * @return PATERNITY_LEAVE
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPATERNITYLEAVE() {
    return PATERNITY_LEAVE;
  }

  public void setPATERNITYLEAVE(Integer PATERNITY_LEAVE) {
    this.PATERNITY_LEAVE = PATERNITY_LEAVE;
  }

  public DailyReportInfoListDataContentItem PRENATAL_CHECK_UP(Integer PRENATAL_CHECK_UP) {
    this.PRENATAL_CHECK_UP = PRENATAL_CHECK_UP;
    return this;
  }

  /**
   * Get PRENATAL_CHECK_UP
   * @return PRENATAL_CHECK_UP
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPRENATALCHECKUP() {
    return PRENATAL_CHECK_UP;
  }

  public void setPRENATALCHECKUP(Integer PRENATAL_CHECK_UP) {
    this.PRENATAL_CHECK_UP = PRENATAL_CHECK_UP;
  }

  public DailyReportInfoListDataContentItem abnormal(Boolean abnormal) {
    this.abnormal = abnormal;
    return this;
  }

  /**
   * Get abnormal
   * @return abnormal
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isAbnormal() {
    return abnormal;
  }

  public void setAbnormal(Boolean abnormal) {
    this.abnormal = abnormal;
  }

  public DailyReportInfoListDataContentItem absenceHours(BigDecimal absenceHours) {
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

  public DailyReportInfoListDataContentItem absenceTimes(BigDecimal absenceTimes) {
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

  public DailyReportInfoListDataContentItem actualAttendanceHours(BigDecimal actualAttendanceHours) {
    this.actualAttendanceHours = actualAttendanceHours;
    return this;
  }

  /**
   * Get actualAttendanceHours
   * @return actualAttendanceHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getActualAttendanceHours() {
    return actualAttendanceHours;
  }

  public void setActualAttendanceHours(BigDecimal actualAttendanceHours) {
    this.actualAttendanceHours = actualAttendanceHours;
  }

  public DailyReportInfoListDataContentItem appealTimes(BigDecimal appealTimes) {
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

  public DailyReportInfoListDataContentItem businessTravelDays(BigDecimal businessTravelDays) {
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

  public DailyReportInfoListDataContentItem deepNightHours(BigDecimal deepNightHours) {
    this.deepNightHours = deepNightHours;
    return this;
  }

  /**
   * Get deepNightHours
   * @return deepNightHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDeepNightHours() {
    return deepNightHours;
  }

  public void setDeepNightHours(BigDecimal deepNightHours) {
    this.deepNightHours = deepNightHours;
  }

  public DailyReportInfoListDataContentItem delayDayOffHours(BigDecimal delayDayOffHours) {
    this.delayDayOffHours = delayDayOffHours;
    return this;
  }

  /**
   * Get delayDayOffHours
   * @return delayDayOffHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDelayDayOffHours() {
    return delayDayOffHours;
  }

  public void setDelayDayOffHours(BigDecimal delayDayOffHours) {
    this.delayDayOffHours = delayDayOffHours;
  }

  public DailyReportInfoListDataContentItem delayHolidayHours(BigDecimal delayHolidayHours) {
    this.delayHolidayHours = delayHolidayHours;
    return this;
  }

  /**
   * Get delayHolidayHours
   * @return delayHolidayHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDelayHolidayHours() {
    return delayHolidayHours;
  }

  public void setDelayHolidayHours(BigDecimal delayHolidayHours) {
    this.delayHolidayHours = delayHolidayHours;
  }

  public DailyReportInfoListDataContentItem delayWorkdayHours(BigDecimal delayWorkdayHours) {
    this.delayWorkdayHours = delayWorkdayHours;
    return this;
  }

  /**
   * Get delayWorkdayHours
   * @return delayWorkdayHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDelayWorkdayHours() {
    return delayWorkdayHours;
  }

  public void setDelayWorkdayHours(BigDecimal delayWorkdayHours) {
    this.delayWorkdayHours = delayWorkdayHours;
  }

  public DailyReportInfoListDataContentItem departmentId(BigDecimal departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(BigDecimal departmentId) {
    this.departmentId = departmentId;
  }

  public DailyReportInfoListDataContentItem departmentName(String departmentName) {
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

  public DailyReportInfoListDataContentItem earlyMinutes(BigDecimal earlyMinutes) {
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

  public DailyReportInfoListDataContentItem earlyTimes(BigDecimal earlyTimes) {
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

  public DailyReportInfoListDataContentItem fieldWorkHours(BigDecimal fieldWorkHours) {
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

  public DailyReportInfoListDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "9fb83543-3c9f-4d0e-b0ba-b432a827bc9f", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DailyReportInfoListDataContentItem isAbsence(Boolean isAbsence) {
    this.isAbsence = isAbsence;
    return this;
  }

  /**
   * Get isAbsence
   * @return isAbsence
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsAbsence() {
    return isAbsence;
  }

  public void setIsAbsence(Boolean isAbsence) {
    this.isAbsence = isAbsence;
  }

  public DailyReportInfoListDataContentItem isFixed(Boolean isFixed) {
    this.isFixed = isFixed;
    return this;
  }

  /**
   * Get isFixed
   * @return isFixed
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public DailyReportInfoListDataContentItem lateMinutes(Boolean lateMinutes) {
    this.lateMinutes = lateMinutes;
    return this;
  }

  /**
   * Get lateMinutes
   * @return lateMinutes
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isLateMinutes() {
    return lateMinutes;
  }

  public void setLateMinutes(Boolean lateMinutes) {
    this.lateMinutes = lateMinutes;
  }

  public DailyReportInfoListDataContentItem lateTimes(BigDecimal lateTimes) {
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

  public DailyReportInfoListDataContentItem mobileNo(String mobileNo) {
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

  public DailyReportInfoListDataContentItem normalHours(BigDecimal normalHours) {
    this.normalHours = normalHours;
    return this;
  }

  /**
   * Get normalHours
   * @return normalHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getNormalHours() {
    return normalHours;
  }

  public void setNormalHours(BigDecimal normalHours) {
    this.normalHours = normalHours;
  }

  public DailyReportInfoListDataContentItem positionId(String positionId) {
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

  public DailyReportInfoListDataContentItem positionName(String positionName) {
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

  public DailyReportInfoListDataContentItem shiftId(String shiftId) {
    this.shiftId = shiftId;
    return this;
  }

  /**
   * Get shiftId
   * @return shiftId
  **/
  @ApiModelProperty(example = "f11b24b8-a5f3-4408-978a-305a7cf3ec3f", value = "")
  
    public String getShiftId() {
    return shiftId;
  }

  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }

  public DailyReportInfoListDataContentItem shiftName(String shiftName) {
    this.shiftName = shiftName;
    return this;
  }

  /**
   * Get shiftName
   * @return shiftName
  **/
  @ApiModelProperty(example = "固", value = "")
  
    public String getShiftName() {
    return shiftName;
  }

  public void setShiftName(String shiftName) {
    this.shiftName = shiftName;
  }

  public DailyReportInfoListDataContentItem shiftType(String shiftType) {
    this.shiftType = shiftType;
    return this;
  }

  /**
   * Get shiftType
   * @return shiftType
  **/
  @ApiModelProperty(example = "NORMAL", value = "")
  
    public String getShiftType() {
    return shiftType;
  }

  public void setShiftType(String shiftType) {
    this.shiftType = shiftType;
  }

  public DailyReportInfoListDataContentItem signDate(LocalDate signDate) {
    this.signDate = signDate;
    return this;
  }

  /**
   * Get signDate
   * @return signDate
  **/
  @ApiModelProperty(example = "Fri Sep 25 00:00:00 GMT 2020", value = "")
  
    @Valid
    public LocalDate getSignDate() {
    return signDate;
  }

  public void setSignDate(LocalDate signDate) {
    this.signDate = signDate;
  }

  public DailyReportInfoListDataContentItem signInMissingTimes(Object signInMissingTimes) {
    this.signInMissingTimes = signInMissingTimes;
    return this;
  }

  /**
   * Get signInMissingTimes
   * @return signInMissingTimes
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Object getSignInMissingTimes() {
    return signInMissingTimes;
  }

  public void setSignInMissingTimes(Object signInMissingTimes) {
    this.signInMissingTimes = signInMissingTimes;
  }

  public DailyReportInfoListDataContentItem signOutMissingTimes(BigDecimal signOutMissingTimes) {
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

  public DailyReportInfoListDataContentItem signType(String signType) {
    this.signType = signType;
    return this;
  }

  /**
   * Get signType
   * @return signType
  **/
  @ApiModelProperty(example = "Normal", value = "")
  
    public String getSignType() {
    return signType;
  }

  public void setSignType(String signType) {
    this.signType = signType;
  }

  public DailyReportInfoListDataContentItem signTypeExplain(String signTypeExplain) {
    this.signTypeExplain = signTypeExplain;
    return this;
  }

  /**
   * Get signTypeExplain
   * @return signTypeExplain
  **/
  @ApiModelProperty(example = "Normal", value = "")
  
    public String getSignTypeExplain() {
    return signTypeExplain;
  }

  public void setSignTypeExplain(String signTypeExplain) {
    this.signTypeExplain = signTypeExplain;
  }

  public DailyReportInfoListDataContentItem staffId(String staffId) {
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

  public DailyReportInfoListDataContentItem staffName(String staffName) {
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

  public DailyReportInfoListDataContentItem staffNo(String staffNo) {
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

  public DailyReportInfoListDataContentItem statutoryHours(BigDecimal statutoryHours) {
    this.statutoryHours = statutoryHours;
    return this;
  }

  /**
   * Get statutoryHours
   * @return statutoryHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getStatutoryHours() {
    return statutoryHours;
  }

  public void setStatutoryHours(BigDecimal statutoryHours) {
    this.statutoryHours = statutoryHours;
  }

  public DailyReportInfoListDataContentItem supposedAttendanceHours(BigDecimal supposedAttendanceHours) {
    this.supposedAttendanceHours = supposedAttendanceHours;
    return this;
  }

  /**
   * Get supposedAttendanceHours
   * @return supposedAttendanceHours
  **/
  @ApiModelProperty(example = "8", value = "")
  
    @Valid
    public BigDecimal getSupposedAttendanceHours() {
    return supposedAttendanceHours;
  }

  public void setSupposedAttendanceHours(BigDecimal supposedAttendanceHours) {
    this.supposedAttendanceHours = supposedAttendanceHours;
  }

  public DailyReportInfoListDataContentItem updateDate(OffsetDateTime updateDate) {
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

  public DailyReportInfoListDataContentItem weekendHours(BigDecimal weekendHours) {
    this.weekendHours = weekendHours;
    return this;
  }

  /**
   * Get weekendHours
   * @return weekendHours
  **/
  @ApiModelProperty(example = "0", value = "")
  
    @Valid
    public BigDecimal getWeekendHours() {
    return weekendHours;
  }

  public void setWeekendHours(BigDecimal weekendHours) {
    this.weekendHours = weekendHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyReportInfoListDataContentItem dailyReportInfoListDataContentItem = (DailyReportInfoListDataContentItem) o;
    return Objects.equals(this.ADJUST_REST, dailyReportInfoListDataContentItem.ADJUST_REST) &&
        Objects.equals(this.AFFAIR_LEAVE, dailyReportInfoListDataContentItem.AFFAIR_LEAVE) &&
        Objects.equals(this.ANNUAL_LEAVE, dailyReportInfoListDataContentItem.ANNUAL_LEAVE) &&
        Objects.equals(this.FULL_PAY_SICK_LEAVE, dailyReportInfoListDataContentItem.FULL_PAY_SICK_LEAVE) &&
        Objects.equals(this.FUNERAL_LEAVE, dailyReportInfoListDataContentItem.FUNERAL_LEAVE) &&
        Objects.equals(this.HOME_LEAVE, dailyReportInfoListDataContentItem.HOME_LEAVE) &&
        Objects.equals(this.LACTATION_LEAVE, dailyReportInfoListDataContentItem.LACTATION_LEAVE) &&
        Objects.equals(this.MARITAL_LEAVE, dailyReportInfoListDataContentItem.MARITAL_LEAVE) &&
        Objects.equals(this.MATERNITY_LEAVE, dailyReportInfoListDataContentItem.MATERNITY_LEAVE) &&
        Objects.equals(this.OTHER_VACATION, dailyReportInfoListDataContentItem.OTHER_VACATION) &&
        Objects.equals(this.PAID_SICK_LEAVE, dailyReportInfoListDataContentItem.PAID_SICK_LEAVE) &&
        Objects.equals(this.PATERNITY_LEAVE, dailyReportInfoListDataContentItem.PATERNITY_LEAVE) &&
        Objects.equals(this.PRENATAL_CHECK_UP, dailyReportInfoListDataContentItem.PRENATAL_CHECK_UP) &&
        Objects.equals(this.abnormal, dailyReportInfoListDataContentItem.abnormal) &&
        Objects.equals(this.absenceHours, dailyReportInfoListDataContentItem.absenceHours) &&
        Objects.equals(this.absenceTimes, dailyReportInfoListDataContentItem.absenceTimes) &&
        Objects.equals(this.actualAttendanceHours, dailyReportInfoListDataContentItem.actualAttendanceHours) &&
        Objects.equals(this.appealTimes, dailyReportInfoListDataContentItem.appealTimes) &&
        Objects.equals(this.businessTravelDays, dailyReportInfoListDataContentItem.businessTravelDays) &&
        Objects.equals(this.deepNightHours, dailyReportInfoListDataContentItem.deepNightHours) &&
        Objects.equals(this.delayDayOffHours, dailyReportInfoListDataContentItem.delayDayOffHours) &&
        Objects.equals(this.delayHolidayHours, dailyReportInfoListDataContentItem.delayHolidayHours) &&
        Objects.equals(this.delayWorkdayHours, dailyReportInfoListDataContentItem.delayWorkdayHours) &&
        Objects.equals(this.departmentId, dailyReportInfoListDataContentItem.departmentId) &&
        Objects.equals(this.departmentName, dailyReportInfoListDataContentItem.departmentName) &&
        Objects.equals(this.earlyMinutes, dailyReportInfoListDataContentItem.earlyMinutes) &&
        Objects.equals(this.earlyTimes, dailyReportInfoListDataContentItem.earlyTimes) &&
        Objects.equals(this.fieldWorkHours, dailyReportInfoListDataContentItem.fieldWorkHours) &&
        Objects.equals(this.id, dailyReportInfoListDataContentItem.id) &&
        Objects.equals(this.isAbsence, dailyReportInfoListDataContentItem.isAbsence) &&
        Objects.equals(this.isFixed, dailyReportInfoListDataContentItem.isFixed) &&
        Objects.equals(this.lateMinutes, dailyReportInfoListDataContentItem.lateMinutes) &&
        Objects.equals(this.lateTimes, dailyReportInfoListDataContentItem.lateTimes) &&
        Objects.equals(this.mobileNo, dailyReportInfoListDataContentItem.mobileNo) &&
        Objects.equals(this.normalHours, dailyReportInfoListDataContentItem.normalHours) &&
        Objects.equals(this.positionId, dailyReportInfoListDataContentItem.positionId) &&
        Objects.equals(this.positionName, dailyReportInfoListDataContentItem.positionName) &&
        Objects.equals(this.shiftId, dailyReportInfoListDataContentItem.shiftId) &&
        Objects.equals(this.shiftName, dailyReportInfoListDataContentItem.shiftName) &&
        Objects.equals(this.shiftType, dailyReportInfoListDataContentItem.shiftType) &&
        Objects.equals(this.signDate, dailyReportInfoListDataContentItem.signDate) &&
        Objects.equals(this.signInMissingTimes, dailyReportInfoListDataContentItem.signInMissingTimes) &&
        Objects.equals(this.signOutMissingTimes, dailyReportInfoListDataContentItem.signOutMissingTimes) &&
        Objects.equals(this.signType, dailyReportInfoListDataContentItem.signType) &&
        Objects.equals(this.signTypeExplain, dailyReportInfoListDataContentItem.signTypeExplain) &&
        Objects.equals(this.staffId, dailyReportInfoListDataContentItem.staffId) &&
        Objects.equals(this.staffName, dailyReportInfoListDataContentItem.staffName) &&
        Objects.equals(this.staffNo, dailyReportInfoListDataContentItem.staffNo) &&
        Objects.equals(this.statutoryHours, dailyReportInfoListDataContentItem.statutoryHours) &&
        Objects.equals(this.supposedAttendanceHours, dailyReportInfoListDataContentItem.supposedAttendanceHours) &&
        Objects.equals(this.updateDate, dailyReportInfoListDataContentItem.updateDate) &&
        Objects.equals(this.weekendHours, dailyReportInfoListDataContentItem.weekendHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ADJUST_REST, AFFAIR_LEAVE, ANNUAL_LEAVE, FULL_PAY_SICK_LEAVE, FUNERAL_LEAVE, HOME_LEAVE, LACTATION_LEAVE, MARITAL_LEAVE, MATERNITY_LEAVE, OTHER_VACATION, PAID_SICK_LEAVE, PATERNITY_LEAVE, PRENATAL_CHECK_UP, abnormal, absenceHours, absenceTimes, actualAttendanceHours, appealTimes, businessTravelDays, deepNightHours, delayDayOffHours, delayHolidayHours, delayWorkdayHours, departmentId, departmentName, earlyMinutes, earlyTimes, fieldWorkHours, id, isAbsence, isFixed, lateMinutes, lateTimes, mobileNo, normalHours, positionId, positionName, shiftId, shiftName, shiftType, signDate, signInMissingTimes, signOutMissingTimes, signType, signTypeExplain, staffId, staffName, staffNo, statutoryHours, supposedAttendanceHours, updateDate, weekendHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyReportInfoListDataContentItem {\n");
    
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
    sb.append("    abnormal: ").append(toIndentedString(abnormal)).append("\n");
    sb.append("    absenceHours: ").append(toIndentedString(absenceHours)).append("\n");
    sb.append("    absenceTimes: ").append(toIndentedString(absenceTimes)).append("\n");
    sb.append("    actualAttendanceHours: ").append(toIndentedString(actualAttendanceHours)).append("\n");
    sb.append("    appealTimes: ").append(toIndentedString(appealTimes)).append("\n");
    sb.append("    businessTravelDays: ").append(toIndentedString(businessTravelDays)).append("\n");
    sb.append("    deepNightHours: ").append(toIndentedString(deepNightHours)).append("\n");
    sb.append("    delayDayOffHours: ").append(toIndentedString(delayDayOffHours)).append("\n");
    sb.append("    delayHolidayHours: ").append(toIndentedString(delayHolidayHours)).append("\n");
    sb.append("    delayWorkdayHours: ").append(toIndentedString(delayWorkdayHours)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    earlyMinutes: ").append(toIndentedString(earlyMinutes)).append("\n");
    sb.append("    earlyTimes: ").append(toIndentedString(earlyTimes)).append("\n");
    sb.append("    fieldWorkHours: ").append(toIndentedString(fieldWorkHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAbsence: ").append(toIndentedString(isAbsence)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    lateMinutes: ").append(toIndentedString(lateMinutes)).append("\n");
    sb.append("    lateTimes: ").append(toIndentedString(lateTimes)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    normalHours: ").append(toIndentedString(normalHours)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    shiftName: ").append(toIndentedString(shiftName)).append("\n");
    sb.append("    shiftType: ").append(toIndentedString(shiftType)).append("\n");
    sb.append("    signDate: ").append(toIndentedString(signDate)).append("\n");
    sb.append("    signInMissingTimes: ").append(toIndentedString(signInMissingTimes)).append("\n");
    sb.append("    signOutMissingTimes: ").append(toIndentedString(signOutMissingTimes)).append("\n");
    sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
    sb.append("    signTypeExplain: ").append(toIndentedString(signTypeExplain)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    statutoryHours: ").append(toIndentedString(statutoryHours)).append("\n");
    sb.append("    supposedAttendanceHours: ").append(toIndentedString(supposedAttendanceHours)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    weekendHours: ").append(toIndentedString(weekendHours)).append("\n");
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
