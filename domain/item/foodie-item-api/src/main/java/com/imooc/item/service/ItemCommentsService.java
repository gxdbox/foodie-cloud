package com.imooc.item.service;

import com.imooc.pojo.PagedGridResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("item-comments-api")
public interface ItemCommentsService {
    /**
     * 我的评价查询 分页
     *
     * @param userId
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("comments")
    public PagedGridResult queryMyComments(String userId, Integer page, Integer pageSize);

    @PostMapping("saveComments")
    public void saveComments(@RequestBody Map<String,Object> map);
}
