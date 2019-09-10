package com.zhangyang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest2 {

	@Test
	public void testIsPhone() {
		boolean phone = StringUtil.isPhone("1234546");
		System.out.println(phone);
	}

	@Test
	public void testIsEmail() {
		boolean b = StringUtil.isEmail("A123456@163.com");
		System.out.println(b);
	}

}
