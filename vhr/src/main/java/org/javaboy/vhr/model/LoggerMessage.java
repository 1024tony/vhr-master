package org.javaboy.vhr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: gaoyang
 * @Date: 2020/6/8  17:32
 * @Description: 日志消息实体类
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class LoggerMessage {

    private String body;
    private String timestamp;
    private String threadName;
    private String className;
    private String level;
    private String exception;
    private String cause;

}
