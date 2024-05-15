package com.justin.Log;

// 抽象处理者：日志处理器接口
 interface LogHandler {
    void setNext(LogHandler handler);
    void logMessage(String message, LogLevel level);
}

// 枚举日志级别
 enum LogLevel {
    DEBUG, INFO, WARNING, ERROR
}

// 具体处理者：Debug日志处理器
 class DebugLogHandler implements LogHandler {
    private LogHandler next;

    @Override
    public void setNext(LogHandler handler) {
        this.next = handler;
    }

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (next != null) {
            next.logMessage(message, level);
        }
    }
}

// 具体处理者：Info日志处理器
 class InfoLogHandler implements LogHandler {
    private LogHandler next;

    @Override
    public void setNext(LogHandler handler) {
        this.next = handler;
    }

    @Override
    public void logMessage(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (next != null) {
            next.logMessage(message, level);
        }
    }
}

// 其他具体处理者（如WarningLogHandler, ErrorLogHandler）类似实现...

// 使用示例
public class Main {
    public static void main(String[] args) {
        // 创建处理器链
        LogHandler debugHandler = new DebugLogHandler();
        LogHandler infoHandler = new InfoLogHandler();
        // 注意：构建链时，需要逆向设置下一个处理器
        debugHandler.setNext(infoHandler);

        // 发送日志消息
        debugHandler.logMessage("This is a debug message", LogLevel.DEBUG);
        debugHandler.logMessage("This is an info message", LogLevel.INFO);
    }
}
