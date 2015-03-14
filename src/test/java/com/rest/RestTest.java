package com.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 28/09/14
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class RestTest extends TestCase{
    public static HttpClient client;

    /*@BeforeClass
    public void setUp(){
        System.out.println("setup");
        RestTest.client=HttpClientBuilder.create().build();
        System.out.println("setup 1");
    } */

    @Override
    @BeforeClass
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    @AfterClass
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testGet() throws IOException {
        Assert.assertTrue(false);
    }
    @Test
    public void testPost() throws IOException {
        System.out.println("adada");
        Assert.assertTrue(true);
    }
     /*
    @AfterClass
    public void tearDown(){
        System.out.println("tear down");
    }
    */
}
