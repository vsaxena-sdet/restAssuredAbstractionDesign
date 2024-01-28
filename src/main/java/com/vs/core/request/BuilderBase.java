package com.vs.core.request;

import com.vs.constants.HttpMethods;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BuilderBase {

    private final RequestSpecBuilder spec = new RequestSpecBuilder();
    private HttpMethods method;

    public Response execute() {
        RequestSpecification spec = this.spec.build();
        Response apiResponse;
        RestAssured.defaultParser = Parser.JSON;
        RestAssuredConfig config = RestAssured.config();
        switch (this.method) {
            case GET:
                apiResponse = RestAssured.given().filter(new RequestLoggingFilter()).config(config).spec(spec).when().get();
                break;
            case POST:
                apiResponse = RestAssured.given().filter(new RequestLoggingFilter()).config(config).spec(spec).when().post();
                break;
            default:
                throw new RuntimeException("API Method not specified");
        }
        return apiResponse;
    }

    public RequestSpecBuilder getSpec(){
        return this.spec;
    }

    public void setMethod(HttpMethods method){
        this.method=method;
    }
}
