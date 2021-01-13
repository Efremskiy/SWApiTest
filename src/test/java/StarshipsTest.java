import api.SWApiRequests;
import org.testng.annotations.Test;

import static api.SWApiResponseSpecifications.starshipsSuccessResponse;

public class StarshipsTest {

    @Test
    public void firstStarshipResponseTest() {
        SWApiRequests.getStarshipInfo(1)
                .then()
                .spec(starshipsSuccessResponse("Test"));
    }

    @Test
    public void secondStarshipResponseTest() {
        SWApiRequests.getStarshipInfo(2)
                .then()
                .spec(starshipsSuccessResponse("CR90 corvette"));
    }

    @Test
    public void thirdStarshipResponseTest() {
        SWApiRequests.getStarshipInfo(3)
                .then()
                .spec(starshipsSuccessResponse("Star Destroyer"));
    }
}
