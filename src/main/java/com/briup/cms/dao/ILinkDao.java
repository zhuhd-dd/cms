package com.briup.cms.dao;

import com.briup.cms.bean.Link;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program:
 * @Description:
 * @Author: zhuhd
 * @Date: 2019/11/25 17:19
 */
public interface ILinkDao extends JpaRepository<Link,Integer> {
}
