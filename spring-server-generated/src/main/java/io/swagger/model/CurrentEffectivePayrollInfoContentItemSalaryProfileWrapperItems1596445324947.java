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
 * CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947   {
  @JsonProperty("v")
  private String v = null;

  public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 v(String v) {
    this.v = v;
    return this;
  }

  /**
   * Get v
   * @return v
  **/
  @ApiModelProperty(example = "1000", value = "")
  
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
    CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 = (CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947) o;
    return Objects.equals(this.v, currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 {\n");
    
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
