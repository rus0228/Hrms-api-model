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
 * CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary   {
  @JsonProperty("v")
  private String v = null;

  public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary v(String v) {
    this.v = v;
    return this;
  }

  /**
   * Get v
   * @return v
  **/
  @ApiModelProperty(example = "2000", value = "")
  
    public String getV() {
    return v;
  }

  public void setV(String v) {
    this.v = v;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary currentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary = (CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary) o;
    return Objects.equals(this.v, currentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary {\n");
    
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
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
