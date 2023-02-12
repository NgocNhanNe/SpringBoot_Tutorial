package fpt.com.vn.spring_handle_exception.controller;

import fpt.com.vn.spring_handle_exception.exception.ApiError;
import fpt.com.vn.spring_handle_exception.exception.MyNullPointerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LevelClassController {

    @GetMapping("/download-file")
    public ResponseEntity<Object> downloadFile(@RequestParam("file_name") String fileName){
        if(fileName == null || fileName.isEmpty()){
            throw new NullPointerException("file_name is null");
        }
        return new ResponseEntity<Object>(fileName, HttpStatus.OK);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> catchNullException(Exception e){
        ApiError apiError = new ApiError();
        apiError.setMessage(e.getMessage());
        apiError.setDebugMessage(e.getLocalizedMessage());
        apiError.setStatus(HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));

        return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/play-video")
    public ResponseEntity<Object> playVideo(@RequestParam("file_name") String fileName){
        if(fileName == null || fileName.isEmpty()){
            throw new MyNullPointerException("file_name is null","this is message debug","file_name");
        }
        return new ResponseEntity<Object>(fileName, HttpStatus.OK);
    }

    @ExceptionHandler(MyNullPointerException.class)
    public ResponseEntity<Object> catchCustomException(MyNullPointerException e){
        ApiError apiError = new ApiError();
        apiError.setMessage(e.getErrorMessage()+e.getErrorMessageDebug()+e.getFieldName());
        apiError.setDebugMessage(e.getLocalizedMessage());
        apiError.setStatus(HttpStatus.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));

        return new ResponseEntity<Object>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
