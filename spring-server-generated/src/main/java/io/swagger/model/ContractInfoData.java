package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ContractInfoListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractInfoData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ContractInfoData   {
  @JsonProperty("list")
  @Valid
  private List<ContractInfoListItem> list = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("rows")
  private Long rows = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  @JsonProperty("totalPages")
  private Long totalPages = null;

  public ContractInfoData list(List<ContractInfoListItem> list) {
    this.list = list;
    return this;
  }

  public ContractInfoData addListItem(ContractInfoListItem listItem) {
    if (this.list == null) {
      this.list = new ArrayList<ContractInfoListItem>();
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
    public List<ContractInfoListItem> getList() {
    return list;
  }

  public void setList(List<ContractInfoListItem> list) {
    this.list = list;
  }

  public ContractInfoData page(Long page) {
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

  public ContractInfoData rows(Long rows) {
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

  public ContractInfoData totalElements(Long totalElements) {
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

  public ContractInfoData totalPages(Long totalPages) {
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
    ContractInfoData contractInfoData = (ContractInfoData) o;
    return Objects.equals(this.list, contractInfoData.list) &&
        Objects.equals(this.page, contractInfoData.page) &&
        Objects.equals(this.rows, contractInfoData.rows) &&
        Objects.equals(this.totalElements, contractInfoData.totalElements) &&
        Objects.equals(this.totalPages, contractInfoData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, page, rows, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractInfoData {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
