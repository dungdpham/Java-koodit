SELECT * FROM currency;


SELECT * FROM currency WHERE abbreviation = 'EUR';


SELECT COUNT(*) AS currencies_count FROM currency;


SELECT * FROM currency ORDER BY conversion_rate DESC LIMIT 1;
