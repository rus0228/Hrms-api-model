package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KpiNormDataContentItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class KpiNormDataContentItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("normAttribute")
  private String normAttribute = null;

  @JsonProperty("normAttributeName")
  private String normAttributeName = null;

  @JsonProperty("normCategory")
  private String normCategory = null;

  @JsonProperty("normCategoryName")
  private String normCategoryName = null;

  @JsonProperty("normCode")
  private String normCode = null;

  @JsonProperty("normDesc")
  private String normDesc = null;

  @JsonProperty("normLowScore")
  private String normLowScore = null;

  @JsonProperty("normName")
  private String normName = null;

  @JsonProperty("normNature")
  private String normNature = null;

  @JsonProperty("normNatureName")
  private String normNatureName = null;

  @JsonProperty("normRange")
  @Valid
  private List<String> normRange = null;

  @JsonProperty("normRangeName")
  private String normRangeName = null;

  @JsonProperty("normScoreRange")
  private String normScoreRange = null;

  @JsonProperty("normStandard")
  private String normStandard = null;

  @JsonProperty("normTopScore")
  private BigDecimal normTopScore = null;

  @JsonProperty("scoreUnlimit")
  private Boolean scoreUnlimit = null;

  @JsonProperty("selectedDepartments")
  private String selectedDepartments = null;

  public KpiNormDataContentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "71aa02de-b481-4b11-8c44-7154f3993b6b", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KpiNormDataContentItem normAttribute(String normAttribute) {
    this.normAttribute = normAttribute;
    return this;
  }

  /**
   * Get normAttribute
   * @return normAttribute
  **/
  @ApiModelProperty(value = "")
  
    public String getNormAttribute() {
    return normAttribute;
  }

  public void setNormAttribute(String normAttribute) {
    this.normAttribute = normAttribute;
  }

  public KpiNormDataContentItem normAttributeName(String normAttributeName) {
    this.normAttributeName = normAttributeName;
    return this;
  }

  /**
   * Get normAttributeName
   * @return normAttributeName
  **/
  @ApiModelProperty(value = "")
  
    public String getNormAttributeName() {
    return normAttributeName;
  }

  public void setNormAttributeName(String normAttributeName) {
    this.normAttributeName = normAttributeName;
  }

  public KpiNormDataContentItem normCategory(String normCategory) {
    this.normCategory = normCategory;
    return this;
  }

  /**
   * Get normCategory
   * @return normCategory
  **/
  @ApiModelProperty(example = "normCategory_03", value = "")
  
    public String getNormCategory() {
    return normCategory;
  }

  public void setNormCategory(String normCategory) {
    this.normCategory = normCategory;
  }

  public KpiNormDataContentItem normCategoryName(String normCategoryName) {
    this.normCategoryName = normCategoryName;
    return this;
  }

  /**
   * Get normCategoryName
   * @return normCategoryName
  **/
  @ApiModelProperty(example = "态度考核", value = "")
  
    public String getNormCategoryName() {
    return normCategoryName;
  }

  public void setNormCategoryName(String normCategoryName) {
    this.normCategoryName = normCategoryName;
  }

  public KpiNormDataContentItem normCode(String normCode) {
    this.normCode = normCode;
    return this;
  }

  /**
   * Get normCode
   * @return normCode
  **/
  @ApiModelProperty(example = "02", value = "")
  
    public String getNormCode() {
    return normCode;
  }

  public void setNormCode(String normCode) {
    this.normCode = normCode;
  }

  public KpiNormDataContentItem normDesc(String normDesc) {
    this.normDesc = normDesc;
    return this;
  }

  /**
   * Get normDesc
   * @return normDesc
  **/
  @ApiModelProperty(example = "工作态度", value = "")
  
    public String getNormDesc() {
    return normDesc;
  }

  public void setNormDesc(String normDesc) {
    this.normDesc = normDesc;
  }

  public KpiNormDataContentItem normLowScore(String normLowScore) {
    this.normLowScore = normLowScore;
    return this;
  }

  /**
   * Get normLowScore
   * @return normLowScore
  **/
  @ApiModelProperty(example = "0", value = "")
  
    public String getNormLowScore() {
    return normLowScore;
  }

  public void setNormLowScore(String normLowScore) {
    this.normLowScore = normLowScore;
  }

  public KpiNormDataContentItem normName(String normName) {
    this.normName = normName;
    return this;
  }

  /**
   * Get normName
   * @return normName
  **/
  @ApiModelProperty(example = "态度考核", value = "")
  
    public String getNormName() {
    return normName;
  }

  public void setNormName(String normName) {
    this.normName = normName;
  }

  public KpiNormDataContentItem normNature(String normNature) {
    this.normNature = normNature;
    return this;
  }

  /**
   * Get normNature
   * @return normNature
  **/
  @ApiModelProperty(example = "normNature_02", value = "")
  
    public String getNormNature() {
    return normNature;
  }

  public void setNormNature(String normNature) {
    this.normNature = normNature;
  }

  public KpiNormDataContentItem normNatureName(String normNatureName) {
    this.normNatureName = normNatureName;
    return this;
  }

  /**
   * Get normNatureName
   * @return normNatureName
  **/
  @ApiModelProperty(example = "定性", value = "")
  
    public String getNormNatureName() {
    return normNatureName;
  }

  public void setNormNatureName(String normNatureName) {
    this.normNatureName = normNatureName;
  }

  public KpiNormDataContentItem normRange(List<String> normRange) {
    this.normRange = normRange;
    return this;
  }

  public KpiNormDataContentItem addNormRangeItem(String normRangeItem) {
    if (this.normRange == null) {
      this.normRange = new ArrayList<String>();
    }
    this.normRange.add(normRangeItem);
    return this;
  }

  /**
   * Get normRange
   * @return normRange
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getNormRange() {
    return normRange;
  }

  public void setNormRange(List<String> normRange) {
    this.normRange = normRange;
  }

  public KpiNormDataContentItem normRangeName(String normRangeName) {
    this.normRangeName = normRangeName;
    return this;
  }

  /**
   * Get normRangeName
   * @return normRangeName
  **/
  @ApiModelProperty(value = "")
  
    public String getNormRangeName() {
    return normRangeName;
  }

  public void setNormRangeName(String normRangeName) {
    this.normRangeName = normRangeName;
  }

  public KpiNormDataContentItem normScoreRange(String normScoreRange) {
    this.normScoreRange = normScoreRange;
    return this;
  }

  /**
   * Get normScoreRange
   * @return normScoreRange
  **/
  @ApiModelProperty(example = "0~100", value = "")
  
    public String getNormScoreRange() {
    return normScoreRange;
  }

  public void setNormScoreRange(String normScoreRange) {
    this.normScoreRange = normScoreRange;
  }

  public KpiNormDataContentItem normStandard(String normStandard) {
    this.normStandard = normStandard;
    return this;
  }

  /**
   * Get normStandard
   * @return normStandard
  **/
  @ApiModelProperty(value = "")
  
    public String getNormStandard() {
    return normStandard;
  }

  public void setNormStandard(String normStandard) {
    this.normStandard = normStandard;
  }

  public KpiNormDataContentItem normTopScore(BigDecimal normTopScore) {
    this.normTopScore = normTopScore;
    return this;
  }

  /**
   * Get normTopScore
   * @return normTopScore
  **/
  @ApiModelProperty(example = "100", value = "")
  
    @Valid
    public BigDecimal getNormTopScore() {
    return normTopScore;
  }

  public void setNormTopScore(BigDecimal normTopScore) {
    this.normTopScore = normTopScore;
  }

  public KpiNormDataContentItem scoreUnlimit(Boolean scoreUnlimit) {
    this.scoreUnlimit = scoreUnlimit;
    return this;
  }

  /**
   * Get scoreUnlimit
   * @return scoreUnlimit
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isScoreUnlimit() {
    return scoreUnlimit;
  }

  public void setScoreUnlimit(Boolean scoreUnlimit) {
    this.scoreUnlimit = scoreUnlimit;
  }

  public KpiNormDataContentItem selectedDepartments(String selectedDepartments) {
    this.selectedDepartments = selectedDepartments;
    return this;
  }

  /**
   * Get selectedDepartments
   * @return selectedDepartments
  **/
  @ApiModelProperty(example = "杭州艾骊莎信息科技有限公司,销售部,人事部,财务部,销售部|销售1部,销售部|销售2部,销售部|刘,信息中心,行政部", value = "")
  
    public String getSelectedDepartments() {
    return selectedDepartments;
  }

  public void setSelectedDepartments(String selectedDepartments) {
    this.selectedDepartments = selectedDepartments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KpiNormDataContentItem kpiNormDataContentItem = (KpiNormDataContentItem) o;
    return Objects.equals(this.id, kpiNormDataContentItem.id) &&
        Objects.equals(this.normAttribute, kpiNormDataContentItem.normAttribute) &&
        Objects.equals(this.normAttributeName, kpiNormDataContentItem.normAttributeName) &&
        Objects.equals(this.normCategory, kpiNormDataContentItem.normCategory) &&
        Objects.equals(this.normCategoryName, kpiNormDataContentItem.normCategoryName) &&
        Objects.equals(this.normCode, kpiNormDataContentItem.normCode) &&
        Objects.equals(this.normDesc, kpiNormDataContentItem.normDesc) &&
        Objects.equals(this.normLowScore, kpiNormDataContentItem.normLowScore) &&
        Objects.equals(this.normName, kpiNormDataContentItem.normName) &&
        Objects.equals(this.normNature, kpiNormDataContentItem.normNature) &&
        Objects.equals(this.normNatureName, kpiNormDataContentItem.normNatureName) &&
        Objects.equals(this.normRange, kpiNormDataContentItem.normRange) &&
        Objects.equals(this.normRangeName, kpiNormDataContentItem.normRangeName) &&
        Objects.equals(this.normScoreRange, kpiNormDataContentItem.normScoreRange) &&
        Objects.equals(this.normStandard, kpiNormDataContentItem.normStandard) &&
        Objects.equals(this.normTopScore, kpiNormDataContentItem.normTopScore) &&
        Objects.equals(this.scoreUnlimit, kpiNormDataContentItem.scoreUnlimit) &&
        Objects.equals(this.selectedDepartments, kpiNormDataContentItem.selectedDepartments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, normAttribute, normAttributeName, normCategory, normCategoryName, normCode, normDesc, normLowScore, normName, normNature, normNatureName, normRange, normRangeName, normScoreRange, normStandard, normTopScore, scoreUnlimit, selectedDepartments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KpiNormDataContentItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    normAttribute: ").append(toIndentedString(normAttribute)).append("\n");
    sb.append("    normAttributeName: ").append(toIndentedString(normAttributeName)).append("\n");
    sb.append("    normCategory: ").append(toIndentedString(normCategory)).append("\n");
    sb.append("    normCategoryName: ").append(toIndentedString(normCategoryName)).append("\n");
    sb.append("    normCode: ").append(toIndentedString(normCode)).append("\n");
    sb.append("    normDesc: ").append(toIndentedString(normDesc)).append("\n");
    sb.append("    normLowScore: ").append(toIndentedString(normLowScore)).append("\n");
    sb.append("    normName: ").append(toIndentedString(normName)).append("\n");
    sb.append("    normNature: ").append(toIndentedString(normNature)).append("\n");
    sb.append("    normNatureName: ").append(toIndentedString(normNatureName)).append("\n");
    sb.append("    normRange: ").append(toIndentedString(normRange)).append("\n");
    sb.append("    normRangeName: ").append(toIndentedString(normRangeName)).append("\n");
    sb.append("    normScoreRange: ").append(toIndentedString(normScoreRange)).append("\n");
    sb.append("    normStandard: ").append(toIndentedString(normStandard)).append("\n");
    sb.append("    normTopScore: ").append(toIndentedString(normTopScore)).append("\n");
    sb.append("    scoreUnlimit: ").append(toIndentedString(scoreUnlimit)).append("\n");
    sb.append("    selectedDepartments: ").append(toIndentedString(selectedDepartments)).append("\n");
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
