package com.py890000.cloud.core.exception;

/**
 * 幂等性异常
 *
 * @author py890000
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
