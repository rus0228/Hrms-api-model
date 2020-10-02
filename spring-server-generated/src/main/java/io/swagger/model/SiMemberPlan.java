package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SiMemberPlanSpecification;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiMemberPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SiMemberPlan   {
  @JsonProperty("insuranceType")
  private String insuranceType = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("siType")
  private Boolean siType = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("specification")
  private SiMemberPlanSpecification specification = null;

  @JsonProperty("year")
  private Integer year = null;

  public SiMemberPlan insuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
    return this;
  }

  /**
   * Get insuranceType
   * @return insuranceType
  **/
  @ApiModelProperty(example = "increase", value = "")
  
    public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }

  public SiMemberPlan month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "7", value = "")
  
    public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public SiMemberPlan page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SiMemberPlan siType(Boolean siType) {
    this.siType = siType;
    return this;
  }

  /**
   * Get siType
   * @return siType
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isSiType() {
    return siType;
  }

  public void setSiType(Boolean siType) {
    this.siType = siType;
  }

  public SiMemberPlan size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "10", value = "")
  
    public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SiMemberPlan specification(SiMemberPlanSpecification specification) {
    this.specification = specification;
    return this;
  }

  /**
   * Get specification
   * @return specification
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SiMemberPlanSpecification getSpecification() {
    return specification;
  }

  public void setSpecification(SiMemberPlanSpecification specification) {
    this.specification = specification;
  }

  public SiMemberPlan year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(example = "2020", value = "")
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiMemberPlan siMemberPlan = (SiMemberPlan) o;
    return Objects.equals(this.insuranceType, siMemberPlan.insuranceType) &&
        Objects.equals(this.month, siMemberPlan.month) &&
        Objects.equals(this.page, siMemberPlan.page) &&
        Objects.equals(this.siType, siMemberPlan.siType) &&
        Objects.equals(this.size, siMemberPlan.size) &&
        Objects.equals(this.specification, siMemberPlan.specification) &&
        Objects.equals(this.year, siMemberPlan.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insuranceType, month, page, siType, size, specification, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiMemberPlan {\n");
    
    sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    siType: ").append(toIndentedString(siType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
