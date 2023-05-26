# springboot 게시판 클론코딩
[강의](https://www.youtube.com/playlist?list=PLV9zd3otBRt7jmXvwCkmvJ8dH5tR_20c0)

[강의 깃허브](https://github.com/codingrecipe1/board)
## 개발환경
- IDE: IntelliJ IDEA Community
- Spring Boot 2.6.13
- JDK 11
- mysql
- Spring Data JPA
- Thymeleaf
## 기본 구조
![](https://gmlwjd9405.github.io/images/spring-framework/spring-package-flow.png)
## 주요 기능
1. 글 쓰기 `/board/save` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L29-L35)
2. 전체 글 목록 `/board/` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L37-L43)
3. 한개 글 조회 `/board/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L45-L55)
4. 글 수정 `/board/update/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L64-L72)
5. 글 삭제 `/board/delete/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L74-L78)
6. 페이징 처리 `/board/paging?page=?`
   - 한 페이지에 몇 개씩 보느냐에 따라서 페이지 개수 바뀜
   - `@PageableDefault(page = 1)`로 인해 기본 페이지는 1로 고정
7. 파일(이미지) 첨부하기
   - 단일 파일 첨부
   - 다중 파일 첨부
8. 댓글 처리하기
   - 글 상세 페이지에서 댓글 입력 (ajax)
   - 상세조회할 때 기존에 작성된 댓글 목록이 보임
   - 댓글 입력할 때 기존 댓글 목록에 새로 작성한 댓글 추가
   - 댓글용 테이블 필요



## 직접 해결할 점
- [ ] 글 삭제 시, 글 작성 시 입력한 비밀번호를 작성해야 삭제할 수 있는 인증 기능
- [ ] 글 전체 삭제 기능
- [ ] test 코드 작성하기(이건 나중에)
- [ ] 한 페이지 내에 보여지는 글 개수 유동적으로 바꾸는 기능
- [ ] 기능 분리 및 리팩토링
- [ ] 목록 기능과 페이징 기능 통합