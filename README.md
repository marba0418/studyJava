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
- DCL (DATA CONTROL LANGUAGE)
  - 권한 설정
  - 명령어는 GRANT(부여),REVOKE(취소)
- TCL (TRANSATION CONTROL LANGUAGE)
  - TRANSATION연속적인 작업으로 구성되는 정보처리
  - 트랜잭션 제어
  - 명령어는 COMMMIT,ROLLBACK,SAVEPOINT
- 제약조건 CONSTRAINT
  - 사용자가 원하는 조건의 데이터만 유지하기 위해서 특정칼럼에 설정하는 제약
  - 데이터의 무결성을 지키기 위해 제한된 조건 

*무결성 DATA INTEGRITY(청렴) : 데이터의 정확성,일관성 유지,보증하는 것을 가리킨다.

- SUBQUERY :SELECT 안에 또 SELECT문장..!
- 사용자 계정 생성을 나타내는 USER -> CREATE USER EXAM IDENTIFIED BY 1234;
- 외래키 칼럼 뒤에 작성하는 방법 -> BOARD_WRITER VARCHAR(20) REFERENCES MEMBERS(MEMBER_ID)
- PRIMARY KEY
  - 테이블에서 한 행의 정보를 구분하기 위한 고유 식별자(IDENTIFIER)의 역할
  - NOT NULL과 UNIQUE의 의미 둘 다 가지고 있음
- FOREIGN KEY
  - 참조 무결성을 유지하기 위한 조건 
  - 만약 로그인시 멤버에서 값을 가져와야 한다면 멤버에서만 가져와야 한다. 이런 말을 참조 무결성이라고 한다.
  - 즉 , 데이터 신뢰도를 높인다고 생각하면 된다.
- DDL (Data Definition Language)
- 데이터 정의 언어 
  - CREATE(객체를 만들고)
  - ALTER(수정하고)-> CREATE로 정의된 내용을 수정할 때 사용
  - DROP(삭제하는)
  - TRUNCATE :해당 테이블을 전체 삭제(초기화)
- DML(DATE MANIPULATION LANGUAGE)
  - 실제로 많이 씀 
  - 데이터 조작 언어
  - 테이블에 값을 삽입,수정, 삭제 하는 역할
    - INSERT(삽입): 테이블에 새로운 행을 추가
    - UPDATE(수정): 테이블에 기록된 컬럼의 값을 수정하는 구문
    - DELETE(삭제): (테이블) 행을 삭제하는 구문,행 개수 감소 (꼭 WHERE 절 넣기)
    - MERGE(합치기):(구조가 같은) 테이블을 하나로 합치는 기능
    - TCL TRANSCATION CONTROL LANGUAGE]
- 트랜젝션 제어 언어
  - 한꺼번에 수행되야하는 최소의 작업단위
  - COMMIT -> 변경 내용을 저장, 저장해주는 개념
  - ROLLBACK -> 최근 COMMIT 한 시점으로 이동
  - SAVEPOINT -> 현재 트랜작업 시점의 이름을 지정(약간 임시저장이라고 생각하면 편함)
    - 굉장히 중요함
    - 후에 자바에서 TRANSCATION 으로 인해 클래스 하나 더 
    - 한꺼번에 수행되어야 할 최소 작업 단위
    - 작업이 한꺼번에 이루어져야 함 (그렇지 않은 경우 한꺼번에 취소되어야함)
    - 하나의 작업으로 보겠다.
  - 만약 과정 중 에러가 발생한다면? 하나의 덩어리로 보고 (작업단위로 보고) 취소처리,에러가 발생하지 않다면 완료처리
  - 테이블에 DML구문이 동작했을때 TRANSCATION실행
  - INSERT,UPDATE,DELETE,(SELECT때는 필요 없음 자료가 바뀌는 것이 아니니까)
  - SAVAPOINT 임시 저장 시점을 잡음
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
  - 단점 : 인덱스 위한 추가 저장공간 필요, 인덱스 생성 TIME 필요, 데이터 변경작업이 자주 일어하는 경우 효율성 떨어짐
- SYNONYM 동의어
  - 사용자가 다른 사용자의 객체를 참조할 때 사용자 ID,테이블명으로 표기
  - 비공개/공개동의어
  - 공개동의어 모든 사용자 사용 가능
  - 비공개 동의어 : 권한을 받아서 사용해야 함 GRANT CREATE SYNONYM TO kh;
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
- SET SERVEROUTPUT ON; 해주기
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
 ## 3월 17일 화(날씨 흐림) 
- JDBC 자바언어에서 디비에 접근할 수 있게 해주는 API 
   - DriverManager:오라클 드라이버 연결, 커넥션 해주는 것
     - 직접 객체 생성 불가 메소드 작성
   - Statement
   - ResultSet : select문을 사용한 질의 성공 시 반환되는 객체
## 3월 18일 수(날씨 좋음)
- Statement
  - 1.캐시사용x
  - select* from member where member_id ='입력값'
  - select* from member where member_id ='user01'
  - select* from member where member_id ='user02'
  
- PreparedStatement
  - 2.캐시사용 (임의의 공간에 넣어놨다),보안성 
  - select* from member where member_id=?
  - user01,user02
  - 속도가 더 빠름(구문 분석하는 시간이 짦아져서)

 ## 3월 24일 화(날씨 좋음)
