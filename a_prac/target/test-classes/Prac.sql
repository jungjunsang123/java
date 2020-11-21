drop table PRAC_MEMBER 
drop table PRAC_BOARD 

create table PRAC_MEMBER(
	Member_ID varchar2(50) primary key,
	Member_Password varchar2(50) not null,
	Member_Name varchar2(50) not null,
	Member_Add varchar2(100) not null
)

select Member_ID,Member_name,Member_Password,Member_Add
 		from PRAC_MEMBER
 		where Member_Password='1234'
 		

create table PRAC_BOARD(
	B_NO varchar2(50) primary key,
	B_TITLE varchar2(50) not null,
	B_CONTENT CLOB not null,
	B_HITS number default 0 not null ,
	B_TIME_POSTED date not null,
	B_WRITER varchar2(100) not null,
	CONSTRAINT PRAC_BOARD_fk
	FOREIGN KEY (B_WRITER)
	REFERENCES PRAC_MEMBER(Member_ID)
)
CREATE SEQUENCE PRAC_BOARD_SEQ
    START WITH 1
    INCREMENT BY 1;
    
insert into prac_member values('java','1234','아이유','서울');
insert into PRAC_BOARD values('1','타이틀','내용',0,sysdate,'java');


select * from PRAC_MEMBER;
select * from prac_board;

commit