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
 * DataForPositionGradeListGradeSalaryEntity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class DataForPositionGradeListGradeSalaryEntity   {
  @JsonProperty("coefficientLower")
  private Float coefficientLower = null;

  @JsonProperty("coefficientUpper")
  private Long coefficientUpper = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("id")
  private String id = null;

  public DataForPositionGradeListGradeSalaryEntity coefficientLower(Float coefficientLower) {
    this.coefficientLower = coefficientLower;
    return this;
  }

  /**
   * Get coefficientLower
   * @return coefficientLower
  **/
  @ApiModelProperty(value = "")
  
    public Float getCoefficientLower() {
    return coefficientLower;
  }

  public void setCoefficientLower(Float coefficientLower) {
    this.coefficientLower = coefficientLower;
  }

  public DataForPositionGradeListGradeSalaryEntity coefficientUpper(Long coefficientUpper) {
    this.coefficientUpper = coefficientUpper;
    return this;
  }

  /**
   * Get coefficientUpper
   * @return coefficientUpper
  **/
  @ApiModelProperty(value = "")
  
    public Long getCoefficientUpper() {
    return coefficientUpper;
  }

  public void setCoefficientUpper(Long coefficientUpper) {
    this.coefficientUpper = coefficientUpper;
  }

  public DataForPositionGradeListGradeSalaryEntity companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public DataForPositionGradeListGradeSalaryEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForPositionGradeListGradeSalaryEntity dataForPositionGradeListGradeSalaryEntity = (DataForPositionGradeListGradeSalaryEntity) o;
    return Objects.equals(this.coefficientLower, dataForPositionGradeListGradeSalaryEntity.coefficientLower) &&
        Objects.equals(this.coefficientUpper, dataForPositionGradeListGradeSalaryEntity.coefficientUpper) &&
        Objects.equals(this.companyId, dataForPositionGradeListGradeSalaryEntity.companyId) &&
        Objects.equals(this.id, dataForPositionGradeListGradeSalaryEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coefficientLower, coefficientUpper, companyId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForPositionGradeListGradeSalaryEntity {\n");
    
    sb.append("    coefficientLower: ").append(toIndentedString(coefficientLower)).append("\n");
    sb.append("    coefficientUpper: ").append(toIndentedString(coefficientUpper)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
