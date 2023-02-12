package fpt.com.vn.spring_handle_exception.controller;

import fpt.com.vn.spring_handle_exception.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GlobalController {
    @Autowired
    private FileService fileService;

    @GetMapping("/open_file")
    public ResponseEntity<Object> openFile(@RequestParam("file_name") String fileName){
        return new ResponseEntity<Object>(fileService.openFile(fileName), HttpStatus.OK);
    }
}
