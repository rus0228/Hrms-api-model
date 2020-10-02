package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntryMetaDataItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllEntryMetaDataDataEntryFlexFieldMap
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AllEntryMetaDataDataEntryFlexFieldMap   {
  @JsonProperty("entryMetaData")
  @Valid
  private List<EntryMetaDataItem> entryMetaData = null;

  public AllEntryMetaDataDataEntryFlexFieldMap entryMetaData(List<EntryMetaDataItem> entryMetaData) {
    this.entryMetaData = entryMetaData;
    return this;
  }

  public AllEntryMetaDataDataEntryFlexFieldMap addEntryMetaDataItem(EntryMetaDataItem entryMetaDataItem) {
    if (this.entryMetaData == null) {
      this.entryMetaData = new ArrayList<EntryMetaDataItem>();
    }
    this.entryMetaData.add(entryMetaDataItem);
    return this;
  }

  /**
   * Get entryMetaData
   * @return entryMetaData
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<EntryMetaDataItem> getEntryMetaData() {
    return entryMetaData;
  }

  public void setEntryMetaData(List<EntryMetaDataItem> entryMetaData) {
    this.entryMetaData = entryMetaData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllEntryMetaDataDataEntryFlexFieldMap allEntryMetaDataDataEntryFlexFieldMap = (AllEntryMetaDataDataEntryFlexFieldMap) o;
    return Objects.equals(this.entryMetaData, allEntryMetaDataDataEntryFlexFieldMap.entryMetaData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryMetaData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllEntryMetaDataDataEntryFlexFieldMap {\n");
    
    sb.append("    entryMetaData: ").append(toIndentedString(entryMetaData)).append("\n");
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
