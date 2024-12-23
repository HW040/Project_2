package green.project_2.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//2
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseResult {
    @Schema(title = "응답 코드")
    private String code;
    // 응답 코드 "OK"
    @ResponseStatus(HttpStatus.OK)
    public static ResponseResult success() {
        return new ResponseResult(ResponseCode.OK.getCode());
    }

    // 응답 코드 커스텀
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static ResponseResult badRequest(ResponseCode code) {
        return new ResponseResult(code.getCode());
    }

    // 응답 코드 "SE"
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public static ResponseResult serverError() {
        return new ResponseResult(ResponseCode.SERVER_ERROR.getCode());
    }

    // 응답 코드 "DE"
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public static ResponseResult databaseError() {
        return new ResponseResult(ResponseCode.DATABASE_ERROR.getCode());
    }

    // 응답 코드 "NF"
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public static ResponseResult noPermission() {
        return new ResponseResult(ResponseCode.NO_FORBIDDEN.getCode());
    }
}
