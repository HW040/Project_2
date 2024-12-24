package green.project_2.User;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    //프로젝트 번호로 리더 번호 가져오기
    long leaderNo(long projectNo);

    // 닉네임으로 사용자 조회
    User selectUserByNickname(String nickname);

    // 유저의 일정 유무 확인
    boolean isUserHaveSchedule(long userNo);

}
