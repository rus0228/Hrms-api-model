package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyPayslipResultDataEmbedded;
import io.swagger.model.CompanyPayslipResultDataPage;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyPayslipResultData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyPayslipResultData   {
  @JsonProperty("page")
  private CompanyPayslipResultDataPage page = null;

  @JsonProperty("_embedded")
  private CompanyPayslipResultDataEmbedded _embedded = null;

  public CompanyPayslipResultData page(CompanyPayslipResultDataPage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyPayslipResultDataPage getPage() {
    return page;
  }

  public void setPage(CompanyPayslipResultDataPage page) {
    this.page = page;
  }

  public CompanyPayslipResultData _embedded(CompanyPayslipResultDataEmbedded _embedded) {
    this._embedded = _embedded;
    return this;
  }

  /**
   * Get _embedded
   * @return _embedded
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyPayslipResultDataEmbedded getEmbedded() {
    return _embedded;
  }

  public void setEmbedded(CompanyPayslipResultDataEmbedded _embedded) {
    this._embedded = _embedded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPayslipResultData companyPayslipResultData = (CompanyPayslipResultData) o;
    return Objects.equals(this.page, companyPayslipResultData.page) &&
        Objects.equals(this._embedded, companyPayslipResultData._embedded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, _embedded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyPayslipResultData {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
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
