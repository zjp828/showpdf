package com.zjp.showpdf.dao;
import com.zjp.showpdf.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author zjp
 * @version 1.0
 * @class PersonMapper
 * @package com.wzhi.tableserver.dao
 * @desc 个人信息Mapper，此处的Mapper注解会被启动类的@MapperScan扫描到
 * @copyright zjp
 * @date 2019/07/04
 */
@Mapper
public interface PersonMapper {
    /**
     * @desc 查询所有的用户
     * @return
     */
    List<Person> findAll();

    List<Person> queryByUserName(String userName);
}
