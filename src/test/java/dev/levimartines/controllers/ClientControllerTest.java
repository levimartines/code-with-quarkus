package dev.levimartines.controllers;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class ClientControllerTest {

    @Test
    public void shouldFindClientByIdAndReturn200() {
        given()
            .when().get("/clients/1")
            .then().statusCode(200);
    }

    @Test
    public void shouldNotFindClientByIdAndReturn404() {
        given()
            .when().get("/clients/2")
            .then().statusCode(404);
    }

}