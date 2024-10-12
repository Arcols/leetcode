SELECT d.name AS Department, e.name AS Employee, e.salary
FROM employee e, department d 
WHERE e.departmentId = d.id
AND e.salary = (
    SELECT MAX(salary)
    FROM employee e2
    WHERE e2.departmentId = d.id
);