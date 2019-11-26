package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

/**
 * @Program:
 * @Description:
 * @Author: zhuhd
 * @Date: 2019/11/26 10:04
 */
public interface ILinkService {

    void addLink(Link link) throws CustomerException;
}
