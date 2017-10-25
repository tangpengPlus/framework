package com.bz.framework.constant.exception;

import com.bz.framework.constant.base.BaseEnum;

/**
 * 作者:唐鹏
 * 描述: BZ服务异常枚举类
 * 创建时间:2017年9月29日上午11:22:47
 */
public class BzExceptionEnum {

	/**
	 * 
	 * 作者:唐鹏
	 * 描述: 用户模块异常信息枚举
	 * 创建时间:2017年9月29日上午11:28:48
	 */
	public enum UserExceptionEnum implements BaseEnum<Integer>{
         USER_CREATE_ERROR(100001,"创建用户信息失败");
		
		private Integer key;
		private String message;
		
		private UserExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}
		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
	
	/**
	 * 
	 * 作者:唐鹏
	 * 描述:商户异常枚举封装
	 * 创建时间:2017年9月29日上午11:34:02
	 */
	public enum MerchantExceptionEnum implements BaseEnum<Integer>{
		MERCHANT_CREATE_FAILE(200001,"商户创建失败");

		
		private Integer key;
		private String message;
		
		private MerchantExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
	
	/**
	 * 
	 * 作者:唐鹏
	 * 描述:订单异常枚举
	 * 创建时间:2017年9月29日上午11:36:31
	 */
	public enum OrderExceptionEnum implements BaseEnum<Integer>{
		ORDER_CREATE_FALILE(300001,"订单创建错误");

		private Integer key;
		private String message;
		
		private OrderExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
	
	/**
	 * 
	 * 作者:唐鹏
	 * 描述:支付异常枚举
	 * 创建时间:2017年9月29日上午11:38:45
	 */
	public enum PayExceptionEnum implements BaseEnum<Integer>{
		PAY_CREATE_FALIE(400001,"支付信息创建失败");

		private Integer key;
		private String message;
		
		private PayExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}
		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
	
	/**
	 * 作者:唐鹏
	 * 描述: 文件服务模块异常枚举
	 * 创建时间:2017年9月29日上午11:41:33
	 */
	public enum FileExceptionEnum implements BaseEnum<Integer>{
		FILE_CREATE_ERROR(500001,"文件信息创建失败"),
		FILE_dELETE_ERR0R(500002,"文件信息删除失败");

		private Integer key;
		private String message;
		private FileExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
	
	/**
	 * 
	 * 作者:唐鹏
	 * 描述:外接板块异常枚举
	 * 创建时间:2017年9月29日上午11:44:27
	 */
	public enum ExternalExceptionEnum implements BaseEnum<Integer>{
		EXTERNAL_CREATE_ERROR(600001,"第三方调用失败"),
		EXTERNAL_SEND_WEIXI_TEMPLATE_NMESSAGE_ERROR(600002,"发送微信模板消息失败"),
		EXTERNAL_SEND_WEIXI_MASS_NMESSAGE_ERROR(600003,"发送微信群发消息失败"),
		EXTERNAL_WEIXIN_TOOLS_ERROR(600004,"调用微信工具服务失败"),
		EXTERNAL_SEND_SMS_ERROR(600005,"使用短信服务失败"),
		EXTERNAL_SEND_MAIL_ERROR(600006,"调用邮件服务失败"),
		EXTERNAL_MAP_SERVER_ERROR(600007,"调用地图服务失败");
		private Integer key;
		private String message;
		private ExternalExceptionEnum(Integer key, String message) {
			this.key = key;
			this.message = message;
		}
		@Override
		public Integer getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return this.message;
		}
		public String toString() {
			return "[key="+key+",title="+message+"]";
		}
	}
}
