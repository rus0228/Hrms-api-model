package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkExperienceFormFlexAttributesCompanyName;
import io.swagger.model.WorkExperienceFormFlexAttributesId;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkExperienceFormFlexAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class WorkExperienceFormFlexAttributes   {
  @JsonProperty("companyName")
  private WorkExperienceFormFlexAttributesCompanyName companyName = null;

  @JsonProperty("enrollDate")
  private WorkExperienceFormFlexAttributesCompanyName enrollDate = null;

  @JsonProperty("id")
  private WorkExperienceFormFlexAttributesId id = null;

  @JsonProperty("jobDescription")
  private WorkExperienceFormFlexAttributesCompanyName jobDescription = null;

  @JsonProperty("jobTitle")
  private WorkExperienceFormFlexAttributesCompanyName jobTitle = null;

  @JsonProperty("quiteDate")
  private WorkExperienceFormFlexAttributesCompanyName quiteDate = null;

  @JsonProperty("staffId")
  private WorkExperienceFormFlexAttributesId staffId = null;

  public WorkExperienceFormFlexAttributes companyName(WorkExperienceFormFlexAttributesCompanyName companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesCompanyName getCompanyName() {
    return companyName;
  }

  public void setCompanyName(WorkExperienceFormFlexAttributesCompanyName companyName) {
    this.companyName = companyName;
  }

  public WorkExperienceFormFlexAttributes enrollDate(WorkExperienceFormFlexAttributesCompanyName enrollDate) {
    this.enrollDate = enrollDate;
    return this;
  }

  /**
   * Get enrollDate
   * @return enrollDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesCompanyName getEnrollDate() {
    return enrollDate;
  }

  public void setEnrollDate(WorkExperienceFormFlexAttributesCompanyName enrollDate) {
    this.enrollDate = enrollDate;
  }

  public WorkExperienceFormFlexAttributes id(WorkExperienceFormFlexAttributesId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesId getId() {
    return id;
  }

  public void setId(WorkExperienceFormFlexAttributesId id) {
    this.id = id;
  }

  public WorkExperienceFormFlexAttributes jobDescription(WorkExperienceFormFlexAttributesCompanyName jobDescription) {
    this.jobDescription = jobDescription;
    return this;
  }

  /**
   * Get jobDescription
   * @return jobDescription
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesCompanyName getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(WorkExperienceFormFlexAttributesCompanyName jobDescription) {
    this.jobDescription = jobDescription;
  }

  public WorkExperienceFormFlexAttributes jobTitle(WorkExperienceFormFlexAttributesCompanyName jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesCompanyName getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(WorkExperienceFormFlexAttributesCompanyName jobTitle) {
    this.jobTitle = jobTitle;
  }

  public WorkExperienceFormFlexAttributes quiteDate(WorkExperienceFormFlexAttributesCompanyName quiteDate) {
    this.quiteDate = quiteDate;
    return this;
  }

  /**
   * Get quiteDate
   * @return quiteDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesCompanyName getQuiteDate() {
    return quiteDate;
  }

  public void setQuiteDate(WorkExperienceFormFlexAttributesCompanyName quiteDate) {
    this.quiteDate = quiteDate;
  }

  public WorkExperienceFormFlexAttributes staffId(WorkExperienceFormFlexAttributesId staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributesId getStaffId() {
    return staffId;
  }

  public void setStaffId(WorkExperienceFormFlexAttributesId staffId) {
    this.staffId = staffId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkExperienceFormFlexAttributes workExperienceFormFlexAttributes = (WorkExperienceFormFlexAttributes) o;
    return Objects.equals(this.companyName, workExperienceFormFlexAttributes.companyName) &&
        Objects.equals(this.enrollDate, workExperienceFormFlexAttributes.enrollDate) &&
        Objects.equals(this.id, workExperienceFormFlexAttributes.id) &&
        Objects.equals(this.jobDescription, workExperienceFormFlexAttributes.jobDescription) &&
        Objects.equals(this.jobTitle, workExperienceFormFlexAttributes.jobTitle) &&
        Objects.equals(this.quiteDate, workExperienceFormFlexAttributes.quiteDate) &&
        Objects.equals(this.staffId, workExperienceFormFlexAttributes.staffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, enrollDate, id, jobDescription, jobTitle, quiteDate, staffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkExperienceFormFlexAttributes {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    enrollDate: ").append(toIndentedString(enrollDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    quiteDate: ").append(toIndentedString(quiteDate)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
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
