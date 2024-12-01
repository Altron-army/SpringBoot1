package com.siddiq.shaikh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/homePage/")
public class MyController {
    @GetMapping(path="/userDetail")
    public String getData(@RequestBody User user)
    {
        return "User name: Shaikh Siddiq= " + user.userName + " "+ user.email  ;
    }
    
}
