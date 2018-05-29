package com.weather.test;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private RestTemplate template;

    @Value("${url}")
    private  String api;
    @Value("${key}")
    private  String key;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView user(
            String city
    ) {
        final Map<String,String> params = new HashMap<>();
        params.put("q",city);
        params.put("APPID", key);

        String result = template.getForObject(api+"?q="+city+"&APPID="+key, String.class, params);
        WeatherResult map = new Gson().fromJson(result, WeatherResult.class);
        ModelAndView view = new ModelAndView("result");
        view.addObject("result", map);
        return view;
    }





}
