# 1. 데이터베이스 생성
drop database if exists test6;
create database test6;
use test6;

# 2. 테이블 생성
	# 회원제기능, 카테고리게시물기능, 댓글기능
	# 1. 저장할 데이터들을 선정
    # 2. 관심사끼리 묶어서 데이터들을 테이블 설계
    # 3. 관계 설정(PK , FK)			* 테이블당 pk 1개 이상 권장
    # 4. 제약 조건

/*
	제약조건
		1. not null
        2. unique
        3. default 값/함수()
		4. primary key(pk필드명)
        5. foreign key(fk필드명) references 참조할테이블명(참조할pk필드명)
        6. auto_increment
*/

create table member(
	mno int auto_increment,
    mid varchar(10),
    mpw varchar(10),
    primary key(mno)
);

create table bcategory(
	bcno int auto_increment,
    bcname varchar(10),
    primary key(bcno)
);

create table board(
	bno int auto_increment,
    btitle text,
    bcontent text,
    primary key(bno)
);

create table reply(
	rno int auto_increment,
    rcontent text,
    primary key(rno)
);