package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SavedCompanyBenefitDataDataEmbedded;
import io.swagger.model.SavedCompanyBenefitDataDataLinks;
import io.swagger.model.SavedCompanyBenefitDataDataPage;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedCompanyBenefitDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SavedCompanyBenefitDataData   {
  @JsonProperty("page")
  private SavedCompanyBenefitDataDataPage page = null;

  @JsonProperty("_embedded")
  private SavedCompanyBenefitDataDataEmbedded _embedded = null;

  @JsonProperty("links")
  private SavedCompanyBenefitDataDataLinks links = null;

  public SavedCompanyBenefitDataData page(SavedCompanyBenefitDataDataPage page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SavedCompanyBenefitDataDataPage getPage() {
    return page;
  }

  public void setPage(SavedCompanyBenefitDataDataPage page) {
    this.page = page;
  }

  public SavedCompanyBenefitDataData _embedded(SavedCompanyBenefitDataDataEmbedded _embedded) {
    this._embedded = _embedded;
    return this;
  }

  /**
   * Get _embedded
   * @return _embedded
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SavedCompanyBenefitDataDataEmbedded getEmbedded() {
    return _embedded;
  }

  public void setEmbedded(SavedCompanyBenefitDataDataEmbedded _embedded) {
    this._embedded = _embedded;
  }

  public SavedCompanyBenefitDataData links(SavedCompanyBenefitDataDataLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SavedCompanyBenefitDataDataLinks getLinks() {
    return links;
  }

  public void setLinks(SavedCompanyBenefitDataDataLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedCompanyBenefitDataData savedCompanyBenefitDataData = (SavedCompanyBenefitDataData) o;
    return Objects.equals(this.page, savedCompanyBenefitDataData.page) &&
        Objects.equals(this._embedded, savedCompanyBenefitDataData._embedded) &&
        Objects.equals(this.links, savedCompanyBenefitDataData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, _embedded, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCompanyBenefitDataData {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    _embedded: ").append(toIndentedString(_embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
