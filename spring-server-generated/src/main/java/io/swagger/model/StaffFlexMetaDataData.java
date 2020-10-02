package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StaffFlexMetaDataDataCertificateInfo;
import io.swagger.model.StaffFlexMetaDataDataStaffEducation;
import io.swagger.model.StaffFlexMetaDataDataStaffInfo;
import io.swagger.model.StaffFlexMetaDataDataStaffJobHistory;
import io.swagger.model.StaffFlexMetaDataDataTabStaffSubsetPtd;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffFlexMetaDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class StaffFlexMetaDataData   {
  @JsonProperty("CertificateInfo")
  private StaffFlexMetaDataDataCertificateInfo certificateInfo = null;

  @JsonProperty("StaffEducation")
  private StaffFlexMetaDataDataStaffEducation staffEducation = null;

  @JsonProperty("StaffInfo")
  private StaffFlexMetaDataDataStaffInfo staffInfo = null;

  @JsonProperty("StaffJobHistory")
  private StaffFlexMetaDataDataStaffJobHistory staffJobHistory = null;

  @JsonProperty("tab_staff_subset_ptd")
  private StaffFlexMetaDataDataTabStaffSubsetPtd tabStaffSubsetPtd = null;

  public StaffFlexMetaDataData certificateInfo(StaffFlexMetaDataDataCertificateInfo certificateInfo) {
    this.certificateInfo = certificateInfo;
    return this;
  }

  /**
   * Get certificateInfo
   * @return certificateInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataDataCertificateInfo getCertificateInfo() {
    return certificateInfo;
  }

  public void setCertificateInfo(StaffFlexMetaDataDataCertificateInfo certificateInfo) {
    this.certificateInfo = certificateInfo;
  }

  public StaffFlexMetaDataData staffEducation(StaffFlexMetaDataDataStaffEducation staffEducation) {
    this.staffEducation = staffEducation;
    return this;
  }

  /**
   * Get staffEducation
   * @return staffEducation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataDataStaffEducation getStaffEducation() {
    return staffEducation;
  }

  public void setStaffEducation(StaffFlexMetaDataDataStaffEducation staffEducation) {
    this.staffEducation = staffEducation;
  }

  public StaffFlexMetaDataData staffInfo(StaffFlexMetaDataDataStaffInfo staffInfo) {
    this.staffInfo = staffInfo;
    return this;
  }

  /**
   * Get staffInfo
   * @return staffInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataDataStaffInfo getStaffInfo() {
    return staffInfo;
  }

  public void setStaffInfo(StaffFlexMetaDataDataStaffInfo staffInfo) {
    this.staffInfo = staffInfo;
  }

  public StaffFlexMetaDataData staffJobHistory(StaffFlexMetaDataDataStaffJobHistory staffJobHistory) {
    this.staffJobHistory = staffJobHistory;
    return this;
  }

  /**
   * Get staffJobHistory
   * @return staffJobHistory
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataDataStaffJobHistory getStaffJobHistory() {
    return staffJobHistory;
  }

  public void setStaffJobHistory(StaffFlexMetaDataDataStaffJobHistory staffJobHistory) {
    this.staffJobHistory = staffJobHistory;
  }

  public StaffFlexMetaDataData tabStaffSubsetPtd(StaffFlexMetaDataDataTabStaffSubsetPtd tabStaffSubsetPtd) {
    this.tabStaffSubsetPtd = tabStaffSubsetPtd;
    return this;
  }

  /**
   * Get tabStaffSubsetPtd
   * @return tabStaffSubsetPtd
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StaffFlexMetaDataDataTabStaffSubsetPtd getTabStaffSubsetPtd() {
    return tabStaffSubsetPtd;
  }

  public void setTabStaffSubsetPtd(StaffFlexMetaDataDataTabStaffSubsetPtd tabStaffSubsetPtd) {
    this.tabStaffSubsetPtd = tabStaffSubsetPtd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffFlexMetaDataData staffFlexMetaDataData = (StaffFlexMetaDataData) o;
    return Objects.equals(this.certificateInfo, staffFlexMetaDataData.certificateInfo) &&
        Objects.equals(this.staffEducation, staffFlexMetaDataData.staffEducation) &&
        Objects.equals(this.staffInfo, staffFlexMetaDataData.staffInfo) &&
        Objects.equals(this.staffJobHistory, staffFlexMetaDataData.staffJobHistory) &&
        Objects.equals(this.tabStaffSubsetPtd, staffFlexMetaDataData.tabStaffSubsetPtd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateInfo, staffEducation, staffInfo, staffJobHistory, tabStaffSubsetPtd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffFlexMetaDataData {\n");
    
    sb.append("    certificateInfo: ").append(toIndentedString(certificateInfo)).append("\n");
    sb.append("    staffEducation: ").append(toIndentedString(staffEducation)).append("\n");
    sb.append("    staffInfo: ").append(toIndentedString(staffInfo)).append("\n");
    sb.append("    staffJobHistory: ").append(toIndentedString(staffJobHistory)).append("\n");
    sb.append("    tabStaffSubsetPtd: ").append(toIndentedString(tabStaffSubsetPtd)).append("\n");
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
