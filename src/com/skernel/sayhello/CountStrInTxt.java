/**
 * @program      统计文本中指定字符串出现的次数；
 * @author       Kahle Kernel
 * @blog         http://skernel.com/
 * @email        skernel@foxmail.com
 * @description  Create By Kahle Kernel.
 */
package com.skernel.sayhello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountStrInTxt {
	public static void main(String[] args) throws IOException {
		BufferedReader bufR = new BufferedReader(new InputStreamReader(new FileInputStream(new File("./Cache/count.txt")), "gbk"));
		int count = 0;
		for (String line = null; (line = bufR.readLine()) != null; count += countSubInSuper("你好", line))
			;
		bufR.close();
		System.out.println(count);
	}

	private static int countSubInSuper(String subString, String superString) {
		int count = 0;
		for (int length = subString.length(), index = 0 - length; (index = superString.indexOf(subString, index + length)) != -1; ++count)
			;
		return count;
	}
}