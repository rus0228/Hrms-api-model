package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyBenefitLinksCompanyConfigs;
import io.swagger.model.CompanyBenefitLinksSelf;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyBenefitLinks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyBenefitLinks   {
  @JsonProperty("companyConfigs")
  private CompanyBenefitLinksCompanyConfigs companyConfigs = null;

  @JsonProperty("self")
  private CompanyBenefitLinksSelf self = null;

  public CompanyBenefitLinks companyConfigs(CompanyBenefitLinksCompanyConfigs companyConfigs) {
    this.companyConfigs = companyConfigs;
    return this;
  }

  /**
   * Get companyConfigs
   * @return companyConfigs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyBenefitLinksCompanyConfigs getCompanyConfigs() {
    return companyConfigs;
  }

  public void setCompanyConfigs(CompanyBenefitLinksCompanyConfigs companyConfigs) {
    this.companyConfigs = companyConfigs;
  }

  public CompanyBenefitLinks self(CompanyBenefitLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyBenefitLinksSelf getSelf() {
    return self;
  }

  public void setSelf(CompanyBenefitLinksSelf self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyBenefitLinks companyBenefitLinks = (CompanyBenefitLinks) o;
    return Objects.equals(this.companyConfigs, companyBenefitLinks.companyConfigs) &&
        Objects.equals(this.self, companyBenefitLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyConfigs, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyBenefitLinks {\n");
    
    sb.append("    companyConfigs: ").append(toIndentedString(companyConfigs)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
