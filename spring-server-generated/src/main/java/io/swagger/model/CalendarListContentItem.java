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
 * CalendarListContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CalendarListContentItem   {
  @JsonProperty("baseOnStatutory")
  private Boolean baseOnStatutory = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("name")
  private Boolean name = null;

  @JsonProperty("number")
  private Boolean number = null;

  @JsonProperty("specialDateEntityList")
  private Object specialDateEntityList = null;

  @JsonProperty("specialDateMap")
  private Object specialDateMap = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("workingDays")
  private String workingDays = null;

  public CalendarListContentItem baseOnStatutory(Boolean baseOnStatutory) {
    this.baseOnStatutory = baseOnStatutory;
    return this;
  }

  /**
   * Get baseOnStatutory
   * @return baseOnStatutory
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isBaseOnStatutory() {
    return baseOnStatutory;
  }

  public void setBaseOnStatutory(Boolean baseOnStatutory) {
    this.baseOnStatutory = baseOnStatutory;
  }

  public CalendarListContentItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "1592285140000", value = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CalendarListContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "0f3093a6-bd6b-41b4-9299-fe7f4eba6252", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CalendarListContentItem isDefault(Boolean isDefault) {
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

  public CalendarListContentItem name(Boolean name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isName() {
    return name;
  }

  public void setName(Boolean name) {
    this.name = name;
  }

  public CalendarListContentItem number(Boolean number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public CalendarListContentItem specialDateEntityList(Object specialDateEntityList) {
    this.specialDateEntityList = specialDateEntityList;
    return this;
  }

  /**
   * Get specialDateEntityList
   * @return specialDateEntityList
  **/
  @ApiModelProperty(value = "")
  
    public Object getSpecialDateEntityList() {
    return specialDateEntityList;
  }

  public void setSpecialDateEntityList(Object specialDateEntityList) {
    this.specialDateEntityList = specialDateEntityList;
  }

  public CalendarListContentItem specialDateMap(Object specialDateMap) {
    this.specialDateMap = specialDateMap;
    return this;
  }

  /**
   * Get specialDateMap
   * @return specialDateMap
  **/
  @ApiModelProperty(value = "")
  
    public Object getSpecialDateMap() {
    return specialDateMap;
  }

  public void setSpecialDateMap(Object specialDateMap) {
    this.specialDateMap = specialDateMap;
  }

  public CalendarListContentItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "WEEKLY", value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CalendarListContentItem workingDays(String workingDays) {
    this.workingDays = workingDays;
    return this;
  }

  /**
   * Get workingDays
   * @return workingDays
  **/
  @ApiModelProperty(example = "1111100", value = "")
  
    public String getWorkingDays() {
    return workingDays;
  }

  public void setWorkingDays(String workingDays) {
    this.workingDays = workingDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarListContentItem calendarListContentItem = (CalendarListContentItem) o;
    return Objects.equals(this.baseOnStatutory, calendarListContentItem.baseOnStatutory) &&
        Objects.equals(this.createdAt, calendarListContentItem.createdAt) &&
        Objects.equals(this.id, calendarListContentItem.id) &&
        Objects.equals(this.isDefault, calendarListContentItem.isDefault) &&
        Objects.equals(this.name, calendarListContentItem.name) &&
        Objects.equals(this.number, calendarListContentItem.number) &&
        Objects.equals(this.specialDateEntityList, calendarListContentItem.specialDateEntityList) &&
        Objects.equals(this.specialDateMap, calendarListContentItem.specialDateMap) &&
        Objects.equals(this.type, calendarListContentItem.type) &&
        Objects.equals(this.workingDays, calendarListContentItem.workingDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseOnStatutory, createdAt, id, isDefault, name, number, specialDateEntityList, specialDateMap, type, workingDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarListContentItem {\n");
    
    sb.append("    baseOnStatutory: ").append(toIndentedString(baseOnStatutory)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    specialDateEntityList: ").append(toIndentedString(specialDateEntityList)).append("\n");
    sb.append("    specialDateMap: ").append(toIndentedString(specialDateMap)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
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
