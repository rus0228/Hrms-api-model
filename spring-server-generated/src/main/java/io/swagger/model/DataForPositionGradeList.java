package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DataForPositionGradeListGradeSalaryEntity;
import io.swagger.model.SubDataForPositionGradeList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataForPositionGradeList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class DataForPositionGradeList   {
  @JsonProperty("datas")
  @Valid
  private List<SubDataForPositionGradeList> datas = null;

  @JsonProperty("gradeSalaryEntity")
  private DataForPositionGradeListGradeSalaryEntity gradeSalaryEntity = null;

  @JsonProperty("positionGradeNum")
  private Long positionGradeNum = null;

  public DataForPositionGradeList datas(List<SubDataForPositionGradeList> datas) {
    this.datas = datas;
    return this;
  }

  public DataForPositionGradeList addDatasItem(SubDataForPositionGradeList datasItem) {
    if (this.datas == null) {
      this.datas = new ArrayList<SubDataForPositionGradeList>();
    }
    this.datas.add(datasItem);
    return this;
  }

  /**
   * Get datas
   * @return datas
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SubDataForPositionGradeList> getDatas() {
    return datas;
  }

  public void setDatas(List<SubDataForPositionGradeList> datas) {
    this.datas = datas;
  }

  public DataForPositionGradeList gradeSalaryEntity(DataForPositionGradeListGradeSalaryEntity gradeSalaryEntity) {
    this.gradeSalaryEntity = gradeSalaryEntity;
    return this;
  }

  /**
   * Get gradeSalaryEntity
   * @return gradeSalaryEntity
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DataForPositionGradeListGradeSalaryEntity getGradeSalaryEntity() {
    return gradeSalaryEntity;
  }

  public void setGradeSalaryEntity(DataForPositionGradeListGradeSalaryEntity gradeSalaryEntity) {
    this.gradeSalaryEntity = gradeSalaryEntity;
  }

  public DataForPositionGradeList positionGradeNum(Long positionGradeNum) {
    this.positionGradeNum = positionGradeNum;
    return this;
  }

  /**
   * Get positionGradeNum
   * @return positionGradeNum
  **/
  @ApiModelProperty(value = "")
  
    public Long getPositionGradeNum() {
    return positionGradeNum;
  }

  public void setPositionGradeNum(Long positionGradeNum) {
    this.positionGradeNum = positionGradeNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataForPositionGradeList dataForPositionGradeList = (DataForPositionGradeList) o;
    return Objects.equals(this.datas, dataForPositionGradeList.datas) &&
        Objects.equals(this.gradeSalaryEntity, dataForPositionGradeList.gradeSalaryEntity) &&
        Objects.equals(this.positionGradeNum, dataForPositionGradeList.positionGradeNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datas, gradeSalaryEntity, positionGradeNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataForPositionGradeList {\n");
    
    sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
    sb.append("    gradeSalaryEntity: ").append(toIndentedString(gradeSalaryEntity)).append("\n");
    sb.append("    positionGradeNum: ").append(toIndentedString(positionGradeNum)).append("\n");
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
