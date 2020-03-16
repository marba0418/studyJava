 # 강의 내용
 
 ## 3월 11일 수(날씨 좋음)

- TEST
- SQL STRUCTURED QUERY LANGUAGE
  - 관계형 데이터베이스에서 데이터를 조회하거나 조작하기 위해 사용하는 표준검색 언어

- SQL 문법 종류
- DDL (DATA DEFINITION LANGUAGE)
  - 데이터 정의 할때 씀
  - 명령어는 CREATE,DROP,ALTER,TRUNCATE
- DML (DATA MANIPULATION LANGUAGE)
  - 데이터 조회/ 데이터 조작 
  - 조회는 SELECT
  - 조작은 INSERT,UPDATE,DELETE
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

## 3월 12일 목(날씨 좋음)


*AS는 복사라는 의미 뒤에 SELECT 옴

 - SELECT연산자 
  - 비교연산자
  - = 같다
  -  '>', < 크다/작다
  -  '>=', =< 크거나 같다/작거나 같다
  -  <> , !=, ^= 같지 않다.
  - BETWEEN AND 특정 범위에 포함되는지 비교
  - LIKE/ NOT LIKE 문자 패턴 비교
  - IS NULL/ IN NOT NULL NULL여부 비교
  - IN/ NOT IN 비교값 목록에 포함/미포함 여부 

 - OBJECT
  - 자바랑 비슷
  - 4~5개 정도 배움

 - VIEW
  - SELECT 쿼리 실행 결과를 화면에 저장한 논리적인 가상 테이블
  - 원본 테이블에 링크 개념으로 들어가 있음
 - VIEW 생성 권한
  - 관리자 계정 접속후 (ADMIN) GRANT CREATE VIEW TO KH;
 - VIEW 만드는 방법
  - CREATE VIEW EMP_VIEW AS SELECT 컬럼들 FROM 테이블;
 - VIEW는 컬럼 값을 참조링크로 가져온 것임(이경우 업데이트시 자료 반영 됨)
  - 복사는 복사해서 가져오는 것(업데이트시 자료 반영 안됨, 단순히 복사만 한 것임)
  - 왜 쓸까? 선택된 정보만 사용자에게 보여주기 위해, 사용자 접근시 테이블에 접근하지 않고 선택된 정보만 볼 수 있게 하려고
  - (일부 제한된 정보만 주게 하려고)
 - GRANT SELECT ON kh.EMP_VIEW TO test01; 조회할 수 있는 권한을 부여한다. EMP 접근 권한 아님 뷰에만 접근 권한 줌
  - test01에서 SELECT* FROM kh.EMP_VIEW; 입력
 - VIEW에서 DML명령어 조작이 안되는 경우
  - 가공된 데이터들은 조작이 불가능
  - 즉 VIEW의 컬럼과 테이블의 컬럼이 직접적으로 연관된 경우에만 사용이 가능
 - VIEW 옵션
  - CREATE OR REPLACE: 생성된 뷰가 없으면 새로 만들고 이미 만들어져 있으면 바꿔짐(대신 이전 데이터는 사라짐)
  - FORCE :테이블 없어도 뷰는 만들어짐 (나중에 테이블 만들면 자동으로 연결됨) 실제로 거의 안쓰임
  - WITH CHECK OPTION 옵션을 설정한 컬럼의 값은 수정 안됨(하나의 컬럼만 가능)
  - WITH READ ONLY:조회만 가능 (범위: 뷰 전체,CHECK는 컬럼만)
 - SEQUENCE 우리도 많이 씀
  - 자동 번호 발생기 역할을 한다고 생각하면 됨
  - 순차적으로 정수 값을 자동으로 생성하는 객체로 ,자동 번호 발생기 역할 당연히 기본값은 1
 - 표현
  - CREATE SEQUENCE 시퀀스 이름
  - 1) START WITH 숫자 : 처음 발생시킬 시작값(기본1)
  - 2) INCREMENT BY 숫자: 다음 값에 대한 증가치 (기본1)
  - 3) MAXVALUE 숫자| NOMAXVALUE :최대값 지정
  - 4) MINVALUE 숫자| NOMINVALUE :최소값 지정
  - 5) CYCLE| NOCYCLE :SEQUENCE 최대값 도달시 CYCLE은 START WITH값으로 되돌아가고 NOCYCLE은 에러
  - 6) CACHE| NOCACHE :메모리상에서 시퀀스값 관리(기본 20)
 - SEQUENCE 사용법
  - 시퀀스명.CURRVAL :현재 시퀀스 값 반환
  - 시퀀스명.NEXTVAL :현재 시퀀스의 다음 값 반환
  - 시퀀스의 첫 시작 값은 없으므로 CURRVAL사용 전에 반드시 NEXTVAL을 1번 이상 사용해야 함
 - ALTER SEQUENCE 로 수정
  - 만약 INSERT 실패하더라도 번호는 다음 번호로 넘어간다.  
  - START WITH 는 수정이 안된다 (수정하려면 새로 SEQUENCE 실행해야 함)
  - 삭제 하려면? DROP SEQUENCE 시퀀스명;
 - INDEX
  - 명령문 처리 속도를 향상시키기 위해 컬럼에 대해 생성하는 오라클 객체
  - 장점 : 검색 속도 UP, 시스템 전체 성능 향상(부하 줄여서)
  - 단점 : 인덱스 위한 추가 저장공간 필요, 인덱스 생성 TIME 필요,데이터 변경작업이 자주 일어하는 경우 효율성 떨어짐
 - SYNONYM 동의어
  - 사용자가 다른 사용자의 객체를 참조할 때 사용자 ID,테이블명으로 표기
  - 비공개/공개동의어
  - 공개동의어 모든 사용자 사용 가능
  - 비공개 동의어 :권한을 받아서 사용해야 함 GRANT CREATE SYNONYM TO kh;
  - 공개 동의어 : 똑같이 다 사용할 수 있게 CREATE PUBLIC SYNONYM DEPT FOR kh.DEPARTMENT;
 - PL, SQL
  - 오라클 자체에 내장되어 있는 절차적 언어
  - SQL 단점 보완
  - SQL 언어를 확장하기 위해 사용
 - 문법
   - SET SERVEROUTPUT ON; PL/SQL을 이용한 출력문을 출력하기 위한 설정문
   - DECLARE 선언부
   - BEGIN 실행부
   - EXCEPTION
   - END;
   - /(/써야 실행됨)
 - 변수 만들기(변수 먼저 만듬)
 - DECLARE
  - MSG VARCHAR2(20);
 - BEGIN  오라클은 := 로 대입함
  - SELECT
    - INTO
    - FROM
    - WHERE
    - MSG :='하이';
  - DBMS_OUTPUT.PUT_LINE(MSG);
  - END;
  - / 
 - MSG :='&입력';(키보드로 입력받겠다) 만약 ESC누르면 값을 대체하겠다 이런 의미(대체취소)
  - JOIN 시 꼭 LEFT JOIN 쓰기
 - 변수 종류
   - 일반 변수 := 대입
   - 상수: CONSTANT 키워드를 자료형 앞에 붙임
   - %TYPE :해당 컬럼과 동일한 형태로 나옴(길이 지정안해도됨) 해당 테이블의 컬럼을 가져옴 
   - %ROWTYPE:
   - %ROWTYPE을 쓰면 해당 테이블의 모든 데이터를 다 가져옴, 만약 두 테이블 써야 한다면 변수를 하나 더 만들어준다!!
   - RECORDTYPE :자료형을 만들어줌(내가 사용자 정의를 만드는 것) 
   - DELETE는 테이블 일부를 담을 수 있음
 - PL ,SQL 선택문(제어문이라고 생각하면됨)
  - PL,SQL의 모든 문장들은 기술한 순서대로 순차적으로 수행
 - PL,SQL 선택문 종류
  - 1. IF~THEN~END IF문(자바의 IF문) : IF문으로 시작해서 END IF 꼭 써줌 (안써주면 IF문이 안끝남 END가 안됨)
  - 2. IF~THEN~ELSE~END IF(ESLE IF문) 만약 ~라면 만약 ~가 아니라면
  - 3. IF~ ELSIF~ELSE END IF
  - 4. CASE WHEN~THEN WHEN~THEN~ ELSE(자바 디폴트) ~END CASE
