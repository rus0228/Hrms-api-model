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
 * SubDataForPositionGradeList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SubDataForPositionGradeList   {
  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jobCategoryId")
  private String jobCategoryId = null;

  @JsonProperty("jobCategoryName")
  private String jobCategoryName = null;

  @JsonProperty("positionGradeName")
  private String positionGradeName = null;

  @JsonProperty("positionGradeNum")
  private Long positionGradeNum = null;

  public SubDataForPositionGradeList companyId(String companyId) {
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

  public SubDataForPositionGradeList id(String id) {
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

  public SubDataForPositionGradeList jobCategoryId(String jobCategoryId) {
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

  public SubDataForPositionGradeList jobCategoryName(String jobCategoryName) {
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

  public SubDataForPositionGradeList positionGradeName(String positionGradeName) {
    this.positionGradeName = positionGradeName;
    return this;
  }

  /**
   * Get positionGradeName
   * @return positionGradeName
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionGradeName() {
    return positionGradeName;
  }

  public void setPositionGradeName(String positionGradeName) {
    this.positionGradeName = positionGradeName;
  }

  public SubDataForPositionGradeList positionGradeNum(Long positionGradeNum) {
    this.positionGradeNum = positionGradeNum;
    return this;
  }

  /**
   * Get positionGradeNum
   * @return positionGradeNum
  **/
  @ApiModelProperty(value = "")
  
    public Long getPositionGradeNum() {
    return positionGradeNum;
  }

  public void setPositionGradeNum(Long positionGradeNum) {
    this.positionGradeNum = positionGradeNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubDataForPositionGradeList subDataForPositionGradeList = (SubDataForPositionGradeList) o;
    return Objects.equals(this.companyId, subDataForPositionGradeList.companyId) &&
        Objects.equals(this.id, subDataForPositionGradeList.id) &&
        Objects.equals(this.jobCategoryId, subDataForPositionGradeList.jobCategoryId) &&
        Objects.equals(this.jobCategoryName, subDataForPositionGradeList.jobCategoryName) &&
        Objects.equals(this.positionGradeName, subDataForPositionGradeList.positionGradeName) &&
        Objects.equals(this.positionGradeNum, subDataForPositionGradeList.positionGradeNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, id, jobCategoryId, jobCategoryName, positionGradeName, positionGradeNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubDataForPositionGradeList {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobCategoryId: ").append(toIndentedString(jobCategoryId)).append("\n");
    sb.append("    jobCategoryName: ").append(toIndentedString(jobCategoryName)).append("\n");
    sb.append("    positionGradeName: ").append(toIndentedString(positionGradeName)).append("\n");
    sb.append("    positionGradeNum: ").append(toIndentedString(positionGradeNum)).append("\n");
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
