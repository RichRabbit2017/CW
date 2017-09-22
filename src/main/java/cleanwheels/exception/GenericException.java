package cleanwheels.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GenericException {

    @ExceptionHandler(CleanWheelsException.class)
    public ResponseEntity<ExceptionResponse> resourceNotFound(CleanWheelsException ex) {
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode(((CleanWheelsException)ex).getErrorCode());
        response.setErrorMessage(ex.getMessage());

        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
    }
}
