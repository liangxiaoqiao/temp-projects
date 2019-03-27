package com.demo;

import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.io.FileReader;
import java.nio.file.Paths;
/**
 * <dependencies>
 * <dependency>
 * <groupId>io.github.swagger2markup</groupId>
 * <artifactId>swagger2markup</artifactId>
 * <version>1.3.1</version>
 * </dependency>
 * </dependencies>
 *
 *
 * <repositories>
 * <repository>
 * <snapshots>
 * <enabled>true</enabled>
 * <updatePolicy>always</updatePolicy>
 * </snapshots>
 * <id>jcenter-releases</id>
 * <name>jcenter</name>
 * <url>http://jcenter.bintray.com</url>
 * </repository>
 * </repositories>
 */

/**
 * @author liangchao03
 * 2019/3/27
 */
public class SwaggerConverter {
    public static void main(String[] args) {
        try {
            generateMarkdownDocs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void generateMarkdownDocs() throws Exception {
        //    输出Markdown格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new FileReader("C:\\demo\\api-docs.json"))
                .withConfig(config)
                .build()
                .toFolder(Paths.get("C:\\demo\\test"));
    }
}