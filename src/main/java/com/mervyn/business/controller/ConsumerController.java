package com.mervyn.business.controller;

import com.mervyn.common.JsonResult;
import com.mervyn.business.service.ComputeClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hexinxin
 * @Date: 2018/3/16
 * @Time: 15:18
 * @Description:
 */
@RestController
@RequestMapping("compute")
public class ConsumerController {
   @Autowired
    private ComputeClient computeClient;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public JsonResult<Integer> add(@RequestParam(value="augend") Integer augend, @RequestParam(value = "addend") Integer addend){
        return computeClient.add(augend,addend);
    }
}
