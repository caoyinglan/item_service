package com.baixing.controller;


import com.baixing.service.ItemService;
import com.baixing.entity.req.CreateItemReq;
import com.baixing.entity.req.ReQueryReq;
import com.baixing.entity.req.UpdateItemReq;
import com.baixing.entity.vo.AppVO;
import com.baixing.entity.vo.ItemVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("query")
    public List<ItemVO> query() {
        return itemService.query();

    }

    @PostMapping("create")
    public String create(@RequestBody CreateItemReq req){
        return itemService.create(req);

    }

    @PostMapping("update")
    public String update(@RequestBody UpdateItemReq req){
        return itemService.update(req);
    }

    @GetMapping("reQuery")
    public AppVO reQuery(ReQueryReq req){
        return itemService.reQuery(req);
    }





}
