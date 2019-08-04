package com.techprimers.config.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class UrlResource {

    @Value("${baseDataUri}")
    private String baseDataUri;

    @GetMapping("/url")
    public String baseDataUri() {
        return baseDataUri;
    }
}
