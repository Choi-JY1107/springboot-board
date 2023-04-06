# springboot 게시판 클론코딩
[참고하는 강의](https://www.youtube.com/playlist?list=PLV9zd3otBRt7jmXvwCkmvJ8dH5tR_20c0)
## 개발환경
- IDE: IntelliJ IDEA Community
- Spring Boot 2.6.13
- JDK 11
- mysql
- Spring Data JPA
- Thymeleaf
## 주요 기능
- 글 쓰기 `/board/save` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L29-L35)
- 전체 글 목록 `/board/` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L37-L43)
- 한개 글 조회 `/board/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L45-L55)
- 글 수정 `/board/update/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L64-L72)
- 글 삭제 `/board/delete/{id}` [Code](https://github.com/Choi-JY1107/springboot-board/blob/main/src/main/java/com/example/boardClone/board/controller/BoardController.java#L74-L78)

## 추가, 개선할 점
- [ ] 글 삭제 시, 글 작성 시 입력한 비밀번호를 작성해야 삭제할 수 있는 인증 기능
- [ ] 글 전체 삭제 기능