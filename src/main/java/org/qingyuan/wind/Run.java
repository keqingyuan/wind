package org.qingyuan.wind;

import org.hsweb.web.core.authorize.annotation.Authorize;
import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"org.qingyuan.wind"})
@Controller
@MapperScan("org.qingyuan.wind.dao")
public class Run {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Run.class, args);
    }

    @RequestMapping(value = {"/", "/index.html"})
    @Authorize
    public String index() {
        return "admin/index";
    }
}
