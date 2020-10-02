package io.swagger.api;

import io.swagger.model.CurrentEffectivePayrollInfo;
import io.swagger.model.KpiNorm;
import io.swagger.model.KpiPlan;
import io.swagger.model.SiMemberPlan;
import io.swagger.model.SiMemberPlanList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-01T16:49:09.202Z[GMT]")
@Controller
public class GatewayApiController implements GatewayApi {

    private static final Logger log = LoggerFactory.getLogger(GatewayApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GatewayApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CurrentEffectivePayrollInfo> getCurrentEffectivePayrollInfoList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CurrentEffectivePayrollInfo>(objectMapper.readValue("{\n  \"staffCodes\" : \"staffCodes\",\n  \"count\" : 0,\n  \"pageDate\" : {\n    \"totalPages\" : 1,\n    \"end\" : false,\n    \"content\" : [ {\n      \"corporationId\" : \"corporationId\",\n      \"corporationName\" : \"corporationName\",\n      \"workHourType\" : \"workHourType\",\n      \"staff\" : {\n        \"departmentName\" : \"杭州艾骊莎信息科技有限公司\",\n        \"lastWorkDay\" : \"lastWorkDay\",\n        \"country\" : \"country\",\n        \"enrollInDate\" : \"2018-07-01T16:00:00.000+0000\",\n        \"corporationId\" : \"corporationId\",\n        \"staffNo\" : \"staffNo\",\n        \"positionLevelName\" : \"positionLevelName\",\n        \"staffStatus\" : \"IN_SERVICE\",\n        \"contractType\" : \"劳动合同\",\n        \"departmentId\" : \"0\",\n        \"idCardNo\" : \"19820512\",\n        \"sex\" : \"sex\",\n        \"mobileNo\" : \"13707313549\",\n        \"staffType\" : \"全职\",\n        \"legalName\" : \"legalName\",\n        \"positionName\" : \"校长\",\n        \"sequence\" : 19,\n        \"idCardType\" : \"其他\",\n        \"positionId\" : \"a789e212-16e3-4a26-bda6-ebf039d7e0fe\",\n        \"positiveDate\" : \"2000-01-23\",\n        \"leaveDate\" : \"2000-01-23\",\n        \"staffName\" : \"颜亮\",\n        \"id\" : \"044caed7-924e-4275-831f-c8fa03b13406\"\n      },\n      \"createdAt\" : \"2020-08-04T08:02:26.000+0000\",\n      \"totalAmount\" : \"totalAmount\",\n      \"companyId\" : \"36dbfa02cbe54b11a5543d46b5112168\",\n      \"salaryPlanList\" : \"salaryPlanList\",\n      \"disabledFreeTaxRuleName\" : \"disabledFreeTaxRuleName\",\n      \"salaryProfile\" : {\n        \"sourceId\" : \"sourceId\",\n        \"valid\" : true,\n        \"usingInStaffSalaryfields\" : \"usingInStaffSalaryfields\",\n        \"changeType\" : {\n          \"id\" : \"PROBATION_REVIEW\",\n          \"title\" : \"转正\"\n        },\n        \"effectiveAt\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"inValidAt\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"wrapper\" : {\n          \"items\" : {\n            \"positionsalary\" : {\n              \"v\" : \"2000\"\n            },\n            \"basesalary\" : {\n              \"v\" : \"3000\"\n            },\n            \"绩效工资1596445324947\" : {\n              \"v\" : \"1000\"\n            }\n          }\n        }\n      },\n      \"taxExemption\" : \"taxExemption\",\n      \"id\" : \"dd3116d7-5a9b-4f74-ad4f-2326e48bf084\",\n      \"salaryPlans\" : { },\n      \"taxRole\" : {\n        \"id\" : \"NATIVE\",\n        \"title\" : \"居民\"\n      },\n      \"updatedAt\" : \"2000-01-23\"\n    }, {\n      \"corporationId\" : \"corporationId\",\n      \"corporationName\" : \"corporationName\",\n      \"workHourType\" : \"workHourType\",\n      \"staff\" : {\n        \"departmentName\" : \"杭州艾骊莎信息科技有限公司\",\n        \"lastWorkDay\" : \"lastWorkDay\",\n        \"country\" : \"country\",\n        \"enrollInDate\" : \"2018-07-01T16:00:00.000+0000\",\n        \"corporationId\" : \"corporationId\",\n        \"staffNo\" : \"staffNo\",\n        \"positionLevelName\" : \"positionLevelName\",\n        \"staffStatus\" : \"IN_SERVICE\",\n        \"contractType\" : \"劳动合同\",\n        \"departmentId\" : \"0\",\n        \"idCardNo\" : \"19820512\",\n        \"sex\" : \"sex\",\n        \"mobileNo\" : \"13707313549\",\n        \"staffType\" : \"全职\",\n        \"legalName\" : \"legalName\",\n        \"positionName\" : \"校长\",\n        \"sequence\" : 19,\n        \"idCardType\" : \"其他\",\n        \"positionId\" : \"a789e212-16e3-4a26-bda6-ebf039d7e0fe\",\n        \"positiveDate\" : \"2000-01-23\",\n        \"leaveDate\" : \"2000-01-23\",\n        \"staffName\" : \"颜亮\",\n        \"id\" : \"044caed7-924e-4275-831f-c8fa03b13406\"\n      },\n      \"createdAt\" : \"2020-08-04T08:02:26.000+0000\",\n      \"totalAmount\" : \"totalAmount\",\n      \"companyId\" : \"36dbfa02cbe54b11a5543d46b5112168\",\n      \"salaryPlanList\" : \"salaryPlanList\",\n      \"disabledFreeTaxRuleName\" : \"disabledFreeTaxRuleName\",\n      \"salaryProfile\" : {\n        \"sourceId\" : \"sourceId\",\n        \"valid\" : true,\n        \"usingInStaffSalaryfields\" : \"usingInStaffSalaryfields\",\n        \"changeType\" : {\n          \"id\" : \"PROBATION_REVIEW\",\n          \"title\" : \"转正\"\n        },\n        \"effectiveAt\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"inValidAt\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"wrapper\" : {\n          \"items\" : {\n            \"positionsalary\" : {\n              \"v\" : \"2000\"\n            },\n            \"basesalary\" : {\n              \"v\" : \"3000\"\n            },\n            \"绩效工资1596445324947\" : {\n              \"v\" : \"1000\"\n            }\n          }\n        }\n      },\n      \"taxExemption\" : \"taxExemption\",\n      \"id\" : \"dd3116d7-5a9b-4f74-ad4f-2326e48bf084\",\n      \"salaryPlans\" : { },\n      \"taxRole\" : {\n        \"id\" : \"NATIVE\",\n        \"title\" : \"居民\"\n      },\n      \"updatedAt\" : \"2000-01-23\"\n    } ],\n    \"totalElements\" : 9\n  }\n}", CurrentEffectivePayrollInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CurrentEffectivePayrollInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CurrentEffectivePayrollInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SiMemberPlanList> getListAdditionsAndReductions(@ApiParam(value = ""  )  @Valid @RequestBody SiMemberPlan body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SiMemberPlanList>(objectMapper.readValue("{\n  \"code\" : \"0\",\n  \"data\" : {\n    \"totalPages\" : 1,\n    \"end\" : false,\n    \"content\" : [ {\n      \"siAccountNumber\" : \"siAccountNumber\",\n      \"isLedger\" : \"否\",\n      \"year\" : \"year\",\n      \"departmentId\" : \"0\",\n      \"idCardNo\" : \"19820512\",\n      \"insuranceType\" : \"增员\",\n      \"hfName\" : \"hfName\",\n      \"houseFund\" : \"houseFund\",\n      \"siStartOn\" : \"2020-07\",\n      \"staffName\" : \"颜亮\",\n      \"inLedger\" : false,\n      \"siPayDepartmentName\" : \"杭州艾骊莎信息科技有限公司\",\n      \"socialInsurance\" : {\n        \"actualPayer\" : {\n          \"id\" : \"PERSON\",\n          \"title\" : \"个人\"\n        },\n        \"calculatable\" : true,\n        \"endOn\" : \"2000-01-23\",\n        \"startOn\" : \"2020-07\",\n        \"divisionId\" : \"2\",\n        \"base\" : 330000\n      },\n      \"departmentName\" : \"杭州艾骊莎信息科技有限公司\",\n      \"hfAccountNumber\" : \"hfAccountNumber\",\n      \"siName\" : \"北京市-社保\",\n      \"hfEndOn\" : \"2000-01-23\",\n      \"hfStartOn\" : \"2000-01-23\",\n      \"hfPayDepartmentName\" : \"hfPayDepartmentName\",\n      \"userId\" : \"userId\",\n      \"hfCompanyBenefit\" : { },\n      \"month\" : \"month\",\n      \"siEndOn\" : \"siEndOn\",\n      \"siCompanyBenefit\" : {\n        \"name\" : \"北京市-社保\",\n        \"payDepartmentId\" : \"d2822608-d5f4-47dd-9776-9ae2f24c9993\",\n        \"payDepartmentName\" : \"杭州艾骊莎信息科技有限公司\",\n        \"id\" : \"329482487287775232\"\n      },\n      \"staffId\" : \"044caed7-924e-4275-831f-c8fa03b13406\"\n    }, {\n      \"siAccountNumber\" : \"siAccountNumber\",\n      \"isLedger\" : \"否\",\n      \"year\" : \"year\",\n      \"departmentId\" : \"0\",\n      \"idCardNo\" : \"19820512\",\n      \"insuranceType\" : \"增员\",\n      \"hfName\" : \"hfName\",\n      \"houseFund\" : \"houseFund\",\n      \"siStartOn\" : \"2020-07\",\n      \"staffName\" : \"颜亮\",\n      \"inLedger\" : false,\n      \"siPayDepartmentName\" : \"杭州艾骊莎信息科技有限公司\",\n      \"socialInsurance\" : {\n        \"actualPayer\" : {\n          \"id\" : \"PERSON\",\n          \"title\" : \"个人\"\n        },\n        \"calculatable\" : true,\n        \"endOn\" : \"2000-01-23\",\n        \"startOn\" : \"2020-07\",\n        \"divisionId\" : \"2\",\n        \"base\" : 330000\n      },\n      \"departmentName\" : \"杭州艾骊莎信息科技有限公司\",\n      \"hfAccountNumber\" : \"hfAccountNumber\",\n      \"siName\" : \"北京市-社保\",\n      \"hfEndOn\" : \"2000-01-23\",\n      \"hfStartOn\" : \"2000-01-23\",\n      \"hfPayDepartmentName\" : \"hfPayDepartmentName\",\n      \"userId\" : \"userId\",\n      \"hfCompanyBenefit\" : { },\n      \"month\" : \"month\",\n      \"siEndOn\" : \"siEndOn\",\n      \"siCompanyBenefit\" : {\n        \"name\" : \"北京市-社保\",\n        \"payDepartmentId\" : \"d2822608-d5f4-47dd-9776-9ae2f24c9993\",\n        \"payDepartmentName\" : \"杭州艾骊莎信息科技有限公司\",\n        \"id\" : \"329482487287775232\"\n      },\n      \"staffId\" : \"044caed7-924e-4275-831f-c8fa03b13406\"\n    } ],\n    \"totalElements\" : 2\n  },\n  \"errorResult\" : false,\n  \"showType\" : \"0\",\n  \"message\" : \"message\",\n  \"url\" : \"url\"\n}", SiMemberPlanList.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SiMemberPlanList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SiMemberPlanList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<KpiNorm> kpiNormByKeyword() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<KpiNorm>(objectMapper.readValue("{\n  \"code\" : \"0\",\n  \"data\" : {\n    \"totalPages\" : 1,\n    \"end\" : false,\n    \"content\" : [ {\n      \"scoreUnlimit\" : false,\n      \"normRange\" : [ \"0\", \"0\" ],\n      \"normName\" : \"态度考核\",\n      \"selectedDepartments\" : \"杭州艾骊莎信息科技有限公司,销售部,人事部,财务部,销售部|销售1部,销售部|销售2部,销售部|刘,信息中心,行政部\",\n      \"normCategory\" : \"normCategory_03\",\n      \"normAttribute\" : \"normAttribute\",\n      \"normNatureName\" : \"定性\",\n      \"normCategoryName\" : \"态度考核\",\n      \"normNature\" : \"normNature_02\",\n      \"normLowScore\" : \"0\",\n      \"normDesc\" : \"工作态度\",\n      \"normTopScore\" : 100,\n      \"normCode\" : \"02\",\n      \"normStandard\" : \"normStandard\",\n      \"normScoreRange\" : \"0~100\",\n      \"normAttributeName\" : \"normAttributeName\",\n      \"id\" : \"71aa02de-b481-4b11-8c44-7154f3993b6b\",\n      \"normRangeName\" : \"normRangeName\"\n    }, {\n      \"scoreUnlimit\" : false,\n      \"normRange\" : [ \"0\", \"0\" ],\n      \"normName\" : \"态度考核\",\n      \"selectedDepartments\" : \"杭州艾骊莎信息科技有限公司,销售部,人事部,财务部,销售部|销售1部,销售部|销售2部,销售部|刘,信息中心,行政部\",\n      \"normCategory\" : \"normCategory_03\",\n      \"normAttribute\" : \"normAttribute\",\n      \"normNatureName\" : \"定性\",\n      \"normCategoryName\" : \"态度考核\",\n      \"normNature\" : \"normNature_02\",\n      \"normLowScore\" : \"0\",\n      \"normDesc\" : \"工作态度\",\n      \"normTopScore\" : 100,\n      \"normCode\" : \"02\",\n      \"normStandard\" : \"normStandard\",\n      \"normScoreRange\" : \"0~100\",\n      \"normAttributeName\" : \"normAttributeName\",\n      \"id\" : \"71aa02de-b481-4b11-8c44-7154f3993b6b\",\n      \"normRangeName\" : \"normRangeName\"\n    } ],\n    \"totalElements\" : 4\n  },\n  \"errorResult\" : false,\n  \"showType\" : \"0\",\n  \"message\" : \"message\",\n  \"url\" : \"url\"\n}", KpiNorm.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<KpiNorm>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<KpiNorm>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<KpiPlan> kpiPlanByKeyword() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<KpiPlan>(objectMapper.readValue("{\n  \"code\" : \"0\",\n  \"data\" : {\n    \"totalPages\" : 1,\n    \"end\" : false,\n    \"content\" : [ {\n      \"evaluateStartEndDate\" : \"2020-09-14~2020-09-30\",\n      \"confirmStartEndDate\" : \"2000-01-23\",\n      \"apmName\" : \"营销部测试\",\n      \"apmExcStageName\" : \"计划制定\",\n      \"apmExcStage\" : \"STAGE_1\",\n      \"appealEndDate\" : \"2000-01-23\",\n      \"carryRule\" : \"四舍五入\",\n      \"planLeaderNames\" : \"郑晴(18268128047)\",\n      \"retractEnable\" : false,\n      \"id\" : \"12cca222-257e-4803-9b40-6b561480f390\",\n      \"apmCycle\" : \"2020年9月\",\n      \"resultConfirmEndDate\" : \"2000-01-23\",\n      \"digit\" : \"0.1\"\n    }, {\n      \"evaluateStartEndDate\" : \"2020-09-14~2020-09-30\",\n      \"confirmStartEndDate\" : \"2000-01-23\",\n      \"apmName\" : \"营销部测试\",\n      \"apmExcStageName\" : \"计划制定\",\n      \"apmExcStage\" : \"STAGE_1\",\n      \"appealEndDate\" : \"2000-01-23\",\n      \"carryRule\" : \"四舍五入\",\n      \"planLeaderNames\" : \"郑晴(18268128047)\",\n      \"retractEnable\" : false,\n      \"id\" : \"12cca222-257e-4803-9b40-6b561480f390\",\n      \"apmCycle\" : \"2020年9月\",\n      \"resultConfirmEndDate\" : \"2000-01-23\",\n      \"digit\" : \"0.1\"\n    } ],\n    \"totalElements\" : 1\n  },\n  \"errorResult\" : false,\n  \"showType\" : \"0\",\n  \"message\" : \"message\",\n  \"url\" : \"url\"\n}", KpiPlan.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<KpiPlan>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<KpiPlan>(HttpStatus.NOT_IMPLEMENTED);
    }

}
