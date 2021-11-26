package com.ct.common;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zym
 * @date 2021/11/25 16:28
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class Resp<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    @Setter
    private int code = ResultCode.SUCCESS;
    @Getter
    @Setter
    private String message = "success";
    @Getter
    @Setter
    private T data;
    @Getter
    @Setter
    private Object other;

    public Resp() {
        super();
    }

    public Resp(T data) {
        super();
        this.data = data;
    }

    public Resp(T data, String message) {
        super();
        this.data = data;
        this.message = message;
    }

    public Resp(Throwable e) {
        super();
        this.message = e.getMessage();
        this.code = ResultCode.ERROR;
    }

    public static <T> Resp ok(T data) {

        return Resp.builder().code(ResultCode.SUCCESS).data(data).build();
    }

    public static <T> Resp ok(T data, Object other) {
        return Resp.builder().code(ResultCode.SUCCESS).data(data).other(other).build();
    }

    public static Resp ok() {
        return ok(null);
    }

    public static <T> Resp<T> failed() {
        return restResult(null, ResultCode.ERROR, null);
    }

    public static <T> Resp<T> failed(String message) {
        return restResult(null, ResultCode.ERROR, message);
    }

    public static <T> Resp<T> failed(T data) {
        return restResult(data, ResultCode.ERROR, null);
    }

    public static <T> Resp<T> failed(T data, String message) {
        return restResult(data, ResultCode.ERROR, message);
    }

    public static Resp fail(int code, String message) {
        return Resp.builder().code(code).message(message).build();
    }

    private static <T> Resp<T> restResult(T data, int code, String message) {
        Resp<T> apiResult = new Resp<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMessage(message);
        return apiResult;
    }
}
