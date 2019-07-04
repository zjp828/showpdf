package com.zjp.showpdf.service;

import com.zjp.showpdf.pojo.Person;
import java.util.List;
/**
 * @author zjp
 * @version 1.0
 * @class PersonService
 * @package com.zjp.showpdf.service;
 * @desc 个人信息Service
 * @copyright zjp
 * @date 2019/07/04
 */
public interface PersonService {
    /**
     * @desc 查询所有的用户
     * @return
     */
    List<Person> findAll();
    List<Person> queryByUserName(String userName);
}
