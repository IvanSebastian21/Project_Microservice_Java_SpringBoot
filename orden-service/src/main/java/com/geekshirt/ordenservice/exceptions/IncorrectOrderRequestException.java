package com.geekshirt.ordenservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class IncorrectOrderRequestException extends RuntimeException {
    public IncorrectOrderRequestException(String message) {
        super(message);
    }

}
