package fpt.com.vn.spring_handle_exception.service;

import fpt.com.vn.spring_handle_exception.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FileService {
    public String openFile(String fileName){
        if(fileName==null|| (fileName != null && !fileName.equals("abc.txt"))){
            throw new ResourceNotFoundException("abc.txt");
        }
        return fileName;
    }
}
