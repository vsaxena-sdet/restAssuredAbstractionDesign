package com.vs.core.request;

import com.vs.constants.HttpMethods;
import io.restassured.http.ContentType;
import org.apache.commons.httpclient.HttpMethod;

import java.util.Map;

public interface IApiRequest {

    String setBaseUri();
    String setBasePath();
    Map<String,?> setPathParams();
    Map<String,?> setQueryParams();
    Map<String,?> setHeaders();
    String setJsonBody();
    HttpMethods setMethod();
    ContentType setContentType();
}
