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
            
            return new ModelAndView(attributes, "index.jade");
        }, new JadeEngine());

    }
}
