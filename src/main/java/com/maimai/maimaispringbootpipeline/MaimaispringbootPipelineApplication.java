package com.maimai.maimaispringbootpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MaimaispringbootPipelineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaimaispringbootPipelineApplication.class, args);
    }

    @RequestMapping("who")
    public String who(){
        return "pipeline";
    }
}
