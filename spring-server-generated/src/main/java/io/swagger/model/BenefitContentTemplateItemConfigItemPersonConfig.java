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
 * BenefitContentTemplateItemConfigItemPersonConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentTemplateItemConfigItemPersonConfig   {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("baseMax")
  private Integer baseMax = null;

  @JsonProperty("baseMin")
  private Integer baseMin = null;

  @JsonProperty("personAmount")
  private Integer personAmount = null;

  @JsonProperty("personBaseMax")
  private Integer personBaseMax = null;

  @JsonProperty("personBaseMin")
  private Integer personBaseMin = null;

  @JsonProperty("personRatio")
  private Integer personRatio = null;

  @JsonProperty("personRoundBit")
  private Integer personRoundBit = null;

  @JsonProperty("personRoundType")
  private BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType personRoundType = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  @JsonProperty("roundBit")
  private Integer roundBit = null;

  @JsonProperty("roundType")
  private BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType roundType = null;

  public BenefitContentTemplateItemConfigItemPersonConfig amount(Integer amount) {
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

  public BenefitContentTemplateItemConfigItemPersonConfig baseMax(Integer baseMax) {
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

  public BenefitContentTemplateItemConfigItemPersonConfig baseMin(Integer baseMin) {
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

  public BenefitContentTemplateItemConfigItemPersonConfig personAmount(Integer personAmount) {
    this.personAmount = personAmount;
    return this;
  }

  /**
   * Get personAmount
   * @return personAmount
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPersonAmount() {
    return personAmount;
  }

  public void setPersonAmount(Integer personAmount) {
    this.personAmount = personAmount;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig personBaseMax(Integer personBaseMax) {
    this.personBaseMax = personBaseMax;
    return this;
  }

  /**
   * Get personBaseMax
   * @return personBaseMax
  **/
  @ApiModelProperty(example = "2311800", value = "")
  
    public Integer getPersonBaseMax() {
    return personBaseMax;
  }

  public void setPersonBaseMax(Integer personBaseMax) {
    this.personBaseMax = personBaseMax;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig personBaseMin(Integer personBaseMin) {
    this.personBaseMin = personBaseMin;
    return this;
  }

  /**
   * Get personBaseMin
   * @return personBaseMin
  **/
  @ApiModelProperty(example = "308200", value = "")
  
    public Integer getPersonBaseMin() {
    return personBaseMin;
  }

  public void setPersonBaseMin(Integer personBaseMin) {
    this.personBaseMin = personBaseMin;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig personRatio(Integer personRatio) {
    this.personRatio = personRatio;
    return this;
  }

  /**
   * Get personRatio
   * @return personRatio
  **/
  @ApiModelProperty(example = "800", value = "")
  
    public Integer getPersonRatio() {
    return personRatio;
  }

  public void setPersonRatio(Integer personRatio) {
    this.personRatio = personRatio;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig personRoundBit(Integer personRoundBit) {
    this.personRoundBit = personRoundBit;
    return this;
  }

  /**
   * Get personRoundBit
   * @return personRoundBit
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Integer getPersonRoundBit() {
    return personRoundBit;
  }

  public void setPersonRoundBit(Integer personRoundBit) {
    this.personRoundBit = personRoundBit;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig personRoundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType personRoundType) {
    this.personRoundType = personRoundType;
    return this;
  }

  /**
   * Get personRoundType
   * @return personRoundType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType getPersonRoundType() {
    return personRoundType;
  }

  public void setPersonRoundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType personRoundType) {
    this.personRoundType = personRoundType;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(example = "800", value = "")
  
    public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  public BenefitContentTemplateItemConfigItemPersonConfig roundBit(Integer roundBit) {
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

  public BenefitContentTemplateItemConfigItemPersonConfig roundType(BenefitContentTemplateItemConfigItemCompanyConfigCompanyRoundType roundType) {
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
    BenefitContentTemplateItemConfigItemPersonConfig benefitContentTemplateItemConfigItemPersonConfig = (BenefitContentTemplateItemConfigItemPersonConfig) o;
    return Objects.equals(this.amount, benefitContentTemplateItemConfigItemPersonConfig.amount) &&
        Objects.equals(this.baseMax, benefitContentTemplateItemConfigItemPersonConfig.baseMax) &&
        Objects.equals(this.baseMin, benefitContentTemplateItemConfigItemPersonConfig.baseMin) &&
        Objects.equals(this.personAmount, benefitContentTemplateItemConfigItemPersonConfig.personAmount) &&
        Objects.equals(this.personBaseMax, benefitContentTemplateItemConfigItemPersonConfig.personBaseMax) &&
        Objects.equals(this.personBaseMin, benefitContentTemplateItemConfigItemPersonConfig.personBaseMin) &&
        Objects.equals(this.personRatio, benefitContentTemplateItemConfigItemPersonConfig.personRatio) &&
        Objects.equals(this.personRoundBit, benefitContentTemplateItemConfigItemPersonConfig.personRoundBit) &&
        Objects.equals(this.personRoundType, benefitContentTemplateItemConfigItemPersonConfig.personRoundType) &&
        Objects.equals(this.ratio, benefitContentTemplateItemConfigItemPersonConfig.ratio) &&
        Objects.equals(this.roundBit, benefitContentTemplateItemConfigItemPersonConfig.roundBit) &&
        Objects.equals(this.roundType, benefitContentTemplateItemConfigItemPersonConfig.roundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, baseMax, baseMin, personAmount, personBaseMax, personBaseMin, personRatio, personRoundBit, personRoundType, ratio, roundBit, roundType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentTemplateItemConfigItemPersonConfig {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    baseMax: ").append(toIndentedString(baseMax)).append("\n");
    sb.append("    baseMin: ").append(toIndentedString(baseMin)).append("\n");
    sb.append("    personAmount: ").append(toIndentedString(personAmount)).append("\n");
    sb.append("    personBaseMax: ").append(toIndentedString(personBaseMax)).append("\n");
    sb.append("    personBaseMin: ").append(toIndentedString(personBaseMin)).append("\n");
    sb.append("    personRatio: ").append(toIndentedString(personRatio)).append("\n");
    sb.append("    personRoundBit: ").append(toIndentedString(personRoundBit)).append("\n");
    sb.append("    personRoundType: ").append(toIndentedString(personRoundType)).append("\n");
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
