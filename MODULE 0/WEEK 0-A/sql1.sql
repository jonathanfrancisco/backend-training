/*1*/
SELECT DISTINCT supplier.sname FROM supplier
INNER JOIN catalog ON supplier.sid = catalog.sid
INNER JOIN parts ON catalog.pid = parts.pid
WHERE parts.color = 'red';

/*2*/
SElECT DISTINCT catalog.sid FROM catalog
WHERE catalog.pid
IN(SElECT parts.pid FROM parts WHERE parts.color IN('red', 'green'));
	
/*3*/
SELECT DISTINCT supplier.sid FROM supplier
INNER JOIN catalog ON supplier.sid = catalog.sid
INNER JOIN parts ON catalog.pid = parts.pid
WHERE parts.color = 'red' OR supplier.address = 'Hyattfurt';

/*4*/
SElECT DISTINCT catalog.sid FROM catalog
WHERE EXISTS(SELECT p1.pid FROM parts p1 WHERE catalog.pid = p1.pid AND EXISTS(
    SELECT p2.color FROM parts p2 WHERE (p2.color = 'green' OR p2.color = 'red') AND catalog.pid = p2.pid
));

/*5*/

/*6*/

/*7*/

/*8*/

/*9*/

/*10*/

/*11*/
SELECT parts.pid
FROM supplier
INNER JOIN catalog ON catalog.sid = supplier.sid
INNER JOIN parts ON parts.pid = catalog.pid
WHERE supplier.sname = 'Jeff Kuhic'
ORDER BY catalog.cost DESC LIMIT 1;


/*12*/
SELECT supplier.sname, parts.pid, catalog.cost
FROM parts
INNER JOIN catalog ON catalog.pid = parts.pid
INNER JOIN supplier ON supplier.sid = catalog.sid
WHERE catalog.cost < 4000;