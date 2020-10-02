package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResumeListPageDataContentItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResumeListPageData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ResumeListPageData   {
  @JsonProperty("content")
  @Valid
  private List<ResumeListPageDataContentItem> content = null;

  @JsonProperty("page")
  private String page = null;

  @JsonProperty("rows")
  private Integer rows = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  public ResumeListPageData content(List<ResumeListPageDataContentItem> content) {
    this.content = content;
    return this;
  }

  public ResumeListPageData addContentItem(ResumeListPageDataContentItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ResumeListPageDataContentItem>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ResumeListPageDataContentItem> getContent() {
    return content;
  }

  public void setContent(List<ResumeListPageDataContentItem> content) {
    this.content = content;
  }

  public ResumeListPageData page(String page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public ResumeListPageData rows(Integer rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getRows() {
    return rows;
  }

  public void setRows(Integer rows) {
    this.rows = rows;
  }

  public ResumeListPageData totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeListPageData resumeListPageData = (ResumeListPageData) o;
    return Objects.equals(this.content, resumeListPageData.content) &&
        Objects.equals(this.page, resumeListPageData.page) &&
        Objects.equals(this.rows, resumeListPageData.rows) &&
        Objects.equals(this.totalElements, resumeListPageData.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, rows, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeListPageData {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
