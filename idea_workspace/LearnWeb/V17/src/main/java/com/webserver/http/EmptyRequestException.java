package com.webserver.http;

/**
 * 空请求异常
 * <p>
 * 当HttpRequest解析请求时发现此请求为空请求则会抛出该异常
 *
 * @Author Izaro
 * @Date 2021/2/20 10:18
 */
public class EmptyRequestException extends Exception{
    public EmptyRequestException() {
    }

    public EmptyRequestException(String message) {
        super(message);
    }

    public EmptyRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyRequestException(Throwable cause) {
        super(cause);
    }

    public EmptyRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
