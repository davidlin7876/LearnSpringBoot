package com.majiaxueyuan.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionAop {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public String runtimeException(RuntimeException runtimeException) {
		return runtimeException.getLocalizedMessage(); 
	}
}
