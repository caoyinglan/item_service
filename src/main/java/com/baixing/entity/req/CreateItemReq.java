package com.baixing.entity.req;

import lombok.Data;

@Data
public class CreateItemReq {

    private Integer app_id;
    private String key_prop;
    private String value_prop;
    private String comment;
}
