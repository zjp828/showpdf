package com.zjp.showpdf.service.impl;
import com.zjp.showpdf.dao.PersonMapper;
import com.zjp.showpdf.pojo.Person;
import com.zjp.showpdf.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Slf4j
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonMapper mapper;
    @Override
    public List<Person> findAll() {
        return mapper.findAll();
    }

    public List<Person> queryByUserName(@RequestParam("userName") String userName){

        return mapper.queryByUserName(userName);
    }
}
