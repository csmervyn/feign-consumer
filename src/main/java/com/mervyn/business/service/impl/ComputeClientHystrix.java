package com.mervyn.business.service.impl;/**
 * Created by hm on 2018/3/19.
 */

import com.mervyn.business.service.ComputeClient;
import com.mervyn.common.JsonResult;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hexinxin
 * @Date: 2018/3/19
 * @Time: 14:07
 * @Description:
 */
@Component
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public JsonResult<Integer> add(@RequestParam(value = "augend") Integer augend, @RequestParam(value = "addend") Integer addend) {
        return new JsonResult<Integer>(null,"调用服务出错",Boolean.FALSE);
    }
}
