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
 * SavedCompanyBenefitDataDataPage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SavedCompanyBenefitDataDataPage   {
  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public SavedCompanyBenefitDataDataPage number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public SavedCompanyBenefitDataDataPage size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "50", value = "")
  
    public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SavedCompanyBenefitDataDataPage totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "7", value = "")
  
    public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public SavedCompanyBenefitDataDataPage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedCompanyBenefitDataDataPage savedCompanyBenefitDataDataPage = (SavedCompanyBenefitDataDataPage) o;
    return Objects.equals(this.number, savedCompanyBenefitDataDataPage.number) &&
        Objects.equals(this.size, savedCompanyBenefitDataDataPage.size) &&
        Objects.equals(this.totalElements, savedCompanyBenefitDataDataPage.totalElements) &&
        Objects.equals(this.totalPages, savedCompanyBenefitDataDataPage.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, size, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCompanyBenefitDataDataPage {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
