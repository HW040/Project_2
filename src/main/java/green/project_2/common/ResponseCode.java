package green.project_2.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {

    // 성공
    OK("OK"),

    // 공통 에러
    DATABASE_ERROR("DE"),
    NO_FORBIDDEN("NF"),
    SERVER_ERROR("SE"),
    FAIL("FAIL"),

    // 회원가입
    DUPLICATE_EMAIL("DPE"),
    DUPLICATE_NICKNAME("DPN"),
    PASSWORD_FORMAT_ERROR("PFE"),
    PASSWORD_CHECK_ERROR("PCE"),

    // 로그인
    INCORRECT_EMAIL("IE"),
    INCORRECT_PASSWORD("IP"),

    // 조건에 맞는 유저 없음
    NO_EXIST_USER("NEU"),

    //필수 사항 미기재
    NOT_NULL("NN");

    private final String code;
}
