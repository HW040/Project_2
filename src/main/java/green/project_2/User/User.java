package green.project_2.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private long userNo;
    private String nickname;
    private String pic;
    private boolean isExistSchedule;  // 일정 유무
}
