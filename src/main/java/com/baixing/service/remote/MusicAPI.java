package com.baixing.service.remote;

import com.baixing.entity.dto.BannerDTO;
import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://autumnfish.cn", value = "MusicAPI")   //只写域名
public interface MusicAPI {

    @PostMapping("banner")
    public BannerResp banner(@RequestParam("type") Integer type);

    @Data
    public static class BannerResp {
        private List<BannerDTO> banners;
    }
}
