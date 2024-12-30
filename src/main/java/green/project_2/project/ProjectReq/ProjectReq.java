package green.project_2.project.ProjectReq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
//2
@Getter
@Setter
@Schema(title="프로젝트 생성")
public class ProjectReq {
    @Schema(description = "프로젝트명", requiredMode=Schema.RequiredMode.REQUIRED)
    private String title;// 프로젝트명
    @Schema(description = "로그인 유저 PK", requiredMode=Schema.RequiredMode.REQUIRED)
    private Long signedUserNo;          // 작성자 사용자 번호
    @Schema(description = "프로젝트 상세내용", requiredMode=Schema.RequiredMode.REQUIRED)
    private String description;         // 프로젝트 설명
    @Schema(description = "참여중인 멤버 리스트",requiredMode=Schema.RequiredMode.REQUIRED)
    private List<Long> memberList;  // 프로젝트 멤버 리스트
    @Schema(description = "프로젝트 시작일", requiredMode=Schema.RequiredMode.REQUIRED)
    private String startAt;             // 프로젝트 시작일
    @Schema(description = "프로젝트 종료일",requiredMode=Schema.RequiredMode.REQUIRED)
    private String deadLine; // 프로젝트 종료일
}
