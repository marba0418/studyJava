3월 11일 수(날씨 좋음)

[DML(DATE MANIPULATION LANGUAGE)]
-실제로 많이 씀 

-데이터 조작 언어

-테이블에 값을 삽입,수정, 삭제 하는 역할

-INSERT(삽입),UPDATE(수정),DELETE(삭제)

DELETE: 행 개수 감소 (꼭 WHERE 절 넣기)

[TRANSCATION]

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
