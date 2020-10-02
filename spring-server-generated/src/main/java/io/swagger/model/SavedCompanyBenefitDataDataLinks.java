package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SavedCompanyBenefitDataDataLinksSelf;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SavedCompanyBenefitDataDataLinks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SavedCompanyBenefitDataDataLinks   {
  @JsonProperty("self")
  private SavedCompanyBenefitDataDataLinksSelf self = null;

  public SavedCompanyBenefitDataDataLinks self(SavedCompanyBenefitDataDataLinksSelf self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SavedCompanyBenefitDataDataLinksSelf getSelf() {
    return self;
  }

  public void setSelf(SavedCompanyBenefitDataDataLinksSelf self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedCompanyBenefitDataDataLinks savedCompanyBenefitDataDataLinks = (SavedCompanyBenefitDataDataLinks) o;
    return Objects.equals(this.self, savedCompanyBenefitDataDataLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedCompanyBenefitDataDataLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