- html(hyper text markup language):웹에서 정보를 표현할 목적으로 만든 마크업 언어 
  - 특징
    
  - 테이블 구조를 나누는 태그
    - <thead> </thead> : 테이블 구조를 나누는 태그로 테이블 당 한 개만 존재가능
    - <tbody> </tbody> : 테이블 구조를 나누는 태그로, 몸체를 의미하며 테이블에 여러개 존재 가능
    - <tfoot> </tfoot> : 테이블 구조를 나누는 태그로, thead태그 뒤에 있어야 하며 테이블 당 한 개만 존재 가능 
  - 영역분할 태그: 많이 씀
    - <iframe> </iframe> : 웹 문서 안에 다른 문서 태그,최근에 많이 안씀
    - navigation : 클릭을 통해 이동하는 것
    - contents: 사람들이 실제로 보는 것
    - 풋터? :개인 정보 들어간 부분
    - 블록요소 : 한 줄 전체를 차지하는 요소, 한 줄에 여러 요소가 올 수 없음(한줄을 무조건 다 차지),위 아래 크기 조절됨
    - 인라인 요소: 한 줄에 여러 요소가 올 수 있음. 내부 컨텐츠가 끝나는 지점까지를 넓이로 가짐,개행 안됨,위아래로 크기 조절이 안됨
    - 인라인 요소 중 span 있음
  - 페이지 구조
    - <div>,<span> 
    - 시멘틱 태그 : 페이지 구조를 특정 기능에 맞는 태그를 사용하여 구분, 구조를 쉽게 파악
    - <header></header> : 특정 부분의 머리말, 주로 검색어 들어감
    - 반복되는 아티클을 묶으면 섹션
    - <aside></aside> 사이드바라고 불림, 주로 광고나 링크 모음
    - <footer></footer> :회사정보 들어감
  - 멀티미디어 태그
    - <img> 웹페이지에 사진이나 그림 넣을 때 사용하는 태그
    - gif(움짤들),jpg/jpeg(사진을 위해 개발,저장 반복하다보면 화질 떨어짐),png(네트워크용으로 개발되어 최근 많이 사용)
    - 닫는 태그 존재 안함
  - 오디오
    - controls 꼭 써줘야함 <audio controls autoplay loop src="../mp3/"
    - poster 재생전 출력 이미지(일종의 썸네일)
  - 하이퍼링크 태그: 클릭했을 때 다른 사이트로 넘어가는 것(html목적)
    - href : 링크한 펭이지의 id값이나 사이트 주소 지정 <a href='이동할 페이지 경로'> 링크 표시 문구</a>
    - target="_blank" 새창을 열어서 이동
 
  - 폼 태그:사용자가 입력한 데이터를 보내는 방식과 처리할 프로그램을 정하는 태그
    
    - method: 
    
    - get: url창에 데이터를 보내는 방식, 보내는 데이터 크기에 제한이 있음(256~4096바이트)
    
    - post : http헤더에  데이터를 넣어 보내는 방식
    
    - name : form태그의 고유이름 지정(form을 구분하기 위함)  input시 반드시 name이 들어간다고 생각하면 됨
    
    - input : 사용자로부터 데이터를 입력 받기 위한 태그
 
    - placeholder : 입력에 대한 가이드를 제공하는 것
    - maxlength="5": 입력이 5글자로 제한
    - size ="3": 폭이 줄어듬
    - hidden : 값이 안보이게 함 p hidden: input type ="hidden" name ="input3" /p
    - button : 기능 구현을 해줄 것임 p button: input type ="button" value ="눌러봐" onclick="btnClick()" /p
    - checkbox : 다중 선택이 가능 checked 옵션 쓰면 체크가 되어있는 상태가 됨(라디오도 마찬가지)
    - radio : 1개 선택만 가능(속성이 같아야함)
    - file : input type ="file" name ="file" multiple 뒤에 써주면 여러 파일 업로드됨
    - 뒤에 accept 써주면 파일 스타일이 제한됨 ex).gif,.jpg
    - 입력하지 않으면 안넘어가게 함? 뒤에 required 써주면 됨
    - label을 써주면 글씨만 클릭해도 창에 바로 커서가 감                         
    - 날짜 입력 형식 : label date : input type="date" name="date1" /label br
    - 기타 입력 형식 : 골뱅이 form action ="test.html" method ="get"
    - label email : input type ="email" name ="email" /label br
    - input type="submit" value="제출"
    - /form
    - 여러가지 값을 표현하는 태그 select name="job" size="4" 하면 전체보기 가능, multiple하면 다중 선택가능
    - option value='doctor'의사 /option
    - option value='fire' 불꽃 /option
    - option value='nothing' selected /option하면 선택됨
    - /select
    - 옵션 달아주기 legend차량 종류 선택/legend
    - select
    - optgroup label ="외제차"
    - option value ="bmw3"bmw3/option
 ## 3월 25일 수(날씨 좋음)        
 - 페이지 이동    
    - 1. a 태그를 이용한 페이지 이동
    - a href="https://nid.naver.com/user2/help/idInquiry.nhn?lang=ko_KR" /a
    - 페이지만 이동할때
    - 2.form태그를 이용한 페이지 이동
    - 사용자가 입력한 값을 가지고 이동
 - 회원가입페이지로 이동 ->a태그
 - 아이디찾기페이지로 이동 ->a태그
 - 검색-> 폼태그(사용자가 입력한 값을 가지고 가야하니까)
- name 프론트에서 굉장히 중요 나중에 자료 받을 때 name으로 찾음
- form action="https://search.naver.com/search.naver" method="get"
- input type= "text" name="query"
- input type="submit" value"검색"
- /form
- css 
 - 웹페이지 구성 : 내용과 꾸미는 부분 분리 ,디자인 수정시 서로 영향 최소화
 - style, stylesheet 
 - p{ color : red;}
 - 선택자 속성 값
- style과 stylesheet 
 - style은 정해진 속성을 입력하여 웹페이지를 꾸미는 것
 - stylesheet는 웹페이지에서 반복적으로 쓰는 style을 모아놓은 것
- stylesheet 종류
 - 1.내부 : html 문서 내부의 <style></style>에 에 스타일 정보를 저장하는 방법
 - 2.외부 :  외부에 css 파일을 작성하고 <link> 태그를 이용하여 읽어와서 스타일 적용
 - <link href=“css 파일 경로” rel=“stylesheet” type=“text/css”>
 - 3. 인라인 스타일 시트 : 태그 내부에 스타일 정보를 지정하는 방법
 - <p style=“color:red”>test</p>
- 선택자 :html문서 내부에서 스타일을 적용하기 위한 요소를 선택하는 것 
 - 전체 선택자 :*(대부분 *쓰면 전체의미) *{}
 - 태그 선택자 : 태그 이름(h1,p,li 등등)
    - 특정 태그에 적용되는 스타일 
    - 태그명 {설정내용;} 예 p,a,h1{설정내용;}
 - 아이디 선택자 : #아이디명(고유식별자 개념있음... 겹쳐쓰지 말기 나중에 자바스크립트에서 에러남)
    - 태그 속성 id를 설정하고 id값으로 선택하는 것(#)
    - #아이디명{설정내용;}
 - 클래스 선택자 : 태그 속성 class를 설정하고 class 값으로 선택하는 것(.)
    - .클래스명{설정내용;}, 중복허용, 일반적으로 스타일 적용시 가장 많이 나옴
    - 후손 선택자 : 선택자 선택자
    - 구조 선택자 :  
      - first-child/last-child
      - nth-child(수열)/nth-last-child(수열)
      - first-of-type/last-of-type
      - nth-of-type(수열)/nth-last-of-type(수열)
    - 반응 선택자 : 선택자 active, 선택자 hover
    - 속성 선택자 : :enabled/ :disabled
    - 링크 선택자 : link/visited(보라색)
    - 부정 선택자 : 선택자:not(선택자)
- div로 자손을 잡아옴(block 형식의 공간을 분할, 수직으로 공간 분할)
- 기본 속성 선택자 : 선택자와 함께 사용하는 선택자로 선택자 뒤에 []를 사용하여 속성과 속성값을 명시
    - 기본 형식 : 선택자[속성=값] {설정내용;}
    - ex) input[name=id] input 태그 중 name 속성의 값이 id인 요소 선택
- 적용 방법에 따른 우선 순위 : 태그스타일-> class스타일 -> id스타일-> 인라인 스타일->!important
- 소스 순서에 따른 순위 : 나중에 작성된 스타일 
## 3월 26일 목(날씨 곧 비올듯)
- CSS 단위 구성
- em 부모요소의 크기가 기준
- 상대 크기에서 % 많이 씀
- 색상 표현
    - 영문색 이름, 16진수 표현,rgb,rgba(투명도 조절해줌 0으로 갈 수록 투명  1로 갈수록 불투명)
