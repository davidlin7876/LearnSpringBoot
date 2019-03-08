package com.majiaxueyuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.majiaxueyuan.mapper.UserMapper;
import com.majiaxueyuan.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	//事物处理
	@Transactional
	public void transfer(Integer id) {
		// 我们要做的操作，我们将某个用户的NAME更新成待删除，然后去删除，但是中间我们制造一个异常出来
		userMapper.update("DeleteTHIS", id);
		System.out.println("异常之前");
		int a = 2 / 0;
		System.out.println("异常之后");
		userMapper.delete(id);
	}
}