## 3월 13일 금(추움)
 * SET SERVEROUTPUT ON; 해주기
 - LOOP
  - BASIC LOOP 조건 없이 무한대로 반복
  - DECLARE
  - I NUMBER := 1;
  - BEGIN
  - LOOP
  - DBMS_OUTPUT.PUT_LINE(I); 
  - I := I+1; 현재값1에 1을 더함
  - IF I>5
  - THEN EXIT;
  - END IF;
  - END LOOP; 반복 끝지점
 - END; 
 - FOR LOOP 디클레어에서 선언안해도 자동으로 1씩 증가함
  - DECLARE
  - BEGIN
  - FOR I IN REVERSE 1..5 LOOP(거꾸로 내려감)
 - TRIGGER
   - 데이터베이스가 만족되면 일어나는 행동
   - OLD NEW TRIGGER 만들때 꼭 FOR EACH ROW 써주기
   - 자동적으로 수행되는 행동
   - 데이터가 입려,수정,삭제 될 경우 자동으로 실행
 - TRIGGER 구성 요소
   - 트리거 실행시점
     - 이벤트 전 BEFORE/ 후 AFTER
   - 트리거 이벤트
     - 어떤 DML(INSERT,UPDATE,DELETE)문 실행했을 때 TRIGGER를 발생시킬 것인지 결정
   - 몸체
     - TRIGGER 동작 로직, BEGIN~END 안에 작성
   - 유형
     - FOR EACH ROW 문장이 있으면
       행레벨 트리거: DML에 의해서 여러 개의 행이 변경되면 각 행이 변경될 때마다 TRIGGER를 발생시키는 방법
     - 없으면?
       문장레벨 트리거 : DML을 실행하면 TRIGGER가 한번 발생
 - TRIGGER 바인드 변수
   - :NEW 새로 입력된 데이터 (INSERT,UPDATE시 존재)
   - :OLD 기존 데이터
   - :NEW.컬럼명 ->SQL반영 후의 컬럼 데이터
   - :OLD.컬럼명 ->SQL반영 전의 컬럼 데이터
     - DELETE의 경우 삭제이기 때문에 OLD만  
