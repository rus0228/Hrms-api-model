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
 * GroupListContentItemStaffListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class GroupListContentItemStaffListItem   {
  @JsonProperty("abbr")
  private String abbr = null;

  @JsonProperty("colorIndex")
  private Integer colorIndex = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("shiftType")
  private String shiftType = null;

  @JsonProperty("workHours")
  private Integer workHours = null;

  public GroupListContentItemStaffListItem abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Get abbr
   * @return abbr
  **/
  @ApiModelProperty(example = "早九晚五点半 09:00-17:30", value = "")
  
    public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public GroupListContentItemStaffListItem colorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
    return this;
  }

  /**
   * Get colorIndex
   * @return colorIndex
  **/
  @ApiModelProperty(example = "3", value = "")
  
    public Integer getColorIndex() {
    return colorIndex;
  }

  public void setColorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
  }

  public GroupListContentItemStaffListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupListContentItemStaffListItem shiftType(String shiftType) {
    this.shiftType = shiftType;
    return this;
  }

  /**
   * Get shiftType
   * @return shiftType
  **/
  @ApiModelProperty(example = "NORMAL", value = "")
  
    public String getShiftType() {
    return shiftType;
  }

  public void setShiftType(String shiftType) {
    this.shiftType = shiftType;
  }

  public GroupListContentItemStaffListItem workHours(Integer workHours) {
    this.workHours = workHours;
    return this;
  }

  /**
   * Get workHours
   * @return workHours
  **/
  @ApiModelProperty(value = "")
  
    public Integer getWorkHours() {
    return workHours;
  }

  public void setWorkHours(Integer workHours) {
    this.workHours = workHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupListContentItemStaffListItem groupListContentItemStaffListItem = (GroupListContentItemStaffListItem) o;
    return Objects.equals(this.abbr, groupListContentItemStaffListItem.abbr) &&
        Objects.equals(this.colorIndex, groupListContentItemStaffListItem.colorIndex) &&
        Objects.equals(this.id, groupListContentItemStaffListItem.id) &&
        Objects.equals(this.shiftType, groupListContentItemStaffListItem.shiftType) &&
        Objects.equals(this.workHours, groupListContentItemStaffListItem.workHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, colorIndex, id, shiftType, workHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupListContentItemStaffListItem {\n");
    
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
    sb.append("    colorIndex: ").append(toIndentedString(colorIndex)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shiftType: ").append(toIndentedString(shiftType)).append("\n");
    sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
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
