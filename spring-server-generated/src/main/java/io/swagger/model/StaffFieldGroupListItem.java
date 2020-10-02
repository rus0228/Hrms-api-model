package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffFieldListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffFieldGroupListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffFieldGroupListItem   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("fieldList")
  @Valid
  private List<StaffFieldListItem> fieldList = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("metaCode")
  private String metaCode = null;

  @JsonProperty("metaDataCode")
  private String metaDataCode = null;

  @JsonProperty("sortNo")
  private String sortNo = null;

  public StaffFieldGroupListItem description(String description) {
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

  public StaffFieldGroupListItem displayName(String displayName) {
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

  public StaffFieldGroupListItem fieldList(List<StaffFieldListItem> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  public StaffFieldGroupListItem addFieldListItem(StaffFieldListItem fieldListItem) {
    if (this.fieldList == null) {
      this.fieldList = new ArrayList<StaffFieldListItem>();
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
    public List<StaffFieldListItem> getFieldList() {
    return fieldList;
  }

  public void setFieldList(List<StaffFieldListItem> fieldList) {
    this.fieldList = fieldList;
  }

  public StaffFieldGroupListItem id(String id) {
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

  public StaffFieldGroupListItem metaCode(String metaCode) {
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

  public StaffFieldGroupListItem metaDataCode(String metaDataCode) {
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

  public StaffFieldGroupListItem sortNo(String sortNo) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffFieldGroupListItem staffFieldGroupListItem = (StaffFieldGroupListItem) o;
    return Objects.equals(this.description, staffFieldGroupListItem.description) &&
        Objects.equals(this.displayName, staffFieldGroupListItem.displayName) &&
        Objects.equals(this.fieldList, staffFieldGroupListItem.fieldList) &&
        Objects.equals(this.id, staffFieldGroupListItem.id) &&
        Objects.equals(this.metaCode, staffFieldGroupListItem.metaCode) &&
        Objects.equals(this.metaDataCode, staffFieldGroupListItem.metaDataCode) &&
        Objects.equals(this.sortNo, staffFieldGroupListItem.sortNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, fieldList, id, metaCode, metaDataCode, sortNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffFieldGroupListItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaCode: ").append(toIndentedString(metaCode)).append("\n");
    sb.append("    metaDataCode: ").append(toIndentedString(metaDataCode)).append("\n");
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
