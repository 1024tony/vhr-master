package org.javaboy.vhr.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Integer id;

    @ExcelProperty("员工姓名")
    private String name;
    @ExcelProperty("性别")
    private String gender;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("出生日期")
    private Date birthday;
    @ExcelProperty("身份证号")
    private String idCard;
    @ExcelProperty("婚姻状况")
    private String wedlock;
    @ExcelIgnore
    private Integer nationId;
    @ExcelProperty("籍贯")
    private String nativePlace;
    @ExcelIgnore
    private Integer politicId;
    @ExcelProperty("邮箱")
    private String email;
    @ExcelProperty("电话号码")
    private String phone;
    @ExcelProperty("联系地址")
    private String address;
    @ExcelIgnore
    private Integer departmentId;
    @ExcelIgnore
    private Integer jobLevelId;
    @ExcelIgnore
    private Integer posId;
    @ExcelProperty("聘用形式")
    private String engageForm;
    @ExcelProperty("最高学历")
    private String tiptopDegree;
    @ExcelProperty("所属专业")
    private String specialty;
    @ExcelProperty("毕业院校")
    private String school;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("入职日期")
    private Date beginDate;
    @ExcelProperty("在职状态")
    private String workState;
    @ExcelProperty("工号")
    private String workID;
    @ExcelProperty("合同期限")
    private Double contractTerm;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("转正日期")
    private Date conversionTime;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("离职日期")
    private Date notWorkDate;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("合同起始日期")
    private Date beginContract;
    @DateTimeFormat("yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    @ExcelProperty("合同终止日期")
    private Date endContract;
    @ExcelProperty("工龄")
    private Integer workAge;

    @ExcelIgnore
    private Nation nation;
    @ExcelIgnore
    private Politicsstatus politicsstatus;
    @ExcelIgnore
    private Department department;
    @ExcelIgnore
    private JobLevel jobLevel;
    @ExcelIgnore
    private Position position;

}