package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyListContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyListContentItem   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private Long city = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = false;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("siteName")
  private String siteName = null;

  @JsonProperty("siteType")
  private String siteType = null;

  public CompanyListContentItem address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CompanyListContentItem city(Long city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  
    public Long getCity() {
    return city;
  }

  public void setCity(Long city) {
    this.city = city;
  }

  public CompanyListContentItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public CompanyListContentItem country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CompanyListContentItem createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public CompanyListContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanyListContentItem isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CompanyListContentItem province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
  **/
  @ApiModelProperty(value = "")
  
    public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public CompanyListContentItem siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

  /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(value = "")
  
    public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public CompanyListContentItem siteType(String siteType) {
    this.siteType = siteType;
    return this;
  }

  /**
   * Get siteType
   * @return siteType
  **/
  @ApiModelProperty(value = "")
  
    public String getSiteType() {
    return siteType;
  }

  public void setSiteType(String siteType) {
    this.siteType = siteType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyListContentItem companyListContentItem = (CompanyListContentItem) o;
    return Objects.equals(this.address, companyListContentItem.address) &&
        Objects.equals(this.city, companyListContentItem.city) &&
        Objects.equals(this.companyId, companyListContentItem.companyId) &&
        Objects.equals(this.country, companyListContentItem.country) &&
        Objects.equals(this.createdDate, companyListContentItem.createdDate) &&
        Objects.equals(this.id, companyListContentItem.id) &&
        Objects.equals(this.isDeleted, companyListContentItem.isDeleted) &&
        Objects.equals(this.province, companyListContentItem.province) &&
        Objects.equals(this.siteName, companyListContentItem.siteName) &&
        Objects.equals(this.siteType, companyListContentItem.siteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, companyId, country, createdDate, id, isDeleted, province, siteName, siteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyListContentItem {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
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
