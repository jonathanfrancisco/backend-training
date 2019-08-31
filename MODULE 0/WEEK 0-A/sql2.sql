/*1. Find the eids of pilots certified for some Boeing aircraft.*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid 
WHERE aircraft.aname = 'Boeing';

/*2. Find the names of pilots certified for some Boeing aircraft.*/
SELECT employees.ename
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid 
WHERE aircraft.aname = 'Boeing';

/*3. Find the aids of all aircraft that can be used on non-stop flights from Bangalore to Frankfurt.*/
SELECT aid
FROM aircraft
WHERE EXISTS(
	SELECT distance 
	FROM flight 
	WHERE origin = 'Bangalore' AND destination = 'Frankfurt' AND distance <= aircraft.cruisingrange
);

/*4. Identify the flights that can be piloted by every pilot whose salary is more than 100,000.
(Hint: The pilot must be certified for at least one plane with a sufficiently large cruising range.)*/
SELECT *
FROM flight
WHERE EXISTS (
	SELECT aircraft.cruisingrange
	FROM employees
	INNER JOIN certified ON employees.eid = certified.eid
	INNER JOIN aircraft ON certified.aid = aircraft.aid
	WHERE employees.salary > '100000' AND aircraft.cruisingrange >= flight.distance
);

/*5. Find the names of pilots who can operate some plane with a range
greater than 3,000 miles but are not certified on any Boeing aircraft.*/
SELECT DISTINCT employees.ename
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
INNER JOIN aircraft ON certified.aid = aircraft.aid
WHERE aircraft.cruisingrange > 3000 AND aircraft.aname = 'Boeing';

/*6. Find the eids of employees who make the highest salary.*/
SELECT eid
FROM employees
ORDER BY salary DESC LIMIT 1;

/*7. Find the eids of employees who make the second highest salary.*/
SELECT eid
FROM employees
ORDER BY salary DESC OFFSET 1 LIMIT 1;

/*8. Find the eids of pilots who are certified for the largest number of aircraft.*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
GROUP BY employees.eid
ORDER BY COUNT(certified.eid) DESC LIMIT 1;


/*9. Find the eids of employees who are certified for exactly three aircraft.*/
SELECT employees.eid
FROM employees
INNER JOIN certified ON employees.eid = certified.eid
GROUP BY employees.eid
HAVING COUNT(certified.eid) = 3;


/*10. Find the total amount paid to employees as salaries.*/
SELECT SUM(salary) AS salaries FROM employees;