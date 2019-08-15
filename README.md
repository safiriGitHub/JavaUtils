# JavaUtils
Utils accumulated in java development

## Detail util

|--web

  |-- WebUtils：
		- 网络工具类
		-...
		
  |-- XmlUtils：
		- XML常用操作
		
  |-- RequestCheckUtils：
		- 请求参数检查（参考实现方式）
  |-- AtsUtils：
		- 异步API下载工具类
		- 解压gzip文件到指定的目录，目前只能解压gzip包里面只包含一个文件的压缩包
		- 解压zip文件到指定的目录
		- 通过HTTP GET方式下载文件到指定的目录
		- 检查指定文件的md5sum和指定的检验码是否一致
		- 把字节数组转换成十六进制的字符串
		- ...
  |-- AlipayEncrypt：
		- 加密解密工具
  |-- AlipaySignature:
		- 签名验签，加密解密（未使用，参考）
|--util
  |-- SaUtils: 
		- 返回32位纯数字字母组成的UUID
		- 取出指定cookie
		- 设置request、response编码格式为UTF-8，中文乱码问题
		- 清除字典中值为空的项
		- 获取本机的网络IP
  |-- StringUtils：
		- 检查指定的字符串是否为空
		- 判断所有字符串是否都不空
		- 检查对象是否为数字型字符串,包含负数开头的
		- 把通用字符编码的字符串转化为汉字编码
		- 过滤不可见字符
  |-- JDBCUtil:
		- 获取c3p0链接池及池中链接
		- 释放资源
  |-- PageBean:
		- 分页模型类
  |-- PropertiesUtil:
		- 加载指定资源到Properties单例（覆盖上一次加载内容）
		- 根据key获取property
		- 根据key获取property，若没有返回指定默认值
  |-- StreamUtil：
		- 流常用操作
  |-- FileUtils:
		- 获取文件的真实后缀名。目前只支持JPG, GIF, PNG, BMP四种图片文件
		- 获取文件的真实媒体类型。目前只支持JPG, GIF, PNG, BMP四种图片文件
  |-- AlipayHashMap：
		- 纯字符串字典结构
  |-- AlipayLogger：
		- 日志打印及记录（参考实现方式）
		
|--json
|--base64codec
  |--base64加解码
  
 ## Detail jars