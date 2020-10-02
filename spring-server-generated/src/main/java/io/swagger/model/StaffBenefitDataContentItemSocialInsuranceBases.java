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
 * StaffBenefitDataContentItemSocialInsuranceBases
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffBenefitDataContentItemSocialInsuranceBases   {
  @JsonProperty("SI_PB")
  private Integer SI_PB = null;

  public StaffBenefitDataContentItemSocialInsuranceBases SI_PB(Integer SI_PB) {
    this.SI_PB = SI_PB;
    return this;
  }

  /**
   * Get SI_PB
   * @return SI_PB
  **/
  @ApiModelProperty(example = "3300", value = "")
  
    public Integer getSIPB() {
    return SI_PB;
  }

  public void setSIPB(Integer SI_PB) {
    this.SI_PB = SI_PB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffBenefitDataContentItemSocialInsuranceBases staffBenefitDataContentItemSocialInsuranceBases = (StaffBenefitDataContentItemSocialInsuranceBases) o;
    return Objects.equals(this.SI_PB, staffBenefitDataContentItemSocialInsuranceBases.SI_PB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SI_PB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffBenefitDataContentItemSocialInsuranceBases {\n");
    
    sb.append("    SI_PB: ").append(toIndentedString(SI_PB)).append("\n");
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