- 텍스트 스타일
  - font family : 기본 형식 선택자{font-family:글꼴1[,글꼴2,글꼴3];}, 최대3개까지 지정가능
  - 글꼴이 모두 없으면 브라우저 기본 글꼴로 적용
  - 기본 글꼴, 외부에서 글꼴 가져오는 것 
  - font -size: 글자의 크기를 조절하는 속성 선택자{font-size : 숫자단위;}
  - font-weight: 글자의 굵기를 조절하는 것 (bold 굵게 표시,400:noraml,900:max
  - font-variant : 영어를 작은 대문자로 표시해주는 속성 (대문자가 작게 나옴)
  - font-style: 글자를 이텔릭체로 표시하는 속성 선택자{font-style:normal또는 italic또는 olique;}
  - font : 글꼴 속성을 모아서 표현할 수 있는 스타일 속성
- 문단 스타일
  - text align: 문자 위치를 조정(정렬)하는 속성
  - text identify
  - line height 문장끼리의 높이 조절
  - text-overflow :영역을 벗어나는 텍스트 
- line-height: 50px;/*글자테스트 위에 높이를 주는 것 박스에서 높이를 맞춰주는 것임*/
-clip은 영역 넘어가면 짤림
- ellipsis 는 영역이 넘어가면 ...으로 표시됨
- ul과 ol 차이점?
- 배경스타일
## 3월 27일 금(날씨 흐림)
- display : 화면 배치 방법 변경 속성 , 블록 요소와 인라인요소를 변경 가능 
- 테두리 스타일 : 읽어만보기
- border-width 테두리
- 여백 스타일 
- 포지셔닝 :페이지의 요소들을 자유롭게 배치해 주는 속성
- static : 요소를 문서의 흐름에 맞춰 배치(default)
- relative : 위치 지정 가능
- absolute
- visibility 페이지에 특정 속성을 보이거나 보이지 않게 하는 속성
- visible,hidden
- 애니메이션 : 속성을 점차적으로 변화시켜 움직이는 효과를 내는 기법
  - transform 속성 : 페이지에서 요소들을 변형시키려면 transform 속성과 변형 함수를 이용
## 4월 08일 수(날씨 추움)
- createElement는 요소를 만듬 var element = document.createElement("tr");
- createTextNode는 선택한 요소에 텍스트를 추가함 var textNode1 = document.createTextNode(name);
- appendChild선택한 요소안에 자식요소를 추가함  appendChild선택한 요소안에 자식요소를 추가함  
- 이벤트 : 웹페이지에서 어떠한 행위(사용자의 행동)가 발생한 것이 이벤트
- 이벤트 활용 : 이벤트 속성과 이벤트핸들러(함수)를 연동하여 이벤트 발생시 특정 이벤트가 나오게 함
- 고전 이벤트 : 클릭시 이벤트 실행
- var 변수 = document.getElementById("아이디명")
- 인라인 이벤트
- 표준이벤트 모델 : W3C에서 공식적으로 지정한 이벤트 모델
- 이벤트 전달 
   - 이벤트 버블링: 자식에서 부모노드로 올라가면서 이벤트가 실행 
- 유효성 검사:사용자가 입력한 데이터가 양식에 맞는지 검사하는 것
- 비밀번호와 비밀번호 확인의 값이 같은지 확인
   - 정규표현식 : 특정한 규칙을 가진 문자열의 집합
   - meta 문자
     - ^x : 문자열의 시작을 표현 (x로 시작하는 문자
     - x$ : 문자열의 끝을 표현
     - x? : 앞의 문자가 존재하거나 존재하지 않을 때 사용
     - [^xyz] : not을 표현하며 xyz를 제외한 문자를 의미
     - [x-z]: 범위를 표현하며 x~z사이의 문자를 의미
     - x{n}: 반복을 표현하며 x 문자가 n번 반복 [0-9]{4}
     - \d :숫자를 의미
     - \D : 숫자가 아닌 것을 의미
     - \s :공백을 의미
     -  Flag : 정규표현식을 사용할대 flag를 사용하지 않으면 문자열에 대해서 검색을 한번만 처리하고 종료
     - g: 문자열 내의 모든 패턴을 찾음
     - i : 대상 문자열에 대해서 대소문자를 식별하지 않는 것을 의미
     - m : 
     - 정규표현식 메소드를 이용하여 검사 test()메소드
## 4월 13일 월(날씨 따뜻)
  - 이벤트 
     - dblclick :더블클릭 했을 때
     - click: 클릭했을 때
     - mousemove: 마우스가 요소,child에서 움직 일 때
     - change 요소의 값이 변경되었을 때
     - select : 텍스트가 선택되었을 때 
     - keydown: 키를 눌렀을 때
     - keypress: 키를 눌렀을 때(alt,ctrl,shift,esc 인식되지 않음)
 ## 4월 20일 월 (날씨 좋음) 
 - 화면구현 (UI 구현 유저 인터페이스)
 - HTML : 웹페이지에 컨텐츠를 표현하는 기본언어 
 - <h1></h1>
 - css : HTML로 작성된 문서에 대한 스타일(글자크기,색상,여백 등)을 적용하는 언어
 - JavaScript: HTML 로 작성된 웹페이지 문서에 기능을 적용하는 언어
 - jQuery: Javascript의 문법을 간소화하기 위한 프레임워크
 - ECMAScript : ECMA표준화 단체에서 JavaScript를 기초로 하여 구성한 스크립트 표준
 - 화면구현시 고려해야할 사항
 - 1.웹표준: 
    - 웹기술을 표준화하기 위한 일련의 단계와 요구사항
    - 플러그인(Active x 등)과 같은 비표준 기술을 배제하고, W3C(World Wide Web Consortium)에서 나온 권고안을 사용하는 것을 의미
    - 웹 문서의 구조와 표현, 동작을 구분해서 사용
    - 브라우저 버전이나 종류에 상관없이 호환이 가능하도록 제시된 표준
    - 지원되지 않는 웹브라우저를 위한 보완장치를 제공
    
 - 2. 웹 접근성
    - 장애 가진 사람과 장애를 갖지 않은 사람 모두가 웹사이트를 이용할 수 있게 하는 방식
 - 3. 웹 호환성 
    - 웹 사이트가 작동하는 서비스 이용자 단말기(pc,모바일,타블렛 등)의 하드웨어 또는 소프트웨어 환경이 다른 경우에도 동등한 서비스를 제공       하는 것
 - 시멘틱 태그 :
 - 1. header :  문서의 header를 나타낼 때 사용, 사이트 로고, 링크 , 소개 등을 넣음
 - 2. navi : 문서의 navigation을 나타낼 때 사용, 메뉴영역으로 사용
 - 3. section : 문서의 컨텐츠가 들어가는 영역, 컨텐츠를 주제별로 묶을 때 사용
 - 4. aside : 본문 전체 내용과 직접적인 연관성이 없는 분리된 내용을 담을 때 사용, 배너광고,위젯
 - 5. footer : 문서의 하단을 나타낼때 사용, 주소, 연락처, 저작권 등을 넣음

 - CSS
 - 선택자 
 - 아이디 선택자 :#(반드시 고유 식별자로 사용한다)
 - 클래스 선택자 : .
 - 태그 선택자 : 태그명
 - 자손 선택자 : >
 - 후손 선택자 : 공백
 - 속성 선택자 : [type=text]
 - <div class="test></div>
 - <p class="test"></div>
 - div.test{}
 - p.test{}
 - css에서 display는? 
 - display : 레이아웃을 배치하거나 위치시킬때 사용하는 속성
 - display 속성 
 - block: 한줄에 한개의 요소만 가능/크기 지정이 가능
 - inline: 한줄에 여러개 요소가 가능/ 크기 지정 불가능
 - inline-block: block,inline을 모두 가지고 있는 속성,한줄에 여러개 요소가 가능/ 크기 지정이 가능함
 - none: 화면에 보이지 않는 속성 
 - position :  
 - static : 기본값으로 위치를 지정하지 않을 때 사용(자연스럽게 배치) 
 - relative: static의 원래 위치부터 위치를 계산(배치 하지 않는 경우 static과 동일)
 - absolute : 문서의 원래 위치와 상관없이 배치(부모 요소 중 가장 가까운 relative 요소 기준으로 배치)
 - fixed: 브라우저 화면의 상대위치
 
 ## 4월 27일 월(바람 많음)
 - JSTL 태그 종류
 - Core Tags 변수와 url, 조건문,반복문 등의 로직과 관련된 JSTL 문법 제공
 - <c:set>
 - 변수 타입을 별도로 선언하지 않음
 - 초기값을 반드시 입력
 - <% int num1 = 10, num2=20>
 - <c:remove> 삭제
 - <c:out> 데이터를 출력할때 사용하는 태그
 - <c:if>
 - 자바의 if문과 비슷한 역할
 - <c:choose>
 - 자바의 switch(if~else if)문과 비슷한 역할을 하는 태그
 - <c:when>,<c:otherwise>태그와 함께 사용되는데
 - <c:forEach> 자바의 forEach
 - <c:forTokens> 문자열에 포함된 구분자를 통해 토큰을 분리해서 반복처리
 - 사용자 요청을 받는 클래스 -> 서블렛->비즈니스 로직 처리 -> HTML 페이지 제작
 - jsp : 사용자 요청을 jsp가 받아서 비즈니스 로직처리-> 화면 구현
 - MVC 패턴
 - 사용자 요청처리(비즈니스 로직)은 servlet처리
 - 화면 구현은 jsp

 ## 5월 6일 수(날씨 더움)
 
 - Filter : client와 server 사이에서 request와 response 객체를 필터가 먼저 받아 사전 사후 작업 등 공통적으로 필요한 부분을 처리하는 것
 - client와 Servlet사이에 거름막이 생겼다고 생각하면 됨
 - 웹 브라우저가 필요한 Servlet을 호출할 경우, filter가 대신 호출되어 전달받은 정보를 수정하고 Servlet에게 넘기는 일종의 경유지 역할을 수행
 
 - init : 웹컨테이너가 filter를 호출할 경우 해당 메소드가 호출되어 filter 객체를 생성하며 초기화 한다.
 - doFilter 수행될 때 구동하는 메소드로 요청 객체와 응답 객체를 사용해 일련의 작업을 수행한 뒤, chain을 통해 가공된 값을 목적지로 전송한다.
 
 - ajax(Asynchronous JavaScript And XML) : 서버로부터 데이터를 가져와 전체 페이지를 새로 고치지 않고 일부만 로드할 수 있게 하는 기법으로 
 -  비동기식 요청을 보내는데 필요한 기술 
    - 장점 : 비동기식 방식으로 웹서버의 응답을 기다리지 않고 데이터를 빠르게 처리 , 페이지 리로딩 없이 처리
    - 단점 : 한페이지에 지속적으로 사용시 리소스가 쌓여 페이지가 느려짐,스크립트로 되어있어 에러 발생시 디버깅이 어려움
 - 동기식 처리모델 : 페이지가 로드 되는 동안 브라우저는 script문이 실행되면 그 실행이 종료될때 까지 기다렸다가 종료되면 나머지 페이지를 
 - 로드하는 방식으로 실행되는 방식
 - 비동기식 처리모델 : 페이지가 로드되는 동안 브라우저는 먼저 서버데이터 요청 스크립트문을 실행한 후 나머지 페이지를 계속 로드하고 페이지와
 - 상호 작용을 처리하며 스크립트 요청 데이터를 기다리지 않는다. 그리고 요청 데이터가 도착하면 그때 이벤트가 발생하면서 지정된 함수가 호출되어
 - 실행되는 방식
 
 - JavaScript ajax
 - 처리절차 
 - 1. 스크립트 문에 요청을 위한 XMLHttpRequest
 - 비동기식으로 서버에 요청(Request)을 보내기 위한 객체로 요청 및 응답을 처리
 - 속성 
 - onreadystatechange readyState속성이 변경될 때 호출되는 메소드를 저장하는 변수
 - readyState 객체의 상태를 저장하는 변수
 - responseText 응답 결과를 문자열로 저장하는 변수
 - responseXML 응답 결과를 XML data로 저장하는 변수
 - status
 - readyState status 속성 값을
 - 200 요청성공
 - 404(Not Found) 페이지 없음
 - 500()서버 오류 발생
 - 1. XMLHttpRequest객체 생성
 - IE7 이상, safari, firefox,opera, chrome
 - var httpRequest
 - 2. 응답 처리 함수 설정
 - XMLHttpRequest 객체 생성 후 속성값에 저장
 - 3.요청대상 설정/요청 처리
 - XMLHttpRequest객체 생성 후 open메소드로 요청대상 설정
 - var httpRequest
 - 4. 응답처리
 - JSON과 XML 
 - JSON: JavaScript Object Notation 
 - {key1:value1,key2:value2,key3:value3}
 - XML : Extensible Markup Language의 약자로 HTML과 매우 비슷한 문자 기반의 마크업 언어로
 - 사람과 기계가 동시에 읽기 편한 구조로 되어있음
 - 형식 
 - <태그명1>값1</태그명1>
 - <태그명2>값2</태그명2>
 - <태그명3>값3</태그명3>
 - $.ajax()의 주요 속성
 - 속성명 내용
 - url 데이터를 전송할 URL의 주소 설정
 - data 서버에 전송할 데이터를 key:value로 처리
 - $.ajax()를 이용하여 처리
 - $.ajax({url:text:})
 
 ## 5월 12일 화(날씨 추움)
 - Ajax : JavaScript의 라이브러리 중 하나이며 Asynchronous JavaScript And Xml(비동기식 자바스크립트와 xml)의 약자
 - 브라우저가 가지고 있는 XMLHttpRequest 객체를 이용해서 전체 페이지를 새로 고치지 않고도 페이지의 일부만을 위한 데이터를 로드하는 기법
 - 비동기통신, 클라이언트와 서버간에 XML 데이터를 주고받는 기술  
 
 ## 5월 14일 목(날씨 더움)    
 - UML (Unified Modeling Language)
 - 소프트웨어 공학에서 사용되는 표준화된 모델링 언어로 소프트웨어 개념을 다이어그램으로 그리기 위해 사용하는 시각적 표기법
 - UML 필요성
 - 의사소통하기 좋다.
 - 대규모 프로젝트 구조의 로드맵을 만들 때 유용하다.
 - 개발할 시스템 구축에 대한 기초를 마련할 수 있다.
 - 백엔드 문서용으로 사용 용이 (진행하던 프로젝트를 다른팀이 맡을 경우 유용)
 - UML의 종류
     - 클래스 다이어 그램 : 시스템을 구성하는 클래스들 사이의 관계를 표현
     - 객체 다이어그램 : 시스템 실행 중 어느 시간의 객체와 관계를 보여줌(특정 시점의 메모리 상태를 표현)
     - 패키지 다이어그램 : 패키지 들과 그들 사이의 의존성을 보여줌으로 시스템의 구조를 표현
     - 유스케이스 다이어그램 : Actor와 시스템이 수행하는 활동간의 관계를 표시하며, 시스템의 기능적인 요구사항을 설명하기 위한 도구
     - 시퀀스 다이어그램 : 시간 흐름에 따른 객체 사이의 상호작용을 표현
 - 클래스 다이어그램
   - 클래스 : 동일한 속성과 행위를 수행하는 객체들의 집합
   - 객체를 생성하는 설계도
- 클래스 다이어그램의 접근제어 지시자 표시
   - public (+) 어떤 클래스의 객체에서든 접근 가능
   - private(-) 해당 클래스 내부에서만 접근 가능
   - protected (#) 동일한 패키지에 있거나 상속관계에 있는 경우 접근 가능
   - default(~) 동일한 패키지에 있는 클래스의 객체에서만 접근 가능
- 클래스 다이어그램의 속성(변수) 표현
   - 접근제어지시자 변수명: 자료형 
   - ex) - id : String 
         - age : int
         + addr : String
- 클래스 다이어그램의 기능(메소드) 표현
  - 접근제어지시자 메소드명(매개변수명: 매개변수자료형) :리턴자료형
  - +addMember(m:Member): void
  - +delMember(no:int): boolean
- 클래스 사이의 관계표현
  - 클래스 사이의 여러 종류의 관계선을 이용하여 표현
  - Dependency : 클래스간의 지역변수에서 참조하는 관계
  - Aggregation : 클래스간의 지역변수에서 참조하는 관계로 두 클래스의 라이프사이클이 다를 때
  - Composition : 클래스간의 지역변수에서 참조하는 관계로 두 클래스의 라이프사이클이 같을 때
  - Generalization : 클래스 상속 관계를 의미
  - Realization : 상속관계를 의미하지만 interface의 implements를 의미
- Dependency(의존관계) :한 클래스가 다른 클래스의 멤버를 참조할 때 사용
- Aggregation(집합연관관계) : 한 클래스가 멤버변수로 다른 클래스를 참조하며, 두 클래스의 생명주기가 다른 것
- Composition(합성연관관계) : 한 클래스가 멤버변수로 다른 클래스를 참조하며, 두 클래스의 생명주기가 같은 것
- Generalization(일반화관계) : 한 클래스가 다른 클래스를 상속하는 관계
- Realization(실체화관계) : Generalization과 유사하게 상속하지만, 상속해서 구현해야하는 인터페이스를 implement를 하는 것을 의미

- 유스케이스 다이어그램
- Actor와 시스템이 수행하는 활동간의 관계를 표시하며, 시스템의 기능적인 요구사항을 설명하기 위한 도구
- 유스케이스 다이어그램 구성요소
- Actor : 시스템 외부에 있으면서 시스템과 상호 작용을 하는 사람 또는 시스템
- System : 만들고자 하는 어플리케이션
- Usecase : 시스템이 엑터에게 제공해야 하는 기능의 집합
- Relation : 엑터와 유스케이스 사이의 의미 있는 관계

- Actor : 시스템의 외부에 있고 시스템과 상호작용을 하는 사람 또는 시스템
- 원과 선을 조합하여 사람모양으로 표현하고 아래 또는 위에 역할 작성

- System : 만들고자 하는 프로그램, 유스케이스들을 둘러싼 사각형 틀로 시스템 명칭을 안쪽 상단에 작성

- 유스케이스 : 시스템이 액터에게 제공해야 하는 기능 , 사용자 입장에서 바라본 시스템의 기능, 타원으로 표시하고 안쪽에 유스케이스 명을 작성한다.
- Relation : 연관관계 , 사용자가 글을 등록한다는 기능과 상호작용이 있다는 것을 의미
- Relation : 의존관계1(include) 
- 포함관계(Include)는 하나의 유스케이스가 다른 유스케이스의 실행을 전제로 할 때 형성되는 관계로, 해당 유스케이스를 실행하기 위해 반드시 
- 실행되어야 하는 경우 적용
- Relation : 의존관계2(extend) 
- 확장관계(extend)는 확장 대상 유스케이스를 수행할 때 특정 조건에 따라 확장기능 유스케이스를 수행하는 경우 적용
- Relation : Generalization
- 일반화 관계(Generalization) 유사한 유스케이스 또는 액터를 모아 추상화한 유스케이스 또는 액터와 연결시켜 그룹을 만들어 이해도를 높이기 위함

- 유스케이스 다이어그램 작성 순서
- 1. 액터 식별 : 액터는 시스템에 관련이 있는 사용자의 역할과 외부 시스템으로 식별 가능
- 2. 유스케이스 식별 : 액터가 요구하는 서비스, 정보를 유스케이스로 식별할 수 있고 액터가 시스템과 상호작용 하는 행위를 유스케이스로도 
- 나타낼 수 있다.
- 3. 관계 정의 : 액터간, 유스케이스간 일반화, 연관관계를 정의하고, 포함, 확장관계를 정의한다.

- 유스케이스 정의서 
- 유스케이스 다이어그램을 보완하기 위한 산출물로 유스케이스 다이어 그램이 시스템의 기능을 표현한다면 각각의 유스케이스에 대해서
- 해당 유스케이스가 어떻게 수행되는지를 표현한다.

- 유스케이스 정의서 포함 항목
- 1. 유스케이스명 : 액터가 시스템을 통해 달성할 목적을 명확하게 표현
- 2. 액터명 : 시스템에서 수행하는 역할 이름
- 3. 개요 : 유스케이스를 수행하는 개요
- 4. 사전조건 : 올바르게 동작하기 위해 사전에 충족되어야 하는 조건
- 5. 사후조건 : 유스케이스가 실행된 후 만족해야 하는 조건 기술
- 6. 기본흐름 : 시스템과 액터 사이에 목적을 달성하기 위한 기본적인 상호흐름을 기술하며, 오류나 예외가 발생하지 않는 것을 전제로 작성
- 7. 대체 흐름: 기본흐름으로 부터 경우에 따라 선택적으로 실행되고, 다시 기본흐름으로 돌아오거나, 예외가 발생한 경우 이를 처리하는 흐름 기술

## 5월 24일 일(날씨 더움)
- ajax(Asynchronous JavaScript And XML) : 서버로부터 데이터를 가져와 전체 페이지를 새로 고치지 않고 일부만 로드할 수 있게 하는 기법으로 비동기식 요청을 보내는데 필요한 기술
- 장점: 비동기식 방식으로 웹서버의 응답을 기다리지 않고 데이터를 빠르게 처리, 페이지 리로딩 없이 처리
- 단점 : 한 페이지에 지속적으로 사용시 리소스가 쌓여 페이지가 느려짐, 스크립트로 되어있어 에러발생시 디버깅이 어려움
- 동기식 처리모델 : 페이지가 로드 되는 동안 브라우저는 script문이 실행되면 그 실행이 종료될때까지 기다렸다가 종료되면 나머지 페이지를 로드하는 방식
- 비동기식 처리모델 : 페이지가 로드 되는 동안 브라우저는 먼저 서버데이터 요청 script문을 실행한 후 나머지 페이지를 계속 로드하고 페이지가 상호작용을 처리한 후 나머지 페이지를 계속 로드하고 페이지와 상호작용을 처리하며, script요청 데이터를 기다리지 않는다. 그리고 요청데이터가 도착하면 그때 이벤트가 발생하면서 지정된 함수가 호출되어 실행되는 방식
- status 속성 값
- 200(OK) : 요청성공
- 404(Not Found) : 페이지 없음
- 500(Internal Server Error) : 서버 오류 발생

- json문법
- 객체는 {}(중괄호)로 표기
- 배열은 [](대괄호)로 표기
- 각 속성은 key와 value쌍으로 이루어짐 :(콜론)으로 구분
- 속성이 여러개인 경우 ,(쉼표)로 구분

- gson
- json구조를 띄는 직렬화된 데이터를 JAVA의 객체로 역직렬화, 직렬화 해주는 자바 라이브러리
- JSONObject-> JAVA Object 또는 그 반대의 행위를 돕는 라이브러리
 ## 5월 29일 금(날씨 더움)
  
-Spring MVC
-Spring MVC Model : Spring MVC는 View, Controller, Model 부분을 유지보수 및 확장성을 고려하여 설계
-Spring MVC 요소
- DispatcherServlet 유일한 Servlet 클래스로서 HTTP 프로토콜을 통해 들어오는 모든 요청을 가장 먼저 처리하는 Front Controller
- HandlerMapping 클라이언트 요청을 어떤 Controller가 처리할 지 URL Mapping값을 가지고 있음
- Controller 실질적인 클라이언트 요청을 처리
- ViewResolver : Controller가 반환환 View 이름으로 실행될 jsp경로를 가지고 있음
- View 실제 클라이언트들에게 보여질 페이지

- java : Java Source파일(package, class,...)
- resources : 설정파일(mybatis-config.xml,...)
- webapp : VI
 ## 6월 01일 월(날씨 더움)
- Spring setting 
- 1. 라이브러리 추가 
- pom.xml에서 mybatis, mybatis-Spring추가
 ## 6월 02일 화(날씨 비옴)
- AOP
- Joinpoint : 클라이언트가 호출하는 모든 비즈니스 메소드, 공통적으로, 일반적으로 Service의 모든 클래스(서비스의 모든 메소드)
- Pointcut : 필터링 된 조인 포인트
- Pointcut의 Around 메소드 호출 자체를 가로채 비즈니스 메소드 실행 전후에 처리할 로직을 삽입가능(스톱워치같은?)
- Advice : Pointcut에 적용할 공통 기능의 코드
- JoinPoint Interface 
- JoinPoint Interface 메소드
- getArgs() : 메소드의 매개 변수를 반환
- getSignature() : 대상 객체 메소드의 설명(메소드명, 리턴 타입 등)변환

- Hash 알고리즘 : 암호화 알고리즘, 단방향(1234->asdf) : 되돌릴 방법이 없다.
- 1) One-way : 암호화는 하되 복호화는 제공하지 않음
- 2) compression : 다양한 길이의 데이터를 입력해도 고정길이로 출력 123456789-> dvsa
- 3) 효율성 : 평문에서 암호화 하는 과정이 빠름
- 4) collision-free : 메세지가 고유하면 해시 값도 고유(1234->asdf)
- 종류 : MD-5, SHA(SHA-1, SHA-2(SHA-224,SHA-256,SHA-384, SHA-512 등등))
 ## 6월 03일 화(날씨 어둑)
