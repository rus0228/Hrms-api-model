package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntryMetaDataFieldListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class EntryMetaDataFieldListItem   {
  @JsonProperty("codeTypeId")
  private String codeTypeId = null;

  @JsonProperty("codeValueList")
  private String codeValueList = null;

  @JsonProperty("columnName")
  private String columnName = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("engName")
  private String engName = null;

  @JsonProperty("fieldGroupId")
  private String fieldGroupId = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("flexTableSelectField")
  private Boolean flexTableSelectField = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isEntryRequired")
  private Boolean isEntryRequired = null;

  @JsonProperty("isFixed")
  private Boolean isFixed = null;

  @JsonProperty("isMain")
  private Boolean isMain = null;

  @JsonProperty("isNameable")
  private Boolean isNameable = null;

  @JsonProperty("isRequired")
  private Boolean isRequired = null;

  @JsonProperty("isShow")
  private Boolean isShow = null;

  @JsonProperty("isSystem")
  private Boolean isSystem = null;

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataId")
  private String metaDataId = null;

  @JsonProperty("minimumValue")
  private BigDecimal minimumValue = null;

  @JsonProperty("notMainOrDimension")
  private Boolean notMainOrDimension = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("valueLength")
  private BigDecimal valueLength = null;

  @JsonProperty("valuePattern")
  private String valuePattern = null;

  public EntryMetaDataFieldListItem codeTypeId(String codeTypeId) {
    this.codeTypeId = codeTypeId;
    return this;
  }

  /**
   * Get codeTypeId
   * @return codeTypeId
  **/
  @ApiModelProperty(value = "")
  
    public String getCodeTypeId() {
    return codeTypeId;
  }

  public void setCodeTypeId(String codeTypeId) {
    this.codeTypeId = codeTypeId;
  }

  public EntryMetaDataFieldListItem codeValueList(String codeValueList) {
    this.codeValueList = codeValueList;
    return this;
  }

  /**
   * Get codeValueList
   * @return codeValueList
  **/
  @ApiModelProperty(value = "")
  
    public String getCodeValueList() {
    return codeValueList;
  }

  public void setCodeValueList(String codeValueList) {
    this.codeValueList = codeValueList;
  }

  public EntryMetaDataFieldListItem columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
  **/
  @ApiModelProperty(example = "staffName", value = "")
  
    public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public EntryMetaDataFieldListItem companyId(String companyId) {
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

  public EntryMetaDataFieldListItem defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  
    public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public EntryMetaDataFieldListItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EntryMetaDataFieldListItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "姓名", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EntryMetaDataFieldListItem engName(String engName) {
    this.engName = engName;
    return this;
  }

  /**
   * Get engName
   * @return engName
  **/
  @ApiModelProperty(value = "")
  
    public String getEngName() {
    return engName;
  }

  public void setEngName(String engName) {
    this.engName = engName;
  }

  public EntryMetaDataFieldListItem fieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
    return this;
  }

  /**
   * Get fieldGroupId
   * @return fieldGroupId
  **/
  @ApiModelProperty(example = "22ad9aa3-7c87-4195-9db6-227f269cbd3a", value = "")
  
    public String getFieldGroupId() {
    return fieldGroupId;
  }

  public void setFieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
  }

  public EntryMetaDataFieldListItem fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(example = "tab_staff_info.staffName", value = "")
  
    public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public EntryMetaDataFieldListItem fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(example = "staffName", value = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public EntryMetaDataFieldListItem fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(example = "STRING", value = "")
  
    public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public EntryMetaDataFieldListItem flexTableSelectField(Boolean flexTableSelectField) {
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

  public EntryMetaDataFieldListItem groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "22ad9aa3-7c87-4195-9db6-227f269cbd3a", value = "")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public EntryMetaDataFieldListItem groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")
  
    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public EntryMetaDataFieldListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "tab_staff_info.staffName", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntryMetaDataFieldListItem isEntryRequired(Boolean isEntryRequired) {
    this.isEntryRequired = isEntryRequired;
    return this;
  }

  /**
   * Get isEntryRequired
   * @return isEntryRequired
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsEntryRequired() {
    return isEntryRequired;
  }

  public void setIsEntryRequired(Boolean isEntryRequired) {
    this.isEntryRequired = isEntryRequired;
  }

  public EntryMetaDataFieldListItem isFixed(Boolean isFixed) {
    this.isFixed = isFixed;
    return this;
  }

  /**
   * Get isFixed
   * @return isFixed
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public EntryMetaDataFieldListItem isMain(Boolean isMain) {
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

  public EntryMetaDataFieldListItem isNameable(Boolean isNameable) {
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

  public EntryMetaDataFieldListItem isRequired(Boolean isRequired) {
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

  public EntryMetaDataFieldListItem isShow(Boolean isShow) {
    this.isShow = isShow;
    return this;
  }

  /**
   * Get isShow
   * @return isShow
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsShow() {
    return isShow;
  }

  public void setIsShow(Boolean isShow) {
    this.isShow = isShow;
  }

  public EntryMetaDataFieldListItem isSystem(Boolean isSystem) {
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

  public EntryMetaDataFieldListItem isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * Get isUnique
   * @return isUnique
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public EntryMetaDataFieldListItem isValid(Boolean isValid) {
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

  public EntryMetaDataFieldListItem maximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * Get maximumValue
   * @return maximumValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
  }

  public EntryMetaDataFieldListItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_info.staffName", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public EntryMetaDataFieldListItem metaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
    return this;
  }

  /**
   * Get metaDataId
   * @return metaDataId
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getMetaDataId() {
    return metaDataId;
  }

  public void setMetaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
  }

  public EntryMetaDataFieldListItem minimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * Get minimumValue
   * @return minimumValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BigDecimal getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
  }

  public EntryMetaDataFieldListItem notMainOrDimension(Boolean notMainOrDimension) {
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

  public EntryMetaDataFieldListItem selected(Boolean selected) {
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

  public EntryMetaDataFieldListItem valueLength(BigDecimal valueLength) {
    this.valueLength = valueLength;
    return this;
  }

  /**
   * Get valueLength
   * @return valueLength
  **/
  @ApiModelProperty(example = "32", value = "")
  
    @Valid
    public BigDecimal getValueLength() {
    return valueLength;
  }

  public void setValueLength(BigDecimal valueLength) {
    this.valueLength = valueLength;
  }

  public EntryMetaDataFieldListItem valuePattern(String valuePattern) {
    this.valuePattern = valuePattern;
    return this;
  }

  /**
   * Get valuePattern
   * @return valuePattern
  **/
  @ApiModelProperty(value = "")
  
    public String getValuePattern() {
    return valuePattern;
  }

  public void setValuePattern(String valuePattern) {
    this.valuePattern = valuePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryMetaDataFieldListItem entryMetaDataFieldListItem = (EntryMetaDataFieldListItem) o;
    return Objects.equals(this.codeTypeId, entryMetaDataFieldListItem.codeTypeId) &&
        Objects.equals(this.codeValueList, entryMetaDataFieldListItem.codeValueList) &&
        Objects.equals(this.columnName, entryMetaDataFieldListItem.columnName) &&
        Objects.equals(this.companyId, entryMetaDataFieldListItem.companyId) &&
        Objects.equals(this.defaultValue, entryMetaDataFieldListItem.defaultValue) &&
        Objects.equals(this.description, entryMetaDataFieldListItem.description) &&
        Objects.equals(this.displayName, entryMetaDataFieldListItem.displayName) &&
        Objects.equals(this.engName, entryMetaDataFieldListItem.engName) &&
        Objects.equals(this.fieldGroupId, entryMetaDataFieldListItem.fieldGroupId) &&
        Objects.equals(this.fieldId, entryMetaDataFieldListItem.fieldId) &&
        Objects.equals(this.fieldName, entryMetaDataFieldListItem.fieldName) &&
        Objects.equals(this.fieldType, entryMetaDataFieldListItem.fieldType) &&
        Objects.equals(this.flexTableSelectField, entryMetaDataFieldListItem.flexTableSelectField) &&
        Objects.equals(this.groupId, entryMetaDataFieldListItem.groupId) &&
        Objects.equals(this.groupName, entryMetaDataFieldListItem.groupName) &&
        Objects.equals(this.id, entryMetaDataFieldListItem.id) &&
        Objects.equals(this.isEntryRequired, entryMetaDataFieldListItem.isEntryRequired) &&
        Objects.equals(this.isFixed, entryMetaDataFieldListItem.isFixed) &&
        Objects.equals(this.isMain, entryMetaDataFieldListItem.isMain) &&
        Objects.equals(this.isNameable, entryMetaDataFieldListItem.isNameable) &&
        Objects.equals(this.isRequired, entryMetaDataFieldListItem.isRequired) &&
        Objects.equals(this.isShow, entryMetaDataFieldListItem.isShow) &&
        Objects.equals(this.isSystem, entryMetaDataFieldListItem.isSystem) &&
        Objects.equals(this.isUnique, entryMetaDataFieldListItem.isUnique) &&
        Objects.equals(this.isValid, entryMetaDataFieldListItem.isValid) &&
        Objects.equals(this.maximumValue, entryMetaDataFieldListItem.maximumValue) &&
        Objects.equals(this.metaCode, entryMetaDataFieldListItem.metaCode) &&
        Objects.equals(this.metaDataId, entryMetaDataFieldListItem.metaDataId) &&
        Objects.equals(this.minimumValue, entryMetaDataFieldListItem.minimumValue) &&
        Objects.equals(this.notMainOrDimension, entryMetaDataFieldListItem.notMainOrDimension) &&
        Objects.equals(this.selected, entryMetaDataFieldListItem.selected) &&
        Objects.equals(this.valueLength, entryMetaDataFieldListItem.valueLength) &&
        Objects.equals(this.valuePattern, entryMetaDataFieldListItem.valuePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeTypeId, codeValueList, columnName, companyId, defaultValue, description, displayName, engName, fieldGroupId, fieldId, fieldName, fieldType, flexTableSelectField, groupId, groupName, id, isEntryRequired, isFixed, isMain, isNameable, isRequired, isShow, isSystem, isUnique, isValid, maximumValue, metaCode, metaDataId, minimumValue, notMainOrDimension, selected, valueLength, valuePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryMetaDataFieldListItem {\n");
    
    sb.append("    codeTypeId: ").append(toIndentedString(codeTypeId)).append("\n");
    sb.append("    codeValueList: ").append(toIndentedString(codeValueList)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    fieldGroupId: ").append(toIndentedString(fieldGroupId)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    flexTableSelectField: ").append(toIndentedString(flexTableSelectField)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEntryRequired: ").append(toIndentedString(isEntryRequired)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isNameable: ").append(toIndentedString(isNameable)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isShow: ").append(toIndentedString(isShow)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataId: ").append(toIndentedString(metaDataId)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    notMainOrDimension: ").append(toIndentedString(notMainOrDimension)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    valueLength: ").append(toIndentedString(valueLength)).append("\n");
    sb.append("    valuePattern: ").append(toIndentedString(valuePattern)).append("\n");
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
