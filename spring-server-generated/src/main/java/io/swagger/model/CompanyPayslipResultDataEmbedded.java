package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyPayslipResultItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyPayslipResultDataEmbedded
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyPayslipResultDataEmbedded   {
  @JsonProperty("payslipResults")
  @Valid
  private List<CompanyPayslipResultItem> payslipResults = null;

  public CompanyPayslipResultDataEmbedded payslipResults(List<CompanyPayslipResultItem> payslipResults) {
    this.payslipResults = payslipResults;
    return this;
  }

  public CompanyPayslipResultDataEmbedded addPayslipResultsItem(CompanyPayslipResultItem payslipResultsItem) {
    if (this.payslipResults == null) {
      this.payslipResults = new ArrayList<CompanyPayslipResultItem>();
    }
    this.payslipResults.add(payslipResultsItem);
    return this;
  }

  /**
   * Get payslipResults
   * @return payslipResults
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<CompanyPayslipResultItem> getPayslipResults() {
    return payslipResults;
  }

  public void setPayslipResults(List<CompanyPayslipResultItem> payslipResults) {
    this.payslipResults = payslipResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPayslipResultDataEmbedded companyPayslipResultDataEmbedded = (CompanyPayslipResultDataEmbedded) o;
    return Objects.equals(this.payslipResults, companyPayslipResultDataEmbedded.payslipResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payslipResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPayslipResultDataEmbedded {\n");
    
    sb.append("    payslipResults: ").append(toIndentedString(payslipResults)).append("\n");
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