- CORS(Cross-Origin Resource Sharing)
- 동일한 출처가 아니어도 다른 출처의 자원을 요청하여 쓸 수 있게 허용하는 구조
- @Scheduled
- cron (리눅스에서 잡 스케쥴러)
- *  *  *  *  *   *  [ * ]
- 초 분 시 일 월  주 [년도]
- 초 0~59,-(범위를 의미) ,* (모든 초),/(간격)
- 매분 10초마다 동작(1분에 1번 동작) 10 * * * * * 
- 10-15 * * * * * : 매 분 10, 11,12,13,14,15 총 6번 동작
- 0/10 * * * * * : 0초부터 시작해서 10초마다 간격(시작시간과 간격을 의미함)
- 분 : 0~59, -,*,/
- 시 :0~23,-, *,/
- day of month :1~31,-,*,?,L W,/
- ?는 해당항목 사용하지 않음
- L : 해당월 가장 마지막 날
- W : 가장 가까운 평일 13W
- LW : 그달 마지막 평일(월말 결산 이때 돌아가면 편하겠군)
- month : 1~12 or JAN-DEC,-,*,/
- day of week :1-7(1은 일요일임) or SUN-SAT,-,*,?,L, #
- L : 마지막요일 토요일
- 4#2 -> 2번째 주 수요일, 6#4 -> 4번째 주 금요일
- year : 1970 -2099,-,*,/
- 초 분 시 일 월 요일
- 0 0 12 * * * : 매일 12시 0분 0초에 동작(하루에 1번)
- 0 15 10 * * * : 매일 10시 15분 0초에 동작
- 0 * 14 * * * : 매일 14시 0분~59분까지 매분 실행
- 0 0/5 14 * * * : 매일 14시 0분부터 5분간격으로 실행
- 0 0/5 14, 18 * * * :매일 14시, 18시 0분부터 5분 간격으로 실행
- 0 50 7 ? * MON-FRI : 평일(월-금) 아침 7시 50분에 실행
- 0 0 10 ? * 6L : 매달 마지막 금요일 10시에 실행
- 0 /1 * * * * : 매분마다 실행
- 0 /10 * * * * : 10분마다 실행

