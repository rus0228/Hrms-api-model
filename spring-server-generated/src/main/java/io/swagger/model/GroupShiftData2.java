package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupShiftData2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class GroupShiftData2   {
  @JsonProperty("abbr")
  private String abbr = null;

  @JsonProperty("colorIndex")
  private String colorIndex = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("shiftType")
  private String shiftType = null;

  @JsonProperty("workHours")
  private BigDecimal workHours = null;

  public GroupShiftData2 abbr(String abbr) {
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

  public GroupShiftData2 colorIndex(String colorIndex) {
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

  public GroupShiftData2 id(String id) {
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

  public GroupShiftData2 shiftType(String shiftType) {
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

  public GroupShiftData2 workHours(BigDecimal workHours) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupShiftData2 groupShiftData2 = (GroupShiftData2) o;
    return Objects.equals(this.abbr, groupShiftData2.abbr) &&
        Objects.equals(this.colorIndex, groupShiftData2.colorIndex) &&
        Objects.equals(this.id, groupShiftData2.id) &&
        Objects.equals(this.shiftType, groupShiftData2.shiftType) &&
        Objects.equals(this.workHours, groupShiftData2.workHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbr, colorIndex, id, shiftType, workHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupShiftData2 {\n");
    
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
