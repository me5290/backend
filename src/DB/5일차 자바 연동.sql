# 1. 데이터베이스 생성
drop database if exists test5;
create database test5;
use test5;

# 2. 테이블 생성
drop table if exists table1;
create table table1(
	데이터필드1 int,
    데이터필드2 varchar(30)
);

# 3. 조작어
# [C] insert
# java 작성 : insert into table1 values(1,"유재석");

insert into table1 (데이터필드1) values(5);
# [R] select
select*from table1;
select 데이터필드2 from table1;
# [U] update
update table1 set 데이터필드2 = "강호동";
	# 특정 조건에 충족하는 레코드의 필드 값을 수정
update table1 set 데이터필드2 = "강호동" where 데이터필드1 = 5;		-- 조건식 : 만약에 데이터필드1 값이 5인 레코드만 수정
# [D] delete
delete from table1;		-- 추후에 취소 가능/복구 가능/where사용 가능
	# 특정 조건에 충족하는 레코드 삭제
delete from table1 where 데이터필드1 = 5;		-- 조건식 : 만약에 데이터필드1 값이 5인 레코드만 삭제

	# vs
    
truncate table table1;  -- 추후에 취소 불가능/복구 불가능

use test5;
drop table if exists members;
create table members(
	name varchar(30)
);

# 1.

# 2.
select*from members;

# 3.
update members set name = '신동엽' where name = '강호동';

# 4.
delete from members where name = '신동엽';