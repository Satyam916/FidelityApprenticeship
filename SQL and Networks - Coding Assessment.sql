create table worker(
worker_id int primary key,
first_name varchar(50),
last_name varchar(50),
salary decimal(10,2),
joining_date date,
department varchar(50)
);
insert into worker
values
(1,'Monika','Arora','100000.00','2020-02-14','HR'),
(2,'Niharika','Verma','80000.00','2011-02-14','Admin'),
(3,'Vishal','Singhal','300000.00','2020-02-14','HR'),
(4,'Amitabh','Singh','500000.00','2020-02-14','Admin'),
(5,'Vivek','Bhati','500000.00','2011-06-14','Admin'),
(6,'Vipul','Diwan','200000.00','2011-06-14','Account'),
(7,'Satish','Kumar','75000.00','2020-01-14','Account'),
(8,'Geetika','Chauhan','90000.00','2011-04-14','Admin');

create table bonus(
worker_ref_id int,
bonus_amount decimal(10,2),
bonus_date date,
foreign key(worker_ref_id) references worker(worker_id)
);
 
insert into bonus
values
(1,5000,'2020-02-16'),
(2,3000,'2011-06-16'),
(3,4000,'2020-02-16'),
(1,4500,'2020-02-16'),
(2,3500,'2011-02-16'),
(4,4500,'2020-02-16'),
(5,3500,'2011-02-16');

create table title(
worker_ref_id int,
worker_title varchar(50),
affected_from date,
foreign key(worker_ref_id) references worker(worker_id)
);

insert into title
values
(1,'Manager','2016-02-20'),
(2,'Executive','2016-06-11'),
(8,'Executive','2016-06-11'),
(5,'Manager','2016-06-11'),
(4,'Asst. Manager','2016-06-11'),
(7,'Executive','2016-06-11'),
(6,'Lead','2016-06-11'),
(3,'Lead','2016-06-11');

--Query to display
select w.first_name,w.salary,t.worker_title
from worker w
join title t
on w.worker_id=t.worker_ref_id;

--Count of workers based on the nth highest salary
create or replace function get_worker_count_by_nth_highest_salary(n int)
returns int 
language plpgsql
as 
$$
declare
nth_highest_salary decimal(10,2);
worker_count int;
begin
select distinct salary
into nth_highest_salary
from worker
order by salary desc
limit 1 offset n-1;
--Count
select count(*)
into worker_count
from worker
where salary=nth_highest_salary;
return worker_count;
end;
$$ 

select get_worker_count_by_nth_highest_salary(1);