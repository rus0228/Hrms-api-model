package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FieldGroupListItemFieldListItemCodeValueListItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FieldGroupListItemFieldListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class FieldGroupListItemFieldListItem   {
  @JsonProperty("chineseName")
  private String chineseName = null;

  @JsonProperty("codeTypeId")
  private String codeTypeId = null;

  @JsonProperty("codeValueList")
  @Valid
  private List<FieldGroupListItemFieldListItemCodeValueListItem> codeValueList = null;

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

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isApprove")
  private Boolean isApprove = null;

  @JsonProperty("isCompanyField")
  private Boolean isCompanyField = null;

  @JsonProperty("isCustomSubset")
  private Boolean isCustomSubset = null;

  @JsonProperty("isEntryConfig")
  private Boolean isEntryConfig = null;

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

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("isUpdate")
  private Boolean isUpdate = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataCode")
  private String metaDataCode = null;

  @JsonProperty("metaDataId")
  private String metaDataId = null;

  @JsonProperty("minimumValue")
  private BigDecimal minimumValue = null;

  @JsonProperty("notMainOrDimension")
  private Boolean notMainOrDimension = null;

  @JsonProperty("openValid")
  private Boolean openValid = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("valueLength")
  private BigDecimal valueLength = null;

  @JsonProperty("valuePattern")
  private String valuePattern = null;

  public FieldGroupListItemFieldListItem chineseName(String chineseName) {
    this.chineseName = chineseName;
    return this;
  }

  /**
   * Get chineseName
   * @return chineseName
  **/
  @ApiModelProperty(value = "")
  
    public String getChineseName() {
    return chineseName;
  }

  public void setChineseName(String chineseName) {
    this.chineseName = chineseName;
  }

  public FieldGroupListItemFieldListItem codeTypeId(String codeTypeId) {
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

  public FieldGroupListItemFieldListItem codeValueList(List<FieldGroupListItemFieldListItemCodeValueListItem> codeValueList) {
    this.codeValueList = codeValueList;
    return this;
  }

  public FieldGroupListItemFieldListItem addCodeValueListItem(FieldGroupListItemFieldListItemCodeValueListItem codeValueListItem) {
    if (this.codeValueList == null) {
      this.codeValueList = new ArrayList<FieldGroupListItemFieldListItemCodeValueListItem>();
    }
    this.codeValueList.add(codeValueListItem);
    return this;
  }

  /**
   * Get codeValueList
   * @return codeValueList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FieldGroupListItemFieldListItemCodeValueListItem> getCodeValueList() {
    return codeValueList;
  }

  public void setCodeValueList(List<FieldGroupListItemFieldListItemCodeValueListItem> codeValueList) {
    this.codeValueList = codeValueList;
  }

  public FieldGroupListItemFieldListItem columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Get columnName
   * @return columnName
  **/
  @ApiModelProperty(example = "certificateType", value = "")
  
    public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public FieldGroupListItemFieldListItem companyId(String companyId) {
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

  public FieldGroupListItemFieldListItem defaultValue(String defaultValue) {
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

  public FieldGroupListItemFieldListItem description(String description) {
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

  public FieldGroupListItemFieldListItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "证照类型", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FieldGroupListItemFieldListItem engName(String engName) {
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

  public FieldGroupListItemFieldListItem exportSelected(Boolean exportSelected) {
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

  public FieldGroupListItemFieldListItem fieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
    return this;
  }

  /**
   * Get fieldGroupId
   * @return fieldGroupId
  **/
  @ApiModelProperty(example = "tab_staff_certificate", value = "")
  
    public String getFieldGroupId() {
    return fieldGroupId;
  }

  public void setFieldGroupId(String fieldGroupId) {
    this.fieldGroupId = fieldGroupId;
  }

  public FieldGroupListItemFieldListItem fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(example = "certificateType", value = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public FieldGroupListItemFieldListItem fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(example = "CODE_TYPE", value = "")
  
    public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public FieldGroupListItemFieldListItem flexTableSelectField(Boolean flexTableSelectField) {
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

  public FieldGroupListItemFieldListItem functionCode(String functionCode) {
    this.functionCode = functionCode;
    return this;
  }

  /**
   * Get functionCode
   * @return functionCode
  **/
  @ApiModelProperty(example = "tab_staff_certificate", value = "")
  
    public String getFunctionCode() {
    return functionCode;
  }

  public void setFunctionCode(String functionCode) {
    this.functionCode = functionCode;
  }

  public FieldGroupListItemFieldListItem groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(value = "")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public FieldGroupListItemFieldListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "tab_staff_certificate.certificateType", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldGroupListItemFieldListItem isApprove(Boolean isApprove) {
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

  public FieldGroupListItemFieldListItem isCompanyField(Boolean isCompanyField) {
    this.isCompanyField = isCompanyField;
    return this;
  }

  /**
   * Get isCompanyField
   * @return isCompanyField
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsCompanyField() {
    return isCompanyField;
  }

  public void setIsCompanyField(Boolean isCompanyField) {
    this.isCompanyField = isCompanyField;
  }

  public FieldGroupListItemFieldListItem isCustomSubset(Boolean isCustomSubset) {
    this.isCustomSubset = isCustomSubset;
    return this;
  }

  /**
   * Get isCustomSubset
   * @return isCustomSubset
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsCustomSubset() {
    return isCustomSubset;
  }

  public void setIsCustomSubset(Boolean isCustomSubset) {
    this.isCustomSubset = isCustomSubset;
  }

  public FieldGroupListItemFieldListItem isEntryConfig(Boolean isEntryConfig) {
    this.isEntryConfig = isEntryConfig;
    return this;
  }

  /**
   * Get isEntryConfig
   * @return isEntryConfig
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsEntryConfig() {
    return isEntryConfig;
  }

  public void setIsEntryConfig(Boolean isEntryConfig) {
    this.isEntryConfig = isEntryConfig;
  }

  public FieldGroupListItemFieldListItem isFixed(Boolean isFixed) {
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

  public FieldGroupListItemFieldListItem isHide(Boolean isHide) {
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

  public FieldGroupListItemFieldListItem isMain(Boolean isMain) {
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

  public FieldGroupListItemFieldListItem isNameable(Boolean isNameable) {
    this.isNameable = isNameable;
    return this;
  }

  /**
   * Get isNameable
   * @return isNameable
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsNameable() {
    return isNameable;
  }

  public void setIsNameable(Boolean isNameable) {
    this.isNameable = isNameable;
  }

  public FieldGroupListItemFieldListItem isReadOnly(Boolean isReadOnly) {
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

  public FieldGroupListItemFieldListItem isRequired(Boolean isRequired) {
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

  public FieldGroupListItemFieldListItem isSystem(Boolean isSystem) {
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

  public FieldGroupListItemFieldListItem isUnique(Boolean isUnique) {
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

  public FieldGroupListItemFieldListItem isUpdate(Boolean isUpdate) {
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

  public FieldGroupListItemFieldListItem isValid(Boolean isValid) {
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

  public FieldGroupListItemFieldListItem maximumValue(BigDecimal maximumValue) {
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

  public FieldGroupListItemFieldListItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_certificate.certificateType", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public FieldGroupListItemFieldListItem metaDataCode(String metaDataCode) {
    this.metaDataCode = metaDataCode;
    return this;
  }

  /**
   * Get metaDataCode
   * @return metaDataCode
  **/
  @ApiModelProperty(example = "tab_staff_certificate", value = "")
  
    public String getMetaDataCode() {
    return metaDataCode;
  }

  public void setMetaDataCode(String metaDataCode) {
    this.metaDataCode = metaDataCode;
  }

  public FieldGroupListItemFieldListItem metaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
    return this;
  }

  /**
   * Get metaDataId
   * @return metaDataId
  **/
  @ApiModelProperty(example = "e0747fc8-5d39-4610-8d4d-4b561d8932fe", value = "")
  
    public String getMetaDataId() {
    return metaDataId;
  }

  public void setMetaDataId(String metaDataId) {
    this.metaDataId = metaDataId;
  }

  public FieldGroupListItemFieldListItem minimumValue(BigDecimal minimumValue) {
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

  public FieldGroupListItemFieldListItem notMainOrDimension(Boolean notMainOrDimension) {
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

  public FieldGroupListItemFieldListItem openValid(Boolean openValid) {
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

  public FieldGroupListItemFieldListItem selected(Boolean selected) {
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

  public FieldGroupListItemFieldListItem valueLength(BigDecimal valueLength) {
    this.valueLength = valueLength;
    return this;
  }

  /**
   * Get valueLength
   * @return valueLength
  **/
  @ApiModelProperty(example = "40", value = "")
  
    @Valid
    public BigDecimal getValueLength() {
    return valueLength;
  }

  public void setValueLength(BigDecimal valueLength) {
    this.valueLength = valueLength;
  }

  public FieldGroupListItemFieldListItem valuePattern(String valuePattern) {
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
    FieldGroupListItemFieldListItem fieldGroupListItemFieldListItem = (FieldGroupListItemFieldListItem) o;
    return Objects.equals(this.chineseName, fieldGroupListItemFieldListItem.chineseName) &&
        Objects.equals(this.codeTypeId, fieldGroupListItemFieldListItem.codeTypeId) &&
        Objects.equals(this.codeValueList, fieldGroupListItemFieldListItem.codeValueList) &&
        Objects.equals(this.columnName, fieldGroupListItemFieldListItem.columnName) &&
        Objects.equals(this.companyId, fieldGroupListItemFieldListItem.companyId) &&
        Objects.equals(this.defaultValue, fieldGroupListItemFieldListItem.defaultValue) &&
        Objects.equals(this.description, fieldGroupListItemFieldListItem.description) &&
        Objects.equals(this.displayName, fieldGroupListItemFieldListItem.displayName) &&
        Objects.equals(this.engName, fieldGroupListItemFieldListItem.engName) &&
        Objects.equals(this.exportSelected, fieldGroupListItemFieldListItem.exportSelected) &&
        Objects.equals(this.fieldGroupId, fieldGroupListItemFieldListItem.fieldGroupId) &&
        Objects.equals(this.fieldName, fieldGroupListItemFieldListItem.fieldName) &&
        Objects.equals(this.fieldType, fieldGroupListItemFieldListItem.fieldType) &&
        Objects.equals(this.flexTableSelectField, fieldGroupListItemFieldListItem.flexTableSelectField) &&
        Objects.equals(this.functionCode, fieldGroupListItemFieldListItem.functionCode) &&
        Objects.equals(this.groupId, fieldGroupListItemFieldListItem.groupId) &&
        Objects.equals(this.id, fieldGroupListItemFieldListItem.id) &&
        Objects.equals(this.isApprove, fieldGroupListItemFieldListItem.isApprove) &&
        Objects.equals(this.isCompanyField, fieldGroupListItemFieldListItem.isCompanyField) &&
        Objects.equals(this.isCustomSubset, fieldGroupListItemFieldListItem.isCustomSubset) &&
        Objects.equals(this.isEntryConfig, fieldGroupListItemFieldListItem.isEntryConfig) &&
        Objects.equals(this.isFixed, fieldGroupListItemFieldListItem.isFixed) &&
        Objects.equals(this.isHide, fieldGroupListItemFieldListItem.isHide) &&
        Objects.equals(this.isMain, fieldGroupListItemFieldListItem.isMain) &&
        Objects.equals(this.isNameable, fieldGroupListItemFieldListItem.isNameable) &&
        Objects.equals(this.isReadOnly, fieldGroupListItemFieldListItem.isReadOnly) &&
        Objects.equals(this.isRequired, fieldGroupListItemFieldListItem.isRequired) &&
        Objects.equals(this.isSystem, fieldGroupListItemFieldListItem.isSystem) &&
        Objects.equals(this.isUnique, fieldGroupListItemFieldListItem.isUnique) &&
        Objects.equals(this.isUpdate, fieldGroupListItemFieldListItem.isUpdate) &&
        Objects.equals(this.isValid, fieldGroupListItemFieldListItem.isValid) &&
        Objects.equals(this.maximumValue, fieldGroupListItemFieldListItem.maximumValue) &&
        Objects.equals(this.metaCode, fieldGroupListItemFieldListItem.metaCode) &&
        Objects.equals(this.metaDataCode, fieldGroupListItemFieldListItem.metaDataCode) &&
        Objects.equals(this.metaDataId, fieldGroupListItemFieldListItem.metaDataId) &&
        Objects.equals(this.minimumValue, fieldGroupListItemFieldListItem.minimumValue) &&
        Objects.equals(this.notMainOrDimension, fieldGroupListItemFieldListItem.notMainOrDimension) &&
        Objects.equals(this.openValid, fieldGroupListItemFieldListItem.openValid) &&
        Objects.equals(this.selected, fieldGroupListItemFieldListItem.selected) &&
        Objects.equals(this.valueLength, fieldGroupListItemFieldListItem.valueLength) &&
        Objects.equals(this.valuePattern, fieldGroupListItemFieldListItem.valuePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chineseName, codeTypeId, codeValueList, columnName, companyId, defaultValue, description, displayName, engName, exportSelected, fieldGroupId, fieldName, fieldType, flexTableSelectField, functionCode, groupId, id, isApprove, isCompanyField, isCustomSubset, isEntryConfig, isFixed, isHide, isMain, isNameable, isReadOnly, isRequired, isSystem, isUnique, isUpdate, isValid, maximumValue, metaCode, metaDataCode, metaDataId, minimumValue, notMainOrDimension, openValid, selected, valueLength, valuePattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldGroupListItemFieldListItem {\n");
    
    sb.append("    chineseName: ").append(toIndentedString(chineseName)).append("\n");
    sb.append("    codeTypeId: ").append(toIndentedString(codeTypeId)).append("\n");
    sb.append("    codeValueList: ").append(toIndentedString(codeValueList)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    exportSelected: ").append(toIndentedString(exportSelected)).append("\n");
    sb.append("    fieldGroupId: ").append(toIndentedString(fieldGroupId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    flexTableSelectField: ").append(toIndentedString(flexTableSelectField)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isApprove: ").append(toIndentedString(isApprove)).append("\n");
    sb.append("    isCompanyField: ").append(toIndentedString(isCompanyField)).append("\n");
    sb.append("    isCustomSubset: ").append(toIndentedString(isCustomSubset)).append("\n");
    sb.append("    isEntryConfig: ").append(toIndentedString(isEntryConfig)).append("\n");
    sb.append("    isFixed: ").append(toIndentedString(isFixed)).append("\n");
    sb.append("    isHide: ").append(toIndentedString(isHide)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isNameable: ").append(toIndentedString(isNameable)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataCode: ").append(toIndentedString(metaDataCode)).append("\n");
    sb.append("    metaDataId: ").append(toIndentedString(metaDataId)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    notMainOrDimension: ").append(toIndentedString(notMainOrDimension)).append("\n");
    sb.append("    openValid: ").append(toIndentedString(openValid)).append("\n");
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
