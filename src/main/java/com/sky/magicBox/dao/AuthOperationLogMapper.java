package com.sky.magicBox.dao;

import com.sky.magicBox.domain.bo.AuthOperationLog;
import org.springframework.dao.DataAccessException;

import java.util.List;

/* *
 * @Author skyliu
 * @Description 
 * @Date 8:28 2018/4/22
 */
public interface AuthOperationLogMapper {

    List<AuthOperationLog> selectOperationLogList();

    int insertSelective(AuthOperationLog operationLog) throws DataAccessException;
}
