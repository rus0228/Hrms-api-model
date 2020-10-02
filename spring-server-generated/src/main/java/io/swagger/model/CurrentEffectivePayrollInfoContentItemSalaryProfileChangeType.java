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
 * CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  public CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "PROBATION_REVIEW", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "转正", value = "")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType currentEffectivePayrollInfoContentItemSalaryProfileChangeType = (CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType) o;
    return Objects.equals(this.id, currentEffectivePayrollInfoContentItemSalaryProfileChangeType.id) &&
        Objects.equals(this.title, currentEffectivePayrollInfoContentItemSalaryProfileChangeType.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
