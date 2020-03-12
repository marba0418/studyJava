 # 강의 내용
 
 ## 3월 11일 수(날씨 좋음)

- TEST
- SQL STRUCTURED QUERY LANGUAGE
  - 관계형 데이터베이스에서 데이터를 조회하거나 조작하기 위해 사용하는 표준검색 언어

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

[PRIMARY KEY]

-테이블에서 한 행의 정보를 구분하기 위한 고유 식별자(IDENTIFIER)의 역할

-NOT NULL과 UNIQUE의 의미 둘 다 가지고 있음



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

3월 12일 목 

*AS는 복사라는 의미 뒤에 SELECT 옴

[OBJECT]

-자바랑 비슷

-4~5개 정도 배움

[VIEW]

-SELECT 쿼리 실행 결과를 화면에 저장한 논리적인 가상 테이블

-원본 테이블에 링크 개념으로 들어가 있음

-VIEW 생성 권한

-관리자 계정 접속후 (ADMIN) GRANT CREATE VIEW TO KH;

-VIEW 만드는 방법

-CREATE VIEW EMP_VIEW AS SELECT 컬럼들 FROM 테이블;

-뷰는 컬럼 값을 참조  링크로 가져온 것임(이경우 업데이트시 자료 반영 됨)

-복사는 복사해서 가져오는 것(업데이트시 자료 반영 안됨, 단순히 복사만 한 것임)

-왜 쓸까? 선택된 정보만 사용자에게 보여주기 위해, 사용자 접근시 테이블에 접근하지 않고 선택된 정보만 볼 수 있게 하려고

-(일부 제한된 정보만 주게 하려고)

-GRANT SELECT ON kh.EMP_VIEW TO test01; 조회할 수 있는 권한을 부여한다. EMP 접근 권한 아님 뷰에만 접근 권한 줌

- test01에서 SELECT* FROM kh.EMP_VIEW; 입력

-뷰에서 DML명령어 조작이 안되는 경우

-가공된 데이터들은 조작이 불가능

-즉 뷰의 컬럼과 테이블의 컬럼이 직접적으로 연관된 경우에만 사용이 가능

(VIEW 옵션)

-CREATE OR REPLACE: 생성된 뷰가 없으면 새로 만들고 이미 만들어져 있으면 바꿔짐(대신 이전 데이터는 사라짐)

-FORCE :테이블 없어도 뷰는 만들어짐 (나중에 테이블 만들면 자동으로 연결됨) 실제로 거의 안쓰임

-WITH CHECK OPTION 옵션을 설정한 컬럼의 값은 수정 안됨(하나의 컬럼만 가능)

-WITH READ ONLY:조회만 가능 (범위: 뷰 전체,CHECK는 컬럼만)

[SEQUENCE] 우리도 많이 씀

-자동 번호 발생기 역할을 한다고 생각하면 됨

- 순차적으로 정수 값을 자동으로 생성하는 객체로 ,자동 번호 발생기 역할 당연히 기본값은 1

(표현)

CREATE SEQUENCE 시퀀스 이름

1) START WITH 숫자 : 처음 발생시킬 시작값(기본1)

2) [INCREMENT BY 숫자]: 다음 값에 대한 증가치 (기본1)

3) [MAXVALUE 숫자| NOMAXVALUE] :최대값 지정
