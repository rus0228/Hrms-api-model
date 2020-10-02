package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AllEntryMetaDataDataEntryFlexFieldMap;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllEntryMetaDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AllEntryMetaDataData   {
  @JsonProperty("entryFlexFieldMap")
  private AllEntryMetaDataDataEntryFlexFieldMap entryFlexFieldMap = null;

  public AllEntryMetaDataData entryFlexFieldMap(AllEntryMetaDataDataEntryFlexFieldMap entryFlexFieldMap) {
    this.entryFlexFieldMap = entryFlexFieldMap;
    return this;
  }

  /**
   * Get entryFlexFieldMap
   * @return entryFlexFieldMap
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AllEntryMetaDataDataEntryFlexFieldMap getEntryFlexFieldMap() {
    return entryFlexFieldMap;
  }

  public void setEntryFlexFieldMap(AllEntryMetaDataDataEntryFlexFieldMap entryFlexFieldMap) {
    this.entryFlexFieldMap = entryFlexFieldMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllEntryMetaDataData allEntryMetaDataData = (AllEntryMetaDataData) o;
    return Objects.equals(this.entryFlexFieldMap, allEntryMetaDataData.entryFlexFieldMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryFlexFieldMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllEntryMetaDataData {\n");
    
    sb.append("    entryFlexFieldMap: ").append(toIndentedString(entryFlexFieldMap)).append("\n");
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
