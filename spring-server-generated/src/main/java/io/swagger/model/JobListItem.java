package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PositionGradeList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JobListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class JobListItem   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jobCategoryId")
  private String jobCategoryId = null;

  @JsonProperty("jobCategoryName")
  private String jobCategoryName = null;

  @JsonProperty("jobTitleName")
  private String jobTitleName = null;

  @JsonProperty("maxPositionGradeId")
  private String maxPositionGradeId = null;

  @JsonProperty("maxPositionGradeName")
  private String maxPositionGradeName = null;

  @JsonProperty("minPositionGradeId")
  private String minPositionGradeId = null;

  @JsonProperty("minPostionGradeName")
  private String minPostionGradeName = null;

  @JsonProperty("positionGradeList")
  @Valid
  private List<PositionGradeList> positionGradeList = null;

  public JobListItem companyId(String companyId) {
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

  public JobListItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JobListItem id(String id) {
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

  public JobListItem jobCategoryId(String jobCategoryId) {
    this.jobCategoryId = jobCategoryId;
    return this;
  }

  /**
   * Get jobCategoryId
   * @return jobCategoryId
  **/
  @ApiModelProperty(value = "")
  
    public String getJobCategoryId() {
    return jobCategoryId;
  }

  public void setJobCategoryId(String jobCategoryId) {
    this.jobCategoryId = jobCategoryId;
  }

  public JobListItem jobCategoryName(String jobCategoryName) {
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

  public JobListItem jobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
    return this;
  }

  /**
   * Get jobTitleName
   * @return jobTitleName
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitleName() {
    return jobTitleName;
  }

  public void setJobTitleName(String jobTitleName) {
    this.jobTitleName = jobTitleName;
  }

  public JobListItem maxPositionGradeId(String maxPositionGradeId) {
    this.maxPositionGradeId = maxPositionGradeId;
    return this;
  }

  /**
   * Get maxPositionGradeId
   * @return maxPositionGradeId
  **/
  @ApiModelProperty(value = "")
  
    public String getMaxPositionGradeId() {
    return maxPositionGradeId;
  }

  public void setMaxPositionGradeId(String maxPositionGradeId) {
    this.maxPositionGradeId = maxPositionGradeId;
  }

  public JobListItem maxPositionGradeName(String maxPositionGradeName) {
    this.maxPositionGradeName = maxPositionGradeName;
    return this;
  }

  /**
   * Get maxPositionGradeName
   * @return maxPositionGradeName
  **/
  @ApiModelProperty(value = "")
  
    public String getMaxPositionGradeName() {
    return maxPositionGradeName;
  }

  public void setMaxPositionGradeName(String maxPositionGradeName) {
    this.maxPositionGradeName = maxPositionGradeName;
  }

  public JobListItem minPositionGradeId(String minPositionGradeId) {
    this.minPositionGradeId = minPositionGradeId;
    return this;
  }

  /**
   * Get minPositionGradeId
   * @return minPositionGradeId
  **/
  @ApiModelProperty(value = "")
  
    public String getMinPositionGradeId() {
    return minPositionGradeId;
  }

  public void setMinPositionGradeId(String minPositionGradeId) {
    this.minPositionGradeId = minPositionGradeId;
  }

  public JobListItem minPostionGradeName(String minPostionGradeName) {
    this.minPostionGradeName = minPostionGradeName;
    return this;
  }

  /**
   * Get minPostionGradeName
   * @return minPostionGradeName
  **/
  @ApiModelProperty(value = "")
  
    public String getMinPostionGradeName() {
    return minPostionGradeName;
  }

  public void setMinPostionGradeName(String minPostionGradeName) {
    this.minPostionGradeName = minPostionGradeName;
  }

  public JobListItem positionGradeList(List<PositionGradeList> positionGradeList) {
    this.positionGradeList = positionGradeList;
    return this;
  }

  public JobListItem addPositionGradeListItem(PositionGradeList positionGradeListItem) {
    if (this.positionGradeList == null) {
      this.positionGradeList = new ArrayList<PositionGradeList>();
    }
    this.positionGradeList.add(positionGradeListItem);
    return this;
  }

  /**
   * Get positionGradeList
   * @return positionGradeList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<PositionGradeList> getPositionGradeList() {
    return positionGradeList;
  }

  public void setPositionGradeList(List<PositionGradeList> positionGradeList) {
    this.positionGradeList = positionGradeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobListItem jobListItem = (JobListItem) o;
    return Objects.equals(this.companyId, jobListItem.companyId) &&
        Objects.equals(this.description, jobListItem.description) &&
        Objects.equals(this.id, jobListItem.id) &&
        Objects.equals(this.jobCategoryId, jobListItem.jobCategoryId) &&
        Objects.equals(this.jobCategoryName, jobListItem.jobCategoryName) &&
        Objects.equals(this.jobTitleName, jobListItem.jobTitleName) &&
        Objects.equals(this.maxPositionGradeId, jobListItem.maxPositionGradeId) &&
        Objects.equals(this.maxPositionGradeName, jobListItem.maxPositionGradeName) &&
        Objects.equals(this.minPositionGradeId, jobListItem.minPositionGradeId) &&
        Objects.equals(this.minPostionGradeName, jobListItem.minPostionGradeName) &&
        Objects.equals(this.positionGradeList, jobListItem.positionGradeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, description, id, jobCategoryId, jobCategoryName, jobTitleName, maxPositionGradeId, maxPositionGradeName, minPositionGradeId, minPostionGradeName, positionGradeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobListItem {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobCategoryId: ").append(toIndentedString(jobCategoryId)).append("\n");
    sb.append("    jobCategoryName: ").append(toIndentedString(jobCategoryName)).append("\n");
    sb.append("    jobTitleName: ").append(toIndentedString(jobTitleName)).append("\n");
    sb.append("    maxPositionGradeId: ").append(toIndentedString(maxPositionGradeId)).append("\n");
    sb.append("    maxPositionGradeName: ").append(toIndentedString(maxPositionGradeName)).append("\n");
    sb.append("    minPositionGradeId: ").append(toIndentedString(minPositionGradeId)).append("\n");
    sb.append("    minPostionGradeName: ").append(toIndentedString(minPostionGradeName)).append("\n");
    sb.append("    positionGradeList: ").append(toIndentedString(positionGradeList)).append("\n");
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
