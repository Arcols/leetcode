/* Write your PL/SQL query statement below */
SELECT c.name Customers
FROM customers c
LEFT JOIN orders o ON c.id = o.customerId
WHERE o.customerId IS NULL;