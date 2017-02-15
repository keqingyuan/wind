package org.qingyuan.wind.bean.stock;
import org.hsweb.web.bean.po.GenericPo;
/**
* 股票
* Created by hsweb-generator 2017-1-2 15:44:05
*/
public class Stock extends GenericPo<String>{
  		//系统内部码
        private String code;
  		//股票代码
        private String secName;
  		//发行日期
        private java.util.Date ipoDate;
  		//交易城市
        private String exchCity;
  		//股票状态
        private String secStatus;
  		//更新日期
        private java.util.Date updataDate;
  		//MA日期
        private java.util.Date maDate;

        /**
        * 获取 系统内部码
        * @return String 系统内部码
        */
        public String getCode(){
			return this.code;
        }

        /**
        * 设置 系统内部码
        */
        public void setCode(String code){
        	this.code=code;
        }
        /**
        * 获取 股票代码
        * @return String 股票代码
        */
        public String getSecName(){
			return this.secName;
        }

        /**
        * 设置 股票代码
        */
        public void setSecName(String secName){
        	this.secName=secName;
        }
        /**
        * 获取 发行日期
        * @return java.util.Date 发行日期
        */
        public java.util.Date getIpoDate(){
			return this.ipoDate;
        }

        /**
        * 设置 发行日期
        */
        public void setIpoDate(java.util.Date ipoDate){
        	this.ipoDate=ipoDate;
        }
        /**
        * 获取 交易城市
        * @return String 交易城市
        */
        public String getExchCity(){
			return this.exchCity;
        }

        /**
        * 设置 交易城市
        */
        public void setExchCity(String exchCity){
        	this.exchCity=exchCity;
        }
        /**
        * 获取 股票状态
        * @return String 股票状态
        */
        public String getSecStatus(){
			return this.secStatus;
        }

        /**
        * 设置 股票状态
        */
        public void setSecStatus(String secStatus){
        	this.secStatus=secStatus;
        }
        /**
        * 获取 更新日期
        * @return java.util.Date 更新日期
        */
        public java.util.Date getUpdataDate(){
			return this.updataDate;
        }

        /**
        * 设置 更新日期
        */
        public void setUpdataDate(java.util.Date updataDate){
        	this.updataDate=updataDate;
        }
        /**
        * 获取 MA日期
        * @return java.util.Date MA日期
        */
        public java.util.Date getMaDate(){
			return this.maDate;
        }

        /**
        * 设置 MA日期
        */
        public void setMaDate(java.util.Date maDate){
        	this.maDate=maDate;
        }
      
      public interface Property extends GenericPo.Property{
                //系统内部码
                 String code="code";
                //股票代码
                 String secName="secName";
                //发行日期
                 String ipoDate="ipoDate";
                //交易城市
                 String exchCity="exchCity";
                //股票状态
                 String secStatus="secStatus";
                //更新日期
                 String updataDate="updataDate";
                //MA日期
                 String maDate="maDate";
    	}
}