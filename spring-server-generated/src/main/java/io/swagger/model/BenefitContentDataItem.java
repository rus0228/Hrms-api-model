package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitContentDataItemCategory;
import io.swagger.model.BenefitContentDataItemDivision;
import io.swagger.model.BenefitContentDataItemMode;
import io.swagger.model.BenefitContentTemplateItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentDataItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentDataItem   {
  @JsonProperty("category")
  private BenefitContentDataItemCategory category = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("division")
  private BenefitContentDataItemDivision division = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mode")
  private BenefitContentDataItemMode mode = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("templates")
  @Valid
  private List<BenefitContentTemplateItem> templates = null;

  public BenefitContentDataItem category(BenefitContentDataItemCategory category) {
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

  public BenefitContentDataItem code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "SI_LCT_TYPE_0007", value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BenefitContentDataItem division(BenefitContentDataItemDivision division) {
    this.division = division;
    return this;
  }

  /**
   * Get division
   * @return division
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentDataItemDivision getDivision() {
    return division;
  }

  public void setDivision(BenefitContentDataItemDivision division) {
    this.division = division;
  }

  public BenefitContentDataItem enabled(Boolean enabled) {
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

  public BenefitContentDataItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "82", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BenefitContentDataItem mode(BenefitContentDataItemMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentDataItemMode getMode() {
    return mode;
  }

  public void setMode(BenefitContentDataItemMode mode) {
    this.mode = mode;
  }

  public BenefitContentDataItem remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(example = "remark", value = "")
  
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public BenefitContentDataItem templates(List<BenefitContentTemplateItem> templates) {
    this.templates = templates;
    return this;
  }

  public BenefitContentDataItem addTemplatesItem(BenefitContentTemplateItem templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<BenefitContentTemplateItem>();
    }
    this.templates.add(templatesItem);
    return this;
  }

  /**
   * Get templates
   * @return templates
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<BenefitContentTemplateItem> getTemplates() {
    return templates;
  }

  public void setTemplates(List<BenefitContentTemplateItem> templates) {
    this.templates = templates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentDataItem benefitContentDataItem = (BenefitContentDataItem) o;
    return Objects.equals(this.category, benefitContentDataItem.category) &&
        Objects.equals(this.code, benefitContentDataItem.code) &&
        Objects.equals(this.division, benefitContentDataItem.division) &&
        Objects.equals(this.enabled, benefitContentDataItem.enabled) &&
        Objects.equals(this.id, benefitContentDataItem.id) &&
        Objects.equals(this.mode, benefitContentDataItem.mode) &&
        Objects.equals(this.remark, benefitContentDataItem.remark) &&
        Objects.equals(this.templates, benefitContentDataItem.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, division, enabled, id, mode, remark, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentDataItem {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
