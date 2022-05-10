use salesman_db;

SELECT 
    COUNT(ord_no)
FROM
    orders;

SELECT DISTINCT
    cust_name
FROM
    customer;
    
SELECT 
    `name`, COUNT(`name`) AS sales
FROM
    salesman
        LEFT JOIN
    orders ON salesman.salesman_id = orders.salesman_id
GROUP BY `name`
HAVING COUNT(`name`)
ORDER BY sales DESC;

SELECT 
    *
FROM
    customer
ORDER BY customer_id
LIMIT 5;

SELECT 
    MIN(purch_amt) AS min, MAX(purch_amt) AS max
FROM
    orders;