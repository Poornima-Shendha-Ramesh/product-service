package org.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class ProductExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ProductsException.class)
   public ResponseEntity<String> handleProductException(ProductsException pe){
        return new ResponseEntity<>(pe.getMessage(),HttpStatus.BAD_REQUEST);

   }

}
