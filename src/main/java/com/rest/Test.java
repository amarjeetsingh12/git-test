package com.rest;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by amarjeet.singh on 09/12/14.
 */
public class Test {
    public static void main(String[] args) throws URISyntaxException {
        String s="/sherlock/stores/search.flipkart.com/select?redirection=true&context.internal=true&query-stub=true&query-guide=true&augment-frequent=false&smart-classify=true&products.start=0&products.count=120&client.tag=mobile-app-retail&auto-correct=false&q=shoes+women";
        URI uri=new URIBuilder(s).build();
        System.out.println(uri.getPath());
    }
}
