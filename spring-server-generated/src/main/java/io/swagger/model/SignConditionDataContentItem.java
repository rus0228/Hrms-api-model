package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SignConditionDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SignConditionDataContentItem   {
  @JsonProperty("conditionType")
  private String conditionType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  public SignConditionDataContentItem conditionType(String conditionType) {
    this.conditionType = conditionType;
    return this;
  }

  /**
   * Get conditionType
   * @return conditionType
  **/
  @ApiModelProperty(example = "员工自主签到考勤", value = "")
  
    public String getConditionType() {
    return conditionType;
  }

  public void setConditionType(String conditionType) {
    this.conditionType = conditionType;
  }

  public SignConditionDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "dcec5f4f-93fa-47af-b6ef-cdc94a3fee5f", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SignConditionDataContentItem isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SignConditionDataContentItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "IT company", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SignConditionDataContentItem updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignConditionDataContentItem signConditionDataContentItem = (SignConditionDataContentItem) o;
    return Objects.equals(this.conditionType, signConditionDataContentItem.conditionType) &&
        Objects.equals(this.id, signConditionDataContentItem.id) &&
        Objects.equals(this.isDefault, signConditionDataContentItem.isDefault) &&
        Objects.equals(this.name, signConditionDataContentItem.name) &&
        Objects.equals(this.updatedAt, signConditionDataContentItem.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, id, isDefault, name, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignConditionDataContentItem {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
