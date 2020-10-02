package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiMemberPlanListContentItemSiCompanyBenefit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SiMemberPlanListContentItemSiCompanyBenefit   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("payDepartmentId")
  private String payDepartmentId = null;

  @JsonProperty("payDepartmentName")
  private String payDepartmentName = null;

  public SiMemberPlanListContentItemSiCompanyBenefit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "329482487287775232", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SiMemberPlanListContentItemSiCompanyBenefit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "北京市-社保", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SiMemberPlanListContentItemSiCompanyBenefit payDepartmentId(String payDepartmentId) {
    this.payDepartmentId = payDepartmentId;
    return this;
  }

  /**
   * Get payDepartmentId
   * @return payDepartmentId
  **/
  @ApiModelProperty(example = "d2822608-d5f4-47dd-9776-9ae2f24c9993", value = "")
  
    public String getPayDepartmentId() {
    return payDepartmentId;
  }

  public void setPayDepartmentId(String payDepartmentId) {
    this.payDepartmentId = payDepartmentId;
  }

  public SiMemberPlanListContentItemSiCompanyBenefit payDepartmentName(String payDepartmentName) {
    this.payDepartmentName = payDepartmentName;
    return this;
  }

  /**
   * Get payDepartmentName
   * @return payDepartmentName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getPayDepartmentName() {
    return payDepartmentName;
  }

  public void setPayDepartmentName(String payDepartmentName) {
    this.payDepartmentName = payDepartmentName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiMemberPlanListContentItemSiCompanyBenefit siMemberPlanListContentItemSiCompanyBenefit = (SiMemberPlanListContentItemSiCompanyBenefit) o;
    return Objects.equals(this.id, siMemberPlanListContentItemSiCompanyBenefit.id) &&
        Objects.equals(this.name, siMemberPlanListContentItemSiCompanyBenefit.name) &&
        Objects.equals(this.payDepartmentId, siMemberPlanListContentItemSiCompanyBenefit.payDepartmentId) &&
        Objects.equals(this.payDepartmentName, siMemberPlanListContentItemSiCompanyBenefit.payDepartmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, payDepartmentId, payDepartmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiMemberPlanListContentItemSiCompanyBenefit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payDepartmentId: ").append(toIndentedString(payDepartmentId)).append("\n");
    sb.append("    payDepartmentName: ").append(toIndentedString(payDepartmentName)).append("\n");
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
