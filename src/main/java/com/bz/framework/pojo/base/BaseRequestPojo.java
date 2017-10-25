package com.bz.framework.pojo.base;
/**
 * 
 * 作者:唐鹏
 * 描述: 请求对象基类
 * 创建时间:2017年9月29日下午12:17:41
 */
public class BaseRequestPojo extends BasePojo{
	private static final long serialVersionUID = 1L;
	//请求用户编号
	private String clientNo;
	//请求时间
	private long timestamp;
	//摘要签名
	private String mac;
	//版本
	private String version ;
	public BaseRequestPojo(){
		
	}
	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
