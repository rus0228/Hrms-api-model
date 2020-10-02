package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BenefitContentDataItemDivision
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class BenefitContentDataItemDivision   {
  @JsonProperty("children")
  @Valid
  private List<Object> children = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  @JsonProperty("effectiveAt")
  private LocalDate effectiveAt = null;

  @JsonProperty("engName")
  private String engName = null;

  @JsonProperty("fullInitial")
  private String fullInitial = null;

  @JsonProperty("hot")
  private Boolean hot = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("indexno")
  private Integer indexno = null;

  @JsonProperty("initial")
  private String initial = null;

  @JsonProperty("invalidAt")
  private LocalDate invalidAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent")
  private Object parent = null;

  @JsonProperty("pinyin")
  private String pinyin = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("updatedAt")
  private LocalDate updatedAt = null;

  public BenefitContentDataItemDivision children(List<Object> children) {
    this.children = children;
    return this;
  }

  public BenefitContentDataItemDivision addChildrenItem(Object childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<Object>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  
    public List<Object> getChildren() {
    return children;
  }

  public void setChildren(List<Object> children) {
    this.children = children;
  }

  public BenefitContentDataItemDivision code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BenefitContentDataItemDivision country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BenefitContentDataItemDivision createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public BenefitContentDataItemDivision effectiveAt(LocalDate effectiveAt) {
    this.effectiveAt = effectiveAt;
    return this;
  }

  /**
   * Get effectiveAt
   * @return effectiveAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getEffectiveAt() {
    return effectiveAt;
  }

  public void setEffectiveAt(LocalDate effectiveAt) {
    this.effectiveAt = effectiveAt;
  }

  public BenefitContentDataItemDivision engName(String engName) {
    this.engName = engName;
    return this;
  }

  /**
   * Get engName
   * @return engName
  **/
  @ApiModelProperty(value = "")
  
    public String getEngName() {
    return engName;
  }

  public void setEngName(String engName) {
    this.engName = engName;
  }

  public BenefitContentDataItemDivision fullInitial(String fullInitial) {
    this.fullInitial = fullInitial;
    return this;
  }

  /**
   * Get fullInitial
   * @return fullInitial
  **/
  @ApiModelProperty(value = "")
  
    public String getFullInitial() {
    return fullInitial;
  }

  public void setFullInitial(String fullInitial) {
    this.fullInitial = fullInitial;
  }

  public BenefitContentDataItemDivision hot(Boolean hot) {
    this.hot = hot;
    return this;
  }

  /**
   * Get hot
   * @return hot
  **/
  @ApiModelProperty(example = "false", value = "")
  
    public Boolean isHot() {
    return hot;
  }

  public void setHot(Boolean hot) {
    this.hot = hot;
  }

  public BenefitContentDataItemDivision id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BenefitContentDataItemDivision indexno(Integer indexno) {
    this.indexno = indexno;
    return this;
  }

  /**
   * Get indexno
   * @return indexno
  **/
  @ApiModelProperty(value = "")
  
    public Integer getIndexno() {
    return indexno;
  }

  public void setIndexno(Integer indexno) {
    this.indexno = indexno;
  }

  public BenefitContentDataItemDivision initial(String initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Get initial
   * @return initial
  **/
  @ApiModelProperty(value = "")
  
    public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public BenefitContentDataItemDivision invalidAt(LocalDate invalidAt) {
    this.invalidAt = invalidAt;
    return this;
  }

  /**
   * Get invalidAt
   * @return invalidAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getInvalidAt() {
    return invalidAt;
  }

  public void setInvalidAt(LocalDate invalidAt) {
    this.invalidAt = invalidAt;
  }

  public BenefitContentDataItemDivision name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "未设置", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BenefitContentDataItemDivision parent(Object parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  
    public Object getParent() {
    return parent;
  }

  public void setParent(Object parent) {
    this.parent = parent;
  }

  public BenefitContentDataItemDivision pinyin(String pinyin) {
    this.pinyin = pinyin;
    return this;
  }

  /**
   * Get pinyin
   * @return pinyin
  **/
  @ApiModelProperty(value = "")
  
    public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
  }

  public BenefitContentDataItemDivision shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(value = "")
  
    public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public BenefitContentDataItemDivision updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitContentDataItemDivision benefitContentDataItemDivision = (BenefitContentDataItemDivision) o;
    return Objects.equals(this.children, benefitContentDataItemDivision.children) &&
        Objects.equals(this.code, benefitContentDataItemDivision.code) &&
        Objects.equals(this.country, benefitContentDataItemDivision.country) &&
        Objects.equals(this.createdAt, benefitContentDataItemDivision.createdAt) &&
        Objects.equals(this.effectiveAt, benefitContentDataItemDivision.effectiveAt) &&
        Objects.equals(this.engName, benefitContentDataItemDivision.engName) &&
        Objects.equals(this.fullInitial, benefitContentDataItemDivision.fullInitial) &&
        Objects.equals(this.hot, benefitContentDataItemDivision.hot) &&
        Objects.equals(this.id, benefitContentDataItemDivision.id) &&
        Objects.equals(this.indexno, benefitContentDataItemDivision.indexno) &&
        Objects.equals(this.initial, benefitContentDataItemDivision.initial) &&
        Objects.equals(this.invalidAt, benefitContentDataItemDivision.invalidAt) &&
        Objects.equals(this.name, benefitContentDataItemDivision.name) &&
        Objects.equals(this.parent, benefitContentDataItemDivision.parent) &&
        Objects.equals(this.pinyin, benefitContentDataItemDivision.pinyin) &&
        Objects.equals(this.shortName, benefitContentDataItemDivision.shortName) &&
        Objects.equals(this.updatedAt, benefitContentDataItemDivision.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, code, country, createdAt, effectiveAt, engName, fullInitial, hot, id, indexno, initial, invalidAt, name, parent, pinyin, shortName, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitContentDataItemDivision {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    effectiveAt: ").append(toIndentedString(effectiveAt)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    fullInitial: ").append(toIndentedString(fullInitial)).append("\n");
    sb.append("    hot: ").append(toIndentedString(hot)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexno: ").append(toIndentedString(indexno)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    invalidAt: ").append(toIndentedString(invalidAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pinyin: ").append(toIndentedString(pinyin)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
