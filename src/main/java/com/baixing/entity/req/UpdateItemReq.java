package com.baixing.entity.req;

import lombok.Data;

@Data
public class UpdateItemReq {

    private Integer id;
    private Integer app_id;
    private String key_prop;
    private String value_prop;
    private String comment;
}