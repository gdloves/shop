package com.xxxx.protal.mapper;

import com.xxxx.common.pojo.Admin;
import com.xxxx.common.pojo.AdminExample;
import com.xxxx.common.pojo.AdminWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Short adminId);

    int insert(AdminWithBLOBs record);

    int insertSelective(AdminWithBLOBs record);

    List<AdminWithBLOBs> selectByExampleWithBLOBs(AdminExample example);

    List<Admin> selectByExample(AdminExample example);

    AdminWithBLOBs selectByPrimaryKey(Short adminId);

    int updateByExampleSelective(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(AdminWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminWithBLOBs record);

    int updateByPrimaryKey(Admin record);
}