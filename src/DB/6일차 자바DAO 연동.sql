# day18 회원가입 게시판
# 1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

# 2. (회원가입) 테이블
drop table if exists member;
create table member(
	mno int auto_increment,				-- 번호 , 자동번호 부여(auto_increment) : mysql 제공하는 제약조건 , pk만 가능
    mid varchar(30) not null unique,	-- 아이디
    mpw	varchar(30) not null,			-- 비밀번호
    mphone char(13) not null unique,	-- 전화번호 010-0000-0000 형식
    mdate datetime default now(),		-- 가입날짜
    primary key(mno)					-- 번호가 기본키(pk) - not null , unique 기본
);

# 확인용
select * from member;

# 회원가입
insert into member(mid , mpw , mphone) values('qweqweqwe' , 'qweqweqwe' , '010-0000-0000');

# 아이디 중복체크/검사/비교
select mid from member where mid = 'qwe';

# 로그인
select * from member where mid = 'qwe' and mpw = '12341234';

# 회원번호 찾기
select mno from member where mid = 'qwe';

# ===================================================================== #

# 3. (카테고리) 테이블
drop table if exists category;
create table category(
	cateno int auto_increment,
    catetitle varchar(30) not null unique,
    primary key(cateno)
);

# 3. (게시판) 테이블
drop table if exists board;
create table board(
	bno int auto_increment,
    btitle varchar(30) not null,
    bcontent longtext not null,
    bdate datetime default now(),
    bview mediumint default 0,
    mno int,
    cateno int,
    primary key(bno),
    foreign key(mno) references member(mno),
    foreign key(cateno) references category(cateno)
);

# 4. (댓글) 테이블
drop table if exists comment;
create table comment(
	cno int auto_increment,
	comcontent blob not null,
    bno int,
    mno int,
    primary key(cno),
    foreign key(bno) references board(bno),
    foreign key(mno) references member(mno)
);

select * from category;
select * from board;
select * from comment;

insert into category(catetitle) values('자유게시판');
insert into category(catetitle) values('공지사항');
insert into category(catetitle) values('이벤트');