package cn.hsa.city.controller;

import cn.hsa.city.pojo.China;
import cn.hsa.city.service.IChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class ChinaController {

    @RequestMapping("show")
    public String show() {
        return "index";
    }
      @Autowired
      private IChinaService service;
    //获取所有省
    @RequestMapping("getp")
    @ResponseBody
    public Object getp() throws Exception {
        List<China> all = service.findAllByPname();
        return  all;
    }

    //查询省下的所有市
    @RequestMapping("getc")
    @ResponseBody
    public Object getc(@RequestParam("pid") int pid) throws Exception{
        System.out.println(pid);
        List<China> allByPid = service.findAllByPid(pid);
        return allByPid;
    }

    //查询市下的所有区
    @RequestMapping("geta")
    @ResponseBody
    public Object getp(@RequestParam("cid") int cid) throws Exception{
        System.out.println(cid);
        List<China> allByCid = service.findAllByCid(cid);
        return allByCid;
    }
}
