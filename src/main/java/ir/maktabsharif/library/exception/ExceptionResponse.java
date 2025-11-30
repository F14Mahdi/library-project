package ir.maktabsharif.library.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ExceptionResponse {
    private int status;
    private String massage;
    private String path;
    private String timeStamp;
    private String error;

}
