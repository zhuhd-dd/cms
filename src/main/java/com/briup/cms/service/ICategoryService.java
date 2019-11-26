package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;

import java.util.List;

/**
 * @Program:
 * @Description:
 * @Author: zhuhd
 * @Date: 2019/11/26 16:41
 */
public interface ICategoryService {
    void saveOrupdateCategory(Category category) throws CustomerException;

    void deleteById(int id) throws CustomerException;

    Category findById(int id) throws CustomerException;

    List<Category> findAll() throws CustomerException;
}
