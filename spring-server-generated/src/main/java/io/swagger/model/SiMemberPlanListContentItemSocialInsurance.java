package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffBenefitDataContentItemSocialInsuranceActualPayer;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiMemberPlanListContentItemSocialInsurance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SiMemberPlanListContentItemSocialInsurance   {
  @JsonProperty("actualPayer")
  private StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer = null;

  @JsonProperty("base")
  private Integer base = null;

  @JsonProperty("calculatable")
  private Boolean calculatable = null;

  @JsonProperty("divisionId")
  private String divisionId = null;

  @JsonProperty("endOn")
  private LocalDate endOn = null;

  @JsonProperty("startOn")
  private String startOn = null;

  public SiMemberPlanListContentItemSocialInsurance actualPayer(StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer) {
    this.actualPayer = actualPayer;
    return this;
  }

  /**
   * Get actualPayer
   * @return actualPayer
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffBenefitDataContentItemSocialInsuranceActualPayer getActualPayer() {
    return actualPayer;
  }

  public void setActualPayer(StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer) {
    this.actualPayer = actualPayer;
  }

  public SiMemberPlanListContentItemSocialInsurance base(Integer base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(example = "330000", value = "")
  
    public Integer getBase() {
    return base;
  }

  public void setBase(Integer base) {
    this.base = base;
  }

  public SiMemberPlanListContentItemSocialInsurance calculatable(Boolean calculatable) {
    this.calculatable = calculatable;
    return this;
  }

  /**
   * Get calculatable
   * @return calculatable
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isCalculatable() {
    return calculatable;
  }

  public void setCalculatable(Boolean calculatable) {
    this.calculatable = calculatable;
  }

  public SiMemberPlanListContentItemSocialInsurance divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

  /**
   * Get divisionId
   * @return divisionId
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public SiMemberPlanListContentItemSocialInsurance endOn(LocalDate endOn) {
    this.endOn = endOn;
    return this;
  }

  /**
   * Get endOn
   * @return endOn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEndOn() {
    return endOn;
  }

  public void setEndOn(LocalDate endOn) {
    this.endOn = endOn;
  }

  public SiMemberPlanListContentItemSocialInsurance startOn(String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * Get startOn
   * @return startOn
  **/
  @ApiModelProperty(example = "2020-07", value = "")
  
    public String getStartOn() {
    return startOn;
  }

  public void setStartOn(String startOn) {
    this.startOn = startOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiMemberPlanListContentItemSocialInsurance siMemberPlanListContentItemSocialInsurance = (SiMemberPlanListContentItemSocialInsurance) o;
    return Objects.equals(this.actualPayer, siMemberPlanListContentItemSocialInsurance.actualPayer) &&
        Objects.equals(this.base, siMemberPlanListContentItemSocialInsurance.base) &&
        Objects.equals(this.calculatable, siMemberPlanListContentItemSocialInsurance.calculatable) &&
        Objects.equals(this.divisionId, siMemberPlanListContentItemSocialInsurance.divisionId) &&
        Objects.equals(this.endOn, siMemberPlanListContentItemSocialInsurance.endOn) &&
        Objects.equals(this.startOn, siMemberPlanListContentItemSocialInsurance.startOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualPayer, base, calculatable, divisionId, endOn, startOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiMemberPlanListContentItemSocialInsurance {\n");
    
    sb.append("    actualPayer: ").append(toIndentedString(actualPayer)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    calculatable: ").append(toIndentedString(calculatable)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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
