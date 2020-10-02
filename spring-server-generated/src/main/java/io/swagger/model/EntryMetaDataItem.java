package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntryMetaDataFieldListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntryMetaDataItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class EntryMetaDataItem   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("engName")
  private String engName = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("fieldList")
  @Valid
  private List<EntryMetaDataFieldListItem> fieldList = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataCode")
  private String metaDataCode = null;

  @JsonProperty("sortNo")
  private String sortNo = null;

  @JsonProperty("subSetName")
  private String subSetName = null;

  public EntryMetaDataItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "默认分组", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EntryMetaDataItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "默认分组", value = "")
  
    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public EntryMetaDataItem engName(String engName) {
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

  public EntryMetaDataItem entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(value = "")
  
    public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntryMetaDataItem fieldList(List<EntryMetaDataFieldListItem> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  public EntryMetaDataItem addFieldListItem(EntryMetaDataFieldListItem fieldListItem) {
    if (this.fieldList == null) {
      this.fieldList = new ArrayList<EntryMetaDataFieldListItem>();
    }
    this.fieldList.add(fieldListItem);
    return this;
  }

  /**
   * Get fieldList
   * @return fieldList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<EntryMetaDataFieldListItem> getFieldList() {
    return fieldList;
  }

  public void setFieldList(List<EntryMetaDataFieldListItem> fieldList) {
    this.fieldList = fieldList;
  }

  public EntryMetaDataItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "22ad9aa3-7c87-4195-9db6-227f269cbd3a", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntryMetaDataItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_info.default", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public EntryMetaDataItem metaDataCode(String metaDataCode) {
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

  public EntryMetaDataItem sortNo(String sortNo) {
    this.sortNo = sortNo;
    return this;
  }

  /**
   * Get sortNo
   * @return sortNo
  **/
  @ApiModelProperty(example = "-1", value = "")
  
    public String getSortNo() {
    return sortNo;
  }

  public void setSortNo(String sortNo) {
    this.sortNo = sortNo;
  }

  public EntryMetaDataItem subSetName(String subSetName) {
    this.subSetName = subSetName;
    return this;
  }

  /**
   * Get subSetName
   * @return subSetName
  **/
  @ApiModelProperty(example = "基础信息", value = "")
  
    public String getSubSetName() {
    return subSetName;
  }

  public void setSubSetName(String subSetName) {
    this.subSetName = subSetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntryMetaDataItem entryMetaDataItem = (EntryMetaDataItem) o;
    return Objects.equals(this.description, entryMetaDataItem.description) &&
        Objects.equals(this.displayName, entryMetaDataItem.displayName) &&
        Objects.equals(this.engName, entryMetaDataItem.engName) &&
        Objects.equals(this.entityName, entryMetaDataItem.entityName) &&
        Objects.equals(this.fieldList, entryMetaDataItem.fieldList) &&
        Objects.equals(this.id, entryMetaDataItem.id) &&
        Objects.equals(this.metaCode, entryMetaDataItem.metaCode) &&
        Objects.equals(this.metaDataCode, entryMetaDataItem.metaDataCode) &&
        Objects.equals(this.sortNo, entryMetaDataItem.sortNo) &&
        Objects.equals(this.subSetName, entryMetaDataItem.subSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, engName, entityName, fieldList, id, metaCode, metaDataCode, sortNo, subSetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryMetaDataItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataCode: ").append(toIndentedString(metaDataCode)).append("\n");
    sb.append("    sortNo: ").append(toIndentedString(sortNo)).append("\n");
    sb.append("    subSetName: ").append(toIndentedString(subSetName)).append("\n");
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
