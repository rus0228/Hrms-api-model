package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActualListDataDataPageData;
import io.swagger.model.ActualListDateItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActualListDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ActualListDataData   {
  @JsonProperty("dateList")
  @Valid
  private List<ActualListDateItem> dateList = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("pageData")
  private ActualListDataDataPageData pageData = null;

  public ActualListDataData dateList(List<ActualListDateItem> dateList) {
    this.dateList = dateList;
    return this;
  }

  public ActualListDataData addDateListItem(ActualListDateItem dateListItem) {
    if (this.dateList == null) {
      this.dateList = new ArrayList<ActualListDateItem>();
    }
    this.dateList.add(dateListItem);
    return this;
  }

  /**
   * Get dateList
   * @return dateList
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ActualListDateItem> getDateList() {
    return dateList;
  }

  public void setDateList(List<ActualListDateItem> dateList) {
    this.dateList = dateList;
  }

  public ActualListDataData index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public ActualListDataData pageData(ActualListDataDataPageData pageData) {
    this.pageData = pageData;
    return this;
  }

  /**
   * Get pageData
   * @return pageData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ActualListDataDataPageData getPageData() {
    return pageData;
  }

  public void setPageData(ActualListDataDataPageData pageData) {
    this.pageData = pageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActualListDataData actualListDataData = (ActualListDataData) o;
    return Objects.equals(this.dateList, actualListDataData.dateList) &&
        Objects.equals(this.index, actualListDataData.index) &&
        Objects.equals(this.pageData, actualListDataData.pageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateList, index, pageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualListDataData {\n");
    
    sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
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
