package cn.jiashubing.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiashubing
 * @since 2018/5/30
 */
@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "Hello，Spring Boot";
    }
}
