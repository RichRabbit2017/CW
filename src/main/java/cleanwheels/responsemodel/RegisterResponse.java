package cleanwheels.responsemodel;

/**
 * Created by sarvaraj.singh on 22-09-2017.
 */
public class RegisterResponse {
    String errorCode;
    String message;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
