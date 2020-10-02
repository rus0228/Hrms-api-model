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
 * FieldGroupListItemFieldListItemCodeValueListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class FieldGroupListItemFieldListItemCodeValueListItem   {
  @JsonProperty("codeTypeId")
  private String codeTypeId = null;

  @JsonProperty("codeValue")
  private String codeValue = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("engName")
  private String engName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isSystem")
  private Boolean isSystem = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("sortNo")
  private String sortNo = null;

  public FieldGroupListItemFieldListItemCodeValueListItem codeTypeId(String codeTypeId) {
    this.codeTypeId = codeTypeId;
    return this;
  }

  /**
   * Get codeTypeId
   * @return codeTypeId
  **/
  @ApiModelProperty(example = "Enum.CertificateType", value = "")
  
    public String getCodeTypeId() {
    return codeTypeId;
  }

  public void setCodeTypeId(String codeTypeId) {
    this.codeTypeId = codeTypeId;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem codeValue(String codeValue) {
    this.codeValue = codeValue;
    return this;
  }

  /**
   * Get codeValue
   * @return codeValue
  **/
  @ApiModelProperty(example = "IDCard", value = "")
  
    public String getCodeValue() {
    return codeValue;
  }

  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(example = "system-default-company-id", value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "IDCard", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "居民身份证", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem engName(String engName) {
    this.engName = engName;
    return this;
  }

  /**
   * Get engName
   * @return engName
  **/
  @ApiModelProperty(example = "IDCard", value = "")
  
    public String getEngName() {
    return engName;
  }

  public void setEngName(String engName) {
    this.engName = engName;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "CertificateType.IDCard", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
  }

  /**
   * Get isSystem
   * @return isSystem
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsSystem() {
    return isSystem;
  }

  public void setIsSystem(Boolean isSystem) {
    this.isSystem = isSystem;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "CertificateType.IDCard", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  
    public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public FieldGroupListItemFieldListItemCodeValueListItem sortNo(String sortNo) {
    this.sortNo = sortNo;
    return this;
  }

  /**
   * Get sortNo
   * @return sortNo
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public String getSortNo() {
    return sortNo;
  }

  public void setSortNo(String sortNo) {
    this.sortNo = sortNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldGroupListItemFieldListItemCodeValueListItem fieldGroupListItemFieldListItemCodeValueListItem = (FieldGroupListItemFieldListItemCodeValueListItem) o;
    return Objects.equals(this.codeTypeId, fieldGroupListItemFieldListItemCodeValueListItem.codeTypeId) &&
        Objects.equals(this.codeValue, fieldGroupListItemFieldListItemCodeValueListItem.codeValue) &&
        Objects.equals(this.companyId, fieldGroupListItemFieldListItemCodeValueListItem.companyId) &&
        Objects.equals(this.description, fieldGroupListItemFieldListItemCodeValueListItem.description) &&
        Objects.equals(this.displayName, fieldGroupListItemFieldListItemCodeValueListItem.displayName) &&
        Objects.equals(this.engName, fieldGroupListItemFieldListItemCodeValueListItem.engName) &&
        Objects.equals(this.id, fieldGroupListItemFieldListItemCodeValueListItem.id) &&
        Objects.equals(this.isSystem, fieldGroupListItemFieldListItemCodeValueListItem.isSystem) &&
        Objects.equals(this.isValid, fieldGroupListItemFieldListItemCodeValueListItem.isValid) &&
        Objects.equals(this.metaCode, fieldGroupListItemFieldListItemCodeValueListItem.metaCode) &&
        Objects.equals(this.parentId, fieldGroupListItemFieldListItemCodeValueListItem.parentId) &&
        Objects.equals(this.sortNo, fieldGroupListItemFieldListItemCodeValueListItem.sortNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeTypeId, codeValue, companyId, description, displayName, engName, id, isSystem, isValid, metaCode, parentId, sortNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldGroupListItemFieldListItemCodeValueListItem {\n");
    
    sb.append("    codeTypeId: ").append(toIndentedString(codeTypeId)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    sortNo: ").append(toIndentedString(sortNo)).append("\n");
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
