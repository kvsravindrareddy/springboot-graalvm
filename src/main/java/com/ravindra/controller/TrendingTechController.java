package com.ravindra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is created by Trending Technologies Pvt Ltd.
 * Live training please contact info@trendingtechnologies.net
 * +91-7353122882 (Whatsapp only)
 * Send enquires from www.trendingtechnologies.in
 * www.trendingtechnologies.net
 * www.trendingtechnologies.asia
 */
@RestController
public class TrendingTechController {

    @GetMapping("/trendingtech")
    public String hello()
    {
        return "Hello TrendingTechnologies";
    }
}
