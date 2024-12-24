package green.project_2.User;

import green.project_2.common.ResponseResult;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse<T> extends ResponseResult {
    private long userNo;
    private String nickname;
    private String pic;
    private T existSchedule;


    public UserResponse(String code, Long userNo, String nickname, String pic, T existSchedule) {
        super(code);
        this.userNo = userNo;
        this.nickname = nickname;
        this.pic = pic;
        this.existSchedule =existSchedule;
    }
}
