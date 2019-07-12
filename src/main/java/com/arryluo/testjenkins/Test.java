package com.arryluo.testjenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @RequestMapping("jenkins")
    @ResponseBody
    public Object test() {
        return "测试Jenkins自动化部署";
    }
    @RequestMapping("jenkins1")
    @ResponseBody
    public Object test1() {
        return "测试覆盖原来的镜像，进行部署";
    }
}
