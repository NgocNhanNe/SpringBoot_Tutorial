package fpt.com.vn.spring_handle_exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFound(ResourceNotFoundException e){
        ApiError apiError = new ApiError();
        apiError.setMessage("Message: "+ e.getMessage()+e.getResourceName());
        apiError.setStatus(HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));

        return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
