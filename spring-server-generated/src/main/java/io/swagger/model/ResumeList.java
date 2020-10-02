package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ResumeListPageData;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResumeList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ResumeList   {
  @JsonProperty("index")
  private String index = null;

  @JsonProperty("pageData")
  private ResumeListPageData pageData = null;

  @JsonProperty("ssl")
  private Boolean ssl = null;

  @JsonProperty("url")
  private String url = null;

  public ResumeList index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "12784", value = "")
  
    public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public ResumeList pageData(ResumeListPageData pageData) {
    this.pageData = pageData;
    return this;
  }

  /**
   * Get pageData
   * @return pageData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ResumeListPageData getPageData() {
    return pageData;
  }

  public void setPageData(ResumeListPageData pageData) {
    this.pageData = pageData;
  }

  public ResumeList ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * Get ssl
   * @return ssl
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isSsl() {
    return ssl;
  }

  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }

  public ResumeList url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "www.ihr360.com/web", value = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeList resumeList = (ResumeList) o;
    return Objects.equals(this.index, resumeList.index) &&
        Objects.equals(this.pageData, resumeList.pageData) &&
        Objects.equals(this.ssl, resumeList.ssl) &&
        Objects.equals(this.url, resumeList.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, pageData, ssl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeList {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
