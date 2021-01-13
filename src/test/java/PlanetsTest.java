import api.SWApiRequests;
import org.testng.annotations.Test;

import static api.SWApiResponseSpecifications.planetsSuccessResponse;

public class PlanetsTest {
    @Test
    public void firstPlanetResponseTest() {
        SWApiRequests.getPlanetInfo(1)
                .then()
                .spec(planetsSuccessResponse("Tatooine"));
    }

    @Test
    public void secondPlanetResponseTest() {
        SWApiRequests.getPlanetInfo(2)
                .then()
                .spec(planetsSuccessResponse("Alderaan"));
    }

    @Test
    public void thirdPlanetResponseTest() {
        SWApiRequests.getPlanetInfo(3)
                .then()
                .spec(planetsSuccessResponse("Yavin IV"));
    }
}
