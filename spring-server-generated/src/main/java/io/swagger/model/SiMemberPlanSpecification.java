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
 * SiMemberPlanSpecification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SiMemberPlanSpecification   {
  @JsonProperty("predications")
  private Object predications = null;

  public SiMemberPlanSpecification predications(Object predications) {
    this.predications = predications;
    return this;
  }

  /**
   * Get predications
   * @return predications
  **/
  @ApiModelProperty(example = "{}", value = "")
  
    public Object getPredications() {
    return predications;
  }

  public void setPredications(Object predications) {
    this.predications = predications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiMemberPlanSpecification siMemberPlanSpecification = (SiMemberPlanSpecification) o;
    return Objects.equals(this.predications, siMemberPlanSpecification.predications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiMemberPlanSpecification {\n");
    
    sb.append("    predications: ").append(toIndentedString(predications)).append("\n");
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
