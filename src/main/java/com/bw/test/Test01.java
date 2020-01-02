package com.bw.test;

import java.util.Arrays;
import java.util.List;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;

public class Test01 {
	public static void main(String[] args) {
		
		List<Object[]> list = IOUtils.readFile("a.txt", "\\|");
		for (Object[] objects : list) {
			if(StringUtil.isEmpty(objects[2]+"")){
				objects[2] = "0.0";
			}
			Book book = new Book(Integer.parseInt(objects[0]+""), Double.parseDouble(objects[2]+""), objects[1]+"", objects[3]+"");
			
			System.out.println(book);
			
			//添加数据库
			
			
		}
	}
}
