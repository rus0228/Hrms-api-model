package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkExperienceFormFlexAttributes;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkExperience
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class WorkExperience   {
  @JsonProperty("formFlexAttributes")
  private WorkExperienceFormFlexAttributes formFlexAttributes = null;

  @JsonProperty("staffId")
  private String staffId = null;

  public WorkExperience formFlexAttributes(WorkExperienceFormFlexAttributes formFlexAttributes) {
    this.formFlexAttributes = formFlexAttributes;
    return this;
  }

  /**
   * Get formFlexAttributes
   * @return formFlexAttributes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public WorkExperienceFormFlexAttributes getFormFlexAttributes() {
    return formFlexAttributes;
  }

  public void setFormFlexAttributes(WorkExperienceFormFlexAttributes formFlexAttributes) {
    this.formFlexAttributes = formFlexAttributes;
  }

  public WorkExperience staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
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
    WorkExperience workExperience = (WorkExperience) o;
    return Objects.equals(this.formFlexAttributes, workExperience.formFlexAttributes) &&
        Objects.equals(this.staffId, workExperience.staffId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formFlexAttributes, staffId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkExperience {\n");
    
    sb.append("    formFlexAttributes: ").append(toIndentedString(formFlexAttributes)).append("\n");
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
