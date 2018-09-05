package com.ysy.studentmanagesystem.mapper;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface LoginerMapper {

	public Loginer getLoginerByLoginId(@Param("loginId") String loginId);
}
