package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitContentTemplateItemConfigItemCompanyConfig;
import io.swagger.model.BenefitContentTemplateItemConfigItemPersonConfig;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentTemplateItemConfigItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentTemplateItemConfigItem   {
  @JsonProperty("companyConfig")
  private BenefitContentTemplateItemConfigItemCompanyConfig companyConfig = null;

  @JsonProperty("effectiveOn")
  private String effectiveOn = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("freeTaxAmount")
  private Integer freeTaxAmount = null;

  @JsonProperty("freeTaxRatio")
  private Integer freeTaxRatio = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("includeAdjustableItem")
  private Boolean includeAdjustableItem = null;

  @JsonProperty("invalidOn")
  private String invalidOn = null;

  @JsonProperty("openFreeTax")
  private Boolean openFreeTax = null;

  @JsonProperty("personConfig")
  private BenefitContentTemplateItemConfigItemPersonConfig personConfig = null;

  @JsonProperty("remedialConfig")
  private Object remedialConfig = null;

  public BenefitContentTemplateItemConfigItem companyConfig(BenefitContentTemplateItemConfigItemCompanyConfig companyConfig) {
    this.companyConfig = companyConfig;
    return this;
  }

  /**
   * Get companyConfig
   * @return companyConfig
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemConfigItemCompanyConfig getCompanyConfig() {
    return companyConfig;
  }

  public void setCompanyConfig(BenefitContentTemplateItemConfigItemCompanyConfig companyConfig) {
    this.companyConfig = companyConfig;
  }

  public BenefitContentTemplateItemConfigItem effectiveOn(String effectiveOn) {
    this.effectiveOn = effectiveOn;
    return this;
  }

  /**
   * Get effectiveOn
   * @return effectiveOn
  **/
  @ApiModelProperty(example = "2017-07", value = "")
  
    public String getEffectiveOn() {
    return effectiveOn;
  }

  public void setEffectiveOn(String effectiveOn) {
    this.effectiveOn = effectiveOn;
  }

  public BenefitContentTemplateItemConfigItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BenefitContentTemplateItemConfigItem freeTaxAmount(Integer freeTaxAmount) {
    this.freeTaxAmount = freeTaxAmount;
    return this;
  }

  /**
   * Get freeTaxAmount
   * @return freeTaxAmount
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getFreeTaxAmount() {
    return freeTaxAmount;
  }

  public void setFreeTaxAmount(Integer freeTaxAmount) {
    this.freeTaxAmount = freeTaxAmount;
  }

  public BenefitContentTemplateItemConfigItem freeTaxRatio(Integer freeTaxRatio) {
    this.freeTaxRatio = freeTaxRatio;
    return this;
  }

  /**
   * Get freeTaxRatio
   * @return freeTaxRatio
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getFreeTaxRatio() {
    return freeTaxRatio;
  }

  public void setFreeTaxRatio(Integer freeTaxRatio) {
    this.freeTaxRatio = freeTaxRatio;
  }

  public BenefitContentTemplateItemConfigItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "27", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BenefitContentTemplateItemConfigItem includeAdjustableItem(Boolean includeAdjustableItem) {
    this.includeAdjustableItem = includeAdjustableItem;
    return this;
  }

  /**
   * Get includeAdjustableItem
   * @return includeAdjustableItem
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIncludeAdjustableItem() {
    return includeAdjustableItem;
  }

  public void setIncludeAdjustableItem(Boolean includeAdjustableItem) {
    this.includeAdjustableItem = includeAdjustableItem;
  }

  public BenefitContentTemplateItemConfigItem invalidOn(String invalidOn) {
    this.invalidOn = invalidOn;
    return this;
  }

  /**
   * Get invalidOn
   * @return invalidOn
  **/
  @ApiModelProperty(example = "2018-07", value = "")
  
    public String getInvalidOn() {
    return invalidOn;
  }

  public void setInvalidOn(String invalidOn) {
    this.invalidOn = invalidOn;
  }

  public BenefitContentTemplateItemConfigItem openFreeTax(Boolean openFreeTax) {
    this.openFreeTax = openFreeTax;
    return this;
  }

  /**
   * Get openFreeTax
   * @return openFreeTax
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isOpenFreeTax() {
    return openFreeTax;
  }

  public void setOpenFreeTax(Boolean openFreeTax) {
    this.openFreeTax = openFreeTax;
  }

  public BenefitContentTemplateItemConfigItem personConfig(BenefitContentTemplateItemConfigItemPersonConfig personConfig) {
    this.personConfig = personConfig;
    return this;
  }

  /**
   * Get personConfig
   * @return personConfig
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemConfigItemPersonConfig getPersonConfig() {
    return personConfig;
  }

  public void setPersonConfig(BenefitContentTemplateItemConfigItemPersonConfig personConfig) {
    this.personConfig = personConfig;
  }

  public BenefitContentTemplateItemConfigItem remedialConfig(Object remedialConfig) {
    this.remedialConfig = remedialConfig;
    return this;
  }

  /**
   * Get remedialConfig
   * @return remedialConfig
  **/
  @ApiModelProperty(value = "")
  
    public Object getRemedialConfig() {
    return remedialConfig;
  }

  public void setRemedialConfig(Object remedialConfig) {
    this.remedialConfig = remedialConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentTemplateItemConfigItem benefitContentTemplateItemConfigItem = (BenefitContentTemplateItemConfigItem) o;
    return Objects.equals(this.companyConfig, benefitContentTemplateItemConfigItem.companyConfig) &&
        Objects.equals(this.effectiveOn, benefitContentTemplateItemConfigItem.effectiveOn) &&
        Objects.equals(this.enabled, benefitContentTemplateItemConfigItem.enabled) &&
        Objects.equals(this.freeTaxAmount, benefitContentTemplateItemConfigItem.freeTaxAmount) &&
        Objects.equals(this.freeTaxRatio, benefitContentTemplateItemConfigItem.freeTaxRatio) &&
        Objects.equals(this.id, benefitContentTemplateItemConfigItem.id) &&
        Objects.equals(this.includeAdjustableItem, benefitContentTemplateItemConfigItem.includeAdjustableItem) &&
        Objects.equals(this.invalidOn, benefitContentTemplateItemConfigItem.invalidOn) &&
        Objects.equals(this.openFreeTax, benefitContentTemplateItemConfigItem.openFreeTax) &&
        Objects.equals(this.personConfig, benefitContentTemplateItemConfigItem.personConfig) &&
        Objects.equals(this.remedialConfig, benefitContentTemplateItemConfigItem.remedialConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyConfig, effectiveOn, enabled, freeTaxAmount, freeTaxRatio, id, includeAdjustableItem, invalidOn, openFreeTax, personConfig, remedialConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentTemplateItemConfigItem {\n");
    
    sb.append("    companyConfig: ").append(toIndentedString(companyConfig)).append("\n");
    sb.append("    effectiveOn: ").append(toIndentedString(effectiveOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    freeTaxAmount: ").append(toIndentedString(freeTaxAmount)).append("\n");
    sb.append("    freeTaxRatio: ").append(toIndentedString(freeTaxRatio)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includeAdjustableItem: ").append(toIndentedString(includeAdjustableItem)).append("\n");
    sb.append("    invalidOn: ").append(toIndentedString(invalidOn)).append("\n");
    sb.append("    openFreeTax: ").append(toIndentedString(openFreeTax)).append("\n");
    sb.append("    personConfig: ").append(toIndentedString(personConfig)).append("\n");
    sb.append("    remedialConfig: ").append(toIndentedString(remedialConfig)).append("\n");
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
