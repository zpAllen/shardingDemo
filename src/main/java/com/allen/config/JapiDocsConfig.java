package com.allen.config;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

/**
 * @ClassName JapiDocsConfig
 * @Description: JapiDocs配置文件
 * @Author Administrator
 * @Date 2020/6/15 0015
 * @Version V1.0
 **/
public class JapiDocsConfig {

    /**
     * 运行主程序方法即可生成对应的接口文档
     * @param args
     */
    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("D:/GIT_ZP/shardingDemo"); // 项目根目录
        config.setProjectName("分库分表实践"); // 项目名称
        config.setApiVersion("V1.0");       // 声明该API的版本
        config.setDocsPath("D:/GIT_ZP/shardingDemo/apidocs"); // 生成API 文档所在目录
        config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
        Docs.buildHtmlDocs(config); // 执行生成文档
    }


}
