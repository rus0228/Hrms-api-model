package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FieldGroupListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffFlexMetaDataDataStaffEducation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffFlexMetaDataDataStaffEducation   {
  @JsonProperty("childrenFunctionAuth")
  private Object childrenFunctionAuth = null;

  @JsonProperty("childrenFunctionCodes")
  private String childrenFunctionCodes = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("createUserId")
  private String createUserId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("fieldGroupList")
  @Valid
  private List<FieldGroupListItem> fieldGroupList = null;

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

  @JsonProperty("lateUpdateTime")
  private String lateUpdateTime = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataType")
  private String metaDataType = null;

  @JsonProperty("sortNo")
  private String sortNo = null;

  @JsonProperty("tableName")
  private String tableName = null;

  @JsonProperty("updateOperatorMobile")
  private String updateOperatorMobile = null;

  @JsonProperty("updateOperatorName")
  private String updateOperatorName = null;

  @JsonProperty("usingInSalary")
  private String usingInSalary = null;

  @JsonProperty("usingInStaffRoster")
  private String usingInStaffRoster = null;

  public StaffFlexMetaDataDataStaffEducation childrenFunctionAuth(Object childrenFunctionAuth) {
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

  public StaffFlexMetaDataDataStaffEducation childrenFunctionCodes(String childrenFunctionCodes) {
    this.childrenFunctionCodes = childrenFunctionCodes;
    return this;
  }

  /**
   * Get childrenFunctionCodes
   * @return childrenFunctionCodes
  **/
  @ApiModelProperty(value = "")
  
    public String getChildrenFunctionCodes() {
    return childrenFunctionCodes;
  }

  public void setChildrenFunctionCodes(String childrenFunctionCodes) {
    this.childrenFunctionCodes = childrenFunctionCodes;
  }

  public StaffFlexMetaDataDataStaffEducation companyId(String companyId) {
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

  public StaffFlexMetaDataDataStaffEducation createUserId(String createUserId) {
    this.createUserId = createUserId;
    return this;
  }

  /**
   * Get createUserId
   * @return createUserId
  **/
  @ApiModelProperty(value = "")
  
    public String getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public StaffFlexMetaDataDataStaffEducation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "教育信息", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StaffFlexMetaDataDataStaffEducation displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "教育经历", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public StaffFlexMetaDataDataStaffEducation entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(example = "cn.irenshi.meta.dto.roster.mysql.StaffEducation", value = "")
  
    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public StaffFlexMetaDataDataStaffEducation fieldGroupList(List<FieldGroupListItem> fieldGroupList) {
    this.fieldGroupList = fieldGroupList;
    return this;
  }

  public StaffFlexMetaDataDataStaffEducation addFieldGroupListItem(FieldGroupListItem fieldGroupListItem) {
    if (this.fieldGroupList == null) {
      this.fieldGroupList = new ArrayList<FieldGroupListItem>();
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
    public List<FieldGroupListItem> getFieldGroupList() {
    return fieldGroupList;
  }

  public void setFieldGroupList(List<FieldGroupListItem> fieldGroupList) {
    this.fieldGroupList = fieldGroupList;
  }

  public StaffFlexMetaDataDataStaffEducation functionCode(String functionCode) {
    this.functionCode = functionCode;
    return this;
  }

  /**
   * Get functionCode
   * @return functionCode
  **/
  @ApiModelProperty(example = "tab_staff_education", value = "")
  
    public String getFunctionCode() {
    return functionCode;
  }

  public void setFunctionCode(String functionCode) {
    this.functionCode = functionCode;
  }

  public StaffFlexMetaDataDataStaffEducation hasAuthority(Boolean hasAuthority) {
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

  public StaffFlexMetaDataDataStaffEducation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "tab_staff_education", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffFlexMetaDataDataStaffEducation isApprove(Boolean isApprove) {
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

  public StaffFlexMetaDataDataStaffEducation isHide(Boolean isHide) {
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

  public StaffFlexMetaDataDataStaffEducation isReadOnly(Boolean isReadOnly) {
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

  public StaffFlexMetaDataDataStaffEducation isSubSet(Boolean isSubSet) {
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

  public StaffFlexMetaDataDataStaffEducation isUpdate(Boolean isUpdate) {
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

  public StaffFlexMetaDataDataStaffEducation isValid(Boolean isValid) {
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

  public StaffFlexMetaDataDataStaffEducation lateUpdateTime(String lateUpdateTime) {
    this.lateUpdateTime = lateUpdateTime;
    return this;
  }

  /**
   * Get lateUpdateTime
   * @return lateUpdateTime
  **/
  @ApiModelProperty(value = "")
  
    public String getLateUpdateTime() {
    return lateUpdateTime;
  }

  public void setLateUpdateTime(String lateUpdateTime) {
    this.lateUpdateTime = lateUpdateTime;
  }

  public StaffFlexMetaDataDataStaffEducation metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_education", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public StaffFlexMetaDataDataStaffEducation metaDataType(String metaDataType) {
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

  public StaffFlexMetaDataDataStaffEducation sortNo(String sortNo) {
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

  public StaffFlexMetaDataDataStaffEducation tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
  **/
  @ApiModelProperty(example = "tab_staff_education_flex", value = "")
  
    public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public StaffFlexMetaDataDataStaffEducation updateOperatorMobile(String updateOperatorMobile) {
    this.updateOperatorMobile = updateOperatorMobile;
    return this;
  }

  /**
   * Get updateOperatorMobile
   * @return updateOperatorMobile
  **/
  @ApiModelProperty(value = "")
  
    public String getUpdateOperatorMobile() {
    return updateOperatorMobile;
  }

  public void setUpdateOperatorMobile(String updateOperatorMobile) {
    this.updateOperatorMobile = updateOperatorMobile;
  }

  public StaffFlexMetaDataDataStaffEducation updateOperatorName(String updateOperatorName) {
    this.updateOperatorName = updateOperatorName;
    return this;
  }

  /**
   * Get updateOperatorName
   * @return updateOperatorName
  **/
  @ApiModelProperty(value = "")
  
    public String getUpdateOperatorName() {
    return updateOperatorName;
  }

  public void setUpdateOperatorName(String updateOperatorName) {
    this.updateOperatorName = updateOperatorName;
  }

  public StaffFlexMetaDataDataStaffEducation usingInSalary(String usingInSalary) {
    this.usingInSalary = usingInSalary;
    return this;
  }

  /**
   * Get usingInSalary
   * @return usingInSalary
  **/
  @ApiModelProperty(value = "")
  
    public String getUsingInSalary() {
    return usingInSalary;
  }

  public void setUsingInSalary(String usingInSalary) {
    this.usingInSalary = usingInSalary;
  }

  public StaffFlexMetaDataDataStaffEducation usingInStaffRoster(String usingInStaffRoster) {
    this.usingInStaffRoster = usingInStaffRoster;
    return this;
  }

  /**
   * Get usingInStaffRoster
   * @return usingInStaffRoster
  **/
  @ApiModelProperty(value = "")
  
    public String getUsingInStaffRoster() {
    return usingInStaffRoster;
  }

  public void setUsingInStaffRoster(String usingInStaffRoster) {
    this.usingInStaffRoster = usingInStaffRoster;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffFlexMetaDataDataStaffEducation staffFlexMetaDataDataStaffEducation = (StaffFlexMetaDataDataStaffEducation) o;
    return Objects.equals(this.childrenFunctionAuth, staffFlexMetaDataDataStaffEducation.childrenFunctionAuth) &&
        Objects.equals(this.childrenFunctionCodes, staffFlexMetaDataDataStaffEducation.childrenFunctionCodes) &&
        Objects.equals(this.companyId, staffFlexMetaDataDataStaffEducation.companyId) &&
        Objects.equals(this.createUserId, staffFlexMetaDataDataStaffEducation.createUserId) &&
        Objects.equals(this.description, staffFlexMetaDataDataStaffEducation.description) &&
        Objects.equals(this.displayName, staffFlexMetaDataDataStaffEducation.displayName) &&
        Objects.equals(this.entityName, staffFlexMetaDataDataStaffEducation.entityName) &&
        Objects.equals(this.fieldGroupList, staffFlexMetaDataDataStaffEducation.fieldGroupList) &&
        Objects.equals(this.functionCode, staffFlexMetaDataDataStaffEducation.functionCode) &&
        Objects.equals(this.hasAuthority, staffFlexMetaDataDataStaffEducation.hasAuthority) &&
        Objects.equals(this.id, staffFlexMetaDataDataStaffEducation.id) &&
        Objects.equals(this.isApprove, staffFlexMetaDataDataStaffEducation.isApprove) &&
        Objects.equals(this.isHide, staffFlexMetaDataDataStaffEducation.isHide) &&
        Objects.equals(this.isReadOnly, staffFlexMetaDataDataStaffEducation.isReadOnly) &&
        Objects.equals(this.isSubSet, staffFlexMetaDataDataStaffEducation.isSubSet) &&
        Objects.equals(this.isUpdate, staffFlexMetaDataDataStaffEducation.isUpdate) &&
        Objects.equals(this.isValid, staffFlexMetaDataDataStaffEducation.isValid) &&
        Objects.equals(this.lateUpdateTime, staffFlexMetaDataDataStaffEducation.lateUpdateTime) &&
        Objects.equals(this.metaCode, staffFlexMetaDataDataStaffEducation.metaCode) &&
        Objects.equals(this.metaDataType, staffFlexMetaDataDataStaffEducation.metaDataType) &&
        Objects.equals(this.sortNo, staffFlexMetaDataDataStaffEducation.sortNo) &&
        Objects.equals(this.tableName, staffFlexMetaDataDataStaffEducation.tableName) &&
        Objects.equals(this.updateOperatorMobile, staffFlexMetaDataDataStaffEducation.updateOperatorMobile) &&
        Objects.equals(this.updateOperatorName, staffFlexMetaDataDataStaffEducation.updateOperatorName) &&
        Objects.equals(this.usingInSalary, staffFlexMetaDataDataStaffEducation.usingInSalary) &&
        Objects.equals(this.usingInStaffRoster, staffFlexMetaDataDataStaffEducation.usingInStaffRoster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childrenFunctionAuth, childrenFunctionCodes, companyId, createUserId, description, displayName, entityName, fieldGroupList, functionCode, hasAuthority, id, isApprove, isHide, isReadOnly, isSubSet, isUpdate, isValid, lateUpdateTime, metaCode, metaDataType, sortNo, tableName, updateOperatorMobile, updateOperatorName, usingInSalary, usingInStaffRoster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffFlexMetaDataDataStaffEducation {\n");
    
    sb.append("    childrenFunctionAuth: ").append(toIndentedString(childrenFunctionAuth)).append("\n");
    sb.append("    childrenFunctionCodes: ").append(toIndentedString(childrenFunctionCodes)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
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
    sb.append("    lateUpdateTime: ").append(toIndentedString(lateUpdateTime)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataType: ").append(toIndentedString(metaDataType)).append("\n");
    sb.append("    sortNo: ").append(toIndentedString(sortNo)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    updateOperatorMobile: ").append(toIndentedString(updateOperatorMobile)).append("\n");
    sb.append("    updateOperatorName: ").append(toIndentedString(updateOperatorName)).append("\n");
    sb.append("    usingInSalary: ").append(toIndentedString(usingInSalary)).append("\n");
    sb.append("    usingInStaffRoster: ").append(toIndentedString(usingInStaffRoster)).append("\n");
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
