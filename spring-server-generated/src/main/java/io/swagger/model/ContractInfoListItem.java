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
 * ContractInfoListItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ContractInfoListItem   {
  @JsonProperty("applicantName")
  private String applicantName = null;

  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("applicationStatus")
  private String applicationStatus = null;

  @JsonProperty("applicationType")
  private String applicationType = null;

  @JsonProperty("applyTime")
  private String applyTime = null;

  @JsonProperty("assignees")
  private String assignees = null;

  @JsonProperty("calcContractTerm")
  private Long calcContractTerm = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("contactTerm")
  private String contactTerm = null;

  @JsonProperty("contractBeginDate")
  private String contractBeginDate = null;

  @JsonProperty("contractEndDate")
  private String contractEndDate = null;

  @JsonProperty("contractHistoryRecordList")
  private Object contractHistoryRecordList = null;

  @JsonProperty("contractNo")
  private String contractNo = null;

  @JsonProperty("contractProperty")
  private String contractProperty = null;

  @JsonProperty("contractSignDate")
  private String contractSignDate = null;

  @JsonProperty("contractStatus")
  private String contractStatus = null;

  @JsonProperty("contractTermDate")
  private String contractTermDate = null;

  @JsonProperty("contractTermType")
  private String contractTermType = null;

  @JsonProperty("contractType")
  private String contractType = null;

  @JsonProperty("corporationId")
  private String corporationId = null;

  @JsonProperty("corporationName")
  private String corporationName = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("curContractBeginDate")
  private String curContractBeginDate = null;

  @JsonProperty("curContractEndDate")
  private String curContractEndDate = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("departmentName")
  private String departmentName = null;

  @JsonProperty("digitalContractNum")
  private String digitalContractNum = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("enrollDate")
  private String enrollDate = null;

  @JsonProperty("historyContract")
  private Boolean historyContract = false;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("idCardId")
  private String idCardId = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("positionId")
  private String positionId = null;

  @JsonProperty("positionName")
  private String positionName = null;

  @JsonProperty("processCode")
  private Object processCode = null;

  @JsonProperty("processId")
  private String processId = null;

  @JsonProperty("remark")
  private String remark = null;

  @JsonProperty("renewContractBeginDate")
  private String renewContractBeginDate = null;

  @JsonProperty("renewContractEndDate")
  private String renewContractEndDate = null;

  @JsonProperty("signedNum")
  private Long signedNum = null;

  @JsonProperty("staffId")
  private String staffId = null;

  @JsonProperty("staffName")
  private String staffName = null;

  @JsonProperty("staffNo")
  private String staffNo = null;

  @JsonProperty("staffStatus")
  private String staffStatus = null;

  @JsonProperty("warningStatus")
  private Long warningStatus = null;

  public ContractInfoListItem applicantName(String applicantName) {
    this.applicantName = applicantName;
    return this;
  }

  /**
   * Get applicantName
   * @return applicantName
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicantName() {
    return applicantName;
  }

  public void setApplicantName(String applicantName) {
    this.applicantName = applicantName;
  }

  public ContractInfoListItem applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public ContractInfoListItem applicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
    return this;
  }

  /**
   * Get applicationStatus
   * @return applicationStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  public ContractInfoListItem applicationType(String applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  **/
  @ApiModelProperty(value = "")
  
    public String getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }

  public ContractInfoListItem applyTime(String applyTime) {
    this.applyTime = applyTime;
    return this;
  }

  /**
   * Get applyTime
   * @return applyTime
  **/
  @ApiModelProperty(value = "")
  
    public String getApplyTime() {
    return applyTime;
  }

  public void setApplyTime(String applyTime) {
    this.applyTime = applyTime;
  }

  public ContractInfoListItem assignees(String assignees) {
    this.assignees = assignees;
    return this;
  }

  /**
   * Get assignees
   * @return assignees
  **/
  @ApiModelProperty(value = "")
  
    public String getAssignees() {
    return assignees;
  }

  public void setAssignees(String assignees) {
    this.assignees = assignees;
  }

  public ContractInfoListItem calcContractTerm(Long calcContractTerm) {
    this.calcContractTerm = calcContractTerm;
    return this;
  }

  /**
   * Get calcContractTerm
   * @return calcContractTerm
  **/
  @ApiModelProperty(value = "")
  
    public Long getCalcContractTerm() {
    return calcContractTerm;
  }

  public void setCalcContractTerm(Long calcContractTerm) {
    this.calcContractTerm = calcContractTerm;
  }

  public ContractInfoListItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ContractInfoListItem contactTerm(String contactTerm) {
    this.contactTerm = contactTerm;
    return this;
  }

  /**
   * Get contactTerm
   * @return contactTerm
  **/
  @ApiModelProperty(value = "")
  
    public String getContactTerm() {
    return contactTerm;
  }

  public void setContactTerm(String contactTerm) {
    this.contactTerm = contactTerm;
  }

  public ContractInfoListItem contractBeginDate(String contractBeginDate) {
    this.contractBeginDate = contractBeginDate;
    return this;
  }

  /**
   * Get contractBeginDate
   * @return contractBeginDate
  **/
  @ApiModelProperty(value = "")
  
    public String getContractBeginDate() {
    return contractBeginDate;
  }

  public void setContractBeginDate(String contractBeginDate) {
    this.contractBeginDate = contractBeginDate;
  }

  public ContractInfoListItem contractEndDate(String contractEndDate) {
    this.contractEndDate = contractEndDate;
    return this;
  }

  /**
   * Get contractEndDate
   * @return contractEndDate
  **/
  @ApiModelProperty(value = "")
  
    public String getContractEndDate() {
    return contractEndDate;
  }

  public void setContractEndDate(String contractEndDate) {
    this.contractEndDate = contractEndDate;
  }

  public ContractInfoListItem contractHistoryRecordList(Object contractHistoryRecordList) {
    this.contractHistoryRecordList = contractHistoryRecordList;
    return this;
  }

  /**
   * Get contractHistoryRecordList
   * @return contractHistoryRecordList
  **/
  @ApiModelProperty(value = "")
  
    public Object getContractHistoryRecordList() {
    return contractHistoryRecordList;
  }

  public void setContractHistoryRecordList(Object contractHistoryRecordList) {
    this.contractHistoryRecordList = contractHistoryRecordList;
  }

  public ContractInfoListItem contractNo(String contractNo) {
    this.contractNo = contractNo;
    return this;
  }

  /**
   * Get contractNo
   * @return contractNo
  **/
  @ApiModelProperty(value = "")
  
    public String getContractNo() {
    return contractNo;
  }

  public void setContractNo(String contractNo) {
    this.contractNo = contractNo;
  }

  public ContractInfoListItem contractProperty(String contractProperty) {
    this.contractProperty = contractProperty;
    return this;
  }

  /**
   * Get contractProperty
   * @return contractProperty
  **/
  @ApiModelProperty(value = "")
  
    public String getContractProperty() {
    return contractProperty;
  }

  public void setContractProperty(String contractProperty) {
    this.contractProperty = contractProperty;
  }

  public ContractInfoListItem contractSignDate(String contractSignDate) {
    this.contractSignDate = contractSignDate;
    return this;
  }

  /**
   * Get contractSignDate
   * @return contractSignDate
  **/
  @ApiModelProperty(value = "")
  
    public String getContractSignDate() {
    return contractSignDate;
  }

  public void setContractSignDate(String contractSignDate) {
    this.contractSignDate = contractSignDate;
  }

  public ContractInfoListItem contractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * Get contractStatus
   * @return contractStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }

  public ContractInfoListItem contractTermDate(String contractTermDate) {
    this.contractTermDate = contractTermDate;
    return this;
  }

  /**
   * Get contractTermDate
   * @return contractTermDate
  **/
  @ApiModelProperty(value = "")
  
    public String getContractTermDate() {
    return contractTermDate;
  }

  public void setContractTermDate(String contractTermDate) {
    this.contractTermDate = contractTermDate;
  }

  public ContractInfoListItem contractTermType(String contractTermType) {
    this.contractTermType = contractTermType;
    return this;
  }

  /**
   * Get contractTermType
   * @return contractTermType
  **/
  @ApiModelProperty(value = "")
  
    public String getContractTermType() {
    return contractTermType;
  }

  public void setContractTermType(String contractTermType) {
    this.contractTermType = contractTermType;
  }

  public ContractInfoListItem contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
  **/
  @ApiModelProperty(value = "")
  
    public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public ContractInfoListItem corporationId(String corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * Get corporationId
   * @return corporationId
  **/
  @ApiModelProperty(value = "")
  
    public String getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(String corporationId) {
    this.corporationId = corporationId;
  }

  public ContractInfoListItem corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(value = "")
  
    public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public ContractInfoListItem createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ContractInfoListItem curContractBeginDate(String curContractBeginDate) {
    this.curContractBeginDate = curContractBeginDate;
    return this;
  }

  /**
   * Get curContractBeginDate
   * @return curContractBeginDate
  **/
  @ApiModelProperty(value = "")
  
    public String getCurContractBeginDate() {
    return curContractBeginDate;
  }

  public void setCurContractBeginDate(String curContractBeginDate) {
    this.curContractBeginDate = curContractBeginDate;
  }

  public ContractInfoListItem curContractEndDate(String curContractEndDate) {
    this.curContractEndDate = curContractEndDate;
    return this;
  }

  /**
   * Get curContractEndDate
   * @return curContractEndDate
  **/
  @ApiModelProperty(value = "")
  
    public String getCurContractEndDate() {
    return curContractEndDate;
  }

  public void setCurContractEndDate(String curContractEndDate) {
    this.curContractEndDate = curContractEndDate;
  }

  public ContractInfoListItem departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public ContractInfoListItem departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public ContractInfoListItem digitalContractNum(String digitalContractNum) {
    this.digitalContractNum = digitalContractNum;
    return this;
  }

  /**
   * Get digitalContractNum
   * @return digitalContractNum
  **/
  @ApiModelProperty(value = "")
  
    public String getDigitalContractNum() {
    return digitalContractNum;
  }

  public void setDigitalContractNum(String digitalContractNum) {
    this.digitalContractNum = digitalContractNum;
  }

  public ContractInfoListItem endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  
    public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ContractInfoListItem enrollDate(String enrollDate) {
    this.enrollDate = enrollDate;
    return this;
  }

  /**
   * Get enrollDate
   * @return enrollDate
  **/
  @ApiModelProperty(value = "")
  
    public String getEnrollDate() {
    return enrollDate;
  }

  public void setEnrollDate(String enrollDate) {
    this.enrollDate = enrollDate;
  }

  public ContractInfoListItem historyContract(Boolean historyContract) {
    this.historyContract = historyContract;
    return this;
  }

  /**
   * Get historyContract
   * @return historyContract
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isHistoryContract() {
    return historyContract;
  }

  public void setHistoryContract(Boolean historyContract) {
    this.historyContract = historyContract;
  }

  public ContractInfoListItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContractInfoListItem idCardId(String idCardId) {
    this.idCardId = idCardId;
    return this;
  }

  /**
   * Get idCardId
   * @return idCardId
  **/
  @ApiModelProperty(value = "")
  
    public String getIdCardId() {
    return idCardId;
  }

  public void setIdCardId(String idCardId) {
    this.idCardId = idCardId;
  }

  public ContractInfoListItem isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public ContractInfoListItem mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(value = "")
  
    public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public ContractInfoListItem positionId(String positionId) {
    this.positionId = positionId;
    return this;
  }

  /**
   * Get positionId
   * @return positionId
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionId() {
    return positionId;
  }

  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }

  public ContractInfoListItem positionName(String positionName) {
    this.positionName = positionName;
    return this;
  }

  /**
   * Get positionName
   * @return positionName
  **/
  @ApiModelProperty(value = "")
  
    public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  public ContractInfoListItem processCode(Object processCode) {
    this.processCode = processCode;
    return this;
  }

  /**
   * Get processCode
   * @return processCode
  **/
  @ApiModelProperty(value = "")
  
    public Object getProcessCode() {
    return processCode;
  }

  public void setProcessCode(Object processCode) {
    this.processCode = processCode;
  }

  public ContractInfoListItem processId(String processId) {
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

  public ContractInfoListItem remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(value = "")
  
    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public ContractInfoListItem renewContractBeginDate(String renewContractBeginDate) {
    this.renewContractBeginDate = renewContractBeginDate;
    return this;
  }

  /**
   * Get renewContractBeginDate
   * @return renewContractBeginDate
  **/
  @ApiModelProperty(value = "")
  
    public String getRenewContractBeginDate() {
    return renewContractBeginDate;
  }

  public void setRenewContractBeginDate(String renewContractBeginDate) {
    this.renewContractBeginDate = renewContractBeginDate;
  }

  public ContractInfoListItem renewContractEndDate(String renewContractEndDate) {
    this.renewContractEndDate = renewContractEndDate;
    return this;
  }

  /**
   * Get renewContractEndDate
   * @return renewContractEndDate
  **/
  @ApiModelProperty(value = "")
  
    public String getRenewContractEndDate() {
    return renewContractEndDate;
  }

  public void setRenewContractEndDate(String renewContractEndDate) {
    this.renewContractEndDate = renewContractEndDate;
  }

  public ContractInfoListItem signedNum(Long signedNum) {
    this.signedNum = signedNum;
    return this;
  }

  /**
   * Get signedNum
   * @return signedNum
  **/
  @ApiModelProperty(value = "")
  
    public Long getSignedNum() {
    return signedNum;
  }

  public void setSignedNum(Long signedNum) {
    this.signedNum = signedNum;
  }

  public ContractInfoListItem staffId(String staffId) {
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

  public ContractInfoListItem staffName(String staffName) {
    this.staffName = staffName;
    return this;
  }

  /**
   * Get staffName
   * @return staffName
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public ContractInfoListItem staffNo(String staffNo) {
    this.staffNo = staffNo;
    return this;
  }

  /**
   * Get staffNo
   * @return staffNo
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffNo() {
    return staffNo;
  }

  public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
  }

  public ContractInfoListItem staffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
    return this;
  }

  /**
   * Get staffStatus
   * @return staffStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getStaffStatus() {
    return staffStatus;
  }

  public void setStaffStatus(String staffStatus) {
    this.staffStatus = staffStatus;
  }

  public ContractInfoListItem warningStatus(Long warningStatus) {
    this.warningStatus = warningStatus;
    return this;
  }

  /**
   * Get warningStatus
   * @return warningStatus
  **/
  @ApiModelProperty(value = "")
  
    public Long getWarningStatus() {
    return warningStatus;
  }

  public void setWarningStatus(Long warningStatus) {
    this.warningStatus = warningStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractInfoListItem contractInfoListItem = (ContractInfoListItem) o;
    return Objects.equals(this.applicantName, contractInfoListItem.applicantName) &&
        Objects.equals(this.applicationId, contractInfoListItem.applicationId) &&
        Objects.equals(this.applicationStatus, contractInfoListItem.applicationStatus) &&
        Objects.equals(this.applicationType, contractInfoListItem.applicationType) &&
        Objects.equals(this.applyTime, contractInfoListItem.applyTime) &&
        Objects.equals(this.assignees, contractInfoListItem.assignees) &&
        Objects.equals(this.calcContractTerm, contractInfoListItem.calcContractTerm) &&
        Objects.equals(this.companyId, contractInfoListItem.companyId) &&
        Objects.equals(this.contactTerm, contractInfoListItem.contactTerm) &&
        Objects.equals(this.contractBeginDate, contractInfoListItem.contractBeginDate) &&
        Objects.equals(this.contractEndDate, contractInfoListItem.contractEndDate) &&
        Objects.equals(this.contractHistoryRecordList, contractInfoListItem.contractHistoryRecordList) &&
        Objects.equals(this.contractNo, contractInfoListItem.contractNo) &&
        Objects.equals(this.contractProperty, contractInfoListItem.contractProperty) &&
        Objects.equals(this.contractSignDate, contractInfoListItem.contractSignDate) &&
        Objects.equals(this.contractStatus, contractInfoListItem.contractStatus) &&
        Objects.equals(this.contractTermDate, contractInfoListItem.contractTermDate) &&
        Objects.equals(this.contractTermType, contractInfoListItem.contractTermType) &&
        Objects.equals(this.contractType, contractInfoListItem.contractType) &&
        Objects.equals(this.corporationId, contractInfoListItem.corporationId) &&
        Objects.equals(this.corporationName, contractInfoListItem.corporationName) &&
        Objects.equals(this.createdDate, contractInfoListItem.createdDate) &&
        Objects.equals(this.curContractBeginDate, contractInfoListItem.curContractBeginDate) &&
        Objects.equals(this.curContractEndDate, contractInfoListItem.curContractEndDate) &&
        Objects.equals(this.departmentId, contractInfoListItem.departmentId) &&
        Objects.equals(this.departmentName, contractInfoListItem.departmentName) &&
        Objects.equals(this.digitalContractNum, contractInfoListItem.digitalContractNum) &&
        Objects.equals(this.endTime, contractInfoListItem.endTime) &&
        Objects.equals(this.enrollDate, contractInfoListItem.enrollDate) &&
        Objects.equals(this.historyContract, contractInfoListItem.historyContract) &&
        Objects.equals(this.id, contractInfoListItem.id) &&
        Objects.equals(this.idCardId, contractInfoListItem.idCardId) &&
        Objects.equals(this.isDeleted, contractInfoListItem.isDeleted) &&
        Objects.equals(this.mobileNo, contractInfoListItem.mobileNo) &&
        Objects.equals(this.positionId, contractInfoListItem.positionId) &&
        Objects.equals(this.positionName, contractInfoListItem.positionName) &&
        Objects.equals(this.processCode, contractInfoListItem.processCode) &&
        Objects.equals(this.processId, contractInfoListItem.processId) &&
        Objects.equals(this.remark, contractInfoListItem.remark) &&
        Objects.equals(this.renewContractBeginDate, contractInfoListItem.renewContractBeginDate) &&
        Objects.equals(this.renewContractEndDate, contractInfoListItem.renewContractEndDate) &&
        Objects.equals(this.signedNum, contractInfoListItem.signedNum) &&
        Objects.equals(this.staffId, contractInfoListItem.staffId) &&
        Objects.equals(this.staffName, contractInfoListItem.staffName) &&
        Objects.equals(this.staffNo, contractInfoListItem.staffNo) &&
        Objects.equals(this.staffStatus, contractInfoListItem.staffStatus) &&
        Objects.equals(this.warningStatus, contractInfoListItem.warningStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantName, applicationId, applicationStatus, applicationType, applyTime, assignees, calcContractTerm, companyId, contactTerm, contractBeginDate, contractEndDate, contractHistoryRecordList, contractNo, contractProperty, contractSignDate, contractStatus, contractTermDate, contractTermType, contractType, corporationId, corporationName, createdDate, curContractBeginDate, curContractEndDate, departmentId, departmentName, digitalContractNum, endTime, enrollDate, historyContract, id, idCardId, isDeleted, mobileNo, positionId, positionName, processCode, processId, remark, renewContractBeginDate, renewContractEndDate, signedNum, staffId, staffName, staffNo, staffStatus, warningStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractInfoListItem {\n");
    
    sb.append("    applicantName: ").append(toIndentedString(applicantName)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
    sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
    sb.append("    calcContractTerm: ").append(toIndentedString(calcContractTerm)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    contactTerm: ").append(toIndentedString(contactTerm)).append("\n");
    sb.append("    contractBeginDate: ").append(toIndentedString(contractBeginDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    contractHistoryRecordList: ").append(toIndentedString(contractHistoryRecordList)).append("\n");
    sb.append("    contractNo: ").append(toIndentedString(contractNo)).append("\n");
    sb.append("    contractProperty: ").append(toIndentedString(contractProperty)).append("\n");
    sb.append("    contractSignDate: ").append(toIndentedString(contractSignDate)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    contractTermDate: ").append(toIndentedString(contractTermDate)).append("\n");
    sb.append("    contractTermType: ").append(toIndentedString(contractTermType)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    curContractBeginDate: ").append(toIndentedString(curContractBeginDate)).append("\n");
    sb.append("    curContractEndDate: ").append(toIndentedString(curContractEndDate)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    digitalContractNum: ").append(toIndentedString(digitalContractNum)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    enrollDate: ").append(toIndentedString(enrollDate)).append("\n");
    sb.append("    historyContract: ").append(toIndentedString(historyContract)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCardId: ").append(toIndentedString(idCardId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
    sb.append("    processCode: ").append(toIndentedString(processCode)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    renewContractBeginDate: ").append(toIndentedString(renewContractBeginDate)).append("\n");
    sb.append("    renewContractEndDate: ").append(toIndentedString(renewContractEndDate)).append("\n");
    sb.append("    signedNum: ").append(toIndentedString(signedNum)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    staffName: ").append(toIndentedString(staffName)).append("\n");
    sb.append("    staffNo: ").append(toIndentedString(staffNo)).append("\n");
    sb.append("    staffStatus: ").append(toIndentedString(staffStatus)).append("\n");
    sb.append("    warningStatus: ").append(toIndentedString(warningStatus)).append("\n");
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
