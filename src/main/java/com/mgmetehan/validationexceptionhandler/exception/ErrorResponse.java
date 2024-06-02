package com.mgmetehan.validationexceptionhandler.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {
    private List<String> errorDetails;
    private String message;
    private int statusCode;
    private String statusMessage;
}
