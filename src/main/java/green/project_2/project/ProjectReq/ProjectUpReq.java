package green.project_2.project.ProjectReq;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

//2
@Getter
@Setter
public class ProjectUpReq {
        private String title;               // 프로젝트명
        private String description;         // 프로젝트 설명
        private String startAt;      // 프로젝트 시작일
        private String deadline;     // 프로젝트 종료일
        private long projectNo;      // 프로젝트 번호
        private List<Long> memberNoList; // 수정된 멤버 번호 리스트
        private long signedUserNo;   // 요청자 ID
       // 또는 적절한 데이터 타입

        // 'deadLine'의 getter 메서드 추가
        public String getDeadLine() {
                return deadline;
        }

        // 'deadLine'의 setter 메서드 추가
        public void setDeadLine(String deadLine) {
                this.deadline = deadLine;
        }


    }

