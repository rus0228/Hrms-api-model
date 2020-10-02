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
 * OrganizationList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class OrganizationList   {
  @JsonProperty("assignedCount")
  private Long assignedCount = null;

  @JsonProperty("capacity")
  private Long capacity = null;

  @JsonProperty("costCenterCode")
  private String costCenterCode = null;

  @JsonProperty("departmentCode")
  private String departmentCode = null;

  @JsonProperty("depth")
  private Long depth = null;

  @JsonProperty("hasAuth")
  private Boolean hasAuth = true;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isVirtual")
  private Boolean isVirtual = true;

  @JsonProperty("nodeId")
  private String nodeId = null;

  @JsonProperty("onJobHeadCount")
  private Long onJobHeadCount = null;

  @JsonProperty("onJobTotalHeadCount")
  private Long onJobTotalHeadCount = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("principalId")
  private String principalId = null;

  @JsonProperty("principalName")
  private String principalName = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("totalCapacitry")
  private Integer totalCapacitry = null;

  @JsonProperty("type")
  private String type = null;

  public OrganizationList assignedCount(Long assignedCount) {
    this.assignedCount = assignedCount;
    return this;
  }

  /**
   * Get assignedCount
   * @return assignedCount
  **/
  @ApiModelProperty(value = "")
  
    public Long getAssignedCount() {
    return assignedCount;
  }

  public void setAssignedCount(Long assignedCount) {
    this.assignedCount = assignedCount;
  }

  public OrganizationList capacity(Long capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  
    public Long getCapacity() {
    return capacity;
  }

  public void setCapacity(Long capacity) {
    this.capacity = capacity;
  }

  public OrganizationList costCenterCode(String costCenterCode) {
    this.costCenterCode = costCenterCode;
    return this;
  }

  /**
   * Get costCenterCode
   * @return costCenterCode
  **/
  @ApiModelProperty(value = "")
  
    public String getCostCenterCode() {
    return costCenterCode;
  }

  public void setCostCenterCode(String costCenterCode) {
    this.costCenterCode = costCenterCode;
  }

  public OrganizationList departmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
    return this;
  }

  /**
   * Get departmentCode
   * @return departmentCode
  **/
  @ApiModelProperty(value = "")
  
    public String getDepartmentCode() {
    return departmentCode;
  }

  public void setDepartmentCode(String departmentCode) {
    this.departmentCode = departmentCode;
  }

  public OrganizationList depth(Long depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(value = "")
  
    public Long getDepth() {
    return depth;
  }

  public void setDepth(Long depth) {
    this.depth = depth;
  }

  public OrganizationList hasAuth(Boolean hasAuth) {
    this.hasAuth = hasAuth;
    return this;
  }

  /**
   * Get hasAuth
   * @return hasAuth
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isHasAuth() {
    return hasAuth;
  }

  public void setHasAuth(Boolean hasAuth) {
    this.hasAuth = hasAuth;
  }

  public OrganizationList id(String id) {
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

  public OrganizationList isVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
    return this;
  }

  /**
   * Get isVirtual
   * @return isVirtual
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsVirtual() {
    return isVirtual;
  }

  public void setIsVirtual(Boolean isVirtual) {
    this.isVirtual = isVirtual;
  }

  public OrganizationList nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(value = "")
  
    public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public OrganizationList onJobHeadCount(Long onJobHeadCount) {
    this.onJobHeadCount = onJobHeadCount;
    return this;
  }

  /**
   * Get onJobHeadCount
   * @return onJobHeadCount
  **/
  @ApiModelProperty(value = "")
  
    public Long getOnJobHeadCount() {
    return onJobHeadCount;
  }

  public void setOnJobHeadCount(Long onJobHeadCount) {
    this.onJobHeadCount = onJobHeadCount;
  }

  public OrganizationList onJobTotalHeadCount(Long onJobTotalHeadCount) {
    this.onJobTotalHeadCount = onJobTotalHeadCount;
    return this;
  }

  /**
   * Get onJobTotalHeadCount
   * @return onJobTotalHeadCount
  **/
  @ApiModelProperty(value = "")
  
    public Long getOnJobTotalHeadCount() {
    return onJobTotalHeadCount;
  }

  public void setOnJobTotalHeadCount(Long onJobTotalHeadCount) {
    this.onJobTotalHeadCount = onJobTotalHeadCount;
  }

  public OrganizationList parentId(String parentId) {
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

  public OrganizationList principalId(String principalId) {
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

  public OrganizationList principalName(String principalName) {
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

  public OrganizationList text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public OrganizationList totalCapacitry(Integer totalCapacitry) {
    this.totalCapacitry = totalCapacitry;
    return this;
  }

  /**
   * Get totalCapacitry
   * @return totalCapacitry
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalCapacitry() {
    return totalCapacitry;
  }

  public void setTotalCapacitry(Integer totalCapacitry) {
    this.totalCapacitry = totalCapacitry;
  }

  public OrganizationList type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
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
    OrganizationList organizationList = (OrganizationList) o;
    return Objects.equals(this.assignedCount, organizationList.assignedCount) &&
        Objects.equals(this.capacity, organizationList.capacity) &&
        Objects.equals(this.costCenterCode, organizationList.costCenterCode) &&
        Objects.equals(this.departmentCode, organizationList.departmentCode) &&
        Objects.equals(this.depth, organizationList.depth) &&
        Objects.equals(this.hasAuth, organizationList.hasAuth) &&
        Objects.equals(this.id, organizationList.id) &&
        Objects.equals(this.isVirtual, organizationList.isVirtual) &&
        Objects.equals(this.nodeId, organizationList.nodeId) &&
        Objects.equals(this.onJobHeadCount, organizationList.onJobHeadCount) &&
        Objects.equals(this.onJobTotalHeadCount, organizationList.onJobTotalHeadCount) &&
        Objects.equals(this.parentId, organizationList.parentId) &&
        Objects.equals(this.principalId, organizationList.principalId) &&
        Objects.equals(this.principalName, organizationList.principalName) &&
        Objects.equals(this.text, organizationList.text) &&
        Objects.equals(this.totalCapacitry, organizationList.totalCapacitry) &&
        Objects.equals(this.type, organizationList.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedCount, capacity, costCenterCode, departmentCode, depth, hasAuth, id, isVirtual, nodeId, onJobHeadCount, onJobTotalHeadCount, parentId, principalId, principalName, text, totalCapacitry, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationList {\n");
    
    sb.append("    assignedCount: ").append(toIndentedString(assignedCount)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    costCenterCode: ").append(toIndentedString(costCenterCode)).append("\n");
    sb.append("    departmentCode: ").append(toIndentedString(departmentCode)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    hasAuth: ").append(toIndentedString(hasAuth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isVirtual: ").append(toIndentedString(isVirtual)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    onJobHeadCount: ").append(toIndentedString(onJobHeadCount)).append("\n");
    sb.append("    onJobTotalHeadCount: ").append(toIndentedString(onJobTotalHeadCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    totalCapacitry: ").append(toIndentedString(totalCapacitry)).append("\n");
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
