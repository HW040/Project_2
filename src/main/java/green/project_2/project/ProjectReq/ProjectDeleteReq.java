package green.project_2.project.ProjectReq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDeleteReq {
    @Schema(description = "로그인한 유저PK",requiredMode = Schema.RequiredMode.REQUIRED)
    private Long signedUserNo;  // 삭제 요청을 보내는 사용자 번호
    @Schema(description = "삭제 할 프로젝트PK",requiredMode = Schema.RequiredMode.REQUIRED)
    private Long projectNo;     // 삭제할 프로젝트 번호2
}
