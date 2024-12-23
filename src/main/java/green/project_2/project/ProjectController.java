package green.project_2.project;

import green.project_2.User.UserMapper;
import green.project_2.common.ResponseResult;
import green.project_2.project.ProjectReq.ProjectDeleteReq;
import green.project_2.project.ProjectReq.ProjectReq;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/project")
@RequiredArgsConstructor  // Lombok 어노테이션을 사용해 final 필드들의 생성자 주입 처리
public class ProjectController {
    private final UserMapper userMapper;
    private final ProjectService projectService;

    // 프로젝트 생성
    @PostMapping  // "/api/project/project" 경로에 해당2
    public ResponseResult createProject(@RequestBody ProjectReq request) {
        log.info("프로젝트 생성 요청: {}", request);

        return projectService.createProject(request);
    }


    // 실제 프로젝트 삭제 로직
    @DeleteMapping // 프로젝트 번호를 경로에 포함시켜서 삭제
    private ResponseResult deleteProject(@ParameterObject ProjectDeleteReq request) {
        log.info("프로젝트 삭제 중, 프로젝트 번호: {}", request.getProjectNo());

        // 삭제할 프로젝트가 존재하는지 확인 (예시: DB에서 프로젝트 삭제)
        ResponseResult result = projectService.deleteProject(request); // 서비스에서 실제 삭제 처리하는 로직

        // 프로젝트 삭제 성공 메시지 반환
        log.info("프로젝트 삭제 성공: {}", request.getProjectNo());
        return result;
    }
}
