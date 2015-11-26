package me.quxiu.user.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.quxiu.user.util.Md5Util;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.alibaba.dubbo.common.utils.StringUtils;

/**
 * php 加密  解密  用java实现
 * 
 * 
 * php 源码
 * 
 *  可逆解密算法
 *	function decrypt($data, $key=''){
 *		if(!$key) $key = 'dfdc24c13ca3e8a4d3cd797251966f4c';
 *		$key = md5($key);
 *		$x = 0;
 *		$data = base64_decode($data);
 *		$len = strlen($data);
 *		$l = strlen($key);
 *		for ($i = 0; $i < $len; $i++)
 *		{
 *			if ($x == $l)
 *			{
 *				$x = 0;
 *			}
 *			$char .= substr($key, $x, 1);
 *			$x++;
 *		}
 *		for ($i = 0; $i < $len; $i++)
 *		{
 *			if (ord(substr($data, $i, 1)) < ord(substr($char, $i, 1)))
 *			{
 *				$str .= chr((ord(substr($data, $i, 1)) + 256) - ord(substr($char, $i, 1)));
 *			}
 *			else
 *			{
 *				$str .= chr(ord(substr($data, $i, 1)) - ord(substr($char, $i, 1)));
 *			}
 *		}
 *		return $str;
 *	}
 *  可逆加密算法
 *  function encrypt($data, $key=''){
 * 		if(!$key) $key = 'dfdc24c13ca3e8a4d3cd797251966f4c';
 * 		$key	=	md5($key);
 * 		$x		=	0;
 * 		$len	=	strlen($data);
 * 		$l		=	strlen($key);
 * 		for ($i = 0; $i < $len; $i++)
 * 		{
 * 			if ($x == $l)
 * 			{
 * 				$x = 0;
 * 			}
 * 			$char .= $key{$x};
 * 			$x++;
 * 		}
 * 		for ($i = 0; $i < $len; $i++)
 * 		{
 * 			$str .= chr(ord($data{$i}) + (ord($char{$i})) % 256);
 * 		}
 * 		return base64_encode($str);
 * }
 * @author wenan.chen@quxiu.me
 * @version 2015年7月27日 下午4:35:25
 * 
 */

public class TestUserServiceImpl {
	
	public static void main(String[] args) throws IOException {
		//System.out.println(encrypt("vivian",""));
		System.out.println(decrypt("t6G7raeg",""));
	}
	
	public static String encrypt(String data,String key){
		if(StringUtils.isBlank(key))
			key = "dfdc24c13ca3e8a4d3cd797251966f4c";
		key = Md5Util.encodeByMD5(key);
		List<Character> chars = new ArrayList<Character>();
		String result = "";
		int	x = 0;
		for(int i=0;i<data.length();i++){
			if(x == data.length())
				x = 0;
			chars.add(key.toCharArray()[i]);
			x++;
		}
		byte[] bytes = new byte[data.length()];
		for(int i=0;i<data.length();i++){
			byte char1 = (byte)data.toCharArray()[i];
			byte char2 = (byte)(char)chars.get(i);
			bytes[i] = (byte)((int)char1 + (int)char2%256);
		}
		return new BASE64Encoder().encode(bytes); 
	}
	
	public static String decrypt(String data,String key) throws IOException{
		String resultStr = "";
		
		if(StringUtils.isBlank(key))
			key = "dfdc24c13ca3e8a4d3cd797251966f4c";
		key = Md5Util.encodeByMD5(key);
		byte[] dataByte = new BASE64Decoder().decodeBuffer(data);  
		List<Character> chars = new ArrayList<Character>();
		int x = 0;
		for(int i=0; i<data.length();i++){
			if(x == key.length())
				x = 0;
			chars.add(key.toCharArray()[i]);
			x++;
		}
		for(int i=0;i<data.length();i++){
			int first = (int)data.toCharArray()[i];
			int second = (int)chars.get(i);
			if(first < second){
				resultStr += String.valueOf((char)((first + 256) - second));
			}else{
				resultStr += String.valueOf((char)(first - second));
			}	
		}
		return resultStr;
	}	
	
	/** 
     * base 64 encode 
     * @param bytes 待编码的byte[] 
     * @return 编码后的base 64 code 
     */  
    public static String base64Encode(byte[] bytes){  
        return new BASE64Encoder().encode(bytes);  
    }  
      
    /** 
     * base 64 decode 
     * @param base64Code 待解码的base 64 code 
     * @return 解码后的byte[] 
     * @throws Exception 
     */  
    public static byte[] base64Decode(String base64Code) throws Exception{  
        return StringUtils.isEmpty(base64Code) ? null : new BASE64Decoder().decodeBuffer(base64Code);  
    } 
}
