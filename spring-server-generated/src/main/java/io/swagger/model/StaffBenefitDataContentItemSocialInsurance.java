package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffBenefitDataContentItemSocialInsuranceActualPayer;
import io.swagger.model.StaffBenefitDataContentItemSocialInsuranceBases;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffBenefitDataContentItemSocialInsurance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffBenefitDataContentItemSocialInsurance   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("actualPayer")
  private StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer = null;

  @JsonProperty("base")
  private Integer base = null;

  @JsonProperty("bases")
  private StaffBenefitDataContentItemSocialInsuranceBases bases = null;

  @JsonProperty("calculatable")
  private Boolean calculatable = null;

  @JsonProperty("companyBenefitId")
  private String companyBenefitId = null;

  @JsonProperty("companyBenefitName")
  private String companyBenefitName = null;

  @JsonProperty("divisionId")
  private Integer divisionId = null;

  @JsonProperty("endOn")
  private LocalDate endOn = null;

  @JsonProperty("originalCompanyBenefitId")
  private String originalCompanyBenefitId = null;

  @JsonProperty("payDepartmentId")
  private String payDepartmentId = null;

  @JsonProperty("startOn")
  private LocalDate startOn = null;

  @JsonProperty("supplementaryHfAccountNumber")
  private String supplementaryHfAccountNumber = null;

  @JsonProperty("vendorId")
  private String vendorId = null;

  public StaffBenefitDataContentItemSocialInsurance accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public StaffBenefitDataContentItemSocialInsurance actualPayer(StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer) {
    this.actualPayer = actualPayer;
    return this;
  }

  /**
   * Get actualPayer
   * @return actualPayer
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffBenefitDataContentItemSocialInsuranceActualPayer getActualPayer() {
    return actualPayer;
  }

  public void setActualPayer(StaffBenefitDataContentItemSocialInsuranceActualPayer actualPayer) {
    this.actualPayer = actualPayer;
  }

  public StaffBenefitDataContentItemSocialInsurance base(Integer base) {
    this.base = base;
    return this;
  }

  /**
   * Get base
   * @return base
  **/
  @ApiModelProperty(example = "330000", value = "")
  
    public Integer getBase() {
    return base;
  }

  public void setBase(Integer base) {
    this.base = base;
  }

  public StaffBenefitDataContentItemSocialInsurance bases(StaffBenefitDataContentItemSocialInsuranceBases bases) {
    this.bases = bases;
    return this;
  }

  /**
   * Get bases
   * @return bases
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffBenefitDataContentItemSocialInsuranceBases getBases() {
    return bases;
  }

  public void setBases(StaffBenefitDataContentItemSocialInsuranceBases bases) {
    this.bases = bases;
  }

  public StaffBenefitDataContentItemSocialInsurance calculatable(Boolean calculatable) {
    this.calculatable = calculatable;
    return this;
  }

  /**
   * Get calculatable
   * @return calculatable
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isCalculatable() {
    return calculatable;
  }

  public void setCalculatable(Boolean calculatable) {
    this.calculatable = calculatable;
  }

  public StaffBenefitDataContentItemSocialInsurance companyBenefitId(String companyBenefitId) {
    this.companyBenefitId = companyBenefitId;
    return this;
  }

  /**
   * Get companyBenefitId
   * @return companyBenefitId
  **/
  @ApiModelProperty(example = "329482487287775232", value = "")
  
    public String getCompanyBenefitId() {
    return companyBenefitId;
  }

  public void setCompanyBenefitId(String companyBenefitId) {
    this.companyBenefitId = companyBenefitId;
  }

  public StaffBenefitDataContentItemSocialInsurance companyBenefitName(String companyBenefitName) {
    this.companyBenefitName = companyBenefitName;
    return this;
  }

  /**
   * Get companyBenefitName
   * @return companyBenefitName
  **/
  @ApiModelProperty(example = "北京市-社保", value = "")
  
    public String getCompanyBenefitName() {
    return companyBenefitName;
  }

  public void setCompanyBenefitName(String companyBenefitName) {
    this.companyBenefitName = companyBenefitName;
  }

  public StaffBenefitDataContentItemSocialInsurance divisionId(Integer divisionId) {
    this.divisionId = divisionId;
    return this;
  }

  /**
   * Get divisionId
   * @return divisionId
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Integer getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(Integer divisionId) {
    this.divisionId = divisionId;
  }

  public StaffBenefitDataContentItemSocialInsurance endOn(LocalDate endOn) {
    this.endOn = endOn;
    return this;
  }

  /**
   * Get endOn
   * @return endOn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEndOn() {
    return endOn;
  }

  public void setEndOn(LocalDate endOn) {
    this.endOn = endOn;
  }

  public StaffBenefitDataContentItemSocialInsurance originalCompanyBenefitId(String originalCompanyBenefitId) {
    this.originalCompanyBenefitId = originalCompanyBenefitId;
    return this;
  }

  /**
   * Get originalCompanyBenefitId
   * @return originalCompanyBenefitId
  **/
  @ApiModelProperty(example = "329482487287775232", value = "")
  
    public String getOriginalCompanyBenefitId() {
    return originalCompanyBenefitId;
  }

  public void setOriginalCompanyBenefitId(String originalCompanyBenefitId) {
    this.originalCompanyBenefitId = originalCompanyBenefitId;
  }

  public StaffBenefitDataContentItemSocialInsurance payDepartmentId(String payDepartmentId) {
    this.payDepartmentId = payDepartmentId;
    return this;
  }

  /**
   * Get payDepartmentId
   * @return payDepartmentId
  **/
  @ApiModelProperty(example = "d2822608-d5f4-47dd-9776-9ae2f24c9993", value = "")
  
    public String getPayDepartmentId() {
    return payDepartmentId;
  }

  public void setPayDepartmentId(String payDepartmentId) {
    this.payDepartmentId = payDepartmentId;
  }

  public StaffBenefitDataContentItemSocialInsurance startOn(LocalDate startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * Get startOn
   * @return startOn
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getStartOn() {
    return startOn;
  }

  public void setStartOn(LocalDate startOn) {
    this.startOn = startOn;
  }

  public StaffBenefitDataContentItemSocialInsurance supplementaryHfAccountNumber(String supplementaryHfAccountNumber) {
    this.supplementaryHfAccountNumber = supplementaryHfAccountNumber;
    return this;
  }

  /**
   * Get supplementaryHfAccountNumber
   * @return supplementaryHfAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getSupplementaryHfAccountNumber() {
    return supplementaryHfAccountNumber;
  }

  public void setSupplementaryHfAccountNumber(String supplementaryHfAccountNumber) {
    this.supplementaryHfAccountNumber = supplementaryHfAccountNumber;
  }

  public StaffBenefitDataContentItemSocialInsurance vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  
    public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffBenefitDataContentItemSocialInsurance staffBenefitDataContentItemSocialInsurance = (StaffBenefitDataContentItemSocialInsurance) o;
    return Objects.equals(this.accountNumber, staffBenefitDataContentItemSocialInsurance.accountNumber) &&
        Objects.equals(this.actualPayer, staffBenefitDataContentItemSocialInsurance.actualPayer) &&
        Objects.equals(this.base, staffBenefitDataContentItemSocialInsurance.base) &&
        Objects.equals(this.bases, staffBenefitDataContentItemSocialInsurance.bases) &&
        Objects.equals(this.calculatable, staffBenefitDataContentItemSocialInsurance.calculatable) &&
        Objects.equals(this.companyBenefitId, staffBenefitDataContentItemSocialInsurance.companyBenefitId) &&
        Objects.equals(this.companyBenefitName, staffBenefitDataContentItemSocialInsurance.companyBenefitName) &&
        Objects.equals(this.divisionId, staffBenefitDataContentItemSocialInsurance.divisionId) &&
        Objects.equals(this.endOn, staffBenefitDataContentItemSocialInsurance.endOn) &&
        Objects.equals(this.originalCompanyBenefitId, staffBenefitDataContentItemSocialInsurance.originalCompanyBenefitId) &&
        Objects.equals(this.payDepartmentId, staffBenefitDataContentItemSocialInsurance.payDepartmentId) &&
        Objects.equals(this.startOn, staffBenefitDataContentItemSocialInsurance.startOn) &&
        Objects.equals(this.supplementaryHfAccountNumber, staffBenefitDataContentItemSocialInsurance.supplementaryHfAccountNumber) &&
        Objects.equals(this.vendorId, staffBenefitDataContentItemSocialInsurance.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, actualPayer, base, bases, calculatable, companyBenefitId, companyBenefitName, divisionId, endOn, originalCompanyBenefitId, payDepartmentId, startOn, supplementaryHfAccountNumber, vendorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffBenefitDataContentItemSocialInsurance {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    actualPayer: ").append(toIndentedString(actualPayer)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    bases: ").append(toIndentedString(bases)).append("\n");
    sb.append("    calculatable: ").append(toIndentedString(calculatable)).append("\n");
    sb.append("    companyBenefitId: ").append(toIndentedString(companyBenefitId)).append("\n");
    sb.append("    companyBenefitName: ").append(toIndentedString(companyBenefitName)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
    sb.append("    originalCompanyBenefitId: ").append(toIndentedString(originalCompanyBenefitId)).append("\n");
    sb.append("    payDepartmentId: ").append(toIndentedString(payDepartmentId)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    supplementaryHfAccountNumber: ").append(toIndentedString(supplementaryHfAccountNumber)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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
