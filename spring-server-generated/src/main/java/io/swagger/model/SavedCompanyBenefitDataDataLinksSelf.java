package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedCompanyBenefitDataDataLinksSelf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SavedCompanyBenefitDataDataLinksSelf   {
  @JsonProperty("href")
  private String href = null;

  public SavedCompanyBenefitDataDataLinksSelf href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(example = "http://www.hrms2020.com/gateway/insurance/api/companyBenefits/search?companyId=36dbfa02cbe54b11a5543d46b5112168&pageNo=1&companyName=%E6%9D%AD%E5%B7%9E%E8%89%BE%E9%AA%8A%E8%8E%8E%E4%BF%A1%E6%81%AF%E7%A7%91%E6%8A%80%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8&bound=true&pageSize=50&_category=SI&projection=list&mobileNo=13567190293&sessionId=ODM4MTNkZGUtNDcxYy00ZWZkLWJlN2UtNzBkNTgwZTY5ZWNm&userName=13567190293&userId=96afabbd7430488c90e4f3f0cd8aff66&staffId=5a43bd72-6b47-4cd6-b56d-4ed401dc0dca&page=0&size=50", value = "")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedCompanyBenefitDataDataLinksSelf savedCompanyBenefitDataDataLinksSelf = (SavedCompanyBenefitDataDataLinksSelf) o;
    return Objects.equals(this.href, savedCompanyBenefitDataDataLinksSelf.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCompanyBenefitDataDataLinksSelf {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
