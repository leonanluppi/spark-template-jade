Spark Jade Template Engine
----

An implementation for Spark and Jade Template Engine

  - Spark Java: www.sparkjava.com
  - Jade4J: https://github.com/neuland/jade4j
  
### Version
0.1

### How to use

* Make sure that you have jade4j-0.4.3.jar on lib folder


```sh
import static spark.Spark.get;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import api.JadeEngine;

public class Application {
    public static void main(String args[]) {
        get("/hello", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("name", "Hello World!");
    
            return new ModelAndView(attributes, "index.jade");
        }, new JadeEngine());
    }
}
```

License
----

MIT
