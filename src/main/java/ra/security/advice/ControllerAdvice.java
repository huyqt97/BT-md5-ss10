package ra.security.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ra.security.exception.LoginException;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(LoginException.class)
    public ResponseEntity<String> loginFail(LoginException loginException){
        return new ResponseEntity<>(loginException.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