- pom.xml: 라이브러리 관리(라이브러리 추가/삭제)
- web.xml: 서버가 실행될 때 설정
- applicationContext.xml : spring에서 사용할 설정(bean객체 생성, annotation사용 선언,component-scan...)
- mybatis-config.xml : 마이바티스 관련 설정(null, 별칭설정)
- mapper.xml: 동작할 쿼리문 들어 있음 

- 순서
- base-package : or.kr.iei
- or.kr.member.controller
- or.kr.board.controller

- JAVA 개발 환경
- JDK(Java Development Kit) : 자바 개발 도구
- JRE(Java Runtime Environment) :  자바 실행 환경
- src/main/java(packages)
- src/main/resources(xml)
## 6월 04일 목(날씨 비옴)
- Framework : 일련의 클래스 묶음이나 뼈대, 틀을 제공하는 라이브러리
## 6월 10일 수(날씨 비옴)
- 임베디드시스템과 아두이노
- 내장형 시스템, 기계나 기타제어가 필요한 시스템에 대해, 제어를 위한 특정 기능을 수행하는 컴퓨터 시스템으로 장치 내에 존재하는 전자시스템
- 임베디드 시스템 특징 
- 1. 운영체제 경량성 : 고속, 경량 동작과 단순운영을 목표로 하기 때문에, 일반적인 시스템과 달리 최소한의 Computing Power만을 사용하며, 단순한
- os가 많이 활용
- 2. 개발환경 독립성 : 임베디드 소프트웨어는 경량 운영체제에서 동작하기 때문에 컴파일러 등의 building환경이 모두 제거 되어있다.
- 3. 임베디드 소프트웨어 구성 : 단순 동작에 집중되어 있기 때문에 동작에 필요한 모든 요소는 소프트웨어 패키지에 포함되어 있어야 한다.
- 아두이노
- 오픈소스를 기반으로한 대표적인 프로세서와 메모리를 갖춘 소형컴퓨터(마이크로컨트롤러)
- 아두이노 특징
- 1. 단일 보드 마이크로 컨트롤러
- 2. 통합 개발환경 제공
- 3. 2005년 이탈리아에서 시작
- 4. 방대한 참고 자료와 라이브러리가 존재
- 아두이노 보드 종류
- 1. 아두이노 UNO 보드 : 표준보드
- 2. 아두이노 Nano : UNO의 소형화 버전
- 3. 아두이노 Mega2560 : UNO 의 확장버전
- 4. 아두이노 pro/pro mini : UNO의 초소형화 버전
- Leonardo, MegaADK, Micro, zero 등등 다양한 보드가 존재
- 아두이노 호환보드 : 3rd Party 에서 제작한 호환성을 갖춘 Custom보드
- 아두이노 쉴드 : 아두이노 UNO 보드 혹은 기타 보드 위에 층층이 쌓아서 사용가능한 기능 확장용 보드들 지칭(예 WIFI쉴드, Ethernet쉴드)
- 아두이노 UNO 보드 구성요소 : 
- 1. USB Plug : USB 포트와 연결되며 전원과 작성한 코드를 보드에 컴파일 할 때 사용
- 2. External Power Supply : 외부 전원으로 이미 프로그래밍이 완료된 보드에 전원만 공급할 때 사용
- 3. Ground(grd) : 접지라고 하며, 전기의 기준점을 의미
- 4. Digital Pin : UNO 보드를 기준으로 0-13번까지 사용하는 핀포트로 보드 상단에 위치하며, 0V(off,LOW,0)와 5V(on,HIGH,1)의 입력 및 출력이 가능
- 5. Analog Pin : 아날로그 신호를 입력받을 수 있는 핀으로 0-5V를 1024단계의 구분된 값으로 변환이 가능
- 브레드 보드 : 프로토타입 보드의 일종으로 플라스틱틀 아래에 전류가 흐를 수 있는 라인이 배치된 것으로 기존 PCB보드나 만능기판과 다르게 납땜이
- 필요하지 않아 수정과 재 사용이 용이
- 아두이노 개발 과정 
- 1. 아두이노와 각종 장치들(LED, 센서, 모터 등등 ) 연결
- 2. 아두이노 개발환경(IDE)을 실행
- 3. 소스코드 작성(스케치, sketch)
- 4. 컴파일 및 업로드
- 5. 아두이노 동작 확인 
- 6. 디버깅, 3-5 반복
## 6월 15일 월(날씨 더움)
-아두이노를 통한 IoT
- Bluetooth : 근거리에서 전자기기 간에 선없이 연결되어 통신하는 기술
- 전자기기가 연결되기 위해서는 한쪽에서 신호를 내보내고 다른 한쪽에서 해당 신호에 동기화가 되어야 함
- 연결 된 이후에느 제한없이 양방향 통신이 가능
- SoftwareSerial 라이브러리 : Digital pin의 0번과 1번만이 해당 기능을 수행
- name.end(), name.begin(speed).. : name은 객체를 만들었다고 생각하면 됨

