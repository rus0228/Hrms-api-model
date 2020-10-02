package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CurrentEffectivePayrollInfoPageDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentEffectivePayrollInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfo   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("pageDate")
  private CurrentEffectivePayrollInfoPageDate pageDate = null;

  @JsonProperty("staffCodes")
  private String staffCodes = null;

  public CurrentEffectivePayrollInfo count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CurrentEffectivePayrollInfo pageDate(CurrentEffectivePayrollInfoPageDate pageDate) {
    this.pageDate = pageDate;
    return this;
  }

  /**
   * Get pageDate
   * @return pageDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoPageDate getPageDate() {
    return pageDate;
  }

  public void setPageDate(CurrentEffectivePayrollInfoPageDate pageDate) {
    this.pageDate = pageDate;
  }

  public CurrentEffectivePayrollInfo staffCodes(String staffCodes) {
    this.staffCodes = staffCodes;
    return this;
  }

  /**
   * Get staffCodes
   * @return staffCodes
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffCodes() {
    return staffCodes;
  }

  public void setStaffCodes(String staffCodes) {
    this.staffCodes = staffCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfo currentEffectivePayrollInfo = (CurrentEffectivePayrollInfo) o;
    return Objects.equals(this.count, currentEffectivePayrollInfo.count) &&
        Objects.equals(this.pageDate, currentEffectivePayrollInfo.pageDate) &&
        Objects.equals(this.staffCodes, currentEffectivePayrollInfo.staffCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, pageDate, staffCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfo {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    pageDate: ").append(toIndentedString(pageDate)).append("\n");
    sb.append("    staffCodes: ").append(toIndentedString(staffCodes)).append("\n");
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
