package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShiftListContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ShiftListContentItem   {
  @JsonProperty("abbr")
  private String abbr = null;

  @JsonProperty("actualAttendanceRule")
  private String actualAttendanceRule = null;

  @JsonProperty("colorIndex")
  private String colorIndex = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("isDelayWork")
  private Boolean isDelayWork = null;

  @JsonProperty("isFlexible")
  private Boolean isFlexible = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("number")
  private BigDecimal number = null;

  @JsonProperty("shiftType")
  private String shiftType = null;

  @JsonProperty("showTime")
  private String showTime = null;

  @JsonProperty("workHours")
  private BigDecimal workHours = null;

  @JsonProperty("workTime")
  @Valid
  private List<String> workTime = null;

  public ShiftListContentItem abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Get abbr
   * @return abbr
  **/
  @ApiModelProperty(example = "早九", value = "")
  
    public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public ShiftListContentItem actualAttendanceRule(String actualAttendanceRule) {
    this.actualAttendanceRule = actualAttendanceRule;
    return this;
  }

  /**
   * Get actualAttendanceRule
   * @return actualAttendanceRule
  **/
  @ApiModelProperty(example = "CROSS_SIGN", value = "")
  
    public String getActualAttendanceRule() {
    return actualAttendanceRule;
  }

  public void setActualAttendanceRule(String actualAttendanceRule) {
    this.actualAttendanceRule = actualAttendanceRule;
  }

  public ShiftListContentItem colorIndex(String colorIndex) {
    this.colorIndex = colorIndex;
    return this;
  }

  /**
   * Get colorIndex
   * @return colorIndex
  **/
  @ApiModelProperty(example = "3", value = "")
  
    public String getColorIndex() {
    return colorIndex;
  }

  public void setColorIndex(String colorIndex) {
    this.colorIndex = colorIndex;
  }

  public ShiftListContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "5c2a0087-fd18-4f47-a0f5-aae52cf4f336", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShiftListContentItem isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ShiftListContentItem isDelayWork(Boolean isDelayWork) {
    this.isDelayWork = isDelayWork;
    return this;
  }

  /**
   * Get isDelayWork
   * @return isDelayWork
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsDelayWork() {
    return isDelayWork;
  }

  public void setIsDelayWork(Boolean isDelayWork) {
    this.isDelayWork = isDelayWork;
  }

  public ShiftListContentItem isFlexible(Boolean isFlexible) {
    this.isFlexible = isFlexible;
    return this;
  }

  /**
   * Get isFlexible
   * @return isFlexible
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsFlexible() {
    return isFlexible;
  }

  public void setIsFlexible(Boolean isFlexible) {
    this.isFlexible = isFlexible;
  }

  public ShiftListContentItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "早九晚五点半", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShiftListContentItem number(BigDecimal number) {
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

  public ShiftListContentItem shiftType(String shiftType) {
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

  public ShiftListContentItem showTime(String showTime) {
    this.showTime = showTime;
    return this;
  }

  /**
   * Get showTime
   * @return showTime
  **/
  @ApiModelProperty(value = "")
  
    public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public ShiftListContentItem workHours(BigDecimal workHours) {
    this.workHours = workHours;
    return this;
  }

  /**
   * Get workHours
   * @return workHours
  **/
  @ApiModelProperty(example = "7.5", value = "")
  
    @Valid
    public BigDecimal getWorkHours() {
    return workHours;
  }

  public void setWorkHours(BigDecimal workHours) {
    this.workHours = workHours;
  }

  public ShiftListContentItem workTime(List<String> workTime) {
    this.workTime = workTime;
    return this;
  }

  public ShiftListContentItem addWorkTimeItem(String workTimeItem) {
    if (this.workTime == null) {
      this.workTime = new ArrayList<String>();
    }
    this.workTime.add(workTimeItem);
    return this;
  }

  /**
   * Get workTime
   * @return workTime
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getWorkTime() {
    return workTime;
  }

  public void setWorkTime(List<String> workTime) {
    this.workTime = workTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftListContentItem shiftListContentItem = (ShiftListContentItem) o;
    return Objects.equals(this.abbr, shiftListContentItem.abbr) &&
        Objects.equals(this.actualAttendanceRule, shiftListContentItem.actualAttendanceRule) &&
        Objects.equals(this.colorIndex, shiftListContentItem.colorIndex) &&
        Objects.equals(this.id, shiftListContentItem.id) &&
        Objects.equals(this.isDefault, shiftListContentItem.isDefault) &&
        Objects.equals(this.isDelayWork, shiftListContentItem.isDelayWork) &&
        Objects.equals(this.isFlexible, shiftListContentItem.isFlexible) &&
        Objects.equals(this.name, shiftListContentItem.name) &&
        Objects.equals(this.number, shiftListContentItem.number) &&
        Objects.equals(this.shiftType, shiftListContentItem.shiftType) &&
        Objects.equals(this.showTime, shiftListContentItem.showTime) &&
        Objects.equals(this.workHours, shiftListContentItem.workHours) &&
        Objects.equals(this.workTime, shiftListContentItem.workTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, actualAttendanceRule, colorIndex, id, isDefault, isDelayWork, isFlexible, name, number, shiftType, showTime, workHours, workTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftListContentItem {\n");
    
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
    sb.append("    actualAttendanceRule: ").append(toIndentedString(actualAttendanceRule)).append("\n");
    sb.append("    colorIndex: ").append(toIndentedString(colorIndex)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDelayWork: ").append(toIndentedString(isDelayWork)).append("\n");
    sb.append("    isFlexible: ").append(toIndentedString(isFlexible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    shiftType: ").append(toIndentedString(shiftType)).append("\n");
    sb.append("    showTime: ").append(toIndentedString(showTime)).append("\n");
    sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
    sb.append("    workTime: ").append(toIndentedString(workTime)).append("\n");
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
