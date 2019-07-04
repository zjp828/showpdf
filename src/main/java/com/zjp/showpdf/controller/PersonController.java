package com.zjp.showpdf.controller;
import com.zjp.showpdf.pojo.Person;
import com.zjp.showpdf.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zjp
 * @version 1.0
 * @class PersonController
 * @package com.zjp.showpdf.controller
 * @desc 个人信息交互
 * @copyright
 * @date 2019/07/04
 */
@RestController
@Slf4j
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(value = "findAll")
    public List<Person> findAll(){
        log.info("查询所有的角色信息");
        return service.findAll();
    }
    @RequestMapping(value = "queryByUserName")
    @ResponseBody
    public List<Person> queryByUserName(@RequestBody Person person ){
        log.info("根据userName查询角色信息");
        System.out.println(person.getUserName());
        log.info("-------");
        String userName = person.getUserName();
        return service.queryByUserName(userName);
    }
}
