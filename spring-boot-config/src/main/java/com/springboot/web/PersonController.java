package com.springboot.web;

import com.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private Person person;

    @Value("#{person.name}")
    private String name;
    @Value("#{person.sex}")
    private String sex;

    @RequestMapping("getProperties")
    public String getProperties(){
        return Person.name;
    }

    @RequestMapping("getProperties2")
    public String getProperties2(){
        return name;
    }
}
