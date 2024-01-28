package com.vs.core.response;

import com.vs.core.request.BuilderBase;
import com.vs.core.request.IApiRequest;
import io.restassured.response.Response;

public class ApiExecutor implements IApi {

    private final BuilderBase builderBase;
    private Response apiResponse = null;

    public ApiExecutor(IApiRequest request) {
        BuilderBase builderBase = new BuilderBase();
        builderBase.setMethod(request.setMethod());
        builderBase.getSpec().setBaseUri(request.setBaseUri());
        builderBase.getSpec().setBasePath(request.setBasePath());
        builderBase.getSpec().setContentType(request.setContentType());
        builderBase.getSpec().setAccept("*/*");
        this.builderBase = builderBase;
    }

    @Override
    public Response execute() {
        this.apiResponse = this.builderBase.execute();
        return this.apiResponse;
    }
}
