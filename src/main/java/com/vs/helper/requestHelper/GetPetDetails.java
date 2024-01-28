package com.vs.helper.requestHelper;

import com.vs.constants.HttpMethods;
import com.vs.core.request.IApiRequest;
import io.restassured.http.ContentType;

import java.util.Map;

public class GetPetDetails implements IApiRequest {

    public GetPetDetails(){

    }

    @Override
    public String setBaseUri() {
        return "https://petstore.swagger.io";
    }

    @Override
    public String setBasePath() {
        return "/v2/pet/5";
    }

    @Override
    public Map<String, ?> setPathParams() {
        return null;
    }

    @Override
    public Map<String, ?> setQueryParams() {
        return null;
    }

    @Override
    public Map<String, ?> setHeaders() {
        return null;
    }

    @Override
    public String setJsonBody() {
        return null;
    }

    @Override
    public HttpMethods setMethod() {
        return HttpMethods.GET;
    }

    @Override
    public ContentType setContentType() {
        return ContentType.JSON;
    }
}
