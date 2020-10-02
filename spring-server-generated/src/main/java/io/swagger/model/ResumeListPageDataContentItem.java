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
 * ResumeListPageDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class ResumeListPageDataContentItem   {
  @JsonProperty("applicationTime")
  private String applicationTime = null;

  @JsonProperty("companyId")
  private String companyId = null;

  @JsonProperty("contentId")
  private String contentId = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("enablePreview")
  private Boolean enablePreview = null;

  @JsonProperty("hasRead")
  private Boolean hasRead = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recycleTime")
  private String recycleTime = null;

  @JsonProperty("resumeCategoryId")
  private String resumeCategoryId = null;

  @JsonProperty("resumeSourceName")
  private String resumeSourceName = null;

  @JsonProperty("resumeSourceType")
  private String resumeSourceType = null;

  @JsonProperty("resumeStatus")
  private String resumeStatus = null;

  @JsonProperty("resumeUploadName")
  private String resumeUploadName = null;

  @JsonProperty("resumeUploadType")
  private String resumeUploadType = null;

  @JsonProperty("sourceEmailId")
  private String sourceEmailId = null;

  @JsonProperty("uploadResumeFileType")
  private String uploadResumeFileType = null;

  @JsonProperty("userId")
  private String userId = null;

  public ResumeListPageDataContentItem applicationTime(String applicationTime) {
    this.applicationTime = applicationTime;
    return this;
  }

  /**
   * Get applicationTime
   * @return applicationTime
  **/
  @ApiModelProperty(example = "1593589931000", value = "")
  
    public String getApplicationTime() {
    return applicationTime;
  }

  public void setApplicationTime(String applicationTime) {
    this.applicationTime = applicationTime;
  }

  public ResumeListPageDataContentItem companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
  **/
  @ApiModelProperty(example = "36dbfa02cbe54b11a5543d46b5112168", value = "")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public ResumeListPageDataContentItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Get contentId
   * @return contentId
  **/
  @ApiModelProperty(example = "a98f6feb-bb4f-41cb-8d24-3889cbb19d3b", value = "")
  
    public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public ResumeListPageDataContentItem createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "1593589931000", value = "")
  
    public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ResumeListPageDataContentItem enablePreview(Boolean enablePreview) {
    this.enablePreview = enablePreview;
    return this;
  }

  /**
   * Get enablePreview
   * @return enablePreview
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isEnablePreview() {
    return enablePreview;
  }

  public void setEnablePreview(Boolean enablePreview) {
    this.enablePreview = enablePreview;
  }

  public ResumeListPageDataContentItem hasRead(Boolean hasRead) {
    this.hasRead = hasRead;
    return this;
  }

  /**
   * Get hasRead
   * @return hasRead
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isHasRead() {
    return hasRead;
  }

  public void setHasRead(Boolean hasRead) {
    this.hasRead = hasRead;
  }

  public ResumeListPageDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1b09654b-9fb9-4596-9018-e8af9969ceb3", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResumeListPageDataContentItem isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   * @return isDeleted
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public ResumeListPageDataContentItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "WhatsApp-Image-2020-06-26-at-14.", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResumeListPageDataContentItem recycleTime(String recycleTime) {
    this.recycleTime = recycleTime;
    return this;
  }

  /**
   * Get recycleTime
   * @return recycleTime
  **/
  @ApiModelProperty(example = "1593589931000", value = "")
  
    public String getRecycleTime() {
    return recycleTime;
  }

  public void setRecycleTime(String recycleTime) {
    this.recycleTime = recycleTime;
  }

  public ResumeListPageDataContentItem resumeCategoryId(String resumeCategoryId) {
    this.resumeCategoryId = resumeCategoryId;
    return this;
  }

  /**
   * Get resumeCategoryId
   * @return resumeCategoryId
  **/
  @ApiModelProperty(example = "27f284ef-6272-4a19-927d-ace1bea4491d", value = "")
  
    public String getResumeCategoryId() {
    return resumeCategoryId;
  }

  public void setResumeCategoryId(String resumeCategoryId) {
    this.resumeCategoryId = resumeCategoryId;
  }

  public ResumeListPageDataContentItem resumeSourceName(String resumeSourceName) {
    this.resumeSourceName = resumeSourceName;
    return this;
  }

  /**
   * Get resumeSourceName
   * @return resumeSourceName
  **/
  @ApiModelProperty(example = "前程无忧", value = "")
  
    public String getResumeSourceName() {
    return resumeSourceName;
  }

  public void setResumeSourceName(String resumeSourceName) {
    this.resumeSourceName = resumeSourceName;
  }

  public ResumeListPageDataContentItem resumeSourceType(String resumeSourceType) {
    this.resumeSourceType = resumeSourceType;
    return this;
  }

  /**
   * Get resumeSourceType
   * @return resumeSourceType
  **/
  @ApiModelProperty(example = "JOB_51", value = "")
  
    public String getResumeSourceType() {
    return resumeSourceType;
  }

  public void setResumeSourceType(String resumeSourceType) {
    this.resumeSourceType = resumeSourceType;
  }

  public ResumeListPageDataContentItem resumeStatus(String resumeStatus) {
    this.resumeStatus = resumeStatus;
    return this;
  }

  /**
   * Get resumeStatus
   * @return resumeStatus
  **/
  @ApiModelProperty(example = "WAIT_SCREEN", value = "")
  
    public String getResumeStatus() {
    return resumeStatus;
  }

  public void setResumeStatus(String resumeStatus) {
    this.resumeStatus = resumeStatus;
  }

  public ResumeListPageDataContentItem resumeUploadName(String resumeUploadName) {
    this.resumeUploadName = resumeUploadName;
    return this;
  }

  /**
   * Get resumeUploadName
   * @return resumeUploadName
  **/
  @ApiModelProperty(example = "上传简历", value = "")
  
    public String getResumeUploadName() {
    return resumeUploadName;
  }

  public void setResumeUploadName(String resumeUploadName) {
    this.resumeUploadName = resumeUploadName;
  }

  public ResumeListPageDataContentItem resumeUploadType(String resumeUploadType) {
    this.resumeUploadType = resumeUploadType;
    return this;
  }

  /**
   * Get resumeUploadType
   * @return resumeUploadType
  **/
  @ApiModelProperty(example = "JOB_UPLOAD", value = "")
  
    public String getResumeUploadType() {
    return resumeUploadType;
  }

  public void setResumeUploadType(String resumeUploadType) {
    this.resumeUploadType = resumeUploadType;
  }

  public ResumeListPageDataContentItem sourceEmailId(String sourceEmailId) {
    this.sourceEmailId = sourceEmailId;
    return this;
  }

  /**
   * Get sourceEmailId
   * @return sourceEmailId
  **/
  @ApiModelProperty(example = "c5d02261-4fae-4389-a5e5-e9a16029472d", value = "")
  
    public String getSourceEmailId() {
    return sourceEmailId;
  }

  public void setSourceEmailId(String sourceEmailId) {
    this.sourceEmailId = sourceEmailId;
  }

  public ResumeListPageDataContentItem uploadResumeFileType(String uploadResumeFileType) {
    this.uploadResumeFileType = uploadResumeFileType;
    return this;
  }

  /**
   * Get uploadResumeFileType
   * @return uploadResumeFileType
  **/
  @ApiModelProperty(example = "jpeg", value = "")
  
    public String getUploadResumeFileType() {
    return uploadResumeFileType;
  }

  public void setUploadResumeFileType(String uploadResumeFileType) {
    this.uploadResumeFileType = uploadResumeFileType;
  }

  public ResumeListPageDataContentItem userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "96afabbd7430488c90e4f3f0cd8aff66", value = "")
  
    public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeListPageDataContentItem resumeListPageDataContentItem = (ResumeListPageDataContentItem) o;
    return Objects.equals(this.applicationTime, resumeListPageDataContentItem.applicationTime) &&
        Objects.equals(this.companyId, resumeListPageDataContentItem.companyId) &&
        Objects.equals(this.contentId, resumeListPageDataContentItem.contentId) &&
        Objects.equals(this.createdDate, resumeListPageDataContentItem.createdDate) &&
        Objects.equals(this.enablePreview, resumeListPageDataContentItem.enablePreview) &&
        Objects.equals(this.hasRead, resumeListPageDataContentItem.hasRead) &&
        Objects.equals(this.id, resumeListPageDataContentItem.id) &&
        Objects.equals(this.isDeleted, resumeListPageDataContentItem.isDeleted) &&
        Objects.equals(this.name, resumeListPageDataContentItem.name) &&
        Objects.equals(this.recycleTime, resumeListPageDataContentItem.recycleTime) &&
        Objects.equals(this.resumeCategoryId, resumeListPageDataContentItem.resumeCategoryId) &&
        Objects.equals(this.resumeSourceName, resumeListPageDataContentItem.resumeSourceName) &&
        Objects.equals(this.resumeSourceType, resumeListPageDataContentItem.resumeSourceType) &&
        Objects.equals(this.resumeStatus, resumeListPageDataContentItem.resumeStatus) &&
        Objects.equals(this.resumeUploadName, resumeListPageDataContentItem.resumeUploadName) &&
        Objects.equals(this.resumeUploadType, resumeListPageDataContentItem.resumeUploadType) &&
        Objects.equals(this.sourceEmailId, resumeListPageDataContentItem.sourceEmailId) &&
        Objects.equals(this.uploadResumeFileType, resumeListPageDataContentItem.uploadResumeFileType) &&
        Objects.equals(this.userId, resumeListPageDataContentItem.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationTime, companyId, contentId, createdDate, enablePreview, hasRead, id, isDeleted, name, recycleTime, resumeCategoryId, resumeSourceName, resumeSourceType, resumeStatus, resumeUploadName, resumeUploadType, sourceEmailId, uploadResumeFileType, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeListPageDataContentItem {\n");
    
    sb.append("    applicationTime: ").append(toIndentedString(applicationTime)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    enablePreview: ").append(toIndentedString(enablePreview)).append("\n");
    sb.append("    hasRead: ").append(toIndentedString(hasRead)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recycleTime: ").append(toIndentedString(recycleTime)).append("\n");
    sb.append("    resumeCategoryId: ").append(toIndentedString(resumeCategoryId)).append("\n");
    sb.append("    resumeSourceName: ").append(toIndentedString(resumeSourceName)).append("\n");
    sb.append("    resumeSourceType: ").append(toIndentedString(resumeSourceType)).append("\n");
    sb.append("    resumeStatus: ").append(toIndentedString(resumeStatus)).append("\n");
    sb.append("    resumeUploadName: ").append(toIndentedString(resumeUploadName)).append("\n");
    sb.append("    resumeUploadType: ").append(toIndentedString(resumeUploadType)).append("\n");
    sb.append("    sourceEmailId: ").append(toIndentedString(sourceEmailId)).append("\n");
    sb.append("    uploadResumeFileType: ").append(toIndentedString(uploadResumeFileType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
