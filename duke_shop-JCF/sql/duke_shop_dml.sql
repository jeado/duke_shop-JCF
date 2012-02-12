DROP TABLE CUSTOMER;
pCREATE TABLE CUSTOMER(
	id varchar2(20)  not null,
	passwd varchar2(20)  not null,
	name varchar2(20)  not null,
	dept_name varchar2(20)  ,
	email varchar2(20)  ,
	reg_date date  ,
	log_date date
)

DROP TABLE PRODUCT;
create table PRODUCT(
	pid varchar2(20) not null,
	pname varchar2(20) not null,
	photo varchar2(50) not null,
	descr varchar2(50),
	price number(20),
	stock number(10)
)

DROP TABLE ORDERS;
CREATE TABLE ORDERS(
	oid varchar2(20) not null,
	pid varchar2(20) not null,
	id varchar2(20) not null,
	qty number(10) not null,
	reg_date date
)