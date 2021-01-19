package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//后台返回的是数据,不再是逻辑视图名称（等价下面两个注解的整合）
/*@Controller
@ResponseBody（数据）
*/
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "HelloController";
    }
}
