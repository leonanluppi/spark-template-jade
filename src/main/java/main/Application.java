package main;

import static spark.Spark.get;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import api.JadeEngine;

public class Application {
	
    public static void main(String args[]) throws IOException {

        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("name", "Hello World!");

            // The hello.ftl file is located in directory:
            // src/test/resources/spark/template/freemarker
            return new ModelAndView(attributes, "index.jade");
        }, new JadeEngine());

    }
}