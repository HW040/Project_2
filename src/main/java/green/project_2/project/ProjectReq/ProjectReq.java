package green.project_2.project.ProjectReq;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
//2
@Getter
@Setter
public class ProjectReq {

    private String title;                // 프로젝트명
    private Long signedUserNo;          // 작성자 사용자 번호
    private String description;         // 프로젝트 설명
    private List<Long> memberList;  // 프로젝트 멤버 리스트
    private String startAt;             // 프로젝트 시작일
    private String deadLine;
}
