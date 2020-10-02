package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyBenefit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedCompanyBenefitDataDataEmbedded
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SavedCompanyBenefitDataDataEmbedded   {
  @JsonProperty("companyBenefits")
  @Valid
  private List<CompanyBenefit> companyBenefits = null;

  public SavedCompanyBenefitDataDataEmbedded companyBenefits(List<CompanyBenefit> companyBenefits) {
    this.companyBenefits = companyBenefits;
    return this;
  }

  public SavedCompanyBenefitDataDataEmbedded addCompanyBenefitsItem(CompanyBenefit companyBenefitsItem) {
    if (this.companyBenefits == null) {
      this.companyBenefits = new ArrayList<CompanyBenefit>();
    }
    this.companyBenefits.add(companyBenefitsItem);
    return this;
  }

  /**
   * Get companyBenefits
   * @return companyBenefits
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<CompanyBenefit> getCompanyBenefits() {
    return companyBenefits;
  }

  public void setCompanyBenefits(List<CompanyBenefit> companyBenefits) {
    this.companyBenefits = companyBenefits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedCompanyBenefitDataDataEmbedded savedCompanyBenefitDataDataEmbedded = (SavedCompanyBenefitDataDataEmbedded) o;
    return Objects.equals(this.companyBenefits, savedCompanyBenefitDataDataEmbedded.companyBenefits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyBenefits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCompanyBenefitDataDataEmbedded {\n");
    
    sb.append("    companyBenefits: ").append(toIndentedString(companyBenefits)).append("\n");
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
