package com.fxq.code;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.io.File;
import java.util.Scanner;

/**
 * 自定义代码生成器
 */
public class CustomCodeGenerator {
    public static void main(String[] args) {
        //创建生成器
        AutoGenerator ag = new AutoGenerator();
        //编写配置
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //文件输出路径
        gc.setOutputDir(System.getProperty("user.dir")+"/pro-git/pro-mybatis-plus-generator/src/main/java/generator");
        //作者
        gc.setAuthor("fangxiaoqiang");
        //是否打开文件资源管理器
        gc.setOpen(false);
        //去掉service的I前缀
        gc.setServiceName("%sService");
        //设置id生成策略
        gc.setIdType(IdType.ASSIGN_ID);
        //设置日期
        gc.setDateType(DateType.ONLY_DATE);
        ag.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/custom?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUsername("root")
                .setPassword("root")
                .setDbType(DbType.MYSQL);
        ag.setDataSource(dsc);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(inputModuleName())
                .setEntity("entity")
                .setController("controller")
                .setMapper("mapper")
                .setService("service")
                .setParent("com.fxq");
        ag.setPackageInfo(pc);

        //策略配置
        StrategyConfig sc = new StrategyConfig();
        sc.setInclude("car");
        sc.setNaming(NamingStrategy.underline_to_camel);
        sc.setColumnNaming(NamingStrategy.underline_to_camel);
        sc.setEntityLombokModel(true);
        ag.setStrategy(sc);
        //设置模板
        ag.setTemplateEngine(new FreemarkerTemplateEngine());
        ag.execute();
    }

    private static String inputModuleName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入模块名称：");
        return sc.next();
    }
}
