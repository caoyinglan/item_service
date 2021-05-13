package com.baixing.service;

import com.baixing.entity.req.CreateItemReq;
import com.baixing.entity.req.ReQueryReq;
import com.baixing.entity.req.UpdateItemReq;
import com.baixing.entity.vo.AppVO;
import com.baixing.entity.vo.ItemVO;

import java.util.List;

public interface ItemService {

    List<ItemVO> query();

    String create(CreateItemReq req);

    String update(UpdateItemReq req);

    AppVO reQuery(ReQueryReq req);
}
