package com.baixing.service.remote;

import com.baixing.entity.dto.*;
import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://autumnfish.cn", value = "MusicTestAPI")
public interface MusicTestAPI {



    @Data
    class SearchHotResp{
        private Integer code;
        private ResultResp result;
    }

    @Data
    class ResultResp {
        private List<HotDTO> hots;
    }

    @GetMapping("search/hot")
    SearchHotResp searchHot();

    //
    @Data
    class RelatedPlayListResp{
        private Integer code;
        private List<PlayDTO> playlists;  //这个名字必须和网站上写的一样，里面的内容可以少一项但名字要一样
    }


    @PostMapping("related/playlist")
    RelatedPlayListResp related(@RequestParam("id") Integer id);

    //我再试一次

    @Data
    class SearchDefaultResp{
        private Integer code;
        private String message;
        private DataDTO data;
    }

    @GetMapping("search/default")
    SearchDefaultResp searchDefault();


}
