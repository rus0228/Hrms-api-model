package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType;
import io.swagger.model.CurrentEffectivePayrollInfoContentItemSalaryProfileWrapper;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CurrentEffectivePayrollInfoContentItemSalaryProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class CurrentEffectivePayrollInfoContentItemSalaryProfile   {
  @JsonProperty("changeType")
  private CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType changeType = null;

  @JsonProperty("effectiveAt")
  private OffsetDateTime effectiveAt = null;

  @JsonProperty("inValidAt")
  private OffsetDateTime inValidAt = null;

  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("usingInStaffSalaryfields")
  private String usingInStaffSalaryfields = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("wrapper")
  private CurrentEffectivePayrollInfoContentItemSalaryProfileWrapper wrapper = null;

  public CurrentEffectivePayrollInfoContentItemSalaryProfile changeType(CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType getChangeType() {
    return changeType;
  }

  public void setChangeType(CurrentEffectivePayrollInfoContentItemSalaryProfileChangeType changeType) {
    this.changeType = changeType;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile effectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

  /**
   * Get effectiveAt
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(OffsetDateTime effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile inValidAt(OffsetDateTime inValidAt) {
    this.inValidAt = inValidAt;
    return this;
  }

  /**
   * Get inValidAt
   * @return inValidAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getInValidAt() {
    return inValidAt;
  }

  public void setInValidAt(OffsetDateTime inValidAt) {
    this.inValidAt = inValidAt;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  
    public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile usingInStaffSalaryfields(String usingInStaffSalaryfields) {
    this.usingInStaffSalaryfields = usingInStaffSalaryfields;
    return this;
  }

  /**
   * Get usingInStaffSalaryfields
   * @return usingInStaffSalaryfields
  **/
  @ApiModelProperty(value = "")
  
    public String getUsingInStaffSalaryfields() {
    return usingInStaffSalaryfields;
  }

  public void setUsingInStaffSalaryfields(String usingInStaffSalaryfields) {
    this.usingInStaffSalaryfields = usingInStaffSalaryfields;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public CurrentEffectivePayrollInfoContentItemSalaryProfile wrapper(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapper wrapper) {
    this.wrapper = wrapper;
    return this;
  }

  /**
   * Get wrapper
   * @return wrapper
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CurrentEffectivePayrollInfoContentItemSalaryProfileWrapper getWrapper() {
    return wrapper;
  }

  public void setWrapper(CurrentEffectivePayrollInfoContentItemSalaryProfileWrapper wrapper) {
    this.wrapper = wrapper;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentEffectivePayrollInfoContentItemSalaryProfile currentEffectivePayrollInfoContentItemSalaryProfile = (CurrentEffectivePayrollInfoContentItemSalaryProfile) o;
    return Objects.equals(this.changeType, currentEffectivePayrollInfoContentItemSalaryProfile.changeType) &&
        Objects.equals(this.effectiveAt, currentEffectivePayrollInfoContentItemSalaryProfile.effectiveAt) &&
        Objects.equals(this.inValidAt, currentEffectivePayrollInfoContentItemSalaryProfile.inValidAt) &&
        Objects.equals(this.sourceId, currentEffectivePayrollInfoContentItemSalaryProfile.sourceId) &&
        Objects.equals(this.usingInStaffSalaryfields, currentEffectivePayrollInfoContentItemSalaryProfile.usingInStaffSalaryfields) &&
        Objects.equals(this.valid, currentEffectivePayrollInfoContentItemSalaryProfile.valid) &&
        Objects.equals(this.wrapper, currentEffectivePayrollInfoContentItemSalaryProfile.wrapper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, effectiveAt, inValidAt, sourceId, usingInStaffSalaryfields, valid, wrapper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentEffectivePayrollInfoContentItemSalaryProfile {\n");
    
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    inValidAt: ").append(toIndentedString(inValidAt)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    usingInStaffSalaryfields: ").append(toIndentedString(usingInStaffSalaryfields)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    wrapper: ").append(toIndentedString(wrapper)).append("\n");
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
