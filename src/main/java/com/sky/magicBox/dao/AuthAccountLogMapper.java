package com.sky.magicBox.dao;

import com.sky.magicBox.domain.bo.AuthAccountLog;
import org.springframework.dao.DataAccessException;

import java.util.List;

/* *
 * @Author tomsun28
 * @Description 
 * @Date 8:27 2018/4/22
 */
public interface AuthAccountLogMapper {

    List<AuthAccountLog> selectAccountLogList();

    int insertSelective(AuthAccountLog authAccountLog) throws DataAccessException;

}
