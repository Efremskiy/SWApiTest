import api.SWApiRequests;
import org.testng.annotations.Test;

import static api.SWApiResponseSpecifications.peopleSuccessResponse;

public class PeopleTest {

    @Test
    public void firstPersonResponseTest() {
        SWApiRequests.getPersonInfo(1)
                .then()
                .spec(peopleSuccessResponse("Luke Skywalker"));
    }

    @Test
    public void secondPersonResponseTest() {
        SWApiRequests.getPersonInfo(2)
                .then()
                .spec(peopleSuccessResponse("C-3PO"));
    }

    @Test
    public void thirdPersonResponseTest() {
        SWApiRequests.getPersonInfo(3)
                .then()
                .spec(peopleSuccessResponse("R2-D2"));
    }
}
