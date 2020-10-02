package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitContentDataItemCategory;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentTemplateItemType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentTemplateItemType   {
  @JsonProperty("category")
  private BenefitContentDataItemCategory category = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("companyCustom")
  private Boolean companyCustom = null;

  @JsonProperty("effectiveAt")
  private String effectiveAt = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("id")
  private Boolean id = null;

  @JsonProperty("invalidAt")
  private Boolean invalidAt = null;

  @JsonProperty("name")
  private String name = null;

  public BenefitContentTemplateItemType category(BenefitContentDataItemCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentDataItemCategory getCategory() {
    return category;
  }

  public void setCategory(BenefitContentDataItemCategory category) {
    this.category = category;
  }

  public BenefitContentTemplateItemType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "SI_TYPE_0001", value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BenefitContentTemplateItemType companyCustom(Boolean companyCustom) {
    this.companyCustom = companyCustom;
    return this;
  }

  /**
   * Get companyCustom
   * @return companyCustom
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isCompanyCustom() {
    return companyCustom;
  }

  public void setCompanyCustom(Boolean companyCustom) {
    this.companyCustom = companyCustom;
  }

  public BenefitContentTemplateItemType effectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

  /**
   * Get effectiveAt
   * @return effectiveAt
  **/
  @ApiModelProperty(example = "2000-01", value = "")
  
    public String getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(String effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public BenefitContentTemplateItemType enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BenefitContentTemplateItemType id(Boolean id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isId() {
    return id;
  }

  public void setId(Boolean id) {
    this.id = id;
  }

  public BenefitContentTemplateItemType invalidAt(Boolean invalidAt) {
    this.invalidAt = invalidAt;
    return this;
  }

  /**
   * Get invalidAt
   * @return invalidAt
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isInvalidAt() {
    return invalidAt;
  }

  public void setInvalidAt(Boolean invalidAt) {
    this.invalidAt = invalidAt;
  }

  public BenefitContentTemplateItemType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Pension insurance", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentTemplateItemType benefitContentTemplateItemType = (BenefitContentTemplateItemType) o;
    return Objects.equals(this.category, benefitContentTemplateItemType.category) &&
        Objects.equals(this.code, benefitContentTemplateItemType.code) &&
        Objects.equals(this.companyCustom, benefitContentTemplateItemType.companyCustom) &&
        Objects.equals(this.effectiveAt, benefitContentTemplateItemType.effectiveAt) &&
        Objects.equals(this.enabled, benefitContentTemplateItemType.enabled) &&
        Objects.equals(this.id, benefitContentTemplateItemType.id) &&
        Objects.equals(this.invalidAt, benefitContentTemplateItemType.invalidAt) &&
        Objects.equals(this.name, benefitContentTemplateItemType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, companyCustom, effectiveAt, enabled, id, invalidAt, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentTemplateItemType {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    companyCustom: ").append(toIndentedString(companyCustom)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invalidAt: ").append(toIndentedString(invalidAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
