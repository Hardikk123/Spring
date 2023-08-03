package com.taco.chain.Controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taco.chain.User;

@RestController
public class ListController {
    
    @RequestMapping("/team")
    public Map getTeam(Model model){
        Map<String, String> data = new HashMap<>();
        data.put("id", "1");
        data.put("name", "ABC");
        data.put("type", "DEV");

        return data; 
    }

}
