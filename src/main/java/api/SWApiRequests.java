package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SWApiRequests {

    static {
        baseURI = "https://swapi.dev";
        basePath = "/api";
    }

    private static final String PEOPLE_PATH = "/people/{id}";
    private static final String PLANETS_PATH = "/planets/{id}";
    private static final String STARSHIPS_PATH = "/starships/{id}";

    public static Response getPersonInfo(int personId) {
        return get(PEOPLE_PATH, personId);
    }

    public static Response getPlanetInfo(int planetId) {
        return get(PLANETS_PATH, planetId);
    }

    public static Response getStarshipInfo(int starshipId) {
        return get(STARSHIPS_PATH, starshipId);
    }
}
