package com.movies.tMovies.handler;


import com.movies.tMovies.exception.ErrorDetails;
import com.movies.tMovies.exception.GetBadRequestException;
import com.movies.tMovies.exception.GetForbiddenException;
import com.movies.tMovies.exception.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDetails> notDataFound(NotFoundException exception){
     var errorDetails = new ErrorDetails(exception.getStackTrace().toString(),exception.getStatus(), LocalDate.now());
     return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    

    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(GetBadRequestException.class)
    public ResponseEntity<ErrorDetails> getBadRequest(GetBadRequestException exception){
        var errorDetails = new ErrorDetails(exception.getStackTrace().toString(), exception.getStatus(), LocalDate.now());
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(GetForbiddenException.class)
    public ResponseEntity<ErrorDetails> getForbiddenRequest(GetForbiddenException exception){
        var errorDetails = new ErrorDetails(exception.getStackTrace().toString(),exception.getStatus(), LocalDate.now());
        return new ResponseEntity<>(errorDetails, HttpStatus.FORBIDDEN);
    }
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Map<String, String> handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error) -> {
//            String fieldName = ((FieldError) error).getField();
//            String errorMessage = error.getDefaultMessage();
//            errors.put(fieldName, errorMessage);
//        });
//        return errors;
//    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDetails> notDataFound(RuntimeException exception){
        var errorDetails = new ErrorDetails(exception.getStackTrace().toString(), HttpStatus.NOT_FOUND, LocalDate.now());
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

        @ExceptionHandler(Exception.class)
        public ResponseEntity<ErrorDetails> notDataFound(Exception exception){
            var errorDetails = new ErrorDetails(exception.getStackTrace().toString(), HttpStatus.NOT_FOUND, LocalDate.now());
            return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
        }
    }
