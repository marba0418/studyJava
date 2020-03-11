 3월 11일 수(날씨 좋음)

[TEST]

[SQL STRUCTURED QUERY LANGUAGE]

-관계형 데이터베이스에서 데이터를 조회하거나 조작하기 위해 사용하는 표준검색 언어

[SQL 문법 종류]

[DDL (DATA DEFINITION LANGUAGE)]

-데이터 정의 할때 씀

-명령어는 CREATE,DROP,ALTER,TRUNCATE

[DML (DATA MANIPULATION LANGUAGE)]

-데이터 조회/ 데이터 조작 

-조회는 SELECT

-조작은 INSERT,UPDATE,DELETE

[DCL (DATA CONTROL LANGUAGE)]

-권한 설정

-명령어는  GRANT(부여),REVOKE(취소)

[TCL (TRANSATION CONTROL LANGUAGE)]

-TRANSATION연속적인 작업으로 구성되는 정보처리

-트랜잭션 제어

-명령어는 COMMMIT,ROLLBACK,SAVEPOINT


[제약조건 CONSTRAINT]

-사용자가 원하는 조건의 데이터만 유지하기 위해서 특정칼럼에 설정하는 제약

-데이터의 무결성을 지키기 위해 제한된 조건 

*무결성 DATA INTEGRITY(청렴) : 데이터의 정확성,일관성 유지,보증하는 것을 가리킨다.

-SUBQUERY :SELECT 안에 또 SELECT문장..!

-사용자 계정 생성을 나타내는 USER -> CREATE USER EXAM IDENTIFIED BY 1234;

-외래키 칼럼 뒤에 작성하는 방법 -> BOARD_WRITER VARCHAR(20) REFERENCES MEMBERS(MEMBER_ID)

[FOREIGN KEY]

-참조 무결성을 유지하기 위한 조건 

-만약 로그인시 멤버에서 값을 가져와야 한다면 멤버에서만 가져와야 한다. 이런 말을 참조 무결성이라고 한다.

-즉 , 데이터 신뢰도를 높인다고 생각하면 된다.

[DDL (Data Definition Language)]

-데이터 정의 언어 

-CREATE(객체를 만들고)

-ALTER(수정하고)-> CREATE로 정의된 내용을 수정할 때 사용

-DROP(삭제하는)

*TRUNCATE :해당 테이블을 전체 삭제

[DML(DATE MANIPULATION LANGUAGE)]

-실제로 많이 씀 

-데이터 조작 언어

-테이블에 값을 삽입,수정, 삭제 하는 역할

-INSERT(삽입): 테이블에 새로운 행을 추가

-UPDATE(수정): 테이블에 기록된 컬럼의 값을 수정하는 구문

-DELETE(삭제): (테이블) 행을 삭제하는 구문

-MERGE(합치기):(구조가 같은) 테이블을 하나로 합치는 기능

DELETE: 행 개수 감소 (꼭 WHERE 절 넣기)

[TCL TRANSCATION CONTROL LANGUAGE]

-트랜젝션 제어 언어

- 한꺼번에 수행되야하는 최소의 작업단위

-COMMIT -> 변경 내용을 저장

-ROLLBACK -> 최근 COMMIT 시점으로 이동

-SAVEPOINT -> 현재 트랜작업 시점의 이름을 지정(약간 임시저장이라고 생각하면 편함)

-굉장히 중요함

-후에 자바에서 TRANSCATION 으로 인해 클래스 하나 더 

-한꺼번에 수행되어야 할 최소 작업 단위

-작업이 한꺼번에 이루어져야 함 (그렇지 않은 경우 한꺼번에 취소되어야함)

-하나의 작업으로 보겠다.

-만약 과정 중 에러가 발생한다면? 하나의 덩어리로 보고 (작업단위로 보고) 취소처리,에러가 발생하지 않다면 완료처리

-SAVE POINT 임시저장 

-COMMIT은 저장해주는 개념으로 생각하면 됨 ROLLBACK은 가장 최근 COMMIT한 곳으로 데려가줌

-테이블에 DML구문이 동작했을때 TRANSCATION실행

-INSERT,UPDATE,DELETE,(SELECT때는 필요 없음 자료가 바뀌는 것이 아니니까)

-SAVAPOINT 임시 저장 시점을 잡음
