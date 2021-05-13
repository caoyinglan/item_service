package com.baixing.service;

import com.baixing.dao.AppDao;
import com.baixing.dao.ItemDao;
import com.baixing.entity.po.App;
import com.baixing.entity.po.Item;
import com.baixing.entity.req.CreateItemReq;
import com.baixing.entity.req.ReQueryReq;
import com.baixing.entity.req.UpdateItemReq;
import com.baixing.entity.vo.AppVO;
import com.baixing.entity.vo.ItemVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;

    private final AppDao appDao;

    @Override
    public List<ItemVO> query(){

        List<ItemVO> itemVos = new ArrayList<>();
        List<Item> pos = itemDao.findAll();
        for (Item po : pos) {
            ItemVO vo = new ItemVO();
            BeanUtils.copyProperties(po,vo);
            itemVos.add(vo);
        }
        return itemVos;
    }

    @Override
    public String create(CreateItemReq req){
        log.info("req: {}", req);
        Item item = new Item();
        BeanUtils.copyProperties(req, item);
        itemDao.save(item);
        return "create";
    }

    @Override
    public String update(UpdateItemReq req){
        log.info("req: {}", req);
        Integer id = req.getId();
        Item item = itemDao.findById(id).get();
        BeanUtils.copyProperties(req, item);
        itemDao.save(item);
        return "update";
    }

    @Override
    public AppVO reQuery(ReQueryReq req){
        log.info("req: {}", req);
        Integer id = req.getId();
        Item item = itemDao.findById(id).get();
        Integer appId = item.getApp_id();
        App app = appDao.findById(appId).get();
        AppVO appVO = new AppVO();
        BeanUtils.copyProperties(app, appVO);
        return appVO;
    }




}