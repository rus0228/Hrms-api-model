package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchEntryFormListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class SearchEntryFormListItem   {
  @JsonProperty("abandonDate")
  private LocalDate abandonDate = null;

  @JsonProperty("abandonEntry")
  private Long abandonEntry = null;

  @JsonProperty("abandonReason")
  private String abandonReason = null;

  @JsonProperty("blacklist")
  private Long blacklist = null;

  @JsonProperty("confirmEntryDate")
  private String confirmEntryDate = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("entryApplicationStatus")
  private String entryApplicationStatus = null;

  @JsonProperty("entryStaffInfo")
  private Long entryStaffInfo = null;

  @JsonProperty("entryStatus")
  private Long entryStatus = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idCardNo")
  private String idCardNo = null;

  @JsonProperty("illustration")
  private Object illustration = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("processId")
  private String processId = null;

  @JsonProperty("realityEntryDate")
  private String realityEntryDate = null;

  @JsonProperty("registrationStatus")
  private String registrationStatus = null;

  @JsonProperty("source")
  private Long source = null;

  @JsonProperty("staffName")
  private String staffName = null;

  public SearchEntryFormListItem abandonDate(LocalDate abandonDate) {
    this.abandonDate = abandonDate;
    return this;
  }

  /**
   * Get abandonDate
   * @return abandonDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getAbandonDate() {
    return abandonDate;
  }

  public void setAbandonDate(LocalDate abandonDate) {
    this.abandonDate = abandonDate;
  }

  public SearchEntryFormListItem abandonEntry(Long abandonEntry) {
    this.abandonEntry = abandonEntry;
    return this;
  }

  /**
   * Get abandonEntry
   * @return abandonEntry
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Long getAbandonEntry() {
    return abandonEntry;
  }

  public void setAbandonEntry(Long abandonEntry) {
    this.abandonEntry = abandonEntry;
  }

  public SearchEntryFormListItem abandonReason(String abandonReason) {
    this.abandonReason = abandonReason;
    return this;
  }

  /**
   * Get abandonReason
   * @return abandonReason
  **/
  @ApiModelProperty(value = "")
  
    public String getAbandonReason() {
    return abandonReason;
  }

  public void setAbandonReason(String abandonReason) {
    this.abandonReason = abandonReason;
  }

  public SearchEntryFormListItem blacklist(Long blacklist) {
    this.blacklist = blacklist;
    return this;
  }

  /**
   * Get blacklist
   * @return blacklist
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Long getBlacklist() {
    return blacklist;
  }

  public void setBlacklist(Long blacklist) {
    this.blacklist = blacklist;
  }

  public SearchEntryFormListItem confirmEntryDate(String confirmEntryDate) {
    this.confirmEntryDate = confirmEntryDate;
    return this;
  }

  /**
   * Get confirmEntryDate
   * @return confirmEntryDate
  **/
  @ApiModelProperty(example = "1397577600000", value = "")
  
    public String getConfirmEntryDate() {
    return confirmEntryDate;
  }

  public void setConfirmEntryDate(String confirmEntryDate) {
    this.confirmEntryDate = confirmEntryDate;
  }

  public SearchEntryFormListItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public SearchEntryFormListItem email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SearchEntryFormListItem entryApplicationStatus(String entryApplicationStatus) {
    this.entryApplicationStatus = entryApplicationStatus;
    return this;
  }

  /**
   * Get entryApplicationStatus
   * @return entryApplicationStatus
  **/
  @ApiModelProperty(example = "ARCHIVE", value = "")
  
    public String getEntryApplicationStatus() {
    return entryApplicationStatus;
  }

  public void setEntryApplicationStatus(String entryApplicationStatus) {
    this.entryApplicationStatus = entryApplicationStatus;
  }

  public SearchEntryFormListItem entryStaffInfo(Long entryStaffInfo) {
    this.entryStaffInfo = entryStaffInfo;
    return this;
  }

  /**
   * Get entryStaffInfo
   * @return entryStaffInfo
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Long getEntryStaffInfo() {
    return entryStaffInfo;
  }

  public void setEntryStaffInfo(Long entryStaffInfo) {
    this.entryStaffInfo = entryStaffInfo;
  }

  public SearchEntryFormListItem entryStatus(Long entryStatus) {
    this.entryStatus = entryStatus;
    return this;
  }

  /**
   * Get entryStatus
   * @return entryStatus
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public Long getEntryStatus() {
    return entryStatus;
  }

  public void setEntryStatus(Long entryStatus) {
    this.entryStatus = entryStatus;
  }

  public SearchEntryFormListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1594388f-f67a-488c-ab0e-98836d3c7bc8", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SearchEntryFormListItem idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  /**
   * Get idCardNo
   * @return idCardNo
  **/
  @ApiModelProperty(example = "430602196504052510", value = "")
  
    public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }

  public SearchEntryFormListItem illustration(Object illustration) {
    this.illustration = illustration;
    return this;
  }

  /**
   * Get illustration
   * @return illustration
  **/
  @ApiModelProperty(value = "")
  
    public Object getIllustration() {
    return illustration;
  }

  public void setIllustration(Object illustration) {
    this.illustration = illustration;
  }

  public SearchEntryFormListItem mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(example = "13707313390", value = "")
  
    public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public SearchEntryFormListItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(example = "教务部", value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public SearchEntryFormListItem processId(String processId) {
    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(value = "")
  
    public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public SearchEntryFormListItem realityEntryDate(String realityEntryDate) {
    this.realityEntryDate = realityEntryDate;
    return this;
  }

  /**
   * Get realityEntryDate
   * @return realityEntryDate
  **/
  @ApiModelProperty(example = "1595952000000", value = "")
  
    public String getRealityEntryDate() {
    return realityEntryDate;
  }

  public void setRealityEntryDate(String realityEntryDate) {
    this.realityEntryDate = realityEntryDate;
  }

  public SearchEntryFormListItem registrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
    return this;
  }

  /**
   * Get registrationStatus
   * @return registrationStatus
  **/
  @ApiModelProperty(example = "PASSED", value = "")
  
    public String getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  public SearchEntryFormListItem source(Long source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "5", value = "")
  
    public Long getSource() {
    return source;
  }

  public void setSource(Long source) {
    this.source = source;
  }

  public SearchEntryFormListItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(example = "王剑峰", value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEntryFormListItem searchEntryFormListItem = (SearchEntryFormListItem) o;
    return Objects.equals(this.abandonDate, searchEntryFormListItem.abandonDate) &&
        Objects.equals(this.abandonEntry, searchEntryFormListItem.abandonEntry) &&
        Objects.equals(this.abandonReason, searchEntryFormListItem.abandonReason) &&
        Objects.equals(this.blacklist, searchEntryFormListItem.blacklist) &&
        Objects.equals(this.confirmEntryDate, searchEntryFormListItem.confirmEntryDate) &&
        Objects.equals(this.departmentName, searchEntryFormListItem.departmentName) &&
        Objects.equals(this.email, searchEntryFormListItem.email) &&
        Objects.equals(this.entryApplicationStatus, searchEntryFormListItem.entryApplicationStatus) &&
        Objects.equals(this.entryStaffInfo, searchEntryFormListItem.entryStaffInfo) &&
        Objects.equals(this.entryStatus, searchEntryFormListItem.entryStatus) &&
        Objects.equals(this.id, searchEntryFormListItem.id) &&
        Objects.equals(this.idCardNo, searchEntryFormListItem.idCardNo) &&
        Objects.equals(this.illustration, searchEntryFormListItem.illustration) &&
        Objects.equals(this.mobile, searchEntryFormListItem.mobile) &&
        Objects.equals(this.positionName, searchEntryFormListItem.positionName) &&
        Objects.equals(this.processId, searchEntryFormListItem.processId) &&
        Objects.equals(this.realityEntryDate, searchEntryFormListItem.realityEntryDate) &&
        Objects.equals(this.registrationStatus, searchEntryFormListItem.registrationStatus) &&
        Objects.equals(this.source, searchEntryFormListItem.source) &&
        Objects.equals(this.staffName, searchEntryFormListItem.staffName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonDate, abandonEntry, abandonReason, blacklist, confirmEntryDate, departmentName, email, entryApplicationStatus, entryStaffInfo, entryStatus, id, idCardNo, illustration, mobile, positionName, processId, realityEntryDate, registrationStatus, source, staffName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEntryFormListItem {\n");
    
    sb.append("    abandonDate: ").append(toIndentedString(abandonDate)).append("\n");
    sb.append("    abandonEntry: ").append(toIndentedString(abandonEntry)).append("\n");
    sb.append("    abandonReason: ").append(toIndentedString(abandonReason)).append("\n");
    sb.append("    blacklist: ").append(toIndentedString(blacklist)).append("\n");
    sb.append("    confirmEntryDate: ").append(toIndentedString(confirmEntryDate)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    entryApplicationStatus: ").append(toIndentedString(entryApplicationStatus)).append("\n");
    sb.append("    entryStaffInfo: ").append(toIndentedString(entryStaffInfo)).append("\n");
    sb.append("    entryStatus: ").append(toIndentedString(entryStatus)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCardNo: ").append(toIndentedString(idCardNo)).append("\n");
    sb.append("    illustration: ").append(toIndentedString(illustration)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    realityEntryDate: ").append(toIndentedString(realityEntryDate)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
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
