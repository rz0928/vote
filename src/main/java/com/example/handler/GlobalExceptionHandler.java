package com.example.handler;

import com.example.Exception.SystemException;
import com.example.utils.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SystemException.class)
    public ResponseResult systemExceptionHandler(SystemException e){
        return ResponseResult.errorResult(e.getCode(),e.getMessage());
    }
}
