/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CurrentEffectivePayrollInfo;
import io.swagger.model.KpiNorm;
import io.swagger.model.KpiPlan;
import io.swagger.model.SiMemberPlan;
import io.swagger.model.SiMemberPlanList;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")
@Api(value = "gateway", description = "the gateway API")
public interface GatewayApi {

    @ApiOperation(value = "get current effective payroll info list", nickname = "getCurrentEffectivePayrollInfoList", notes = "", response = CurrentEffectivePayrollInfo.class, tags={ "gateway", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CurrentEffectivePayrollInfo.class) })
    @RequestMapping(value = "/gateway/cnb/aggregate/payrollInfo/list/currentEffective",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<CurrentEffectivePayrollInfo> getCurrentEffectivePayrollInfoList();


    @ApiOperation(value = "get list additions and reductions", nickname = "getListAdditionsAndReductions", notes = "", response = SiMemberPlanList.class, tags={ "gateway", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SiMemberPlanList.class) })
    @RequestMapping(value = "/gateway/cnb/aggregate/siMemberPlans/list",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SiMemberPlanList> getListAdditionsAndReductions(@ApiParam(value = ""  )  @Valid @RequestBody SiMemberPlan body
);


    @ApiOperation(value = "kpi norm by keyword", nickname = "kpiNormByKeyword", notes = "", response = KpiNorm.class, tags={ "gateway", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = KpiNorm.class) })
    @RequestMapping(value = "/gateway/kpi/norm/searchByKeyword",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<KpiNorm> kpiNormByKeyword();


    @ApiOperation(value = "kpi plan by keyword", nickname = "kpiPlanByKeyword", notes = "", response = KpiPlan.class, tags={ "gateway", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = KpiPlan.class) })
    @RequestMapping(value = "/gateway/kpi/plan/searchByKeyword",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<KpiPlan> kpiPlanByKeyword();

}

