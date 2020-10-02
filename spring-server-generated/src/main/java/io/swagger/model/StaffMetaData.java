package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffFieldGroupListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffMetaData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffMetaData   {
  @JsonProperty("childrenFunctionAuth")
  private Object childrenFunctionAuth = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("fieldGroupList")
  @Valid
  private List<StaffFieldGroupListItem> fieldGroupList = null;

  @JsonProperty("functionCode")
  private String functionCode = null;

  @JsonProperty("hasAuthority")
  private Boolean hasAuthority = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isApprove")
  private Boolean isApprove = null;

  @JsonProperty("isHide")
  private Boolean isHide = null;

  @JsonProperty("isReadOnly")
  private Boolean isReadOnly = null;

  @JsonProperty("isSubSet")
  private Boolean isSubSet = null;

  @JsonProperty("isUpdate")
  private Boolean isUpdate = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataType")
  private String metaDataType = null;

  @JsonProperty("sortNo")
  private Long sortNo = null;

  @JsonProperty("tableName")
  private String tableName = null;

  public StaffMetaData childrenFunctionAuth(Object childrenFunctionAuth) {
    this.childrenFunctionAuth = childrenFunctionAuth;
    return this;
  }

  /**
   * Get childrenFunctionAuth
   * @return childrenFunctionAuth
  **/
  @ApiModelProperty(example = "{}", value = "")
  
    public Object getChildrenFunctionAuth() {
    return childrenFunctionAuth;
  }

  public void setChildrenFunctionAuth(Object childrenFunctionAuth) {
    this.childrenFunctionAuth = childrenFunctionAuth;
  }

  public StaffMetaData companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(example = "36dbfa02cbe54b11a5543d46b5112168", value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public StaffMetaData description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "基础信息", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StaffMetaData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "基础信息", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public StaffMetaData entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(example = "cn.irenshi.meta.dto.roster.mysql.StaffInfo", value = "")
  
    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public StaffMetaData fieldGroupList(List<StaffFieldGroupListItem> fieldGroupList) {
    this.fieldGroupList = fieldGroupList;
    return this;
  }

  public StaffMetaData addFieldGroupListItem(StaffFieldGroupListItem fieldGroupListItem) {
    if (this.fieldGroupList == null) {
      this.fieldGroupList = new ArrayList<StaffFieldGroupListItem>();
    }
    this.fieldGroupList.add(fieldGroupListItem);
    return this;
  }

  /**
   * Get fieldGroupList
   * @return fieldGroupList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<StaffFieldGroupListItem> getFieldGroupList() {
    return fieldGroupList;
  }

  public void setFieldGroupList(List<StaffFieldGroupListItem> fieldGroupList) {
    this.fieldGroupList = fieldGroupList;
  }

  public StaffMetaData functionCode(String functionCode) {
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

  public StaffMetaData hasAuthority(Boolean hasAuthority) {
    this.hasAuthority = hasAuthority;
    return this;
  }

  /**
   * Get hasAuthority
   * @return hasAuthority
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isHasAuthority() {
    return hasAuthority;
  }

  public void setHasAuthority(Boolean hasAuthority) {
    this.hasAuthority = hasAuthority;
  }

  public StaffMetaData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffMetaData isApprove(Boolean isApprove) {
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

  public StaffMetaData isHide(Boolean isHide) {
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

  public StaffMetaData isReadOnly(Boolean isReadOnly) {
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

  public StaffMetaData isSubSet(Boolean isSubSet) {
    this.isSubSet = isSubSet;
    return this;
  }

  /**
   * Get isSubSet
   * @return isSubSet
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsSubSet() {
    return isSubSet;
  }

  public void setIsSubSet(Boolean isSubSet) {
    this.isSubSet = isSubSet;
  }

  public StaffMetaData isUpdate(Boolean isUpdate) {
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

  public StaffMetaData isValid(Boolean isValid) {
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

  public StaffMetaData metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_info", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public StaffMetaData metaDataType(String metaDataType) {
    this.metaDataType = metaDataType;
    return this;
  }

  /**
   * Get metaDataType
   * @return metaDataType
  **/
  @ApiModelProperty(example = "ENTITY", value = "")
  
    public String getMetaDataType() {
    return metaDataType;
  }

  public void setMetaDataType(String metaDataType) {
    this.metaDataType = metaDataType;
  }

  public StaffMetaData sortNo(Long sortNo) {
    this.sortNo = sortNo;
    return this;
  }

  /**
   * Get sortNo
   * @return sortNo
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Long getSortNo() {
    return sortNo;
  }

  public void setSortNo(Long sortNo) {
    this.sortNo = sortNo;
  }

  public StaffMetaData tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(example = "tab_staff_info_flex", value = "")
  
    public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffMetaData staffMetaData = (StaffMetaData) o;
    return Objects.equals(this.childrenFunctionAuth, staffMetaData.childrenFunctionAuth) &&
        Objects.equals(this.companyId, staffMetaData.companyId) &&
        Objects.equals(this.description, staffMetaData.description) &&
        Objects.equals(this.displayName, staffMetaData.displayName) &&
        Objects.equals(this.entityName, staffMetaData.entityName) &&
        Objects.equals(this.fieldGroupList, staffMetaData.fieldGroupList) &&
        Objects.equals(this.functionCode, staffMetaData.functionCode) &&
        Objects.equals(this.hasAuthority, staffMetaData.hasAuthority) &&
        Objects.equals(this.id, staffMetaData.id) &&
        Objects.equals(this.isApprove, staffMetaData.isApprove) &&
        Objects.equals(this.isHide, staffMetaData.isHide) &&
        Objects.equals(this.isReadOnly, staffMetaData.isReadOnly) &&
        Objects.equals(this.isSubSet, staffMetaData.isSubSet) &&
        Objects.equals(this.isUpdate, staffMetaData.isUpdate) &&
        Objects.equals(this.isValid, staffMetaData.isValid) &&
        Objects.equals(this.metaCode, staffMetaData.metaCode) &&
        Objects.equals(this.metaDataType, staffMetaData.metaDataType) &&
        Objects.equals(this.sortNo, staffMetaData.sortNo) &&
        Objects.equals(this.tableName, staffMetaData.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childrenFunctionAuth, companyId, description, displayName, entityName, fieldGroupList, functionCode, hasAuthority, id, isApprove, isHide, isReadOnly, isSubSet, isUpdate, isValid, metaCode, metaDataType, sortNo, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffMetaData {\n");
    
    sb.append("    childrenFunctionAuth: ").append(toIndentedString(childrenFunctionAuth)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    fieldGroupList: ").append(toIndentedString(fieldGroupList)).append("\n");
    sb.append("    functionCode: ").append(toIndentedString(functionCode)).append("\n");
    sb.append("    hasAuthority: ").append(toIndentedString(hasAuthority)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isApprove: ").append(toIndentedString(isApprove)).append("\n");
    sb.append("    isHide: ").append(toIndentedString(isHide)).append("\n");
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isSubSet: ").append(toIndentedString(isSubSet)).append("\n");
    sb.append("    isUpdate: ").append(toIndentedString(isUpdate)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataType: ").append(toIndentedString(metaDataType)).append("\n");
    sb.append("    sortNo: ").append(toIndentedString(sortNo)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
