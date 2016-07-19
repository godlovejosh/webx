### Webx 3.2.x 之后风格发生了变化，对于非contribution element采用unqualifed风格，也就是无namespace前缀，使配置文件更易读。

It's just a demo.
See:<http://www.openwebx.org>

### 使用SpringExt Maven插件导出Schemas
<http://code.taobao.org/p/webx/wiki/springext_tools_guide/>

<http://www.openwebx.org/docs/springext-plugin.html>

### doc
<http://www.boyunjian.com/do/jarse/gadetail.do?group=com.alibaba.citrus&artifact=citrus-webx-all&keyword=citrus-webx-all>

### 如果 有遇到类似于这样的报错：`发现了以元素 'group' 开头的无效内容。应以 '{import, property-editor-registrar, group}' 之一开头` 说明 xmlns配置有问题，举例：
xmlns="http://www.alibaba.com/schema/services/form/validators"
### 这种写法是错误的，正确的写法如下：
xmlns:fm-validators="http://www.alibaba.com/schema/services/form/validators"

## 升级spring
### 排除掉webx内部依赖的spring3.2.7.RELEASE, 升级spring到3.2.17.RELEASE 没有问题
### 但是升级到4.0.0.RELEASE会报错