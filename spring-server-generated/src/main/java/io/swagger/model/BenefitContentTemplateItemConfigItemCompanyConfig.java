package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentTemplateItemConfigItemCompanyConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentTemplateItemConfigItemCompanyConfig   {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("baseMax")
  private Integer baseMax = null;

  @JsonProperty("baseMin")
  private Integer baseMin = null;

  @JsonProperty("companyAmount")
  private Integer companyAmount = null;

  @JsonProperty("companyBaseMax")
  private Integer companyBaseMax = null;

  @JsonProperty("companyBaseMin")
  private Integer companyBaseMin = null;

  @JsonProperty("companyRatio")
  private Integer companyRatio = null;

  @JsonProperty("companyRoundBit")
  private Integer companyRoundBit = null;

  @JsonProperty("companyRoundType")
  private BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType companyRoundType = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  @JsonProperty("roundBit")
  private Integer roundBit = null;

  @JsonProperty("roundType")
  private BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType roundType = null;

  public BenefitContentTemplateItemConfigItemCompanyConfig amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig baseMax(Integer baseMax) {
    this.baseMax = baseMax;
    return this;
  }

  /**
   * Get baseMax
   * @return baseMax
  **/
  @ApiModelProperty(example = "2311800", value = "")
  
    public Integer getBaseMax() {
    return baseMax;
  }

  public void setBaseMax(Integer baseMax) {
    this.baseMax = baseMax;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig baseMin(Integer baseMin) {
    this.baseMin = baseMin;
    return this;
  }

  /**
   * Get baseMin
   * @return baseMin
  **/
  @ApiModelProperty(example = "308200", value = "")
  
    public Integer getBaseMin() {
    return baseMin;
  }

  public void setBaseMin(Integer baseMin) {
    this.baseMin = baseMin;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyAmount(Integer companyAmount) {
    this.companyAmount = companyAmount;
    return this;
  }

  /**
   * Get companyAmount
   * @return companyAmount
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getCompanyAmount() {
    return companyAmount;
  }

  public void setCompanyAmount(Integer companyAmount) {
    this.companyAmount = companyAmount;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyBaseMax(Integer companyBaseMax) {
    this.companyBaseMax = companyBaseMax;
    return this;
  }

  /**
   * Get companyBaseMax
   * @return companyBaseMax
  **/
  @ApiModelProperty(example = "2311800", value = "")
  
    public Integer getCompanyBaseMax() {
    return companyBaseMax;
  }

  public void setCompanyBaseMax(Integer companyBaseMax) {
    this.companyBaseMax = companyBaseMax;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyBaseMin(Integer companyBaseMin) {
    this.companyBaseMin = companyBaseMin;
    return this;
  }

  /**
   * Get companyBaseMin
   * @return companyBaseMin
  **/
  @ApiModelProperty(example = "308200", value = "")
  
    public Integer getCompanyBaseMin() {
    return companyBaseMin;
  }

  public void setCompanyBaseMin(Integer companyBaseMin) {
    this.companyBaseMin = companyBaseMin;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyRatio(Integer companyRatio) {
    this.companyRatio = companyRatio;
    return this;
  }

  /**
   * Get companyRatio
   * @return companyRatio
  **/
  @ApiModelProperty(example = "1900", value = "")
  
    public Integer getCompanyRatio() {
    return companyRatio;
  }

  public void setCompanyRatio(Integer companyRatio) {
    this.companyRatio = companyRatio;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyRoundBit(Integer companyRoundBit) {
    this.companyRoundBit = companyRoundBit;
    return this;
  }

  /**
   * Get companyRoundBit
   * @return companyRoundBit
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Integer getCompanyRoundBit() {
    return companyRoundBit;
  }

  public void setCompanyRoundBit(Integer companyRoundBit) {
    this.companyRoundBit = companyRoundBit;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig companyRoundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType companyRoundType) {
    this.companyRoundType = companyRoundType;
    return this;
  }

  /**
   * Get companyRoundType
   * @return companyRoundType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType getCompanyRoundType() {
    return companyRoundType;
  }

  public void setCompanyRoundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType companyRoundType) {
    this.companyRoundType = companyRoundType;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(example = "1990", value = "")
  
    public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig roundBit(Integer roundBit) {
    this.roundBit = roundBit;
    return this;
  }

  /**
   * Get roundBit
   * @return roundBit
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Integer getRoundBit() {
    return roundBit;
  }

  public void setRoundBit(Integer roundBit) {
    this.roundBit = roundBit;
  }

  public BenefitContentTemplateItemConfigItemCompanyConfig roundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType roundType) {
    this.roundType = roundType;
    return this;
  }

  /**
   * Get roundType
   * @return roundType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType getRoundType() {
    return roundType;
  }

  public void setRoundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType roundType) {
    this.roundType = roundType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentTemplateItemConfigItemCompanyConfig benefitContentTemplateItemConfigItemCompanyConfig = (BenefitContentTemplateItemConfigItemCompanyConfig) o;
    return Objects.equals(this.amount, benefitContentTemplateItemConfigItemCompanyConfig.amount) &&
        Objects.equals(this.baseMax, benefitContentTemplateItemConfigItemCompanyConfig.baseMax) &&
        Objects.equals(this.baseMin, benefitContentTemplateItemConfigItemCompanyConfig.baseMin) &&
        Objects.equals(this.companyAmount, benefitContentTemplateItemConfigItemCompanyConfig.companyAmount) &&
        Objects.equals(this.companyBaseMax, benefitContentTemplateItemConfigItemCompanyConfig.companyBaseMax) &&
        Objects.equals(this.companyBaseMin, benefitContentTemplateItemConfigItemCompanyConfig.companyBaseMin) &&
        Objects.equals(this.companyRatio, benefitContentTemplateItemConfigItemCompanyConfig.companyRatio) &&
        Objects.equals(this.companyRoundBit, benefitContentTemplateItemConfigItemCompanyConfig.companyRoundBit) &&
        Objects.equals(this.companyRoundType, benefitContentTemplateItemConfigItemCompanyConfig.companyRoundType) &&
        Objects.equals(this.ratio, benefitContentTemplateItemConfigItemCompanyConfig.ratio) &&
        Objects.equals(this.roundBit, benefitContentTemplateItemConfigItemCompanyConfig.roundBit) &&
        Objects.equals(this.roundType, benefitContentTemplateItemConfigItemCompanyConfig.roundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, baseMax, baseMin, companyAmount, companyBaseMax, companyBaseMin, companyRatio, companyRoundBit, companyRoundType, ratio, roundBit, roundType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentTemplateItemConfigItemCompanyConfig {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    baseMax: ").append(toIndentedString(baseMax)).append("\n");
    sb.append("    baseMin: ").append(toIndentedString(baseMin)).append("\n");
    sb.append("    companyAmount: ").append(toIndentedString(companyAmount)).append("\n");
    sb.append("    companyBaseMax: ").append(toIndentedString(companyBaseMax)).append("\n");
    sb.append("    companyBaseMin: ").append(toIndentedString(companyBaseMin)).append("\n");
    sb.append("    companyRatio: ").append(toIndentedString(companyRatio)).append("\n");
    sb.append("    companyRoundBit: ").append(toIndentedString(companyRoundBit)).append("\n");
    sb.append("    companyRoundType: ").append(toIndentedString(companyRoundType)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    roundBit: ").append(toIndentedString(roundBit)).append("\n");
    sb.append("    roundType: ").append(toIndentedString(roundType)).append("\n");
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
