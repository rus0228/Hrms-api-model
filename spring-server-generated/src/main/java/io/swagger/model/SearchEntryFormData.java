package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchEntryFormListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchEntryFormData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SearchEntryFormData   {
  @JsonProperty("list")
  @Valid
  private List<SearchEntryFormListItem> list = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("pageSize")
  private Long pageSize = null;

  @JsonProperty("totalCount")
  private Long totalCount = null;

  public SearchEntryFormData list(List<SearchEntryFormListItem> list) {
    this.list = list;
    return this;
  }

  public SearchEntryFormData addListItem(SearchEntryFormListItem listItem) {
    if (this.list == null) {
      this.list = new ArrayList<SearchEntryFormListItem>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SearchEntryFormListItem> getList() {
    return list;
  }

  public void setList(List<SearchEntryFormListItem> list) {
    this.list = list;
  }

  public SearchEntryFormData page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public SearchEntryFormData pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "100", value = "")
  
    public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public SearchEntryFormData totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEntryFormData searchEntryFormData = (SearchEntryFormData) o;
    return Objects.equals(this.list, searchEntryFormData.list) &&
        Objects.equals(this.page, searchEntryFormData.page) &&
        Objects.equals(this.pageSize, searchEntryFormData.pageSize) &&
        Objects.equals(this.totalCount, searchEntryFormData.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, page, pageSize, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEntryFormData {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
