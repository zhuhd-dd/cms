package com.briup.cms.web.controller;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program:
 * @Description:
 * @Author: zhuhd
 * @Date: 2019/11/26 16:38
 */
@RestController
@RequestMapping("/category")
@Api(description = "栏目管理")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/add")
    @ApiOperation("添加栏目")
    public Message addCategory(Category category) {
        categoryService.saveOrupdateCategory(category);
        return MessageUtil.success();
    }

    @GetMapping("/findAll")
    @ApiOperation("查询所有栏目")
    public Message<List<Category>> findAll() {
        return MessageUtil.success(categoryService.findAll());
    }

    @GetMapping("/deleteById")
    @ApiOperation("根据id删除栏目")
    public Message deleteById(int id) {
        categoryService.deleteById(id);
        return MessageUtil.success();
    }

    @GetMapping("/findById")
    @ApiOperation("根据id查询栏目")
    public Message<Category> findById(int id) {
        return MessageUtil.success(categoryService.findById(id));
    }

    @PostMapping("/update")
    @ApiOperation("更新栏目")
    public Message update(Category category) {
        categoryService.saveOrupdateCategory(category);
        return MessageUtil.success();
    }
}
