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
 * KpiPlanDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class KpiPlanDataContentItem   {
  @JsonProperty("apmCycle")
  private String apmCycle = null;

  @JsonProperty("apmExcStage")
  private String apmExcStage = null;

  @JsonProperty("apmExcStageName")
  private String apmExcStageName = null;

  @JsonProperty("apmName")
  private String apmName = null;

  @JsonProperty("appealEndDate")
  private LocalDate appealEndDate = null;

  @JsonProperty("carryRule")
  private String carryRule = null;

  @JsonProperty("confirmStartEndDate")
  private LocalDate confirmStartEndDate = null;

  @JsonProperty("digit")
  private String digit = null;

  @JsonProperty("evaluateStartEndDate")
  private String evaluateStartEndDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("planLeaderNames")
  private String planLeaderNames = null;

  @JsonProperty("resultConfirmEndDate")
  private LocalDate resultConfirmEndDate = null;

  @JsonProperty("retractEnable")
  private Boolean retractEnable = null;

  public KpiPlanDataContentItem apmCycle(String apmCycle) {
    this.apmCycle = apmCycle;
    return this;
  }

  /**
   * Get apmCycle
   * @return apmCycle
  **/
  @ApiModelProperty(example = "2020年9月", value = "")
  
    public String getApmCycle() {
    return apmCycle;
  }

  public void setApmCycle(String apmCycle) {
    this.apmCycle = apmCycle;
  }

  public KpiPlanDataContentItem apmExcStage(String apmExcStage) {
    this.apmExcStage = apmExcStage;
    return this;
  }

  /**
   * Get apmExcStage
   * @return apmExcStage
  **/
  @ApiModelProperty(example = "STAGE_1", value = "")
  
    public String getApmExcStage() {
    return apmExcStage;
  }

  public void setApmExcStage(String apmExcStage) {
    this.apmExcStage = apmExcStage;
  }

  public KpiPlanDataContentItem apmExcStageName(String apmExcStageName) {
    this.apmExcStageName = apmExcStageName;
    return this;
  }

  /**
   * Get apmExcStageName
   * @return apmExcStageName
  **/
  @ApiModelProperty(example = "计划制定", value = "")
  
    public String getApmExcStageName() {
    return apmExcStageName;
  }

  public void setApmExcStageName(String apmExcStageName) {
    this.apmExcStageName = apmExcStageName;
  }

  public KpiPlanDataContentItem apmName(String apmName) {
    this.apmName = apmName;
    return this;
  }

  /**
   * Get apmName
   * @return apmName
  **/
  @ApiModelProperty(example = "营销部测试", value = "")
  
    public String getApmName() {
    return apmName;
  }

  public void setApmName(String apmName) {
    this.apmName = apmName;
  }

  public KpiPlanDataContentItem appealEndDate(LocalDate appealEndDate) {
    this.appealEndDate = appealEndDate;
    return this;
  }

  /**
   * Get appealEndDate
   * @return appealEndDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getAppealEndDate() {
    return appealEndDate;
  }

  public void setAppealEndDate(LocalDate appealEndDate) {
    this.appealEndDate = appealEndDate;
  }

  public KpiPlanDataContentItem carryRule(String carryRule) {
    this.carryRule = carryRule;
    return this;
  }

  /**
   * Get carryRule
   * @return carryRule
  **/
  @ApiModelProperty(example = "四舍五入", value = "")
  
    public String getCarryRule() {
    return carryRule;
  }

  public void setCarryRule(String carryRule) {
    this.carryRule = carryRule;
  }

  public KpiPlanDataContentItem confirmStartEndDate(LocalDate confirmStartEndDate) {
    this.confirmStartEndDate = confirmStartEndDate;
    return this;
  }

  /**
   * Get confirmStartEndDate
   * @return confirmStartEndDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getConfirmStartEndDate() {
    return confirmStartEndDate;
  }

  public void setConfirmStartEndDate(LocalDate confirmStartEndDate) {
    this.confirmStartEndDate = confirmStartEndDate;
  }

  public KpiPlanDataContentItem digit(String digit) {
    this.digit = digit;
    return this;
  }

  /**
   * Get digit
   * @return digit
  **/
  @ApiModelProperty(example = "0.1", value = "")
  
    public String getDigit() {
    return digit;
  }

  public void setDigit(String digit) {
    this.digit = digit;
  }

  public KpiPlanDataContentItem evaluateStartEndDate(String evaluateStartEndDate) {
    this.evaluateStartEndDate = evaluateStartEndDate;
    return this;
  }

  /**
   * Get evaluateStartEndDate
   * @return evaluateStartEndDate
  **/
  @ApiModelProperty(example = "2020-09-14~2020-09-30", value = "")
  
    public String getEvaluateStartEndDate() {
    return evaluateStartEndDate;
  }

  public void setEvaluateStartEndDate(String evaluateStartEndDate) {
    this.evaluateStartEndDate = evaluateStartEndDate;
  }

  public KpiPlanDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "12cca222-257e-4803-9b40-6b561480f390", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KpiPlanDataContentItem planLeaderNames(String planLeaderNames) {
    this.planLeaderNames = planLeaderNames;
    return this;
  }

  /**
   * Get planLeaderNames
   * @return planLeaderNames
  **/
  @ApiModelProperty(example = "郑晴(18268128047)", value = "")
  
    public String getPlanLeaderNames() {
    return planLeaderNames;
  }

  public void setPlanLeaderNames(String planLeaderNames) {
    this.planLeaderNames = planLeaderNames;
  }

  public KpiPlanDataContentItem resultConfirmEndDate(LocalDate resultConfirmEndDate) {
    this.resultConfirmEndDate = resultConfirmEndDate;
    return this;
  }

  /**
   * Get resultConfirmEndDate
   * @return resultConfirmEndDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getResultConfirmEndDate() {
    return resultConfirmEndDate;
  }

  public void setResultConfirmEndDate(LocalDate resultConfirmEndDate) {
    this.resultConfirmEndDate = resultConfirmEndDate;
  }

  public KpiPlanDataContentItem retractEnable(Boolean retractEnable) {
    this.retractEnable = retractEnable;
    return this;
  }

  /**
   * Get retractEnable
   * @return retractEnable
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isRetractEnable() {
    return retractEnable;
  }

  public void setRetractEnable(Boolean retractEnable) {
    this.retractEnable = retractEnable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiPlanDataContentItem kpiPlanDataContentItem = (KpiPlanDataContentItem) o;
    return Objects.equals(this.apmCycle, kpiPlanDataContentItem.apmCycle) &&
        Objects.equals(this.apmExcStage, kpiPlanDataContentItem.apmExcStage) &&
        Objects.equals(this.apmExcStageName, kpiPlanDataContentItem.apmExcStageName) &&
        Objects.equals(this.apmName, kpiPlanDataContentItem.apmName) &&
        Objects.equals(this.appealEndDate, kpiPlanDataContentItem.appealEndDate) &&
        Objects.equals(this.carryRule, kpiPlanDataContentItem.carryRule) &&
        Objects.equals(this.confirmStartEndDate, kpiPlanDataContentItem.confirmStartEndDate) &&
        Objects.equals(this.digit, kpiPlanDataContentItem.digit) &&
        Objects.equals(this.evaluateStartEndDate, kpiPlanDataContentItem.evaluateStartEndDate) &&
        Objects.equals(this.id, kpiPlanDataContentItem.id) &&
        Objects.equals(this.planLeaderNames, kpiPlanDataContentItem.planLeaderNames) &&
        Objects.equals(this.resultConfirmEndDate, kpiPlanDataContentItem.resultConfirmEndDate) &&
        Objects.equals(this.retractEnable, kpiPlanDataContentItem.retractEnable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmCycle, apmExcStage, apmExcStageName, apmName, appealEndDate, carryRule, confirmStartEndDate, digit, evaluateStartEndDate, id, planLeaderNames, resultConfirmEndDate, retractEnable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiPlanDataContentItem {\n");
    
    sb.append("    apmCycle: ").append(toIndentedString(apmCycle)).append("\n");
    sb.append("    apmExcStage: ").append(toIndentedString(apmExcStage)).append("\n");
    sb.append("    apmExcStageName: ").append(toIndentedString(apmExcStageName)).append("\n");
    sb.append("    apmName: ").append(toIndentedString(apmName)).append("\n");
    sb.append("    appealEndDate: ").append(toIndentedString(appealEndDate)).append("\n");
    sb.append("    carryRule: ").append(toIndentedString(carryRule)).append("\n");
    sb.append("    confirmStartEndDate: ").append(toIndentedString(confirmStartEndDate)).append("\n");
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    evaluateStartEndDate: ").append(toIndentedString(evaluateStartEndDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planLeaderNames: ").append(toIndentedString(planLeaderNames)).append("\n");
    sb.append("    resultConfirmEndDate: ").append(toIndentedString(resultConfirmEndDate)).append("\n");
    sb.append("    retractEnable: ").append(toIndentedString(retractEnable)).append("\n");
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
