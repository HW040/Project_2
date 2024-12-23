package green.project_2.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //프로젝트 번호로 리더 번호 가져오기
    long leaderNo(long projectNo);

}
