package green.project_2.project.ProjectRes;

import green.project_2.common.ResponseResult;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse extends ResponseResult {
    private long userNo;
    private String nickname;
    private String pic;


    public UserResponse(String code, Long userNo, String nickname, String pic) {
        super(code);
        this.userNo = userNo;
        this.nickname = nickname;
        this.pic = pic;
    }

}
