package com.mgmetehan.validationexceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorStatusCode {
    UNEXPECTED_EXCEPTION(500, "%s", false, HttpStatus.INTERNAL_SERVER_ERROR),
    NAME_WRONG_FORMAT(100, "Name format is not include any number or symbol", false, HttpStatus.BAD_REQUEST);

    private final int value;
    private final String description;
    private final boolean isRepeatable;
    private final HttpStatus httpStatus;

    public static ErrorStatusCode getByValue(int value) {
        for (ErrorStatusCode status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid status code: " + value);
    }
}