package scripts;

import com.vs.core.request.BuilderBase;
import com.vs.core.response.ApiExecutor;
import com.vs.helper.requestHelper.GetPetDetails;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetDetailsTests {

    @Test
    public void abc (){
        GetPetDetails getPetDetails = new GetPetDetails();
        Response apiR = new ApiExecutor(getPetDetails).execute();
        apiR.prettyPrint();
    }
}
