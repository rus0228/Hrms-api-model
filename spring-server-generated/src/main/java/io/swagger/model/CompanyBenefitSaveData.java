package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyBenefitSaveDataGroup;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyBenefitSaveData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyBenefitSaveData   {
  @JsonProperty("companyConfigs")
  private Object companyConfigs = null;

  @JsonProperty("group")
  private CompanyBenefitSaveDataGroup group = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("strategy")
  private String strategy = null;

  public CompanyBenefitSaveData companyConfigs(Object companyConfigs) {
    this.companyConfigs = companyConfigs;
    return this;
  }

  /**
   * Get companyConfigs
   * @return companyConfigs
  **/
  @ApiModelProperty(value = "")
  
    public Object getCompanyConfigs() {
    return companyConfigs;
  }

  public void setCompanyConfigs(Object companyConfigs) {
    this.companyConfigs = companyConfigs;
  }

  public CompanyBenefitSaveData group(CompanyBenefitSaveDataGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyBenefitSaveDataGroup getGroup() {
    return group;
  }

  public void setGroup(CompanyBenefitSaveDataGroup group) {
    this.group = group;
  }

  public CompanyBenefitSaveData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "赣州市-社保", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanyBenefitSaveData strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(example = "CURRENT", value = "")
  
    public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyBenefitSaveData companyBenefitSaveData = (CompanyBenefitSaveData) o;
    return Objects.equals(this.companyConfigs, companyBenefitSaveData.companyConfigs) &&
        Objects.equals(this.group, companyBenefitSaveData.group) &&
        Objects.equals(this.name, companyBenefitSaveData.name) &&
        Objects.equals(this.strategy, companyBenefitSaveData.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyConfigs, group, name, strategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyBenefitSaveData {\n");
    
    sb.append("    companyConfigs: ").append(toIndentedString(companyConfigs)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
