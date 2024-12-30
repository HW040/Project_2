package green.project_2.project;

import green.project_2.common.ResponseResult;
import green.project_2.project.ProjectReq.ProjectDeleteReq;
import green.project_2.project.ProjectReq.ProjectReq;
import green.project_2.project.ProjectReq.ProjectUpReq;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/project")
@RequiredArgsConstructor  // Lombok 어노테이션을 사용해 final 필드들의 생성자 주입 처리
public class ProjectController {
    private final ProjectService projectService;


    // 프로젝트 생성
    @PostMapping
    @Operation(summary = "프로젝트 생성")
    public ResponseResult createProject(@RequestBody ProjectReq request) {
        log.info("프로젝트 생성 요청: {}", request);

        return projectService.createProject(request);
    }




    // 실제 프로젝트 삭제 로직
    @DeleteMapping // 프로젝트 번호를 경로에 포함시켜서 삭제
    @Operation(summary = "프로젝트 삭제")
    private ResponseResult deleteProject(@RequestBody ProjectDeleteReq request) {
        log.info("프로젝트 삭제 중, 프로젝트 번호: {}", request.getProjectNo());
        return projectService.deleteProject(request);
    }


    @PutMapping
    @Operation(summary = "프로젝트 수정")
    public ResponseResult updateProject(@RequestBody ProjectUpReq request) {

        // 수정 요청자 정보와 프로젝트 번호를 확인하여 수정 진행
        return projectService.updateProject(request);
    }


        // 유저 정보 닉네임으로 찾기
    @GetMapping("search-user")
    @Operation(summary = "프로젝트 구성원 검색",description = "구성원 정보 닉네임으로 검색")
    public ResponseResult searchUser(@ParameterObject String nickname) {
        return projectService.getSearchUser(nickname);
    }

}