- AT: 블루투스가 연결되었다.
- AT+NAME->AT+NAMEZZZ: 블루투스 이름 지정
- AT+PIN->AT+PIN0000: 블루투스 비번 지정
- led 연결 : 핸드폰으로 on입력하면 켜지게, off 입력하면 꺼지게
- 98:D3:11:FD:5E:45
- 아두이노로 와이파이 할 때는 setup() mySerial.begin(115200);// 와이파이여서 115200써준다.
- 시리얼 모니터에 Both NL& CR 체크해주기
- 와이파이 할 때 시리얼 모니터에 AT+UART_DEF=9600,8,1,0,0으로 바꾸고
- setup에서  mySerial.begin(9600)으로 바꾸고 시리얼 모니터에 AT 입력
- 시리얼 모니터에 AT+CWMODE=1 와이파이 연결한다는 의미
- AT+CWLAP 치면 지금 잡을 수 있는 와이파이 목록이 뜬다.
- AT+CWJAP 와이파이 이름이랑 비번 치면 해당 와이파이에 연결됨
- AT+CWJAP="A_CLASS","khacademy*"
- AT+CIFSR
- cmd에서 ping 나의 아이피주소
- 와이파이 예제에서 Web Server 선택 하면 아두이노가 만든 와이파이 서버가 나옴 
## 6월 16일 화(날씨 더움)
- 아두이노 입력과 출력
- actuator : 아두이노의 프로그래밍에 의해 어떠한 움직임이나 활동을 할 수 있게 하는 것
- 예) led, lcd, 모터 등등
- sensor : 주위 환경에 대한 정보를 확인한 뒤 전기적 신호를 이용해 아두이노로 정보를 입력하는 전자 부품
- 예) 온도센서, 습도센서, 카메라 등등
- 센서를 통해 정보를 입력받아 엑츄에이터로 표현하는 것
- 예) 온도센서를 통해 체온을 측정하여, 37.5도가 넘는 경우 LED로 위험을 표시하는 것
- 아두이노는 다양한 센서를 이용하여 정보를 수집하고, 다양한 액츄에이터를 이용하여 표현 및 동작이 가능
- Serial
- Serial Monitor : PC와 아두이노가 데이터를 주고받기 위해 사용하는 툴로, 주로 디버깅, 데이터 입력을 위해 사용한다.
- Serial Monitor를 이용한 디버깅이 거의 유일한 디버깅 방법이므로 매우 중요하게 사용된다.
- Serial 함수
- 아두이노 소스에서 Serial 통신을 위해 사용하는 함수
- Serial.begin(): PC로 메시지를 보낼 때 속도를 설정하는 함수로, 읽어올 때 속도가 맞지 않는 경우 정상적으로 메세지를 볼 수 없음
- Serial.write(): Serial모니터에 메시지를 전송하는 함수로 숫자전송시 그대로 전송하여 출력시 아스키코드로 변환하여 출력되어
- 원하는 숫자를 출력할 수 없음 
- Serial.print(): Serial 모니터에 메시지를 전송하는 함수로 아크시코드로 변환하여 보내서 출력시 원하는 숫자를 그래도 볼 수 있음
- Serial.read(): Serial모니터에서 입력받은 값을 char형으로 모두 변환하여 한글자씩 읽어옴
- Serial.readString(): Serial모니터에서 입력받은 값을 문자열로 받기 위해 사용
- Serial.parseInt(): Serial모니터에서 입력받은 값을 정수로 받기 위해 사용
- LCD(Liquid Crystal Display)
- 액정 표시장치로 저전력으로 작동하는 장점이 있지만, 시야각이 제한적이고 선명함이 떨어지는 단점이 있음
- 아두이노에서는 16개의 문자를 2줄로 표기하여 총 32글자를 표기할 수 있는 1602 LCD를 가장 보편적으로 사용
- LCD 사용 방법
- 1. 라이브러리 추가 다운로드
- LCD 라이브러리를 사용하기 위해 다운로드 하여 설치
- 툴->라이브러리 관리 -> LiquidCrystal I2C 검색 후 설치
- 2. 소스코드에 라이브러리 추가
- 소스코드 상단에  라이브러리 사용을 위한 선언문 추가
- #include<LiquidCrystal_I2C.h> 추가
- 3. LiquidCrystal_I2C 객체 생성
- 4. 메소드 사용
- LiquidCrystal_I2C 객체의 주요 메소드
- setCursor(): LCD의 글자를 입력할 커서 위치를 조정하는 함수로 매개변수 2개를 받아 해당 위치로 커서를 움직인다.(열,행)순서
- noDisplay(): 화면에 표시된 문자열을 사라지게 하지만 내용은 메모리에 남아있다.
- display(): noDisplay()에 의해서 사라진 문자열을 다시 보이게 한다.
- clear(): 화면에 표시된 문자열을 사라지게 하며 메모리에서 지운다.(되살릴 수 없음)
- print(): 화면에 문자를 출력
- write(): 화면에 ASCII코드 값을 출력(사용자 정의 특수문자 출력 시에도 사용)
- createChar(): 배열을 통해 만들어진 특수문자를 등록한다.
- scrollDisplayLeft(): 현재 표시된 문자열을 왼쪽으로 한칸 이동한다.
- scrollDisplayRight(): 현재 표시된 문자열을 오른쪽으로 한칸 이동한다.
- LiquidCrystal_I2C의 특수문자 사용
- 1. 길이가 8인 byte배열을 생성한다.
- 2. 2진 데이터를 이용하여 화면에 출력할 부분을 1로 표현하여 배열의 값을 채운다.
- 3. creatChar()메소드를 이용하여 문자를 저장한다.
- 4. write()메소드를 통해 화면에 출력한다.
- LiquidCrystal_I2C의 특수문자 사용
- btye text[8] ={
- B11111,
- B10001,
- B10001,
- B10001,
- B10001,
- B10001,
- B10001,
- B11111,
- }
- lcd.createChar(0,text);
- lcd.setCursor(0,0);
- lcd.write(btye(0));
- 1인 경우는 표현되고, 0인 부분은 표현되지 않는 모양으로 출력
 ## 6월 22일 월(날씨 더움)
