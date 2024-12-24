package green.project_2.project;

import green.project_2.User.UserResponse;
import green.project_2.project.ProjectReq.ProjectReq;
import green.project_2.project.ProjectReq.ProjectUpReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {

    int createProject(ProjectReq project); // 프로젝트 생성
    int deleteProject(long pro); // 프로젝트 삭제

    // 프로젝트 수정
    int updateProject(ProjectUpReq request);

    int selectProject(long pro);

    UserResponse searchUser(String nickname);
}
