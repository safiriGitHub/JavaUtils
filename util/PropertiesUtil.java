package com.sa.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {

	private static Properties _prop = new Properties();
	
	/**
	 * 加载指定资源到Properties单例（覆盖上一次加载内容）
	 */
	public static void readProperties(String fileName) {
		InputStream in = PropertiesUtil.class.getResourceAsStream("/"+fileName);
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));
		try {
			_prop.load(bf);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据key获取property
	 */
	public static String getProperty(String key) {
		return _prop.getProperty(key);
	}
	
	/**
	 * 根据key获取property，若没有返回指定默认值
	 */
	public static String getProperty(String key, String defaultValue) {
		return _prop.getProperty(key, defaultValue);
	}
}
