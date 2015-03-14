package com.rest;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.client.JerseyClientConfiguration;
import com.yammer.dropwizard.config.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 21/07/14
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestConfig extends Configuration implements AssetsBundleConfiguration {

    private AssetsConfiguration assetsConfiguration = new AssetsConfiguration();
    private String host;
    private int port;


    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    @Override
    public AssetsConfiguration getAssetsConfiguration() {
        return assetsConfiguration;
    }



    public void setAssetsConfiguration(AssetsConfiguration assetsConfiguration) {
        this.assetsConfiguration = assetsConfiguration;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
