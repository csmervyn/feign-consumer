package com.mervyn.business.service;

import com.mervyn.business.service.impl.ComputeClientHystrix;
import com.mervyn.common.JsonResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hexinxin
 *         Date: 2018/3/16
 *         Time: 15:04
 *         Description:
 */
@FeignClient(value = "add-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @RequestMapping(method = RequestMethod.GET, value = "compute/add")
    public JsonResult<Integer> add(@RequestParam(value="augend") Integer augend, @RequestParam(value = "addend") Integer addend);
}
