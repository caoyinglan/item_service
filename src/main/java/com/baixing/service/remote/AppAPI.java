package com.baixing.service.remote;

import com.baixing.entity.vo.AppVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8080", value = "appAPI")  //value首字母小写
public interface AppAPI {

    @GetMapping("queryById")
    AppVO queryById(@RequestParam("id") Long id);    //强制绑定
}
