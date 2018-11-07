package com.ligoo.config;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

public class MyCommentGenerator extends DefaultCommentGenerator {
    private boolean suppressAllComments;

    private boolean addRemarkComments;

    /**
     * 设置用户配置参数
     * */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        //获取suppressAllComments 参数值
        suppressAllComments = isTrue(properties.getProperty(
                PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS
        ));
        //获取addRemarksComments 参数值
        addRemarkComments = isTrue(properties.getProperty(
                PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS
        ));
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 如果阻止生成注释,直接返回
        if (suppressAllComments)
            return;
        //文档注释开始
        field.addJavaDocLine("/**");
        //获取数据库字段的备注信息
        String remarks = introspectedColumn.getRemarks();
        //根据参数与备注信息判断是否添加备注信息
        if(addRemarkComments && StringUtility.stringHasValue(remarks)){
            String[] remarkLines = remarks.split(
                    System.getProperty("line.separator")
            );
            for (String remarkLine: remarkLines){
                field.addJavaDocLine(" * " + remarkLine);
            }
        }
        field.addJavaDocLine(" * " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(" */");
    }
}
