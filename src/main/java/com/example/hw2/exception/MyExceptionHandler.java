package com.example.hw2.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e){
        System.out.println("Exception :" + e);
        return e.getMessage();
    }
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandler(NullPointerException e){
        System.out.println("NullPointerException : " + e);
        return e.getMessage();
    }
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public  ResultBody bizExceptionHandler(HttpServletRequest req, MyException e){
        System.out.println(("MyException Happened, reason is : " + e.getErrorMsg()));
        return ResultBody.error(e.getErrorCode(),e.getErrorMsg());
    }
}
