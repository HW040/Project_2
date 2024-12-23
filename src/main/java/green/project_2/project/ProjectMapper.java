package green.project_2.project;

import green.project_2.project.ProjectReq.ProjectReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {

    int createProject(ProjectReq project); // 프로젝트 생성
    int deleteProject(long pro); // 프로젝트 삭제

}
