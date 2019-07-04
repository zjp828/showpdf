package com.zjp.showpdf.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * @author zjp
 * @version 1.0
 * @class Person
 * @package com.zjp.showpdf.pojo
 * @desc 个人信息实体类
 * @copyright zjp
 * @date 2019/07/04
 */
@Data
@Accessors(chain = true)
public class Person {
    private Integer id;
    private String userName;
    private String zone;
    private String email;
    private String sex;
    private String phone;
    private String createTime;
}
