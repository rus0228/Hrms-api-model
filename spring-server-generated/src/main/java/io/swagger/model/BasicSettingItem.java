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
 * BasicSettingItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BasicSettingItem   {
  @JsonProperty("DEPARTMENT")
  private Boolean DEPARTMENT = false;

  @JsonProperty("POSITION")
  private Boolean POSITION = false;

  public BasicSettingItem DEPARTMENT(Boolean DEPARTMENT) {
    this.DEPARTMENT = DEPARTMENT;
    return this;
  }

  /**
   * Get DEPARTMENT
   * @return DEPARTMENT
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isDEPARTMENT() {
    return DEPARTMENT;
  }

  public void setDEPARTMENT(Boolean DEPARTMENT) {
    this.DEPARTMENT = DEPARTMENT;
  }

  public BasicSettingItem POSITION(Boolean POSITION) {
    this.POSITION = POSITION;
    return this;
  }

  /**
   * Get POSITION
   * @return POSITION
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isPOSITION() {
    return POSITION;
  }

  public void setPOSITION(Boolean POSITION) {
    this.POSITION = POSITION;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicSettingItem basicSettingItem = (BasicSettingItem) o;
    return Objects.equals(this.DEPARTMENT, basicSettingItem.DEPARTMENT) &&
        Objects.equals(this.POSITION, basicSettingItem.POSITION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DEPARTMENT, POSITION);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicSettingItem {\n");
    
    sb.append("    DEPARTMENT: ").append(toIndentedString(DEPARTMENT)).append("\n");
    sb.append("    POSITION: ").append(toIndentedString(POSITION)).append("\n");
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