- IoT (Internet of Things)란 각종 사물에 센서와 통신 기능을 내장하여 인터넷에 연결하는 기술로 유선/무선 통신을 통해 각종 사물을 연결하는 기술
- 아두이노를 통한 IoT
- 1. Ethernet: LAN(Local Area Network)을 위해 개발된 근거리 유선 네트워크 통신망 기술로 CSMA/CD 프로토콜을 이용하여 통신하며 
- IEEE 802.3에 표준으로 정의되어 있음
- 2.WIFI : 무선 접속장치(Access Point)가 설치된 곳의 일정 거리 안에서 초고속 인터넷을 할 수 있는 근거리 통신망
- 3.Bluetooth : 근거리에서 전자기기 간에 연결없이 주파수로 데이터를 교환할 수 있게 하는 기술로 10m안의 거리에서 저전력으로 데이터를 주고받을 수 
- 있는 기술
- Bluetooth
- Bluetooth의 Master/Slave
- 블루투스는 근거리에서 전자기기 간에 선없이 연결되어 통신하는 기술
- 전자기기가 연결되기 위해서는 한쪽에서 신호를 내보내고 다른 한쪽에서 해당 신호에 동기화가 되어야 함
- 블루투스의 경우Master기기가 생성하는 주파수에 Slave기기를 동기화 시키는 개념
- 연결의 주체를 Master가 가지고 있음
- 연결이 된 이후에는 제한없이 양방향 통신이 가능
- SoftwareSerial 라이브러리
- 데이터를 입출력 하기 위해서는 데이터를 전송하는 pin과 데이터를 수신하는 pin이 각각 필요한데 보드의 기본설정으로는 Digital pin의 0번과
- 1번만이 해당기능 수행이 가능
- 일반 입출력 데이터 핀을 RX, TX핀으로 동작할 수 있게 해주는 라이브러리
- SoftwareSerial 함수
- SoftwareSerial name(rx,tx) : SoftwareSerial 클래스의 생성자로 RX,TX핀을 지정하면 지정한 이름으로 객체 사용
- name.begin(speed) : 시리얼 통신을 초기화하고 전송속도를 설정
- name.end(): 시리얼 통신을 종료
- name.available(): 수신 버퍼에 저장되어 있는 데이터의 바이트 수 반환, 수신 대기 상태가 아니거나 버퍼가 비어있는 경우 0을 반환하며,
- 일반적으로 데이터를 받기를 기다릴 때 if문을 이용하여 사용
- name.read(): 수신 버퍼의 첫번째 문자를 반환하며, 반환한 데이터를 수신 버퍼에서 제거(Serial.read()와 같은 역할)
- name.readString(): 수신 버퍼의 데이터를 문자열로 반환
- name.print(value) : value를 시리얼 포트로 출력
- name.write(character): 바이트 단위의 데이터 전송, Serial.write()와 달리 바이트 배열을 전송하는 기능은 없음
- Bluetooth의 AT Command(HC-06모듈 기준)
- Command / 응답값/ 설명
- AT/OK/블루투스 모듈 연결확인
- AT+NAME/OK/블루투스 이름확인,설정(default:hc-06)
- AT+PIN/OK/블루투스 비밀번호 확인,설정(default:1234)
- AT+ROLE/OK/Master,Slave모드 설정(0:Slave, 1:master) default: slave
- AT+BAUD1~8/ OK/통신속도설정(1~8 숫자마다 통신속도 지정)4:9600(default),8:115200bps 등등
