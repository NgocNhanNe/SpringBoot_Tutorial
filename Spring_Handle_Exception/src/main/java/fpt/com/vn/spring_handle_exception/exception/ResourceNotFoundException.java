package fpt.com.vn.spring_handle_exception.exception;

public class ResourceNotFoundException extends RuntimeException{

    private String resourceName;

    public ResourceNotFoundException(String resourceName) {
        super();
        this.resourceName = resourceName;
    }
    public ResourceNotFoundException() {
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
