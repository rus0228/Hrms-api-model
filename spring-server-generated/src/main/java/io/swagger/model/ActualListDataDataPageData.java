package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActualListPageDataContentItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActualListDataDataPageData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ActualListDataDataPageData   {
  @JsonProperty("content")
  @Valid
  private List<ActualListPageDataContentItem> content = null;

  @JsonProperty("end")
  private Boolean end = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public ActualListDataDataPageData content(List<ActualListPageDataContentItem> content) {
    this.content = content;
    return this;
  }

  public ActualListDataDataPageData addContentItem(ActualListPageDataContentItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ActualListPageDataContentItem>();
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
    public List<ActualListPageDataContentItem> getContent() {
    return content;
  }

  public void setContent(List<ActualListPageDataContentItem> content) {
    this.content = content;
  }

  public ActualListDataDataPageData end(Boolean end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isEnd() {
    return end;
  }

  public void setEnd(Boolean end) {
    this.end = end;
  }

  public ActualListDataDataPageData totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "8", value = "")
  
    public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public ActualListDataDataPageData totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
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
    ActualListDataDataPageData actualListDataDataPageData = (ActualListDataDataPageData) o;
    return Objects.equals(this.content, actualListDataDataPageData.content) &&
        Objects.equals(this.end, actualListDataDataPageData.end) &&
        Objects.equals(this.totalElements, actualListDataDataPageData.totalElements) &&
        Objects.equals(this.totalPages, actualListDataDataPageData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, end, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActualListDataDataPageData {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
