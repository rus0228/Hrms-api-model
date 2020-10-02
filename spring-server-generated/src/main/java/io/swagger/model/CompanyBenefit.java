package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanyBenefitLinks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanyBenefit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanyBenefit   {
  @JsonProperty("accessPrivilege")
  private String accessPrivilege = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("groupDivisionId")
  private String groupDivisionId = null;

  @JsonProperty("groupModeName")
  private String groupModeName = null;

  @JsonProperty("groupTemplatesTypeNames")
  private String groupTemplatesTypeNames = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourcePublicity")
  private String resourcePublicity = null;

  @JsonProperty("staffCount")
  private Integer staffCount = null;

  @JsonProperty("_links")
  private CompanyBenefitLinks _links = null;

  public CompanyBenefit accessPrivilege(String accessPrivilege) {
    this.accessPrivilege = accessPrivilege;
    return this;
  }

  /**
   * Get accessPrivilege
   * @return accessPrivilege
  **/
  @ApiModelProperty(example = "OWNER", value = "")
  
    public String getAccessPrivilege() {
    return accessPrivilege;
  }

  public void setAccessPrivilege(String accessPrivilege) {
    this.accessPrivilege = accessPrivilege;
  }

  public CompanyBenefit enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CompanyBenefit groupDivisionId(String groupDivisionId) {
    this.groupDivisionId = groupDivisionId;
    return this;
  }

  /**
   * Get groupDivisionId
   * @return groupDivisionId
  **/
  @ApiModelProperty(example = "1379", value = "")
  
    public String getGroupDivisionId() {
    return groupDivisionId;
  }

  public void setGroupDivisionId(String groupDivisionId) {
    this.groupDivisionId = groupDivisionId;
  }

  public CompanyBenefit groupModeName(String groupModeName) {
    this.groupModeName = groupModeName;
    return this;
  }

  /**
   * Get groupModeName
   * @return groupModeName
  **/
  @ApiModelProperty(example = "Urban ", value = "")
  
    public String getGroupModeName() {
    return groupModeName;
  }

  public void setGroupModeName(String groupModeName) {
    this.groupModeName = groupModeName;
  }

  public CompanyBenefit groupTemplatesTypeNames(String groupTemplatesTypeNames) {
    this.groupTemplatesTypeNames = groupTemplatesTypeNames;
    return this;
  }

  /**
   * Get groupTemplatesTypeNames
   * @return groupTemplatesTypeNames
  **/
  @ApiModelProperty(example = "Pension insurance Medical insurance Injury insurance Major illness medical insurance Unemployment insurance Maternity insurance ", value = "")
  
    public String getGroupTemplatesTypeNames() {
    return groupTemplatesTypeNames;
  }

  public void setGroupTemplatesTypeNames(String groupTemplatesTypeNames) {
    this.groupTemplatesTypeNames = groupTemplatesTypeNames;
  }

  public CompanyBenefit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "360466831548350464", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanyBenefit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "九江市-社保", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanyBenefit resourcePublicity(String resourcePublicity) {
    this.resourcePublicity = resourcePublicity;
    return this;
  }

  /**
   * Get resourcePublicity
   * @return resourcePublicity
  **/
  @ApiModelProperty(example = "PERSONAL", value = "")
  
    public String getResourcePublicity() {
    return resourcePublicity;
  }

  public void setResourcePublicity(String resourcePublicity) {
    this.resourcePublicity = resourcePublicity;
  }

  public CompanyBenefit staffCount(Integer staffCount) {
    this.staffCount = staffCount;
    return this;
  }

  /**
   * Get staffCount
   * @return staffCount
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getStaffCount() {
    return staffCount;
  }

  public void setStaffCount(Integer staffCount) {
    this.staffCount = staffCount;
  }

  public CompanyBenefit _links(CompanyBenefitLinks _links) {
    this._links = _links;
    return this;
  }

  /**
   * Get _links
   * @return _links
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanyBenefitLinks getLinks() {
    return _links;
  }

  public void setLinks(CompanyBenefitLinks _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyBenefit companyBenefit = (CompanyBenefit) o;
    return Objects.equals(this.accessPrivilege, companyBenefit.accessPrivilege) &&
        Objects.equals(this.enabled, companyBenefit.enabled) &&
        Objects.equals(this.groupDivisionId, companyBenefit.groupDivisionId) &&
        Objects.equals(this.groupModeName, companyBenefit.groupModeName) &&
        Objects.equals(this.groupTemplatesTypeNames, companyBenefit.groupTemplatesTypeNames) &&
        Objects.equals(this.id, companyBenefit.id) &&
        Objects.equals(this.name, companyBenefit.name) &&
        Objects.equals(this.resourcePublicity, companyBenefit.resourcePublicity) &&
        Objects.equals(this.staffCount, companyBenefit.staffCount) &&
        Objects.equals(this._links, companyBenefit._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPrivilege, enabled, groupDivisionId, groupModeName, groupTemplatesTypeNames, id, name, resourcePublicity, staffCount, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyBenefit {\n");
    
    sb.append("    accessPrivilege: ").append(toIndentedString(accessPrivilege)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groupDivisionId: ").append(toIndentedString(groupDivisionId)).append("\n");
    sb.append("    groupModeName: ").append(toIndentedString(groupModeName)).append("\n");
    sb.append("    groupTemplatesTypeNames: ").append(toIndentedString(groupTemplatesTypeNames)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourcePublicity: ").append(toIndentedString(resourcePublicity)).append("\n");
    sb.append("    staffCount: ").append(toIndentedString(staffCount)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
