package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsBasesalary;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems   {
  @JsonProperty("basesalary")
  private CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsBasesalary basesalary = null;

  @JsonProperty("positionsalary")
  private CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary positionsalary = null;

  @JsonProperty("绩效工资1596445324947")
  private CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 _1596445324947 = null;

  public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems basesalary(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsBasesalary basesalary) {
    this.basesalary = basesalary;
    return this;
  }

  /**
   * Get basesalary
   * @return basesalary
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsBasesalary getBasesalary() {
    return basesalary;
  }

  public void setBasesalary(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsBasesalary basesalary) {
    this.basesalary = basesalary;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems positionsalary(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary positionsalary) {
    this.positionsalary = positionsalary;
    return this;
  }

  /**
   * Get positionsalary
   * @return positionsalary
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary getPositionsalary() {
    return positionsalary;
  }

  public void setPositionsalary(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItemsPositionsalary positionsalary) {
    this.positionsalary = positionsalary;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems _1596445324947(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 _1596445324947) {
    this._1596445324947 = _1596445324947;
    return this;
  }

  /**
   * Get _1596445324947
   * @return _1596445324947
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 get1596445324947() {
    return _1596445324947;
  }

  public void set1596445324947(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems1596445324947 _1596445324947) {
    this._1596445324947 = _1596445324947;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems = (CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems) o;
    return Objects.equals(this.basesalary, currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems.basesalary) &&
        Objects.equals(this.positionsalary, currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems.positionsalary) &&
        Objects.equals(this._1596445324947, currentEffectivePayrollInfoContentItemSalaryProfileWrapperItems._1596445324947);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basesalary, positionsalary, _1596445324947);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemSalaryProfileWrapperItems {\n");
    
    sb.append("    basesalary: ").append(toIndentedString(basesalary)).append("\n");
    sb.append("    positionsalary: ").append(toIndentedString(positionsalary)).append("\n");
    sb.append("    _1596445324947: ").append(toIndentedString(_1596445324947)).append("\n");
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
