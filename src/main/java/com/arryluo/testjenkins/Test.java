package com.arryluo.testjenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @RequestMapping("jenkins")
    @ResponseBody
    public Object test(){
    return "测试Jenkins自动化部署";
}
}
