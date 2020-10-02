package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchWorkExperienceItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchWorkExperienceData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SearchWorkExperienceData   {
  @JsonProperty("content")
  @Valid
  private List<SearchWorkExperienceItem> content = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("rows")
  private Long rows = null;

  @JsonProperty("totalElement")
  private Long totalElement = null;

  @JsonProperty("totalPages")
  private Long totalPages = null;

  public SearchWorkExperienceData content(List<SearchWorkExperienceItem> content) {
    this.content = content;
    return this;
  }

  public SearchWorkExperienceData addContentItem(SearchWorkExperienceItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<SearchWorkExperienceItem>();
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
    public List<SearchWorkExperienceItem> getContent() {
    return content;
  }

  public void setContent(List<SearchWorkExperienceItem> content) {
    this.content = content;
  }

  public SearchWorkExperienceData page(Long page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  
    public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public SearchWorkExperienceData rows(Long rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(value = "")
  
    public Long getRows() {
    return rows;
  }

  public void setRows(Long rows) {
    this.rows = rows;
  }

  public SearchWorkExperienceData totalElement(Long totalElement) {
    this.totalElement = totalElement;
    return this;
  }

  /**
   * Get totalElement
   * @return totalElement
  **/
  @ApiModelProperty(value = "")
  
    public Long getTotalElement() {
    return totalElement;
  }

  public void setTotalElement(Long totalElement) {
    this.totalElement = totalElement;
  }

  public SearchWorkExperienceData totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  
    public Long getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchWorkExperienceData searchWorkExperienceData = (SearchWorkExperienceData) o;
    return Objects.equals(this.content, searchWorkExperienceData.content) &&
        Objects.equals(this.page, searchWorkExperienceData.page) &&
        Objects.equals(this.rows, searchWorkExperienceData.rows) &&
        Objects.equals(this.totalElement, searchWorkExperienceData.totalElement) &&
        Objects.equals(this.totalPages, searchWorkExperienceData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, rows, totalElement, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchWorkExperienceData {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totalElement: ").append(toIndentedString(totalElement)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
