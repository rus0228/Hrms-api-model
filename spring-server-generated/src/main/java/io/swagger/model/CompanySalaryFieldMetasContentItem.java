package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CompanySalaryFieldMetasContentItemOldSource;
import io.swagger.model.CompanySalaryFieldMetasContentItemRoundingMode;
import io.swagger.model.CompanySalaryFieldMetasContentItemSalaryFieldValueType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompanySalaryFieldMetasContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CompanySalaryFieldMetasContentItem   {
  @JsonProperty("categoryCode")
  private String categoryCode = null;

  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("companyCostNumOp")
  private String companyCostNumOp = null;

  @JsonProperty("currentAlpsFieldName")
  private String currentAlpsFieldName = null;

  @JsonProperty("customCost")
  private Boolean customCost = null;

  @JsonProperty("exprItems")
  private String exprItems = null;

  @JsonProperty("fieldCode")
  private String fieldCode = null;

  @JsonProperty("flexField")
  private Boolean flexField = null;

  @JsonProperty("forcedTouse")
  private Boolean forcedTouse = null;

  @JsonProperty("formula")
  private String formula = null;

  @JsonProperty("formulaFrom")
  private String formulaFrom = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("meta")
  private Object meta = null;

  @JsonProperty("metaId")
  private String metaId = null;

  @JsonProperty("modifiedName")
  private Boolean modifiedName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("oldExprItems")
  private String oldExprItems = null;

  @JsonProperty("oldFormula")
  private String oldFormula = null;

  @JsonProperty("oldSource")
  private CompanySalaryFieldMetasContentItemOldSource oldSource = null;

  @JsonProperty("originSource")
  private Object originSource = null;

  @JsonProperty("pattern")
  private String pattern = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("roundingMode")
  private CompanySalaryFieldMetasContentItemRoundingMode roundingMode = null;

  @JsonProperty("salaryFieldValueType")
  private CompanySalaryFieldMetasContentItemSalaryFieldValueType salaryFieldValueType = null;

  @JsonProperty("serviceRefId")
  private String serviceRefId = null;

  @JsonProperty("source")
  private CompanySalaryFieldMetasContentItemOldSource source = null;

  @JsonProperty("sysExprItems")
  private String sysExprItems = null;

  @JsonProperty("systemFieldSetting")
  private String systemFieldSetting = null;

  @JsonProperty("systemsalaryfieldCode")
  private String systemsalaryfieldCode = null;

  @JsonProperty("systemsalaryfieldName")
  private String systemsalaryfieldName = null;

  @JsonProperty("taxTypeCode")
  private String taxTypeCode = null;

  @JsonProperty("taxTypeId")
  private String taxTypeId = null;

  @JsonProperty("taxTypeName")
  private String taxTypeName = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("typeId")
  private String typeId = null;

  @JsonProperty("typeName")
  private String typeName = null;

  @JsonProperty("useInStaffSalary")
  private Boolean useInStaffSalary = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  public CompanySalaryFieldMetasContentItem categoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
    return this;
  }

  /**
   * Get categoryCode
   * @return categoryCode
  **/
  @ApiModelProperty(example = "CUSTOM", value = "")
  
    public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public CompanySalaryFieldMetasContentItem categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  **/
  @ApiModelProperty(example = "其他项", value = "")
  
    public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public CompanySalaryFieldMetasContentItem companyCostNumOp(String companyCostNumOp) {
    this.companyCostNumOp = companyCostNumOp;
    return this;
  }

  /**
   * Get companyCostNumOp
   * @return companyCostNumOp
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyCostNumOp() {
    return companyCostNumOp;
  }

  public void setCompanyCostNumOp(String companyCostNumOp) {
    this.companyCostNumOp = companyCostNumOp;
  }

  public CompanySalaryFieldMetasContentItem currentAlpsFieldName(String currentAlpsFieldName) {
    this.currentAlpsFieldName = currentAlpsFieldName;
    return this;
  }

  /**
   * Get currentAlpsFieldName
   * @return currentAlpsFieldName
  **/
  @ApiModelProperty(example = "工作电话", value = "")
  
    public String getCurrentAlpsFieldName() {
    return currentAlpsFieldName;
  }

  public void setCurrentAlpsFieldName(String currentAlpsFieldName) {
    this.currentAlpsFieldName = currentAlpsFieldName;
  }

  public CompanySalaryFieldMetasContentItem customCost(Boolean customCost) {
    this.customCost = customCost;
    return this;
  }

  /**
   * Get customCost
   * @return customCost
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isCustomCost() {
    return customCost;
  }

  public void setCustomCost(Boolean customCost) {
    this.customCost = customCost;
  }

  public CompanySalaryFieldMetasContentItem exprItems(String exprItems) {
    this.exprItems = exprItems;
    return this;
  }

  /**
   * Get exprItems
   * @return exprItems
  **/
  @ApiModelProperty(value = "")
  
    public String getExprItems() {
    return exprItems;
  }

  public void setExprItems(String exprItems) {
    this.exprItems = exprItems;
  }

  public CompanySalaryFieldMetasContentItem fieldCode(String fieldCode) {
    this.fieldCode = fieldCode;
    return this;
  }

  /**
   * Get fieldCode
   * @return fieldCode
  **/
  @ApiModelProperty(example = "workPhone", value = "")
  
    public String getFieldCode() {
    return fieldCode;
  }

  public void setFieldCode(String fieldCode) {
    this.fieldCode = fieldCode;
  }

  public CompanySalaryFieldMetasContentItem flexField(Boolean flexField) {
    this.flexField = flexField;
    return this;
  }

  /**
   * Get flexField
   * @return flexField
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isFlexField() {
    return flexField;
  }

  public void setFlexField(Boolean flexField) {
    this.flexField = flexField;
  }

  public CompanySalaryFieldMetasContentItem forcedTouse(Boolean forcedTouse) {
    this.forcedTouse = forcedTouse;
    return this;
  }

  /**
   * Get forcedTouse
   * @return forcedTouse
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isForcedTouse() {
    return forcedTouse;
  }

  public void setForcedTouse(Boolean forcedTouse) {
    this.forcedTouse = forcedTouse;
  }

  public CompanySalaryFieldMetasContentItem formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * Get formula
   * @return formula
  **/
  @ApiModelProperty(example = "=STAFF_ROSTER$workPhone", value = "")
  
    public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public CompanySalaryFieldMetasContentItem formulaFrom(String formulaFrom) {
    this.formulaFrom = formulaFrom;
    return this;
  }

  /**
   * Get formulaFrom
   * @return formulaFrom
  **/
  @ApiModelProperty(example = "SYS", value = "")
  
    public String getFormulaFrom() {
    return formulaFrom;
  }

  public void setFormulaFrom(String formulaFrom) {
    this.formulaFrom = formulaFrom;
  }

  public CompanySalaryFieldMetasContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "3433810", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompanySalaryFieldMetasContentItem meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  
    public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public CompanySalaryFieldMetasContentItem metaId(String metaId) {
    this.metaId = metaId;
    return this;
  }

  /**
   * Get metaId
   * @return metaId
  **/
  @ApiModelProperty(example = "3433114", value = "")
  
    public String getMetaId() {
    return metaId;
  }

  public void setMetaId(String metaId) {
    this.metaId = metaId;
  }

  public CompanySalaryFieldMetasContentItem modifiedName(Boolean modifiedName) {
    this.modifiedName = modifiedName;
    return this;
  }

  /**
   * Get modifiedName
   * @return modifiedName
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isModifiedName() {
    return modifiedName;
  }

  public void setModifiedName(Boolean modifiedName) {
    this.modifiedName = modifiedName;
  }

  public CompanySalaryFieldMetasContentItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "工作电话", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanySalaryFieldMetasContentItem oldExprItems(String oldExprItems) {
    this.oldExprItems = oldExprItems;
    return this;
  }

  /**
   * Get oldExprItems
   * @return oldExprItems
  **/
  @ApiModelProperty(value = "")
  
    public String getOldExprItems() {
    return oldExprItems;
  }

  public void setOldExprItems(String oldExprItems) {
    this.oldExprItems = oldExprItems;
  }

  public CompanySalaryFieldMetasContentItem oldFormula(String oldFormula) {
    this.oldFormula = oldFormula;
    return this;
  }

  /**
   * Get oldFormula
   * @return oldFormula
  **/
  @ApiModelProperty(example = "=STAFF_ROSTER$workPhone", value = "")
  
    public String getOldFormula() {
    return oldFormula;
  }

  public void setOldFormula(String oldFormula) {
    this.oldFormula = oldFormula;
  }

  public CompanySalaryFieldMetasContentItem oldSource(CompanySalaryFieldMetasContentItemOldSource oldSource) {
    this.oldSource = oldSource;
    return this;
  }

  /**
   * Get oldSource
   * @return oldSource
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanySalaryFieldMetasContentItemOldSource getOldSource() {
    return oldSource;
  }

  public void setOldSource(CompanySalaryFieldMetasContentItemOldSource oldSource) {
    this.oldSource = oldSource;
  }

  public CompanySalaryFieldMetasContentItem originSource(Object originSource) {
    this.originSource = originSource;
    return this;
  }

  /**
   * Get originSource
   * @return originSource
  **/
  @ApiModelProperty(value = "")
  
    public Object getOriginSource() {
    return originSource;
  }

  public void setOriginSource(Object originSource) {
    this.originSource = originSource;
  }

  public CompanySalaryFieldMetasContentItem pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public CompanySalaryFieldMetasContentItem remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(value = "")
  
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public CompanySalaryFieldMetasContentItem roundingMode(CompanySalaryFieldMetasContentItemRoundingMode roundingMode) {
    this.roundingMode = roundingMode;
    return this;
  }

  /**
   * Get roundingMode
   * @return roundingMode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanySalaryFieldMetasContentItemRoundingMode getRoundingMode() {
    return roundingMode;
  }

  public void setRoundingMode(CompanySalaryFieldMetasContentItemRoundingMode roundingMode) {
    this.roundingMode = roundingMode;
  }

  public CompanySalaryFieldMetasContentItem salaryFieldValueType(CompanySalaryFieldMetasContentItemSalaryFieldValueType salaryFieldValueType) {
    this.salaryFieldValueType = salaryFieldValueType;
    return this;
  }

  /**
   * Get salaryFieldValueType
   * @return salaryFieldValueType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanySalaryFieldMetasContentItemSalaryFieldValueType getSalaryFieldValueType() {
    return salaryFieldValueType;
  }

  public void setSalaryFieldValueType(CompanySalaryFieldMetasContentItemSalaryFieldValueType salaryFieldValueType) {
    this.salaryFieldValueType = salaryFieldValueType;
  }

  public CompanySalaryFieldMetasContentItem serviceRefId(String serviceRefId) {
    this.serviceRefId = serviceRefId;
    return this;
  }

  /**
   * Get serviceRefId
   * @return serviceRefId
  **/
  @ApiModelProperty(example = "STAFF_ROSTER", value = "")
  
    public String getServiceRefId() {
    return serviceRefId;
  }

  public void setServiceRefId(String serviceRefId) {
    this.serviceRefId = serviceRefId;
  }

  public CompanySalaryFieldMetasContentItem source(CompanySalaryFieldMetasContentItemOldSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CompanySalaryFieldMetasContentItemOldSource getSource() {
    return source;
  }

  public void setSource(CompanySalaryFieldMetasContentItemOldSource source) {
    this.source = source;
  }

  public CompanySalaryFieldMetasContentItem sysExprItems(String sysExprItems) {
    this.sysExprItems = sysExprItems;
    return this;
  }

  /**
   * Get sysExprItems
   * @return sysExprItems
  **/
  @ApiModelProperty(value = "")
  
    public String getSysExprItems() {
    return sysExprItems;
  }

  public void setSysExprItems(String sysExprItems) {
    this.sysExprItems = sysExprItems;
  }

  public CompanySalaryFieldMetasContentItem systemFieldSetting(String systemFieldSetting) {
    this.systemFieldSetting = systemFieldSetting;
    return this;
  }

  /**
   * Get systemFieldSetting
   * @return systemFieldSetting
  **/
  @ApiModelProperty(value = "")
  
    public String getSystemFieldSetting() {
    return systemFieldSetting;
  }

  public void setSystemFieldSetting(String systemFieldSetting) {
    this.systemFieldSetting = systemFieldSetting;
  }

  public CompanySalaryFieldMetasContentItem systemsalaryfieldCode(String systemsalaryfieldCode) {
    this.systemsalaryfieldCode = systemsalaryfieldCode;
    return this;
  }

  /**
   * Get systemsalaryfieldCode
   * @return systemsalaryfieldCode
  **/
  @ApiModelProperty(value = "")
  
    public String getSystemsalaryfieldCode() {
    return systemsalaryfieldCode;
  }

  public void setSystemsalaryfieldCode(String systemsalaryfieldCode) {
    this.systemsalaryfieldCode = systemsalaryfieldCode;
  }

  public CompanySalaryFieldMetasContentItem systemsalaryfieldName(String systemsalaryfieldName) {
    this.systemsalaryfieldName = systemsalaryfieldName;
    return this;
  }

  /**
   * Get systemsalaryfieldName
   * @return systemsalaryfieldName
  **/
  @ApiModelProperty(value = "")
  
    public String getSystemsalaryfieldName() {
    return systemsalaryfieldName;
  }

  public void setSystemsalaryfieldName(String systemsalaryfieldName) {
    this.systemsalaryfieldName = systemsalaryfieldName;
  }

  public CompanySalaryFieldMetasContentItem taxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
    return this;
  }

  /**
   * Get taxTypeCode
   * @return taxTypeCode
  **/
  @ApiModelProperty(value = "")
  
    public String getTaxTypeCode() {
    return taxTypeCode;
  }

  public void setTaxTypeCode(String taxTypeCode) {
    this.taxTypeCode = taxTypeCode;
  }

  public CompanySalaryFieldMetasContentItem taxTypeId(String taxTypeId) {
    this.taxTypeId = taxTypeId;
    return this;
  }

  /**
   * Get taxTypeId
   * @return taxTypeId
  **/
  @ApiModelProperty(value = "")
  
    public String getTaxTypeId() {
    return taxTypeId;
  }

  public void setTaxTypeId(String taxTypeId) {
    this.taxTypeId = taxTypeId;
  }

  public CompanySalaryFieldMetasContentItem taxTypeName(String taxTypeName) {
    this.taxTypeName = taxTypeName;
    return this;
  }

  /**
   * Get taxTypeName
   * @return taxTypeName
  **/
  @ApiModelProperty(value = "")
  
    public String getTaxTypeName() {
    return taxTypeName;
  }

  public void setTaxTypeName(String taxTypeName) {
    this.taxTypeName = taxTypeName;
  }

  public CompanySalaryFieldMetasContentItem typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(example = "staff", value = "")
  
    public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public CompanySalaryFieldMetasContentItem typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(example = "21", value = "")
  
    public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public CompanySalaryFieldMetasContentItem typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(example = "员工基本信息", value = "")
  
    public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public CompanySalaryFieldMetasContentItem useInStaffSalary(Boolean useInStaffSalary) {
    this.useInStaffSalary = useInStaffSalary;
    return this;
  }

  /**
   * Get useInStaffSalary
   * @return useInStaffSalary
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isUseInStaffSalary() {
    return useInStaffSalary;
  }

  public void setUseInStaffSalary(Boolean useInStaffSalary) {
    this.useInStaffSalary = useInStaffSalary;
  }

  public CompanySalaryFieldMetasContentItem valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanySalaryFieldMetasContentItem companySalaryFieldMetasContentItem = (CompanySalaryFieldMetasContentItem) o;
    return Objects.equals(this.categoryCode, companySalaryFieldMetasContentItem.categoryCode) &&
        Objects.equals(this.categoryName, companySalaryFieldMetasContentItem.categoryName) &&
        Objects.equals(this.companyCostNumOp, companySalaryFieldMetasContentItem.companyCostNumOp) &&
        Objects.equals(this.currentAlpsFieldName, companySalaryFieldMetasContentItem.currentAlpsFieldName) &&
        Objects.equals(this.customCost, companySalaryFieldMetasContentItem.customCost) &&
        Objects.equals(this.exprItems, companySalaryFieldMetasContentItem.exprItems) &&
        Objects.equals(this.fieldCode, companySalaryFieldMetasContentItem.fieldCode) &&
        Objects.equals(this.flexField, companySalaryFieldMetasContentItem.flexField) &&
        Objects.equals(this.forcedTouse, companySalaryFieldMetasContentItem.forcedTouse) &&
        Objects.equals(this.formula, companySalaryFieldMetasContentItem.formula) &&
        Objects.equals(this.formulaFrom, companySalaryFieldMetasContentItem.formulaFrom) &&
        Objects.equals(this.id, companySalaryFieldMetasContentItem.id) &&
        Objects.equals(this.meta, companySalaryFieldMetasContentItem.meta) &&
        Objects.equals(this.metaId, companySalaryFieldMetasContentItem.metaId) &&
        Objects.equals(this.modifiedName, companySalaryFieldMetasContentItem.modifiedName) &&
        Objects.equals(this.name, companySalaryFieldMetasContentItem.name) &&
        Objects.equals(this.oldExprItems, companySalaryFieldMetasContentItem.oldExprItems) &&
        Objects.equals(this.oldFormula, companySalaryFieldMetasContentItem.oldFormula) &&
        Objects.equals(this.oldSource, companySalaryFieldMetasContentItem.oldSource) &&
        Objects.equals(this.originSource, companySalaryFieldMetasContentItem.originSource) &&
        Objects.equals(this.pattern, companySalaryFieldMetasContentItem.pattern) &&
        Objects.equals(this.remark, companySalaryFieldMetasContentItem.remark) &&
        Objects.equals(this.roundingMode, companySalaryFieldMetasContentItem.roundingMode) &&
        Objects.equals(this.salaryFieldValueType, companySalaryFieldMetasContentItem.salaryFieldValueType) &&
        Objects.equals(this.serviceRefId, companySalaryFieldMetasContentItem.serviceRefId) &&
        Objects.equals(this.source, companySalaryFieldMetasContentItem.source) &&
        Objects.equals(this.sysExprItems, companySalaryFieldMetasContentItem.sysExprItems) &&
        Objects.equals(this.systemFieldSetting, companySalaryFieldMetasContentItem.systemFieldSetting) &&
        Objects.equals(this.systemsalaryfieldCode, companySalaryFieldMetasContentItem.systemsalaryfieldCode) &&
        Objects.equals(this.systemsalaryfieldName, companySalaryFieldMetasContentItem.systemsalaryfieldName) &&
        Objects.equals(this.taxTypeCode, companySalaryFieldMetasContentItem.taxTypeCode) &&
        Objects.equals(this.taxTypeId, companySalaryFieldMetasContentItem.taxTypeId) &&
        Objects.equals(this.taxTypeName, companySalaryFieldMetasContentItem.taxTypeName) &&
        Objects.equals(this.typeCode, companySalaryFieldMetasContentItem.typeCode) &&
        Objects.equals(this.typeId, companySalaryFieldMetasContentItem.typeId) &&
        Objects.equals(this.typeName, companySalaryFieldMetasContentItem.typeName) &&
        Objects.equals(this.useInStaffSalary, companySalaryFieldMetasContentItem.useInStaffSalary) &&
        Objects.equals(this.valid, companySalaryFieldMetasContentItem.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryCode, categoryName, companyCostNumOp, currentAlpsFieldName, customCost, exprItems, fieldCode, flexField, forcedTouse, formula, formulaFrom, id, meta, metaId, modifiedName, name, oldExprItems, oldFormula, oldSource, originSource, pattern, remark, roundingMode, salaryFieldValueType, serviceRefId, source, sysExprItems, systemFieldSetting, systemsalaryfieldCode, systemsalaryfieldName, taxTypeCode, taxTypeId, taxTypeName, typeCode, typeId, typeName, useInStaffSalary, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanySalaryFieldMetasContentItem {\n");
    
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    companyCostNumOp: ").append(toIndentedString(companyCostNumOp)).append("\n");
    sb.append("    currentAlpsFieldName: ").append(toIndentedString(currentAlpsFieldName)).append("\n");
    sb.append("    customCost: ").append(toIndentedString(customCost)).append("\n");
    sb.append("    exprItems: ").append(toIndentedString(exprItems)).append("\n");
    sb.append("    fieldCode: ").append(toIndentedString(fieldCode)).append("\n");
    sb.append("    flexField: ").append(toIndentedString(flexField)).append("\n");
    sb.append("    forcedTouse: ").append(toIndentedString(forcedTouse)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    formulaFrom: ").append(toIndentedString(formulaFrom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    metaId: ").append(toIndentedString(metaId)).append("\n");
    sb.append("    modifiedName: ").append(toIndentedString(modifiedName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oldExprItems: ").append(toIndentedString(oldExprItems)).append("\n");
    sb.append("    oldFormula: ").append(toIndentedString(oldFormula)).append("\n");
    sb.append("    oldSource: ").append(toIndentedString(oldSource)).append("\n");
    sb.append("    originSource: ").append(toIndentedString(originSource)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    roundingMode: ").append(toIndentedString(roundingMode)).append("\n");
    sb.append("    salaryFieldValueType: ").append(toIndentedString(salaryFieldValueType)).append("\n");
    sb.append("    serviceRefId: ").append(toIndentedString(serviceRefId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sysExprItems: ").append(toIndentedString(sysExprItems)).append("\n");
    sb.append("    systemFieldSetting: ").append(toIndentedString(systemFieldSetting)).append("\n");
    sb.append("    systemsalaryfieldCode: ").append(toIndentedString(systemsalaryfieldCode)).append("\n");
    sb.append("    systemsalaryfieldName: ").append(toIndentedString(systemsalaryfieldName)).append("\n");
    sb.append("    taxTypeCode: ").append(toIndentedString(taxTypeCode)).append("\n");
    sb.append("    taxTypeId: ").append(toIndentedString(taxTypeId)).append("\n");
    sb.append("    taxTypeName: ").append(toIndentedString(taxTypeName)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    useInStaffSalary: ").append(toIndentedString(useInStaffSalary)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
