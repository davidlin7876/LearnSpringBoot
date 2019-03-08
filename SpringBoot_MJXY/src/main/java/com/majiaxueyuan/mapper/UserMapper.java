package com.majiaxueyuan.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.majiaxueyuan.entity.User;

@Mapper
public interface UserMapper {
	@Select("select * from user where id = #{id}")
	User selectUserById(@Param("id") Integer id);

	@Insert("INSERT INTO user (`username`, `sex`) VALUES (#{username}, #{sex});")
	int insert(@Param("username") String username, @Param("sex") String sex);
	
	@Update("UPDATE user SET username =#{name} WHERE id = #{id}")
	int update(@Param("name") String name, @Param("id") Integer id);

	@Delete("DELETE from user where id = #{id}")
	void delete(@Param("id") Integer id);
}
