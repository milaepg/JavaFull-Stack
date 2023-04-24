-- Consulta 1
SELECT EXTRACT(MONTH FROM billing.charged_datetime) AS 'month', SUM(billing.amount) AS revenue
FROM billing
WHERE billing.charged_datetime >= '2012/03/01' AND billing.charged_datetime < '2012/04/01';

-- Consulta 2
SELECT clients.client_id,CONCAT(clients.first_name, ' ', clients.last_name) AS client_name, SUM(billing.amount) AS revenue
FROM clients
JOIN billing ON clients.client_id = billing.client_id AND clients.client_id = 2
GROUP BY client_name;

-- Consulta 3
SELECT clients.client_id, CONCAT(clients.first_name, ' ', clients.last_name) AS client_name, sites.domain_name
FROM clients
JOIN sites ON clients.client_id = sites.client_id AND clients.client_id = 10;

-- Consulta 4
SELECT clients.client_id, COUNT(sites.site_id) AS sites_created, MONTH(sites.created_datetime) AS 'month', YEAR(sites.created_datetime) AS 'year'
FROM clients
JOIN sites ON clients.client_id = sites.client_id AND clients.client_id = 1
GROUP BY MONTH(sites.created_datetime) , YEAR(sites.created_datetime)
ORDER BY MONTH(sites.created_datetime) ASC;

-- Consulta 5 
SELECT COUNT(leads.leads_id) AS '# of leads', sites.domain_name, leads.registered_datetime
FROM sites
JOIN leads ON sites.site_id = leads.site_id AND leads.registered_datetime >= '2011-01-01' AND leads.registered_datetime <= '2011-02-15'
GROUP BY sites.domain_name;

-- Consulta 6
SELECT CONCAT(clients.first_name, ' ', clients.last_name) AS 'client_name', COUNT(leads.leads_id) AS 'number_of_leads'
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
LEFT JOIN leads ON sites.site_id = leads.site_id AND leads.registered_datetime >= '2011-01-01'AND leads.registered_datetime <= '2011-12-31'
GROUP BY clients.client_id
ORDER BY '# of leads' DESC;

-- Consulta 7
SELECT CONCAT(clients.first_name, ' ', clients.last_name) AS 'client name', COUNT(leads.leads_id) AS '# of leads', MONTH(leads.registered_datetime) AS 'month'
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id = leads.site_id AND leads.registered_datetime >= '2011-01-01' AND leads.registered_datetime < '2011-06-01'
GROUP BY clients.client_id , MONTH(leads.registered_datetime)
ORDER BY '# of leads' DESC;

-- Consulta 8
SELECT clients.client_id, CONCAT(clients.first_name, ' ', clients.last_name) AS 'client name', sites.domain_name, COUNT(leads.leads_id) AS '# of leads'
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
JOIN leads ON sites.site_id = leads.site_id AND leads.registered_datetime >= '2011-01-01'AND leads.registered_datetime <= '2011-12-31'
GROUP BY sites.domain_name
ORDER BY clients.client_id ASC;


-- Consulta 9
SELECT clients.client_id, CONCAT(clients.first_name, ' ', clients.last_name) AS 'client_name', SUM(billing.amount) AS revenue, MONTH(billing.charged_datetime) AS 'month', YEAR(billing.charged_datetime) AS 'year'
FROM clients
JOIN billing ON clients.client_id = billing.client_id
GROUP BY clients.client_id , MONTH(billing.charged_datetime)
ORDER BY clients.client_id ASC , MONTH(billing.charged_datetime) ASC , YEAR(billing.charged_datetime) ASC;

-- Consulta 10
SELECT clients.client_id, CONCAT(clients.first_name, ' ', clients.last_name) AS 'client_name', GROUP_CONCAT(' ', sites.domain_name) AS 'sites'
FROM clients
LEFT JOIN sites ON clients.client_id = sites.client_id
GROUP BY clients.client_id;