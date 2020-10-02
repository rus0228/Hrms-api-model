package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GroupShiftData1;
import io.swagger.model.GroupShiftData2;
import io.swagger.model.GroupShiftData3;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AllGroupShiftDataData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")


public class AllGroupShiftDataData   {
  @JsonProperty("2b698686-5eb2-403b-a4bf-f0c0a9ebf202")
  @Valid
  private List<GroupShiftData1> _2b6986865eb2403bA4bfF0c0a9ebf202 = null;

  @JsonProperty("7ee84af9-ae1b-4ff7-b49d-b71988e22a9c")
  @Valid
  private List<GroupShiftData2> _7ee84af9Ae1b4ff7B49dB71988e22a9c = null;

  @JsonProperty("1353b9ab-68f0-4953-b1d9-709991312604")
  @Valid
  private List<GroupShiftData3> _1353b9ab68f04953B1d9709991312604 = null;

  public AllGroupShiftDataData _2b6986865eb2403bA4bfF0c0a9ebf202(List<GroupShiftData1> _2b6986865eb2403bA4bfF0c0a9ebf202) {
    this._2b6986865eb2403bA4bfF0c0a9ebf202 = _2b6986865eb2403bA4bfF0c0a9ebf202;
    return this;
  }

  public AllGroupShiftDataData add2b6986865eb2403bA4bfF0c0a9ebf202Item(GroupShiftData1 _2b6986865eb2403bA4bfF0c0a9ebf202Item) {
    if (this._2b6986865eb2403bA4bfF0c0a9ebf202 == null) {
      this._2b6986865eb2403bA4bfF0c0a9ebf202 = new ArrayList<GroupShiftData1>();
    }
    this._2b6986865eb2403bA4bfF0c0a9ebf202.add(_2b6986865eb2403bA4bfF0c0a9ebf202Item);
    return this;
  }

  /**
   * Get _2b6986865eb2403bA4bfF0c0a9ebf202
   * @return _2b6986865eb2403bA4bfF0c0a9ebf202
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<GroupShiftData1> get2b6986865eb2403bA4bfF0c0a9ebf202() {
    return _2b6986865eb2403bA4bfF0c0a9ebf202;
  }

  public void set2b6986865eb2403bA4bfF0c0a9ebf202(List<GroupShiftData1> _2b6986865eb2403bA4bfF0c0a9ebf202) {
    this._2b6986865eb2403bA4bfF0c0a9ebf202 = _2b6986865eb2403bA4bfF0c0a9ebf202;
  }

  public AllGroupShiftDataData _7ee84af9Ae1b4ff7B49dB71988e22a9c(List<GroupShiftData2> _7ee84af9Ae1b4ff7B49dB71988e22a9c) {
    this._7ee84af9Ae1b4ff7B49dB71988e22a9c = _7ee84af9Ae1b4ff7B49dB71988e22a9c;
    return this;
  }

  public AllGroupShiftDataData add7ee84af9Ae1b4ff7B49dB71988e22a9cItem(GroupShiftData2 _7ee84af9Ae1b4ff7B49dB71988e22a9cItem) {
    if (this._7ee84af9Ae1b4ff7B49dB71988e22a9c == null) {
      this._7ee84af9Ae1b4ff7B49dB71988e22a9c = new ArrayList<GroupShiftData2>();
    }
    this._7ee84af9Ae1b4ff7B49dB71988e22a9c.add(_7ee84af9Ae1b4ff7B49dB71988e22a9cItem);
    return this;
  }

  /**
   * Get _7ee84af9Ae1b4ff7B49dB71988e22a9c
   * @return _7ee84af9Ae1b4ff7B49dB71988e22a9c
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<GroupShiftData2> get7ee84af9Ae1b4ff7B49dB71988e22a9c() {
    return _7ee84af9Ae1b4ff7B49dB71988e22a9c;
  }

  public void set7ee84af9Ae1b4ff7B49dB71988e22a9c(List<GroupShiftData2> _7ee84af9Ae1b4ff7B49dB71988e22a9c) {
    this._7ee84af9Ae1b4ff7B49dB71988e22a9c = _7ee84af9Ae1b4ff7B49dB71988e22a9c;
  }

  public AllGroupShiftDataData _1353b9ab68f04953B1d9709991312604(List<GroupShiftData3> _1353b9ab68f04953B1d9709991312604) {
    this._1353b9ab68f04953B1d9709991312604 = _1353b9ab68f04953B1d9709991312604;
    return this;
  }

  public AllGroupShiftDataData add1353b9ab68f04953B1d9709991312604Item(GroupShiftData3 _1353b9ab68f04953B1d9709991312604Item) {
    if (this._1353b9ab68f04953B1d9709991312604 == null) {
      this._1353b9ab68f04953B1d9709991312604 = new ArrayList<GroupShiftData3>();
    }
    this._1353b9ab68f04953B1d9709991312604.add(_1353b9ab68f04953B1d9709991312604Item);
    return this;
  }

  /**
   * Get _1353b9ab68f04953B1d9709991312604
   * @return _1353b9ab68f04953B1d9709991312604
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<GroupShiftData3> get1353b9ab68f04953B1d9709991312604() {
    return _1353b9ab68f04953B1d9709991312604;
  }

  public void set1353b9ab68f04953B1d9709991312604(List<GroupShiftData3> _1353b9ab68f04953B1d9709991312604) {
    this._1353b9ab68f04953B1d9709991312604 = _1353b9ab68f04953B1d9709991312604;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllGroupShiftDataData allGroupShiftDataData = (AllGroupShiftDataData) o;
    return Objects.equals(this._2b6986865eb2403bA4bfF0c0a9ebf202, allGroupShiftDataData._2b6986865eb2403bA4bfF0c0a9ebf202) &&
        Objects.equals(this._7ee84af9Ae1b4ff7B49dB71988e22a9c, allGroupShiftDataData._7ee84af9Ae1b4ff7B49dB71988e22a9c) &&
        Objects.equals(this._1353b9ab68f04953B1d9709991312604, allGroupShiftDataData._1353b9ab68f04953B1d9709991312604);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_2b6986865eb2403bA4bfF0c0a9ebf202, _7ee84af9Ae1b4ff7B49dB71988e22a9c, _1353b9ab68f04953B1d9709991312604);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllGroupShiftDataData {\n");
    
    sb.append("    _2b6986865eb2403bA4bfF0c0a9ebf202: ").append(toIndentedString(_2b6986865eb2403bA4bfF0c0a9ebf202)).append("\n");
    sb.append("    _7ee84af9Ae1b4ff7B49dB71988e22a9c: ").append(toIndentedString(_7ee84af9Ae1b4ff7B49dB71988e22a9c)).append("\n");
    sb.append("    _1353b9ab68f04953B1d9709991312604: ").append(toIndentedString(_1353b9ab68f04953B1d9709991312604)).append("\n");
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
