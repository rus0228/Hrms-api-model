package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SignRecordDataListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SignRecordDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SignRecordDataData   {
  @JsonProperty("content")
  @Valid
  private List<SignRecordDataListItem> content = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("rows")
  private Integer rows = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public SignRecordDataData content(List<SignRecordDataListItem> content) {
    this.content = content;
    return this;
  }

  public SignRecordDataData addContentItem(SignRecordDataListItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<SignRecordDataListItem>();
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
    public List<SignRecordDataListItem> getContent() {
    return content;
  }

  public void setContent(List<SignRecordDataListItem> content) {
    this.content = content;
  }

  public SignRecordDataData page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SignRecordDataData rows(Integer rows) {
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

  public SignRecordDataData totalElements(Integer totalElements) {
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

  public SignRecordDataData totalPages(Integer totalPages) {
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
    SignRecordDataData signRecordDataData = (SignRecordDataData) o;
    return Objects.equals(this.content, signRecordDataData.content) &&
        Objects.equals(this.page, signRecordDataData.page) &&
        Objects.equals(this.rows, signRecordDataData.rows) &&
        Objects.equals(this.totalElements, signRecordDataData.totalElements) &&
        Objects.equals(this.totalPages, signRecordDataData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, rows, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignRecordDataData {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
