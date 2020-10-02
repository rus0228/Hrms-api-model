package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FieldGroupListItemFieldListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FieldGroupListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class FieldGroupListItem   {
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
  private List<FieldGroupListItemFieldListItem> fieldList = null;

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

  public FieldGroupListItem description(String description) {
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

  public FieldGroupListItem displayName(String displayName) {
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

  public FieldGroupListItem engName(String engName) {
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

  public FieldGroupListItem entityName(String entityName) {
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

  public FieldGroupListItem fieldList(List<FieldGroupListItemFieldListItem> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  public FieldGroupListItem addFieldListItem(FieldGroupListItemFieldListItem fieldListItem) {
    if (this.fieldList == null) {
      this.fieldList = new ArrayList<FieldGroupListItemFieldListItem>();
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
    public List<FieldGroupListItemFieldListItem> getFieldList() {
    return fieldList;
  }

  public void setFieldList(List<FieldGroupListItemFieldListItem> fieldList) {
    this.fieldList = fieldList;
  }

  public FieldGroupListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "e0747fc8-5d39-4610-8d4d-4b561d8932fe", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FieldGroupListItem metaCode(String metaCode) {
    this.metaCode = metaCode;
    return this;
  }

  /**
   * Get metaCode
   * @return metaCode
  **/
  @ApiModelProperty(example = "tab_staff_certificate.default", value = "")
  
    public String getMetaCode() {
    return metaCode;
  }

  public void setMetaCode(String metaCode) {
    this.metaCode = metaCode;
  }

  public FieldGroupListItem metaDataCode(String metaDataCode) {
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

  public FieldGroupListItem sortNo(String sortNo) {
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

  public FieldGroupListItem subSetName(String subSetName) {
    this.subSetName = subSetName;
    return this;
  }

  /**
   * Get subSetName
   * @return subSetName
  **/
  @ApiModelProperty(value = "")
  
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
    FieldGroupListItem fieldGroupListItem = (FieldGroupListItem) o;
    return Objects.equals(this.description, fieldGroupListItem.description) &&
        Objects.equals(this.displayName, fieldGroupListItem.displayName) &&
        Objects.equals(this.engName, fieldGroupListItem.engName) &&
        Objects.equals(this.entityName, fieldGroupListItem.entityName) &&
        Objects.equals(this.fieldList, fieldGroupListItem.fieldList) &&
        Objects.equals(this.id, fieldGroupListItem.id) &&
        Objects.equals(this.metaCode, fieldGroupListItem.metaCode) &&
        Objects.equals(this.metaDataCode, fieldGroupListItem.metaDataCode) &&
        Objects.equals(this.sortNo, fieldGroupListItem.sortNo) &&
        Objects.equals(this.subSetName, fieldGroupListItem.subSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, engName, entityName, fieldList, id, metaCode, metaDataCode, sortNo, subSetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldGroupListItem {\n");
    
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
