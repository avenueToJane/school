/**
 * 
 */
package com.westlife.demo.common;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:30 
 * @version 1.0 
 * @parameter
 *
 */
public class GeneralException extends Exception {

    /**
     * 异常错误码
     * */
    private String errorCode;

    public GeneralException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public GeneralException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public GeneralException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public GeneralException(String errorCode, Throwable cause) {
        this(errorCode);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (errorCode != null && !errorCode.equals(message)) {
            return errorCode + " : " + message;
        } else {
            return message;
        }
    }

}
