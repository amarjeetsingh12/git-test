package com.rest;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class RestService extends Service<TestConfig> {


    public RestService() {
        super();
    }

    public static void main(String args[]) throws Exception {
        RestService rs=new RestService();
        rs.run(args);
    }
    @Override
    public void initialize(Bootstrap<TestConfig> serviceConfigurationBootstrap) {
        serviceConfigurationBootstrap.setName("Test");
        int i=50;
        System.out.println("value of i"+i);
//        serviceConfigurationBootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/"));
    }

    @Override
    public void run(TestConfig configuration, Environment environment) throws Exception {
        environment.getObjectMapperFactory().enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        environment.addResource(new TestResource());
    }
}
