package com.fxq.controller;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.fxq.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExportExcelController {

    @RequestMapping("/export")
    public void export(HttpServletResponse response){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setName("大犇"+i);
            employee.setGender("男");
            employee.setBirthday(new Date());
            employees.add(employee);
        }
        ExcelWriter writer = ExcelUtil.getWriter();
        writer.addHeaderAlias("name","姓名");
        writer.addHeaderAlias("gender","性别");
        writer.addHeaderAlias("birthday","生日");
        writer.merge(2,"员工信息");
        writer.write(employees,true);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        String name = "employee";
        response.setHeader("Content-Disposition","attachment;filename="+name+".xls");
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
            writer.flush(out,true);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }
        IoUtil.close(out);
    }
}
