/*1. Find the names of suppliers who supply some red part.*/
SELECT DISTINCT supplier.sname FROM supplier
INNER JOIN catalog ON supplier.sid = catalog.sid
INNER JOIN parts ON catalog.pid = parts.pid
WHERE parts.color = 'red';

/*2. Find the sids of suppliers who supply some red or green part.*/
SElECT DISTINCT catalog.sid FROM catalog
WHERE catalog.pid
IN(SElECT parts.pid FROM parts WHERE parts.color IN('red', 'green'));
	
/*3. Find the sids of suppliers who supply some red part or are at Hyattfurt.*/
SELECT DISTINCT supplier.sid FROM supplier
INNER JOIN catalog ON supplier.sid = catalog.sid
INNER JOIN parts ON catalog.pid = parts.pid
WHERE parts.color = 'red' OR supplier.address = 'Hyattfurt';

/*4. Find the sids of suppliers who supply some red part and some green part.*/
SElECT DISTINCT catalog.sid FROM catalog
WHERE EXISTS(SELECT p1.pid FROM parts p1 WHERE catalog.pid = p1.pid AND EXISTS(
    SELECT p2.color FROM parts p2 WHERE (p2.color = 'green' OR p2.color = 'red') AND catalog.pid = p2.pid
));

/*5. Find the sids of suppliers who supply every part.*/
SELECT catalog.sid
FROM catalog WHERE NOT EXISTS(
    SELECT parts.pid
    FROM parts
    WHERE catalog.pid != parts.pid
);

/*6. Find the sids of suppliers who supply every red part.*/
SELECT catalog.sid
FROM catalog WHERE NOT EXISTS(
    SELECT parts.pid
    FROM parts
    WHERE parts.color != 'red'
);

/*7. Find the sids of suppliers who supply every red or green part.*/
SELECT *
FROM catalog WHERE NOT EXISTS(
    SELECT parts.pid
    FROM parts
    WHERE parts.color != 'red'
) 
OR 
(SELECT parts.color 
    FROM parts
    WHERE parts.pid = catalog.pid
) = 'green';

/*8. Find the sids of suppliers who supply every red part or supply every green part.*/
SELECT catalog.sid
FROM catalog WHERE NOT EXISTS(
    SELECT parts.pid
    FROM parts
    WHERE parts.color NOT IN('red', 'green')
);

/*9. Find pairs of sids such that the supplier with the first sid charges more for some part than the supplier with the second sid.*/

/*10. Find the pids of parts that are supplied by at least two different suppliers.*/
SELECT DISTINCT 1.pid
FROM catalog AS c1
WHERE EXISTS (
    SELECT c2.sid
    FROM catalog AS c2
    WHERE c2.pid = c1.pid AND c2.sid != c1.sid 
);

/*11. Find the pids of the most expensive parts supplied by suppliers named Jeff Kuhic.*/
SELECT parts.pid
FROM supplier
INNER JOIN catalog ON catalog.sid = supplier.sid
INNER JOIN parts ON parts.pid = catalog.pid
WHERE supplier.sname = 'Jeff Kuhic'
ORDER BY catalog.cost DESC LIMIT 1;


/*12. Find the pids of parts supplied by every supplier at less than 4,000. (If any supplier either does not supply the part or charges more than 4000 for it, the part is not selected.*/
SELECT supplier.sname, parts.pid, catalog.cost
FROM parts
INNER JOIN catalog ON catalog.pid = parts.pid
INNER JOIN supplier ON supplier.sid = catalog.sid
WHERE catalog.cost < 4000;