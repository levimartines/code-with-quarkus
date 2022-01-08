package dev.levimartines.controllers;

import dev.levimartines.models.vo.CategoryVO;
import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CategoryControllerTest {

    @Test
    public void shouldGetAllCategories() {
        given()
            .when().get("/categories")
            .then().statusCode(200)
            .body("$.size()", is(2));
    }

    @Test
    public void shouldSaveNewCategory() {
        CategoryVO vo = new CategoryVO("Bakery");
        given()
            .contentType("application/json")
            .body(vo)
            .when().post("/categories")
            .then().statusCode(200)
            .body("id", is(1))
            .body("name", is(vo.getName()));
    }

}