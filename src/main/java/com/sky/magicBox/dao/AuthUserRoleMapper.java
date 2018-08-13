package com.sky.magicBox.dao;

import com.sky.magicBox.domain.bo.AuthUserRole;
import org.springframework.dao.DataAccessException;

public interface AuthUserRoleMapper {

    int deleteByPrimaryKey(Integer id) throws DataAccessException;

    int insert(AuthUserRole record) throws DataAccessException;

    int insertSelective(AuthUserRole record) throws DataAccessException;

    AuthUserRole selectByPrimaryKey(Integer id) throws DataAccessException;

    int updateByPrimaryKeySelective(AuthUserRole record) throws DataAccessException;

    int updateByPrimaryKey(AuthUserRole record) throws DataAccessException;

    int deleteByUniqueKey(AuthUserRole record) throws DataAccessException;
}