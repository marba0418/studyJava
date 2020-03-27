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