## 3월 14일 토(날씨 최고 구름 nono)
- 디버그(debug)
  - 컴퓨터 프로그램이나 시스템의 정확성 또는 논리적인 오류(버그)를 검출하여 제거하는 과정 
- 객체(instance)
  - 데이터를 메모리에 할당하는 결과물
- 무한루프(무한 반복문)
  - 반복 횟수가 미리 정해져 있지 않고, 무한히 반복되는 반복문
    - while(true){ 조건식 자리에 논리형 true값을 입력
    - 실행코드;
    - }
- toLowerCase(): String 객체에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환
- toUpperCase(): String 객체에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환
- getter 멤버 변수의 값을 읽어와서 호출한 쪽으로 읽은 값을 넘기는 메소드
- setter 멤버 변수에 변경할 값을 전달받아서 멤버변수 값을 변경하는 메소드
- MAP
  - 키(key)와 값(value)로 구성
  - 키와 값(클래스명도 와도 됨)은 둘다 객체 타입
    - HashMap<String,House> home = new HashMap<String, House>(); 이런식으로 선언함 
## 3월 15일 일(날씨 더움)
- 변수의 종류
  - 변수 선언 위치에 따라 구분
    - 1. 지역변수:해당 지역(메소드)에서만 사용가능한 변수(반드시 직접 초기화해서 사용)
    - 2. 전역변수(멤버변수,인스턴스 변수):해당클래스 내부에서만 사용이 가능한 변수, 객체 생성시 해당 객체에서만 사용이 가능
    - 3. 정적변수(클래스 변수) : 클래스와 관계없이 사용 가능,static키워드 이용해서 선언
 ## 3월 16일 월(추움)    
 - 데이터 딕셔너리
   - 자원을 효율적으로 관리하기 위한 다양한 정보를 저장하는 시스템 테이블
   - 사용자가 테이블을 생성하거나,사용자변경 등의 작업을 할때 데이터베이스 
   - 서버에 의해 자동으로 갱신되는 테이블
   - 뷰라는 걸 자동으로 제공해줌
     - 1.DBA_XXXXX:데이터베이스 관리자만 접근이 가능한 객체 등의 정보를 조회
     - 2.ALL_XXXXX: 자신의 계정이 소유하거나 권한을 부여받은 객체 등에 관한 정보 조회
     - 3.USER_XXXXX:자신의 계정이 소유한 객체 등에 관한 정보 조회
 - 프로젝트에 대한 테이블 전부 문서화 함, 테이블정의서를 보고 테이블을 만들 수 있어야함
 - AQUEARYTOOL 데이터 관리하기 편함
   - ERD이름, 그 그림의 이름
   - AI 체크 되어있으면 숫자를 자동으로 만들어주는 시퀀스
   - NULL 체크 되어 있으면 NOT NULL X
     - 다 만들고 ERD모든 테이블 생성 SQL
     - 외래키 삭제 옵션 따로 지원안해주니 꼭 확인하기
 - SQL :데이터에서 조회,조작하기 위해 사용하는 표준검색언어
   - DDL: 데이터를 정의(CREATE:객체생성,DROP삭제 ,ALTER수정,TRUNCATE초기화)
   - DML: 데이터를 조작(INSERT:데이터를 입력,UPDATE 데이터를 업데이트,DELETE 데이터 로우 삭제)
     - 앞으로도 많이 쓸 부분(프로젝트를 할때 DDL은 초반에 하고 더 손댈 곳이 없지만,, DML은 많이 씀,데이터 넣고, 리드하고,,)
   - DCL: 권한설정(GRANT,REVOKE 권한 회수)
   - TCL: 한번에 처리되어야할 최소단위(EX; ATM) 트랜잭션 제어 (COMMIT,SAVEPOINT)
 - 뷰, 시퀀스,인덱스,시노임
 - PL/SQL
