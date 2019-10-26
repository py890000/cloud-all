package com.py890000.cloud.core.exception;

/**
 * 业务异常
 *
 * @author py890000
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public BusinessException(String message) {
        super(message);
    }
}
