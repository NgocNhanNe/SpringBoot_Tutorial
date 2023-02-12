package fpt.com.vn.spring_handle_exception.exception;

public class MyNullPointerException extends RuntimeException{
    private String errorMessage;
    private String errorMessageDebug;
    private String fieldName;


    public MyNullPointerException(String errorMessage, String errorMessageDebug, String fieldName) {
        super();
        this.errorMessage = errorMessage;
        this.errorMessageDebug = errorMessageDebug;
        this.fieldName = fieldName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessageDebug() {
        return errorMessageDebug;
    }

    public void setErrorMessageDebug(String errorMessageDebug) {
        this.errorMessageDebug = errorMessageDebug;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
