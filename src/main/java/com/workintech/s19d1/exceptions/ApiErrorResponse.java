package com.workintech.s19d1.exceptions;

public record ApiErrorResponse(int status,String message,long timestamp) {

}
