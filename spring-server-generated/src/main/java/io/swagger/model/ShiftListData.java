package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ShiftListContentItem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ShiftListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ShiftListData   {
  @JsonProperty("content")
  @Valid
  private List<ShiftListContentItem> content = null;

  @JsonProperty("end")
  private Boolean end = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public ShiftListData content(List<ShiftListContentItem> content) {
    this.content = content;
    return this;
  }

  public ShiftListData addContentItem(ShiftListContentItem contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ShiftListContentItem>();
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
    public List<ShiftListContentItem> getContent() {
    return content;
  }

  public void setContent(List<ShiftListContentItem> content) {
    this.content = content;
  }

  public ShiftListData end(Boolean end) {
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

  public ShiftListData totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public ShiftListData totalPages(Integer totalPages) {
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
    ShiftListData shiftListData = (ShiftListData) o;
    return Objects.equals(this.content, shiftListData.content) &&
        Objects.equals(this.end, shiftListData.end) &&
        Objects.equals(this.totalElements, shiftListData.totalElements) &&
        Objects.equals(this.totalPages, shiftListData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, end, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftListData {\n");
    
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
