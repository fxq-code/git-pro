package com.fxq.exception.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PageResp<T> {

    private Long current;

    private Long size;

    private Long total;

    private Long pages;

    private List<T> records;

    public static PageResp from(Page page){
        return PageResp.builder()
                .current(page.getCurrent())
                .size(page.getSize())
                .total(page.getTotal())
                .pages(page.getPages())
                .records(page.getRecords())
                .build();
    }

}
