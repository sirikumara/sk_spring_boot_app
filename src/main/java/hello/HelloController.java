package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sira on 1/5/2016.
 */

@RestController
public class HelloController {
    @RequestMapping(value = "sayHello")
    public String sayHello(){
        return "Hello Mazarin !!";
    }
}
