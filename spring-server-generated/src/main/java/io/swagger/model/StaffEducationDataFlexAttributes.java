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
 * StaffEducationDataFlexAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffEducationDataFlexAttributes   {
  @JsonProperty("data-id")
  private String dataId = null;

  public StaffEducationDataFlexAttributes dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

  /**
   * Get dataId
   * @return dataId
  **/
  @ApiModelProperty(value = "")
  
    public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffEducationDataFlexAttributes staffEducationDataFlexAttributes = (StaffEducationDataFlexAttributes) o;
    return Objects.equals(this.dataId, staffEducationDataFlexAttributes.dataId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffEducationDataFlexAttributes {\n");
    
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
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
