package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffAgreementListItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffAgreementData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffAgreementData   {
  @JsonProperty("list")
  @Valid
  private List<StaffAgreementListItem> list = null;

  @JsonProperty("page")
  private Long page = null;

  @JsonProperty("rows")
  private Long rows = null;

  @JsonProperty("totalElements")
  private Long totalElements = null;

  public StaffAgreementData list(List<StaffAgreementListItem> list) {
    this.list = list;
    return this;
  }

  public StaffAgreementData addListItem(StaffAgreementListItem listItem) {
    if (this.list == null) {
      this.list = new ArrayList<StaffAgreementListItem>();
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
    public List<StaffAgreementListItem> getList() {
    return list;
  }

  public void setList(List<StaffAgreementListItem> list) {
    this.list = list;
  }

  public StaffAgreementData page(Long page) {
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

  public StaffAgreementData rows(Long rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Get rows
   * @return rows
  **/
  @ApiModelProperty(example = "10", value = "")
  
    public Long getRows() {
    return rows;
  }

  public void setRows(Long rows) {
    this.rows = rows;
  }

  public StaffAgreementData totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
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
    StaffAgreementData staffAgreementData = (StaffAgreementData) o;
    return Objects.equals(this.list, staffAgreementData.list) &&
        Objects.equals(this.page, staffAgreementData.page) &&
        Objects.equals(this.rows, staffAgreementData.rows) &&
        Objects.equals(this.totalElements, staffAgreementData.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, page, rows, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffAgreementData {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
