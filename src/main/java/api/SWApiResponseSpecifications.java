package api;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.matchesPattern;

public class SWApiResponseSpecifications {

    private static final String NUMBER_PATTERN = "^[\\d|,]+$";
    private static final String WORD_PATTERN = "^[\\p{Alpha}|,|\\s]+$|n/a";
    private static final String ALPHANUMERIC_PATTERN = "^[\\w|\\s|-]+$|n/a";

    public static ResponseSpecification peopleSuccessResponse(String personName) {
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .expectBody("name", equalTo(personName))
                .expectBody("height", matchesPattern(NUMBER_PATTERN))
                .expectBody("mass", matchesPattern(NUMBER_PATTERN))
                .expectBody("hair_color", matchesPattern(WORD_PATTERN))
                .build();
    }

    public static ResponseSpecification planetsSuccessResponse(String planetName) {
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .expectBody("name", equalTo(planetName))
                .expectBody("rotation_period", matchesPattern(NUMBER_PATTERN))
                .expectBody("climate", matchesPattern(WORD_PATTERN))
                .expectBody("terrain", matchesPattern(WORD_PATTERN))
                .build();
    }

    public static ResponseSpecification starshipsSuccessResponse(String starshipName) {
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .expectContentType(ContentType.JSON)
                .expectBody("name", equalTo(starshipName))
                .expectBody("length", matchesPattern(NUMBER_PATTERN))
                .expectBody("model", matchesPattern(ALPHANUMERIC_PATTERN))
                .expectBody("manufacturer", matchesPattern(WORD_PATTERN))
                .build();
    }
}
