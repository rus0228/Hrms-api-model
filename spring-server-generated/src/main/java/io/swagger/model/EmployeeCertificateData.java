package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmployeeCertificateDataItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeeCertificateData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class EmployeeCertificateData   {
  @JsonProperty("content")
  @Valid
  private List<EmployeeCertificateDataItem> content = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("rows")
  private Long rows = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Long totalPages = null;

  public EmployeeCertificateData content(List<EmployeeCertificateDataItem> content) {
    this.content = content;
    return this;
  }

  public EmployeeCertificateData addContentItem(EmployeeCertificateDataItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<EmployeeCertificateDataItem>();
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
    public List<EmployeeCertificateDataItem> getContent() {
    return content;
  }

  public void setContent(List<EmployeeCertificateDataItem> content) {
    this.content = content;
  }

  public EmployeeCertificateData page(Long page) {
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

  public EmployeeCertificateData rows(Long rows) {
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

  public EmployeeCertificateData totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(value = "")
  
    public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public EmployeeCertificateData totalPages(Long totalPages) {
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
    EmployeeCertificateData employeeCertificateData = (EmployeeCertificateData) o;
    return Objects.equals(this.content, employeeCertificateData.content) &&
        Objects.equals(this.page, employeeCertificateData.page) &&
        Objects.equals(this.rows, employeeCertificateData.rows) &&
        Objects.equals(this.totalElements, employeeCertificateData.totalElements) &&
        Objects.equals(this.totalPages, employeeCertificateData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, rows, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeCertificateData {\n");
    
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
