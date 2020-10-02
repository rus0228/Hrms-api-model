package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActualListDateItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ActualListDateItem   {
  @JsonProperty("day")
  private Integer day = null;

  @JsonProperty("holidayName")
  private String holidayName = null;

  @JsonProperty("isWorkingDay")
  private Boolean isWorkingDay = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("planDate")
  private LocalDate planDate = null;

  @JsonProperty("weekDay")
  private String weekDay = null;

  public ActualListDateItem day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public ActualListDateItem holidayName(String holidayName) {
    this.holidayName = holidayName;
    return this;
  }

  /**
   * Get holidayName
   * @return holidayName
  **/
  @ApiModelProperty(value = "")
  
    public String getHolidayName() {
    return holidayName;
  }

  public void setHolidayName(String holidayName) {
    this.holidayName = holidayName;
  }

  public ActualListDateItem isWorkingDay(Boolean isWorkingDay) {
    this.isWorkingDay = isWorkingDay;
    return this;
  }

  /**
   * Get isWorkingDay
   * @return isWorkingDay
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsWorkingDay() {
    return isWorkingDay;
  }

  public void setIsWorkingDay(Boolean isWorkingDay) {
    this.isWorkingDay = isWorkingDay;
  }

  public ActualListDateItem month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(example = "9", value = "")
  
    public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public ActualListDateItem planDate(LocalDate planDate) {
    this.planDate = planDate;
    return this;
  }

  /**
   * Get planDate
   * @return planDate
  **/
  @ApiModelProperty(example = "Tue Sep 01 00:00:00 GMT 2020", value = "")
  
    @Valid
    public LocalDate getPlanDate() {
    return planDate;
  }

  public void setPlanDate(LocalDate planDate) {
    this.planDate = planDate;
  }

  public ActualListDateItem weekDay(String weekDay) {
    this.weekDay = weekDay;
    return this;
  }

  /**
   * Get weekDay
   * @return weekDay
  **/
  @ApiModelProperty(example = "二", value = "")
  
    public String getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(String weekDay) {
    this.weekDay = weekDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualListDateItem actualListDateItem = (ActualListDateItem) o;
    return Objects.equals(this.day, actualListDateItem.day) &&
        Objects.equals(this.holidayName, actualListDateItem.holidayName) &&
        Objects.equals(this.isWorkingDay, actualListDateItem.isWorkingDay) &&
        Objects.equals(this.month, actualListDateItem.month) &&
        Objects.equals(this.planDate, actualListDateItem.planDate) &&
        Objects.equals(this.weekDay, actualListDateItem.weekDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, holidayName, isWorkingDay, month, planDate, weekDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualListDateItem {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    holidayName: ").append(toIndentedString(holidayName)).append("\n");
    sb.append("    isWorkingDay: ").append(toIndentedString(isWorkingDay)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    planDate: ").append(toIndentedString(planDate)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
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
