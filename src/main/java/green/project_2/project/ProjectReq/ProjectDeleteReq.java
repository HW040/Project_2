package green.project_2.project.ProjectReq;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDeleteReq {
    private Long signedUserNo;  // 삭제 요청을 보내는 사용자 번호
    private Long projectNo;     // 삭제할 프로젝트 번호2
}
