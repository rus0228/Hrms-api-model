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
 * CategoryList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CategoryList   {
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

  public CategoryList categoryContainGrade(Object categoryContainGrade) {
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

  public CategoryList companyId(String companyId) {
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

  public CategoryList createdDate(OffsetDateTime createdDate) {
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

  public CategoryList id(String id) {
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

  public CategoryList jobCategoryName(String jobCategoryName) {
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
    CategoryList categoryList = (CategoryList) o;
    return Objects.equals(this.categoryContainGrade, categoryList.categoryContainGrade) &&
        Objects.equals(this.companyId, categoryList.companyId) &&
        Objects.equals(this.createdDate, categoryList.createdDate) &&
        Objects.equals(this.id, categoryList.id) &&
        Objects.equals(this.jobCategoryName, categoryList.jobCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryContainGrade, companyId, createdDate, id, jobCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryList {\n");
    
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
