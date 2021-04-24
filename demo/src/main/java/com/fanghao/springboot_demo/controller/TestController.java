package com.fanghao.springboot_demo.controller;

import com.fanghao.springboot_demo.dto.PersonDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by FangHao on 2020/11/11 14:29.
 */
@RestController
@RequestMapping("test")
public class TestController {

    /**
     * 将对象以json的格式返回给客户端
     * 但是用了@RestController注解后@ResponseBody就不需要了：@RestController=@Controller+@ResponseBody
     * @return
     */

    @RequestMapping("hello")
    public PersonDto hello(){
        PersonDto personDto = new PersonDto();
        personDto.setName("方浩");
        personDto.setAge(22);
        personDto.setEmail("hifnaghao@163.com");
        personDto.setSex("🚹");
        return personDto;
    }
}
