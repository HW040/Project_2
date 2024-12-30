package green.project_2.project.ProjectReq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ProjectUpReq {
        @Schema(description = "수정 할 프로젝트명",requiredMode = Schema.RequiredMode.REQUIRED)
        private String title;// 프로젝트명
        @Schema(description = "수정 할 내용",requiredMode = Schema.RequiredMode.REQUIRED)
        private String description;// 프로젝트 내용
        @Schema(description = "수정 할 프로젝트 시작일자",requiredMode = Schema.RequiredMode.REQUIRED)
        private String startAt;      // 프로젝트 시작일
        @Schema(description = "수정 할 프로젝트 종료일",requiredMode = Schema.RequiredMode.REQUIRED)
        private String deadLine;     // 프로젝트 종료일
        @Schema(description = "수정 할 프로젝트 PK",requiredMode = Schema.RequiredMode.REQUIRED)
        private long projectNo;      // 프로젝트 번호
        @Schema(description = "로그인 한 유저PK",requiredMode = Schema.RequiredMode.REQUIRED)
        private long signedUserNo;   // 요청자 ID
    }

