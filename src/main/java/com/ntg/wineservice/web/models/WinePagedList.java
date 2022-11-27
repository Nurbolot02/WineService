package com.ntg.wineservice.web.models;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class WinePagedList extends PageImpl<WineDto> {
    public WinePagedList(List<WineDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public WinePagedList(List<WineDto> content) {
        super(content);
    }
}
