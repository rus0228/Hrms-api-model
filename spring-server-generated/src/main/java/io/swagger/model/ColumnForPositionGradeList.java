package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColumnForPositionGradeList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ColumnForPositionGradeList   {
  @JsonProperty("categoryContainGrade")
  private Object categoryContainGrade = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jobCategoryName")
  private String jobCategoryName = null;

  public ColumnForPositionGradeList categoryContainGrade(Object categoryContainGrade) {
    this.categoryContainGrade = categoryContainGrade;
    return this;
  }

  /**
   * Get categoryContainGrade
   * @return categoryContainGrade
  **/
  @ApiModelProperty(value = "")
  
    public Object getCategoryContainGrade() {
    return categoryContainGrade;
  }

  public void setCategoryContainGrade(Object categoryContainGrade) {
    this.categoryContainGrade = categoryContainGrade;
  }

  public ColumnForPositionGradeList companyId(String companyId) {
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

  public ColumnForPositionGradeList createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ColumnForPositionGradeList id(String id) {
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

  public ColumnForPositionGradeList jobCategoryName(String jobCategoryName) {
    this.jobCategoryName = jobCategoryName;
    return this;
  }

  /**
   * Get jobCategoryName
   * @return jobCategoryName
  **/
  @ApiModelProperty(value = "")
  
    public String getJobCategoryName() {
    return jobCategoryName;
  }

  public void setJobCategoryName(String jobCategoryName) {
    this.jobCategoryName = jobCategoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnForPositionGradeList columnForPositionGradeList = (ColumnForPositionGradeList) o;
    return Objects.equals(this.categoryContainGrade, columnForPositionGradeList.categoryContainGrade) &&
        Objects.equals(this.companyId, columnForPositionGradeList.companyId) &&
        Objects.equals(this.createdDate, columnForPositionGradeList.createdDate) &&
        Objects.equals(this.id, columnForPositionGradeList.id) &&
        Objects.equals(this.jobCategoryName, columnForPositionGradeList.jobCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryContainGrade, companyId, createdDate, id, jobCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnForPositionGradeList {\n");
    
    sb.append("    categoryContainGrade: ").append(toIndentedString(categoryContainGrade)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobCategoryName: ").append(toIndentedString(jobCategoryName)).append("\n");
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
