package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GroupListContentItemStaffListItem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupListContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class GroupListContentItem   {
  @JsonProperty("allShift")
  private String allShift = null;

  @JsonProperty("arrangerNames")
  @Valid
  private List<String> arrangerNames = null;

  @JsonProperty("calendarName")
  private String calendarName = null;

  @JsonProperty("departmentNames")
  @Valid
  private List<String> departmentNames = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("number")
  private BigDecimal number = null;

  @JsonProperty("positionNames")
  @Valid
  private List<String> positionNames = null;

  @JsonProperty("shiftList")
  @Valid
  private List<GroupListContentItemStaffListItem> shiftList = null;

  @JsonProperty("staffNames")
  @Valid
  private List<String> staffNames = null;

  public GroupListContentItem allShift(String allShift) {
    this.allShift = allShift;
    return this;
  }

  /**
   * Get allShift
   * @return allShift
  **/
  @ApiModelProperty(value = "")
  
    public String getAllShift() {
    return allShift;
  }

  public void setAllShift(String allShift) {
    this.allShift = allShift;
  }

  public GroupListContentItem arrangerNames(List<String> arrangerNames) {
    this.arrangerNames = arrangerNames;
    return this;
  }

  public GroupListContentItem addArrangerNamesItem(String arrangerNamesItem) {
    if (this.arrangerNames == null) {
      this.arrangerNames = new ArrayList<String>();
    }
    this.arrangerNames.add(arrangerNamesItem);
    return this;
  }

  /**
   * Get arrangerNames
   * @return arrangerNames
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getArrangerNames() {
    return arrangerNames;
  }

  public void setArrangerNames(List<String> arrangerNames) {
    this.arrangerNames = arrangerNames;
  }

  public GroupListContentItem calendarName(String calendarName) {
    this.calendarName = calendarName;
    return this;
  }

  /**
   * Get calendarName
   * @return calendarName
  **/
  @ApiModelProperty(example = "做五休二", value = "")
  
    public String getCalendarName() {
    return calendarName;
  }

  public void setCalendarName(String calendarName) {
    this.calendarName = calendarName;
  }

  public GroupListContentItem departmentNames(List<String> departmentNames) {
    this.departmentNames = departmentNames;
    return this;
  }

  public GroupListContentItem addDepartmentNamesItem(String departmentNamesItem) {
    if (this.departmentNames == null) {
      this.departmentNames = new ArrayList<String>();
    }
    this.departmentNames.add(departmentNamesItem);
    return this;
  }

  /**
   * Get departmentNames
   * @return departmentNames
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getDepartmentNames() {
    return departmentNames;
  }

  public void setDepartmentNames(List<String> departmentNames) {
    this.departmentNames = departmentNames;
  }

  public GroupListContentItem groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "7ee84af9-ae1b-4ff7-b49d-b71988e22a9c", value = "")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GroupListContentItem groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(example = "固定分组", value = "")
  
    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public GroupListContentItem number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "1", value = "")
  
    @Valid
    public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public GroupListContentItem positionNames(List<String> positionNames) {
    this.positionNames = positionNames;
    return this;
  }

  public GroupListContentItem addPositionNamesItem(String positionNamesItem) {
    if (this.positionNames == null) {
      this.positionNames = new ArrayList<String>();
    }
    this.positionNames.add(positionNamesItem);
    return this;
  }

  /**
   * Get positionNames
   * @return positionNames
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getPositionNames() {
    return positionNames;
  }

  public void setPositionNames(List<String> positionNames) {
    this.positionNames = positionNames;
  }

  public GroupListContentItem shiftList(List<GroupListContentItemStaffListItem> shiftList) {
    this.shiftList = shiftList;
    return this;
  }

  public GroupListContentItem addShiftListItem(GroupListContentItemStaffListItem shiftListItem) {
    if (this.shiftList == null) {
      this.shiftList = new ArrayList<GroupListContentItemStaffListItem>();
    }
    this.shiftList.add(shiftListItem);
    return this;
  }

  /**
   * Get shiftList
   * @return shiftList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<GroupListContentItemStaffListItem> getShiftList() {
    return shiftList;
  }

  public void setShiftList(List<GroupListContentItemStaffListItem> shiftList) {
    this.shiftList = shiftList;
  }

  public GroupListContentItem staffNames(List<String> staffNames) {
    this.staffNames = staffNames;
    return this;
  }

  public GroupListContentItem addStaffNamesItem(String staffNamesItem) {
    if (this.staffNames == null) {
      this.staffNames = new ArrayList<String>();
    }
    this.staffNames.add(staffNamesItem);
    return this;
  }

  /**
   * Get staffNames
   * @return staffNames
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getStaffNames() {
    return staffNames;
  }

  public void setStaffNames(List<String> staffNames) {
    this.staffNames = staffNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupListContentItem groupListContentItem = (GroupListContentItem) o;
    return Objects.equals(this.allShift, groupListContentItem.allShift) &&
        Objects.equals(this.arrangerNames, groupListContentItem.arrangerNames) &&
        Objects.equals(this.calendarName, groupListContentItem.calendarName) &&
        Objects.equals(this.departmentNames, groupListContentItem.departmentNames) &&
        Objects.equals(this.groupId, groupListContentItem.groupId) &&
        Objects.equals(this.groupName, groupListContentItem.groupName) &&
        Objects.equals(this.number, groupListContentItem.number) &&
        Objects.equals(this.positionNames, groupListContentItem.positionNames) &&
        Objects.equals(this.shiftList, groupListContentItem.shiftList) &&
        Objects.equals(this.staffNames, groupListContentItem.staffNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allShift, arrangerNames, calendarName, departmentNames, groupId, groupName, number, positionNames, shiftList, staffNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupListContentItem {\n");
    
    sb.append("    allShift: ").append(toIndentedString(allShift)).append("\n");
    sb.append("    arrangerNames: ").append(toIndentedString(arrangerNames)).append("\n");
    sb.append("    calendarName: ").append(toIndentedString(calendarName)).append("\n");
    sb.append("    departmentNames: ").append(toIndentedString(departmentNames)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    positionNames: ").append(toIndentedString(positionNames)).append("\n");
    sb.append("    shiftList: ").append(toIndentedString(shiftList)).append("\n");
    sb.append("    staffNames: ").append(toIndentedString(staffNames)).append("\n");
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
