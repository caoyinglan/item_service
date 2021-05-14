package com.baixing.service.remote;

import com.baixing.entity.dto.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MusicAPITest {

    @Autowired
    private MusicAPI musicAPI;

    @Autowired
    private MusicTestAPI musicTestAPI;


    @Test
    void banner() {
        MusicAPI.BannerResp bannerResp = musicAPI.banner(1);
        List<BannerDTO> banners = bannerResp.getBanners();
        for (BannerDTO banner : banners) {
            System.out.println(banner);
        }
    }

    /*@Test
    void scanner() {
        MusicAPI.SearchHotResp searchHotResp = musicAPI.searchHot();
        List<SearchHotDTO> hots = searchHotResp.getResult().getHots();
        for (SearchHotDTO hot : hots) {
            System.out.println(hot);
        }

    }

     */


    //Practice

    @Test
    void scanner() {
        MusicTestAPI.SearchHotResp searchHotResp = musicTestAPI.searchHot();
        List<HotDTO> hots = searchHotResp.getResult().getHots();
        for (HotDTO hot : hots) {
            System.out.println(hot);
        }

    }

    @Test

    void player(){
        MusicTestAPI.RelatedPlayListResp related = musicTestAPI.related(1);
        List<PlayDTO> plays = related.getPlaylists();
        for (PlayDTO play : plays) {
            CreatorDTO creator = play.getCreator();
            System.out.println(creator);
        }

    }

    @Test
    void Data(){
        MusicTestAPI.SearchDefaultResp searchDefault = musicTestAPI.searchDefault();
        DataDTO data = searchDefault.getData();
        System.out.println(data);
    }
}
