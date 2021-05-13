package com.baixing.item_service;

import com.baixing.Service.ItemService;
import com.baixing.entity.req.CreateItemReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
@Slf4j
class ItemServiceApplicationTests {

    private final ItemService itemService;

    @Test
    void create() {
        CreateItemReq req = new CreateItemReq();
        req.setComment("abc");
        String result = itemService.create(req);
        log.info(result);

    }

}


