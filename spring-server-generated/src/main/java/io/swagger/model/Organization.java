package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Organization;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Organization
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class Organization   {
  @JsonProperty("capacity")
  private Integer capacity = null;

  @JsonProperty("children")
  @Valid
  private List<Organization> children = null;

  @JsonProperty("className")
  private String className = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("depth")
  private Integer depth = null;

  @JsonProperty("hasAuth")
  private Boolean hasAuth = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isVirtual")
  private Boolean isVirtual = null;

  @JsonProperty("nodeId")
  private String nodeId = null;

  @JsonProperty("onJobHeadCount")
  private Integer onJobHeadCount = null;

  @JsonProperty("onJobTotalHeadCount")
  private Integer onJobTotalHeadCount = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("positionList")
  @Valid
  private List<String> positionList = null;

  @JsonProperty("principalId")
  private String principalId = null;

  @JsonProperty("principalName")
  private String principalName = null;

  @JsonProperty("staffInfoList")
  @Valid
  private List<String> staffInfoList = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("totalCapacity")
  private Integer totalCapacity = null;

  @JsonProperty("type")
  private String type = null;

  public Organization capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Organization children(List<Organization> children) {
    this.children = children;
    return this;
  }

  public Organization addChildrenItem(Organization childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<Organization>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Organization> getChildren() {
    return children;
  }

  public void setChildren(List<Organization> children) {
    this.children = children;
  }

  public Organization className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
  **/
  @ApiModelProperty(example = "list-type-company", value = "")
  
    public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public Organization departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public Organization depth(Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Organization hasAuth(Boolean hasAuth) {
    this.hasAuth = hasAuth;
    return this;
  }

  /**
   * Get hasAuth
   * @return hasAuth
  **/
  @ApiModelProperty(example = "true", value = "")
  
    public Boolean isHasAuth() {
    return hasAuth;
  }

  public void setHasAuth(Boolean hasAuth) {
    this.hasAuth = hasAuth;
  }

  public Organization id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "cb0fdf11-f836-4fca-a325-96973f57208d", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Organization isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

  /**
   * Get isVirtual
   * @return isVirtual
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  public Organization nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public Organization onJobHeadCount(Integer onJobHeadCount) {
    this.onJobHeadCount = onJobHeadCount;
    return this;
  }

  /**
   * Get onJobHeadCount
   * @return onJobHeadCount
  **/
  @ApiModelProperty(example = "5", value = "")
  
    public Integer getOnJobHeadCount() {
    return onJobHeadCount;
  }

  public void setOnJobHeadCount(Integer onJobHeadCount) {
    this.onJobHeadCount = onJobHeadCount;
  }

  public Organization onJobTotalHeadCount(Integer onJobTotalHeadCount) {
    this.onJobTotalHeadCount = onJobTotalHeadCount;
    return this;
  }

  /**
   * Get onJobTotalHeadCount
   * @return onJobTotalHeadCount
  **/
  @ApiModelProperty(example = "8", value = "")
  
    public Integer getOnJobTotalHeadCount() {
    return onJobTotalHeadCount;
  }

  public void setOnJobTotalHeadCount(Integer onJobTotalHeadCount) {
    this.onJobTotalHeadCount = onJobTotalHeadCount;
  }

  public Organization parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  
    public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Organization positionList(List<String> positionList) {
    this.positionList = positionList;
    return this;
  }

  public Organization addPositionListItem(String positionListItem) {
    if (this.positionList == null) {
      this.positionList = new ArrayList<String>();
    }
    this.positionList.add(positionListItem);
    return this;
  }

  /**
   * Get positionList
   * @return positionList
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getPositionList() {
    return positionList;
  }

  public void setPositionList(List<String> positionList) {
    this.positionList = positionList;
  }

  public Organization principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * Get principalId
   * @return principalId
  **/
  @ApiModelProperty(value = "")
  
    public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }

  public Organization principalName(String principalName) {
    this.principalName = principalName;
    return this;
  }

  /**
   * Get principalName
   * @return principalName
  **/
  @ApiModelProperty(value = "")
  
    public String getPrincipalName() {
    return principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  public Organization staffInfoList(List<String> staffInfoList) {
    this.staffInfoList = staffInfoList;
    return this;
  }

  public Organization addStaffInfoListItem(String staffInfoListItem) {
    if (this.staffInfoList == null) {
      this.staffInfoList = new ArrayList<String>();
    }
    this.staffInfoList.add(staffInfoListItem);
    return this;
  }

  /**
   * Get staffInfoList
   * @return staffInfoList
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getStaffInfoList() {
    return staffInfoList;
  }

  public void setStaffInfoList(List<String> staffInfoList) {
    this.staffInfoList = staffInfoList;
  }

  public Organization text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司", value = "")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Organization totalCapacity(Integer totalCapacity) {
    this.totalCapacity = totalCapacity;
    return this;
  }

  /**
   * Get totalCapacity
   * @return totalCapacity
  **/
  @ApiModelProperty(example = "289", value = "")
  
    public Integer getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(Integer totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public Organization type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "COMPANY", value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.capacity, organization.capacity) &&
        Objects.equals(this.children, organization.children) &&
        Objects.equals(this.className, organization.className) &&
        Objects.equals(this.departmentId, organization.departmentId) &&
        Objects.equals(this.depth, organization.depth) &&
        Objects.equals(this.hasAuth, organization.hasAuth) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.isVirtual, organization.isVirtual) &&
        Objects.equals(this.nodeId, organization.nodeId) &&
        Objects.equals(this.onJobHeadCount, organization.onJobHeadCount) &&
        Objects.equals(this.onJobTotalHeadCount, organization.onJobTotalHeadCount) &&
        Objects.equals(this.parentId, organization.parentId) &&
        Objects.equals(this.positionList, organization.positionList) &&
        Objects.equals(this.principalId, organization.principalId) &&
        Objects.equals(this.principalName, organization.principalName) &&
        Objects.equals(this.staffInfoList, organization.staffInfoList) &&
        Objects.equals(this.text, organization.text) &&
        Objects.equals(this.totalCapacity, organization.totalCapacity) &&
        Objects.equals(this.type, organization.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, children, className, departmentId, depth, hasAuth, id, isVirtual, nodeId, onJobHeadCount, onJobTotalHeadCount, parentId, positionList, principalId, principalName, staffInfoList, text, totalCapacity, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    hasAuth: ").append(toIndentedString(hasAuth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    onJobHeadCount: ").append(toIndentedString(onJobHeadCount)).append("\n");
    sb.append("    onJobTotalHeadCount: ").append(toIndentedString(onJobTotalHeadCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    positionList: ").append(toIndentedString(positionList)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
    sb.append("    staffInfoList: ").append(toIndentedString(staffInfoList)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    totalCapacity: ").append(toIndentedString(totalCapacity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
