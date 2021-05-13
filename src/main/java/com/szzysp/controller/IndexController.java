package com.szzysp.controller;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class IndexController {
    @RequestMapping("/test")
    public String test(){
        return "index";
    }


}
