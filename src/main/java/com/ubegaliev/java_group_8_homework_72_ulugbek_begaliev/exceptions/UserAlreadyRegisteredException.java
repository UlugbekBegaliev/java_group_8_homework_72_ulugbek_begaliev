package com.ubegaliev.java_group_8_homework_72_ulugbek_begaliev.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class UserAlreadyRegisteredException extends RuntimeException {

}
