use office_db;

select * from office_db.departments;
select first_name, last_name, phone_number from office_db.employees;
select first_name as nombre, last_name as apellido, phone_number as telefono from office_db.employees;
select * from employees where phone_number='515.127.4565';
delete from employees where phone_number='515.127.4565';
select * from employees where phone_number='515.127.4565';
select * from employees where (salary > 5000) and department_id='5';
 