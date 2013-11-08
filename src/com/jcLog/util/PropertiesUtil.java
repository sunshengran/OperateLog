package com.jcLog.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * @description: properties工具类
 * @author： 孙圣然
 * @created: 2013-6-13 下午1:45:12
 * @version：  $Id: PropertiesUtil.java 31118 2013-10-28 20:24:44Z sunsr $
 * @copyright ©1995-2013 Changchun Jiacheng Project of the Network Co.,ltd.All Rights Reserved.
 */
public class PropertiesUtil {
	private static final Logger logger = Logger.getLogger(PropertiesUtil.class);
	
	/**
	 * @Description 获得路径下的properties文件
	 */
	public static Map<String,String> getProperties(String pathName,String fileName){
		Properties property = new Properties();
		Map<String,String> paraMap = new HashMap<String, String>();
		try {
			
			property.load(new FileInputStream(pathName+fileName));
			Set<Entry<Object,Object>> set = property.entrySet();
			Iterator<Entry<Object,Object>> itor = set.iterator();
			
			while(itor.hasNext()){
				Entry<Object,Object> entry = itor.next();
				paraMap.put(entry.getKey().toString(), entry.getValue().toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return paraMap;
	}
	
	/**
	 * @Description 获得根目录下的properties内容
	 */
	public static Map<String,String> getProperties(String fileName){
		String basePath =  PropertiesUtil.class.getClassLoader().getResource("").toString();
		basePath = basePath.substring(6);
		return getProperties(basePath,fileName);
	}
}
