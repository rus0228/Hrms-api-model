package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BenefitContentTemplateItemConfigItem;
import io.swagger.model.BenefitContentTemplateItemType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentTemplateItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentTemplateItem   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("configs")
  @Valid
  private List<BenefitContentTemplateItemConfigItem> configs = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private BenefitContentTemplateItemType type = null;

  public BenefitContentTemplateItem code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "0023", value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BenefitContentTemplateItem configs(List<BenefitContentTemplateItemConfigItem> configs) {
    this.configs = configs;
    return this;
  }

  public BenefitContentTemplateItem addConfigsItem(BenefitContentTemplateItemConfigItem configsItem) {
    if (this.configs == null) {
      this.configs = new ArrayList<BenefitContentTemplateItemConfigItem>();
    }
    this.configs.add(configsItem);
    return this;
  }

  /**
   * Get configs
   * @return configs
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<BenefitContentTemplateItemConfigItem> getConfigs() {
    return configs;
  }

  public void setConfigs(List<BenefitContentTemplateItemConfigItem> configs) {
    this.configs = configs;
  }

  public BenefitContentTemplateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BenefitContentTemplateItem type(BenefitContentTemplateItemType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BenefitContentTemplateItemType getType() {
    return type;
  }

  public void setType(BenefitContentTemplateItemType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentTemplateItem benefitContentTemplateItem = (BenefitContentTemplateItem) o;
    return Objects.equals(this.code, benefitContentTemplateItem.code) &&
        Objects.equals(this.configs, benefitContentTemplateItem.configs) &&
        Objects.equals(this.id, benefitContentTemplateItem.id) &&
        Objects.equals(this.type, benefitContentTemplateItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, configs, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentTemplateItem {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
