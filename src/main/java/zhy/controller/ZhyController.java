package zhy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zhy.entity.Zhy;
import zhy.service.ZhyService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YevgeniC
 * @date 2018/8/31 15:43
 */
@Controller
@RequestMapping("/zhy")
public class ZhyController {
    @Resource
    ZhyService zhyService;
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(){
        List<Zhy> zhies = zhyService.selectGoods();
        return "show";
    }
}
