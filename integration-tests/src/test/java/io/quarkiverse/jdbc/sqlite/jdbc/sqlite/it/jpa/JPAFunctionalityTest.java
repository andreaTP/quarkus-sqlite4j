package io.quarkiverse.jdbc.sqlite.jdbc.sqlite.it.jpa;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

/**
 * Test various JPA operations running in Quarkus
 */
@QuarkusTest
public class JPAFunctionalityTest {

    @Test
    public void testJPAFunctionalityFromServlet() throws Exception {
        RestAssured.when().get("/jpa/testfunctionality").then().body(is("OK"));
    }

}
