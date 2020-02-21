package com.rongqi.manage.mapper;

import com.rongqi.manage.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author chenliang
 * @version 1.0.0
 * Modification  History:
 * Date         Author        Version        Description
 * ------------------------------------------------------
 * 2020-1-6   chenliang     1.0.0          create
 */
public interface UserMapper {
    User getUserByAccount(@Param("account") String account);
}
