package com.antifraud.aegis.registry.eureka;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: antifraud-aegis-registry
 * @description:
 * @author: niuliguo
 * @create: 2020-05-26 11:59
 **/
@EnableDiscoveryClient
@EnableEurekaServer
@SpringBootApplication
public class AegisEurekaRegistryApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AegisEurekaRegistryApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AegisEurekaRegistryApplication.class);
    }
}
