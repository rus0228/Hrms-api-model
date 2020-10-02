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
 * CompanyPositionItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyPositionItem   {
  @JsonProperty("appliedRange")
  private String appliedRange = null;

  @JsonProperty("capacity")
  private Long capacity = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("departmentId")
  private Long departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isPositionGroup")
  private Boolean isPositionGroup = true;

  @JsonProperty("jobTitleId")
  private String jobTitleId = null;

  @JsonProperty("jonTitleName")
  private String jonTitleName = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("positionCode")
  private String positionCode = null;

  @JsonProperty("positionGradeId")
  private String positionGradeId = null;

  @JsonProperty("positionGradeName")
  private String positionGradeName = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("qualifications")
  private Object qualifications = null;

  public CompanyPositionItem appliedRange(String appliedRange) {
    this.appliedRange = appliedRange;
    return this;
  }

  /**
   * Get appliedRange
   * @return appliedRange
  **/
  @ApiModelProperty(value = "")
  
    public String getAppliedRange() {
    return appliedRange;
  }

  public void setAppliedRange(String appliedRange) {
    this.appliedRange = appliedRange;
  }

  public CompanyPositionItem capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  
    public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public CompanyPositionItem companyId(String companyId) {
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

  public CompanyPositionItem departmentId(Long departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(value = "")
  
    public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }

  public CompanyPositionItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public CompanyPositionItem description(String description) {
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

  public CompanyPositionItem id(String id) {
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

  public CompanyPositionItem isPositionGroup(Boolean isPositionGroup) {
    this.isPositionGroup = isPositionGroup;
    return this;
  }

  /**
   * Get isPositionGroup
   * @return isPositionGroup
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsPositionGroup() {
    return isPositionGroup;
  }

  public void setIsPositionGroup(Boolean isPositionGroup) {
    this.isPositionGroup = isPositionGroup;
  }

  public CompanyPositionItem jobTitleId(String jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Get jobTitleId
   * @return jobTitleId
  **/
  @ApiModelProperty(value = "")
  
    public String getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(String jobTitleId) {
    this.jobTitleId = jobTitleId;
  }

  public CompanyPositionItem jonTitleName(String jonTitleName) {
    this.jonTitleName = jonTitleName;
    return this;
  }

  /**
   * Get jonTitleName
   * @return jonTitleName
  **/
  @ApiModelProperty(value = "")
  
    public String getJonTitleName() {
    return jonTitleName;
  }

  public void setJonTitleName(String jonTitleName) {
    this.jonTitleName = jonTitleName;
  }

  public CompanyPositionItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  
    public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CompanyPositionItem positionCode(String positionCode) {
    this.positionCode = positionCode;
    return this;
  }

  /**
   * Get positionCode
   * @return positionCode
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionCode() {
    return positionCode;
  }

  public void setPositionCode(String positionCode) {
    this.positionCode = positionCode;
  }

  public CompanyPositionItem positionGradeId(String positionGradeId) {
    this.positionGradeId = positionGradeId;
    return this;
  }

  /**
   * Get positionGradeId
   * @return positionGradeId
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionGradeId() {
    return positionGradeId;
  }

  public void setPositionGradeId(String positionGradeId) {
    this.positionGradeId = positionGradeId;
  }

  public CompanyPositionItem positionGradeName(String positionGradeName) {
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

  public CompanyPositionItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public CompanyPositionItem qualifications(Object qualifications) {
    this.qualifications = qualifications;
    return this;
  }

  /**
   * Get qualifications
   * @return qualifications
  **/
  @ApiModelProperty(value = "")
  
    public Object getQualifications() {
    return qualifications;
  }

  public void setQualifications(Object qualifications) {
    this.qualifications = qualifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPositionItem companyPositionItem = (CompanyPositionItem) o;
    return Objects.equals(this.appliedRange, companyPositionItem.appliedRange) &&
        Objects.equals(this.capacity, companyPositionItem.capacity) &&
        Objects.equals(this.companyId, companyPositionItem.companyId) &&
        Objects.equals(this.departmentId, companyPositionItem.departmentId) &&
        Objects.equals(this.departmentName, companyPositionItem.departmentName) &&
        Objects.equals(this.description, companyPositionItem.description) &&
        Objects.equals(this.id, companyPositionItem.id) &&
        Objects.equals(this.isPositionGroup, companyPositionItem.isPositionGroup) &&
        Objects.equals(this.jobTitleId, companyPositionItem.jobTitleId) &&
        Objects.equals(this.jonTitleName, companyPositionItem.jonTitleName) &&
        Objects.equals(this.parentId, companyPositionItem.parentId) &&
        Objects.equals(this.positionCode, companyPositionItem.positionCode) &&
        Objects.equals(this.positionGradeId, companyPositionItem.positionGradeId) &&
        Objects.equals(this.positionGradeName, companyPositionItem.positionGradeName) &&
        Objects.equals(this.positionName, companyPositionItem.positionName) &&
        Objects.equals(this.qualifications, companyPositionItem.qualifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedRange, capacity, companyId, departmentId, departmentName, description, id, isPositionGroup, jobTitleId, jonTitleName, parentId, positionCode, positionGradeId, positionGradeName, positionName, qualifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPositionItem {\n");
    
    sb.append("    appliedRange: ").append(toIndentedString(appliedRange)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPositionGroup: ").append(toIndentedString(isPositionGroup)).append("\n");
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
    sb.append("    jonTitleName: ").append(toIndentedString(jonTitleName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    positionCode: ").append(toIndentedString(positionCode)).append("\n");
    sb.append("    positionGradeId: ").append(toIndentedString(positionGradeId)).append("\n");
    sb.append("    positionGradeName: ").append(toIndentedString(positionGradeName)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
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
