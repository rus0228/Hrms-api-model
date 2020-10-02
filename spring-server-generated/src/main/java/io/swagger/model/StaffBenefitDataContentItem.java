package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffBenefitDataContentItemSocialInsurance;
import io.swagger.model.StaffBenefitDataContentItemStaff;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffBenefitDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffBenefitDataContentItem   {
  @JsonProperty("divisionId")
  private String divisionId = null;

  @JsonProperty("hfAccountNumber")
  private String hfAccountNumber = null;

  @JsonProperty("houseFund")
  private String houseFund = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("otherBenefit")
  private Object otherBenefit = null;

  @JsonProperty("siAccountNumber")
  private String siAccountNumber = null;

  @JsonProperty("siCompanyBenefitId")
  private String siCompanyBenefitId = null;

  @JsonProperty("siCompanyBenefitName")
  private String siCompanyBenefitName = null;

  @JsonProperty("socialInsurance")
  private StaffBenefitDataContentItemSocialInsurance socialInsurance = null;

  @JsonProperty("staff")
  private StaffBenefitDataContentItemStaff staff = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffImageId")
  private String staffImageId = null;

  @JsonProperty("staffType")
  private String staffType = null;

  @JsonProperty("supplementaryHfAccountNumber")
  private String supplementaryHfAccountNumber = null;

  public StaffBenefitDataContentItem divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }

  /**
   * Get divisionId
   * @return divisionId
  **/
  @ApiModelProperty(value = "")
  
    public String getDivisionId() {
    return divisionId;
  }

  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  public StaffBenefitDataContentItem hfAccountNumber(String hfAccountNumber) {
    this.hfAccountNumber = hfAccountNumber;
    return this;
  }

  /**
   * Get hfAccountNumber
   * @return hfAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getHfAccountNumber() {
    return hfAccountNumber;
  }

  public void setHfAccountNumber(String hfAccountNumber) {
    this.hfAccountNumber = hfAccountNumber;
  }

  public StaffBenefitDataContentItem houseFund(String houseFund) {
    this.houseFund = houseFund;
    return this;
  }

  /**
   * Get houseFund
   * @return houseFund
  **/
  @ApiModelProperty(value = "")
  
    public String getHouseFund() {
    return houseFund;
  }

  public void setHouseFund(String houseFund) {
    this.houseFund = houseFund;
  }

  public StaffBenefitDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "352717327134883840", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffBenefitDataContentItem otherBenefit(Object otherBenefit) {
    this.otherBenefit = otherBenefit;
    return this;
  }

  /**
   * Get otherBenefit
   * @return otherBenefit
  **/
  @ApiModelProperty(value = "")
  
    public Object getOtherBenefit() {
    return otherBenefit;
  }

  public void setOtherBenefit(Object otherBenefit) {
    this.otherBenefit = otherBenefit;
  }

  public StaffBenefitDataContentItem siAccountNumber(String siAccountNumber) {
    this.siAccountNumber = siAccountNumber;
    return this;
  }

  /**
   * Get siAccountNumber
   * @return siAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getSiAccountNumber() {
    return siAccountNumber;
  }

  public void setSiAccountNumber(String siAccountNumber) {
    this.siAccountNumber = siAccountNumber;
  }

  public StaffBenefitDataContentItem siCompanyBenefitId(String siCompanyBenefitId) {
    this.siCompanyBenefitId = siCompanyBenefitId;
    return this;
  }

  /**
   * Get siCompanyBenefitId
   * @return siCompanyBenefitId
  **/
  @ApiModelProperty(value = "")
  
    public String getSiCompanyBenefitId() {
    return siCompanyBenefitId;
  }

  public void setSiCompanyBenefitId(String siCompanyBenefitId) {
    this.siCompanyBenefitId = siCompanyBenefitId;
  }

  public StaffBenefitDataContentItem siCompanyBenefitName(String siCompanyBenefitName) {
    this.siCompanyBenefitName = siCompanyBenefitName;
    return this;
  }

  /**
   * Get siCompanyBenefitName
   * @return siCompanyBenefitName
  **/
  @ApiModelProperty(value = "")
  
    public String getSiCompanyBenefitName() {
    return siCompanyBenefitName;
  }

  public void setSiCompanyBenefitName(String siCompanyBenefitName) {
    this.siCompanyBenefitName = siCompanyBenefitName;
  }

  public StaffBenefitDataContentItem socialInsurance(StaffBenefitDataContentItemSocialInsurance socialInsurance) {
    this.socialInsurance = socialInsurance;
    return this;
  }

  /**
   * Get socialInsurance
   * @return socialInsurance
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffBenefitDataContentItemSocialInsurance getSocialInsurance() {
    return socialInsurance;
  }

  public void setSocialInsurance(StaffBenefitDataContentItemSocialInsurance socialInsurance) {
    this.socialInsurance = socialInsurance;
  }

  public StaffBenefitDataContentItem staff(StaffBenefitDataContentItemStaff staff) {
    this.staff = staff;
    return this;
  }

  /**
   * Get staff
   * @return staff
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffBenefitDataContentItemStaff getStaff() {
    return staff;
  }

  public void setStaff(StaffBenefitDataContentItemStaff staff) {
    this.staff = staff;
  }

  public StaffBenefitDataContentItem staffId(String staffId) {
    this.staffId = staffId;
    return this;
  }

  /**
   * Get staffId
   * @return staffId
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffId() {
    return staffId;
  }

  public void setStaffId(String staffId) {
    this.staffId = staffId;
  }

  public StaffBenefitDataContentItem staffImageId(String staffImageId) {
    this.staffImageId = staffImageId;
    return this;
  }

  /**
   * Get staffImageId
   * @return staffImageId
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffImageId() {
    return staffImageId;
  }

  public void setStaffImageId(String staffImageId) {
    this.staffImageId = staffImageId;
  }

  public StaffBenefitDataContentItem staffType(String staffType) {
    this.staffType = staffType;
    return this;
  }

  /**
   * Get staffType
   * @return staffType
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffType() {
    return staffType;
  }

  public void setStaffType(String staffType) {
    this.staffType = staffType;
  }

  public StaffBenefitDataContentItem supplementaryHfAccountNumber(String supplementaryHfAccountNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffBenefitDataContentItem staffBenefitDataContentItem = (StaffBenefitDataContentItem) o;
    return Objects.equals(this.divisionId, staffBenefitDataContentItem.divisionId) &&
        Objects.equals(this.hfAccountNumber, staffBenefitDataContentItem.hfAccountNumber) &&
        Objects.equals(this.houseFund, staffBenefitDataContentItem.houseFund) &&
        Objects.equals(this.id, staffBenefitDataContentItem.id) &&
        Objects.equals(this.otherBenefit, staffBenefitDataContentItem.otherBenefit) &&
        Objects.equals(this.siAccountNumber, staffBenefitDataContentItem.siAccountNumber) &&
        Objects.equals(this.siCompanyBenefitId, staffBenefitDataContentItem.siCompanyBenefitId) &&
        Objects.equals(this.siCompanyBenefitName, staffBenefitDataContentItem.siCompanyBenefitName) &&
        Objects.equals(this.socialInsurance, staffBenefitDataContentItem.socialInsurance) &&
        Objects.equals(this.staff, staffBenefitDataContentItem.staff) &&
        Objects.equals(this.staffId, staffBenefitDataContentItem.staffId) &&
        Objects.equals(this.staffImageId, staffBenefitDataContentItem.staffImageId) &&
        Objects.equals(this.staffType, staffBenefitDataContentItem.staffType) &&
        Objects.equals(this.supplementaryHfAccountNumber, staffBenefitDataContentItem.supplementaryHfAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divisionId, hfAccountNumber, houseFund, id, otherBenefit, siAccountNumber, siCompanyBenefitId, siCompanyBenefitName, socialInsurance, staff, staffId, staffImageId, staffType, supplementaryHfAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffBenefitDataContentItem {\n");
    
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    hfAccountNumber: ").append(toIndentedString(hfAccountNumber)).append("\n");
    sb.append("    houseFund: ").append(toIndentedString(houseFund)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    otherBenefit: ").append(toIndentedString(otherBenefit)).append("\n");
    sb.append("    siAccountNumber: ").append(toIndentedString(siAccountNumber)).append("\n");
    sb.append("    siCompanyBenefitId: ").append(toIndentedString(siCompanyBenefitId)).append("\n");
    sb.append("    siCompanyBenefitName: ").append(toIndentedString(siCompanyBenefitName)).append("\n");
    sb.append("    socialInsurance: ").append(toIndentedString(socialInsurance)).append("\n");
    sb.append("    staff: ").append(toIndentedString(staff)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffImageId: ").append(toIndentedString(staffImageId)).append("\n");
    sb.append("    staffType: ").append(toIndentedString(staffType)).append("\n");
    sb.append("    supplementaryHfAccountNumber: ").append(toIndentedString(supplementaryHfAccountNumber)).append("\n");
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
