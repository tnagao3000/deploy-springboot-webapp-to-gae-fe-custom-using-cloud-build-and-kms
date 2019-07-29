package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${certain-setting-value}")
    private String certainSettingValue;

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot! -> " + certainSettingValue;
    }

}
