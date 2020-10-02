package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkShiftListItem;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActualListPageDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ActualListPageDataContentItem   {
  @JsonProperty("changeDepartmentDate")
  private LocalDate changeDepartmentDate = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("enrolledTime")
  private OffsetDateTime enrolledTime = null;

  @JsonProperty("foreign")
  private String foreign = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("lastWorkDay")
  private String lastWorkDay = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("totalDays")
  private Integer totalDays = null;

  @JsonProperty("totalHours")
  private Integer totalHours = null;

  @JsonProperty("workShiftList")
  @Valid
  private List<WorkShiftListItem> workShiftList = null;

  public ActualListPageDataContentItem changeDepartmentDate(LocalDate changeDepartmentDate) {
    this.changeDepartmentDate = changeDepartmentDate;
    return this;
  }

  /**
   * Get changeDepartmentDate
   * @return changeDepartmentDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getChangeDepartmentDate() {
    return changeDepartmentDate;
  }

  public void setChangeDepartmentDate(LocalDate changeDepartmentDate) {
    this.changeDepartmentDate = changeDepartmentDate;
  }

  public ActualListPageDataContentItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public ActualListPageDataContentItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public ActualListPageDataContentItem enrolledTime(OffsetDateTime enrolledTime) {
    this.enrolledTime = enrolledTime;
    return this;
  }

  /**
   * Get enrolledTime
   * @return enrolledTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEnrolledTime() {
    return enrolledTime;
  }

  public void setEnrolledTime(OffsetDateTime enrolledTime) {
    this.enrolledTime = enrolledTime;
  }

  public ActualListPageDataContentItem foreign(String foreign) {
    this.foreign = foreign;
    return this;
  }

  /**
   * Get foreign
   * @return foreign
  **/
  @ApiModelProperty(value = "")
  
    public String getForeign() {
    return foreign;
  }

  public void setForeign(String foreign) {
    this.foreign = foreign;
  }

  public ActualListPageDataContentItem groupId(String groupId) {
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

  public ActualListPageDataContentItem lastWorkDay(String lastWorkDay) {
    this.lastWorkDay = lastWorkDay;
    return this;
  }

  /**
   * Get lastWorkDay
   * @return lastWorkDay
  **/
  @ApiModelProperty(value = "")
  
    public String getLastWorkDay() {
    return lastWorkDay;
  }

  public void setLastWorkDay(String lastWorkDay) {
    this.lastWorkDay = lastWorkDay;
  }

  public ActualListPageDataContentItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(example = "web讲师", value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public ActualListPageDataContentItem staffId(String staffId) {
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

  public ActualListPageDataContentItem staffName(String staffName) {
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

  public ActualListPageDataContentItem staffNo(String staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
  }

  public ActualListPageDataContentItem totalDays(Integer totalDays) {
    this.totalDays = totalDays;
    return this;
  }

  /**
   * Get totalDays
   * @return totalDays
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalDays() {
    return totalDays;
  }

  public void setTotalDays(Integer totalDays) {
    this.totalDays = totalDays;
  }

  public ActualListPageDataContentItem totalHours(Integer totalHours) {
    this.totalHours = totalHours;
    return this;
  }

  /**
   * Get totalHours
   * @return totalHours
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalHours() {
    return totalHours;
  }

  public void setTotalHours(Integer totalHours) {
    this.totalHours = totalHours;
  }

  public ActualListPageDataContentItem workShiftList(List<WorkShiftListItem> workShiftList) {
    this.workShiftList = workShiftList;
    return this;
  }

  public ActualListPageDataContentItem addWorkShiftListItem(WorkShiftListItem workShiftListItem) {
    if (this.workShiftList == null) {
      this.workShiftList = new ArrayList<WorkShiftListItem>();
    }
    this.workShiftList.add(workShiftListItem);
    return this;
  }

  /**
   * Get workShiftList
   * @return workShiftList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<WorkShiftListItem> getWorkShiftList() {
    return workShiftList;
  }

  public void setWorkShiftList(List<WorkShiftListItem> workShiftList) {
    this.workShiftList = workShiftList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualListPageDataContentItem actualListPageDataContentItem = (ActualListPageDataContentItem) o;
    return Objects.equals(this.changeDepartmentDate, actualListPageDataContentItem.changeDepartmentDate) &&
        Objects.equals(this.departmentId, actualListPageDataContentItem.departmentId) &&
        Objects.equals(this.departmentName, actualListPageDataContentItem.departmentName) &&
        Objects.equals(this.enrolledTime, actualListPageDataContentItem.enrolledTime) &&
        Objects.equals(this.foreign, actualListPageDataContentItem.foreign) &&
        Objects.equals(this.groupId, actualListPageDataContentItem.groupId) &&
        Objects.equals(this.lastWorkDay, actualListPageDataContentItem.lastWorkDay) &&
        Objects.equals(this.positionName, actualListPageDataContentItem.positionName) &&
        Objects.equals(this.staffId, actualListPageDataContentItem.staffId) &&
        Objects.equals(this.staffName, actualListPageDataContentItem.staffName) &&
        Objects.equals(this.staffNo, actualListPageDataContentItem.staffNo) &&
        Objects.equals(this.totalDays, actualListPageDataContentItem.totalDays) &&
        Objects.equals(this.totalHours, actualListPageDataContentItem.totalHours) &&
        Objects.equals(this.workShiftList, actualListPageDataContentItem.workShiftList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDepartmentDate, departmentId, departmentName, enrolledTime, foreign, groupId, lastWorkDay, positionName, staffId, staffName, staffNo, totalDays, totalHours, workShiftList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualListPageDataContentItem {\n");
    
    sb.append("    changeDepartmentDate: ").append(toIndentedString(changeDepartmentDate)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    enrolledTime: ").append(toIndentedString(enrolledTime)).append("\n");
    sb.append("    foreign: ").append(toIndentedString(foreign)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    lastWorkDay: ").append(toIndentedString(lastWorkDay)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    totalDays: ").append(toIndentedString(totalDays)).append("\n");
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
    sb.append("    workShiftList: ").append(toIndentedString(workShiftList)).append("\n");
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
