package ir.maktabsharif.library.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(LibraryException.class)
    public ResponseEntity<ExceptionResponse> handelLibraryException(LibraryException e, HttpServletRequest request) {

        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setMassage(e.getMessage());
        exceptionResponse.setPath(request.getRequestURI());
        exceptionResponse.setStatus(500);
        exceptionResponse.setTimeStamp(Instant.now().toString());
        exceptionResponse.setError(HttpStatus.BAD_REQUEST.toString());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
    }

}
