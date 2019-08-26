/*1*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid 
WHERE aircraft.aname = 'Boeing';


/*2*/
SELECT employees.ename
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid 
WHERE aircraft.aname = 'Boeing';


/*3*/
SELECT aid
FROM aircraft
WHERE EXISTS(
	SELECT distance 
	FROM flight 
	WHERE origin = 'Bangalore' AND destination = 'Frankfurt' AND distance <= aircraft.cruisingrange
);


/*4*/
SELECT employees.ename
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
WHERE employees.salary > '$100000';


/*5*/
SELECT DISTINCT employees.ename
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid
WHERE aircraft.cruisingrange > 3000 AND aircraft.aname = 'Boeing';

/*6*/
SELECT eid, salary
FROM employees
ORDER BY salary DESC LIMIT 1;

/*7*/
SELECT eid, salary
FROM employees
ORDER BY salary DESC OFFSET 1 LIMIT 1;

/*8*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
GROUP BY employees.eid
ORDER BY COUNT(certified.eid) DESC LIMIT 1;


/*9*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
GROUP BY employees.eid
HAVING COUNT(certified.eid) = 3;


/*10*/
SELECT SUM(salary) AS salaries FROM employees;