package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ColumnForPositionGradeList;
import io.swagger.model.DataForPositionGradeList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PositionGradeList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class PositionGradeList   {
  @JsonProperty("columns")
  @Valid
  private List<ColumnForPositionGradeList> columns = null;

  @JsonProperty("datas")
  @Valid
  private List<DataForPositionGradeList> datas = null;

  public PositionGradeList columns(List<ColumnForPositionGradeList> columns) {
    this.columns = columns;
    return this;
  }

  public PositionGradeList addColumnsItem(ColumnForPositionGradeList columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ColumnForPositionGradeList>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ColumnForPositionGradeList> getColumns() {
    return columns;
  }

  public void setColumns(List<ColumnForPositionGradeList> columns) {
    this.columns = columns;
  }

  public PositionGradeList datas(List<DataForPositionGradeList> datas) {
    this.datas = datas;
    return this;
  }

  public PositionGradeList addDatasItem(DataForPositionGradeList datasItem) {
    if (this.datas == null) {
      this.datas = new ArrayList<DataForPositionGradeList>();
    }
    this.datas.add(datasItem);
    return this;
  }

  /**
   * Get datas
   * @return datas
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<DataForPositionGradeList> getDatas() {
    return datas;
  }

  public void setDatas(List<DataForPositionGradeList> datas) {
    this.datas = datas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionGradeList positionGradeList = (PositionGradeList) o;
    return Objects.equals(this.columns, positionGradeList.columns) &&
        Objects.equals(this.datas, positionGradeList.datas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, datas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionGradeList {\n");
    
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
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
