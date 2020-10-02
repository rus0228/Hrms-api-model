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
 * StaffFieldListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffFieldListItem   {
  @JsonProperty("columnName")
  private String columnName = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("exportSelected")
  private Boolean exportSelected = null;

  @JsonProperty("fieldGroupId")
  private String fieldGroupId = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("flexTableSelectField")
  private Boolean flexTableSelectField = null;

  @JsonProperty("functionCode")
  private String functionCode = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isApprove")
  private Boolean isApprove = null;

  @JsonProperty("isCompanyField")
  private Boolean isCompanyField = null;

  @JsonProperty("isFixed")
  private Boolean isFixed = null;

  @JsonProperty("isHide")
  private Boolean isHide = null;

  @JsonProperty("isMain")
  private Boolean isMain = null;

  @JsonProperty("isNameable")
  private Boolean isNameable = null;

  @JsonProperty("isReadOnly")
  private Boolean isReadOnly = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("isSystem")
  private Boolean isSystem = null;

  @JsonProperty("isUpdate")
  private Boolean isUpdate = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataCode")
  private String metaDataCode = null;

  @JsonProperty("metaDataId")
  private String metaDataId = null;

  @JsonProperty("notMainOrDimension")
  private Boolean notMainOrDimension = null;

  @JsonProperty("openValid")
  private Boolean openValid = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public StaffFieldListItem columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
  **/
  @ApiModelProperty(example = "enrollInDate", value = "")
  
    public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public StaffFieldListItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "入职日期", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public StaffFieldListItem exportSelected(Boolean exportSelected) {
    this.exportSelected = exportSelected;
    return this;
  }

  /**
   * Get exportSelected
   * @return exportSelected
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isExportSelected() {
    return exportSelected;
  }

  public void setExportSelected(Boolean exportSelected) {
    this.exportSelected = exportSelected;
  }

  public StaffFieldListItem fieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
    return this;
  }

  /**
   * Get fieldGroupId
   * @return fieldGroupId
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getFieldGroupId() {
    return fieldGroupId;
  }

  public void setFieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
  }

  public StaffFieldListItem fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(example = "enrollInDate", value = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public StaffFieldListItem fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(example = "DATE", value = "")
  
    public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public StaffFieldListItem flexTableSelectField(Boolean flexTableSelectField) {
    this.flexTableSelectField = flexTableSelectField;
    return this;
  }

  /**
   * Get flexTableSelectField
   * @return flexTableSelectField
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isFlexTableSelectField() {
    return flexTableSelectField;
  }

  public void setFlexTableSelectField(Boolean flexTableSelectField) {
    this.flexTableSelectField = flexTableSelectField;
  }

  public StaffFieldListItem functionCode(String functionCode) {
    this.functionCode = functionCode;
    return this;
  }

  /**
   * Get functionCode
   * @return functionCode
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getFunctionCode() {
    return functionCode;
  }

  public void setFunctionCode(String functionCode) {
    this.functionCode = functionCode;
  }

  public StaffFieldListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "tab_staff_info.enrollInDate", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffFieldListItem isApprove(Boolean isApprove) {
    this.isApprove = isApprove;
    return this;
  }

  /**
   * Get isApprove
   * @return isApprove
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsApprove() {
    return isApprove;
  }

  public void setIsApprove(Boolean isApprove) {
    this.isApprove = isApprove;
  }

  public StaffFieldListItem isCompanyField(Boolean isCompanyField) {
    this.isCompanyField = isCompanyField;
    return this;
  }

  /**
   * Get isCompanyField
   * @return isCompanyField
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsCompanyField() {
    return isCompanyField;
  }

  public void setIsCompanyField(Boolean isCompanyField) {
    this.isCompanyField = isCompanyField;
  }

  public StaffFieldListItem isFixed(Boolean isFixed) {
    this.isFixed = isFixed;
    return this;
  }

  /**
   * Get isFixed
   * @return isFixed
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public StaffFieldListItem isHide(Boolean isHide) {
    this.isHide = isHide;
    return this;
  }

  /**
   * Get isHide
   * @return isHide
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsHide() {
    return isHide;
  }

  public void setIsHide(Boolean isHide) {
    this.isHide = isHide;
  }

  public StaffFieldListItem isMain(Boolean isMain) {
    this.isMain = isMain;
    return this;
  }

  /**
   * Get isMain
   * @return isMain
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }

  public StaffFieldListItem isNameable(Boolean isNameable) {
    this.isNameable = isNameable;
    return this;
  }

  /**
   * Get isNameable
   * @return isNameable
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsNameable() {
    return isNameable;
  }

  public void setIsNameable(Boolean isNameable) {
    this.isNameable = isNameable;
  }

  public StaffFieldListItem isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

  /**
   * Get isReadOnly
   * @return isReadOnly
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public StaffFieldListItem isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public StaffFieldListItem isSystem(Boolean isSystem) {
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

  public StaffFieldListItem isUpdate(Boolean isUpdate) {
    this.isUpdate = isUpdate;
    return this;
  }

  /**
   * Get isUpdate
   * @return isUpdate
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsUpdate() {
    return isUpdate;
  }

  public void setIsUpdate(Boolean isUpdate) {
    this.isUpdate = isUpdate;
  }

  public StaffFieldListItem isValid(Boolean isValid) {
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

  public StaffFieldListItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_info.enrollInDate", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public StaffFieldListItem metaDataCode(String metaDataCode) {
    this.metaDataCode = metaDataCode;
    return this;
  }

  /**
   * Get metaDataCode
   * @return metaDataCode
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getMetaDataCode() {
    return metaDataCode;
  }

  public void setMetaDataCode(String metaDataCode) {
    this.metaDataCode = metaDataCode;
  }

  public StaffFieldListItem metaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
    return this;
  }

  /**
   * Get metaDataId
   * @return metaDataId
  **/
  @ApiModelProperty(example = "22ad9aa3-7c87-4195-9db6-227f269cbd3a", value = "")
  
    public String getMetaDataId() {
    return metaDataId;
  }

  public void setMetaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
  }

  public StaffFieldListItem notMainOrDimension(Boolean notMainOrDimension) {
    this.notMainOrDimension = notMainOrDimension;
    return this;
  }

  /**
   * Get notMainOrDimension
   * @return notMainOrDimension
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isNotMainOrDimension() {
    return notMainOrDimension;
  }

  public void setNotMainOrDimension(Boolean notMainOrDimension) {
    this.notMainOrDimension = notMainOrDimension;
  }

  public StaffFieldListItem openValid(Boolean openValid) {
    this.openValid = openValid;
    return this;
  }

  /**
   * Get openValid
   * @return openValid
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isOpenValid() {
    return openValid;
  }

  public void setOpenValid(Boolean openValid) {
    this.openValid = openValid;
  }

  public StaffFieldListItem selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffFieldListItem staffFieldListItem = (StaffFieldListItem) o;
    return Objects.equals(this.columnName, staffFieldListItem.columnName) &&
        Objects.equals(this.displayName, staffFieldListItem.displayName) &&
        Objects.equals(this.exportSelected, staffFieldListItem.exportSelected) &&
        Objects.equals(this.fieldGroupId, staffFieldListItem.fieldGroupId) &&
        Objects.equals(this.fieldName, staffFieldListItem.fieldName) &&
        Objects.equals(this.fieldType, staffFieldListItem.fieldType) &&
        Objects.equals(this.flexTableSelectField, staffFieldListItem.flexTableSelectField) &&
        Objects.equals(this.functionCode, staffFieldListItem.functionCode) &&
        Objects.equals(this.id, staffFieldListItem.id) &&
        Objects.equals(this.isApprove, staffFieldListItem.isApprove) &&
        Objects.equals(this.isCompanyField, staffFieldListItem.isCompanyField) &&
        Objects.equals(this.isFixed, staffFieldListItem.isFixed) &&
        Objects.equals(this.isHide, staffFieldListItem.isHide) &&
        Objects.equals(this.isMain, staffFieldListItem.isMain) &&
        Objects.equals(this.isNameable, staffFieldListItem.isNameable) &&
        Objects.equals(this.isReadOnly, staffFieldListItem.isReadOnly) &&
        Objects.equals(this.isRequired, staffFieldListItem.isRequired) &&
        Objects.equals(this.isSystem, staffFieldListItem.isSystem) &&
        Objects.equals(this.isUpdate, staffFieldListItem.isUpdate) &&
        Objects.equals(this.isValid, staffFieldListItem.isValid) &&
        Objects.equals(this.metaCode, staffFieldListItem.metaCode) &&
        Objects.equals(this.metaDataCode, staffFieldListItem.metaDataCode) &&
        Objects.equals(this.metaDataId, staffFieldListItem.metaDataId) &&
        Objects.equals(this.notMainOrDimension, staffFieldListItem.notMainOrDimension) &&
        Objects.equals(this.openValid, staffFieldListItem.openValid) &&
        Objects.equals(this.selected, staffFieldListItem.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, displayName, exportSelected, fieldGroupId, fieldName, fieldType, flexTableSelectField, functionCode, id, isApprove, isCompanyField, isFixed, isHide, isMain, isNameable, isReadOnly, isRequired, isSystem, isUpdate, isValid, metaCode, metaDataCode, metaDataId, notMainOrDimension, openValid, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffFieldListItem {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    exportSelected: ").append(toIndentedString(exportSelected)).append("\n");
    sb.append("    fieldGroupId: ").append(toIndentedString(fieldGroupId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    flexTableSelectField: ").append(toIndentedString(flexTableSelectField)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isApprove: ").append(toIndentedString(isApprove)).append("\n");
    sb.append("    isCompanyField: ").append(toIndentedString(isCompanyField)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    isHide: ").append(toIndentedString(isHide)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isNameable: ").append(toIndentedString(isNameable)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataCode: ").append(toIndentedString(metaDataCode)).append("\n");
    sb.append("    metaDataId: ").append(toIndentedString(metaDataId)).append("\n");
    sb.append("    notMainOrDimension: ").append(toIndentedString(notMainOrDimension)).append("\n");
    sb.append("    openValid: ").append(toIndentedString(openValid)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
