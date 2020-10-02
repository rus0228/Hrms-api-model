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
 * WorkShiftListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class WorkShiftListItem   {
  @JsonProperty("abbr")
  private String abbr = null;

  @JsonProperty("colorIndex")
  private Integer colorIndex = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isEdit")
  private Boolean isEdit = null;

  @JsonProperty("isWorkingDay")
  private Boolean isWorkingDay = null;

  @JsonProperty("planDate")
  private LocalDate planDate = null;

  @JsonProperty("shiftId")
  private String shiftId = null;

  @JsonProperty("signId")
  private String signId = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("workHours")
  private Integer workHours = null;

  public WorkShiftListItem abbr(String abbr) {
    this.abbr = abbr;
    return this;
  }

  /**
   * Get abbr
   * @return abbr
  **/
  @ApiModelProperty(example = "固", value = "")
  
    public String getAbbr() {
    return abbr;
  }

  public void setAbbr(String abbr) {
    this.abbr = abbr;
  }

  public WorkShiftListItem colorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
    return this;
  }

  /**
   * Get colorIndex
   * @return colorIndex
  **/
  @ApiModelProperty(example = "5", value = "")
  
    public Integer getColorIndex() {
    return colorIndex;
  }

  public void setColorIndex(Integer colorIndex) {
    this.colorIndex = colorIndex;
  }

  public WorkShiftListItem groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(example = "1353b9ab-68f0-4953-b1d9-709991312604", value = "")
  
    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public WorkShiftListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "312ae335-cecd-42d3-af7a-85153d06f1e4", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkShiftListItem isEdit(Boolean isEdit) {
    this.isEdit = isEdit;
    return this;
  }

  /**
   * Get isEdit
   * @return isEdit
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isIsEdit() {
    return isEdit;
  }

  public void setIsEdit(Boolean isEdit) {
    this.isEdit = isEdit;
  }

  public WorkShiftListItem isWorkingDay(Boolean isWorkingDay) {
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

  public WorkShiftListItem planDate(LocalDate planDate) {
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

  public WorkShiftListItem shiftId(String shiftId) {
    this.shiftId = shiftId;
    return this;
  }

  /**
   * Get shiftId
   * @return shiftId
  **/
  @ApiModelProperty(example = "f11b24b8-a5f3-4408-978a-305a7cf3ec3f", value = "")
  
    public String getShiftId() {
    return shiftId;
  }

  public void setShiftId(String shiftId) {
    this.shiftId = shiftId;
  }

  public WorkShiftListItem signId(String signId) {
    this.signId = signId;
    return this;
  }

  /**
   * Get signId
   * @return signId
  **/
  @ApiModelProperty(value = "")
  
    public String getSignId() {
    return signId;
  }

  public void setSignId(String signId) {
    this.signId = signId;
  }

  public WorkShiftListItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(example = "90fa87af-0b54-46a9-baf7-c6778823d113", value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public WorkShiftListItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "刘杰音", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public WorkShiftListItem workHours(Integer workHours) {
    this.workHours = workHours;
    return this;
  }

  /**
   * Get workHours
   * @return workHours
  **/
  @ApiModelProperty(example = "8", value = "")
  
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
    WorkShiftListItem workShiftListItem = (WorkShiftListItem) o;
    return Objects.equals(this.abbr, workShiftListItem.abbr) &&
        Objects.equals(this.colorIndex, workShiftListItem.colorIndex) &&
        Objects.equals(this.groupId, workShiftListItem.groupId) &&
        Objects.equals(this.id, workShiftListItem.id) &&
        Objects.equals(this.isEdit, workShiftListItem.isEdit) &&
        Objects.equals(this.isWorkingDay, workShiftListItem.isWorkingDay) &&
        Objects.equals(this.planDate, workShiftListItem.planDate) &&
        Objects.equals(this.shiftId, workShiftListItem.shiftId) &&
        Objects.equals(this.signId, workShiftListItem.signId) &&
        Objects.equals(this.staffId, workShiftListItem.staffId) &&
        Objects.equals(this.staffName, workShiftListItem.staffName) &&
        Objects.equals(this.workHours, workShiftListItem.workHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, colorIndex, groupId, id, isEdit, isWorkingDay, planDate, shiftId, signId, staffId, staffName, workHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkShiftListItem {\n");
    
    sb.append("    abbr: ").append(toIndentedString(abbr)).append("\n");
    sb.append("    colorIndex: ").append(toIndentedString(colorIndex)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isEdit: ").append(toIndentedString(isEdit)).append("\n");
    sb.append("    isWorkingDay: ").append(toIndentedString(isWorkingDay)).append("\n");
    sb.append("    planDate: ").append(toIndentedString(planDate)).append("\n");
    sb.append("    shiftId: ").append(toIndentedString(shiftId)).append("\n");
    sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
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
