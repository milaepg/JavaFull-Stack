-- Consulta 1
SELECT first_name, last_name, email, address FROM customer WHERE city_id = 312;

-- Consulta 2
SELECT title, description, release_year, rating, special_features, name AS category
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Comedy';

-- Consulta 3
SELECT actor.actor_id, actor.first_name, actor.last_name, film.title, film.description, film.release_year
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.actor_id = 5;

-- Consulta 4
SELECT first_name, last_name, email, address
FROM customer
WHERE store_id = 1 AND city_id IN (1, 42, 312, 459);

-- Consulta 5
SELECT film.title, film.description, film.release_year, film.rating, film.special_features
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.actor_id = 15 AND film.rating = 'G' AND film.special_features LIKE '%Behind the Scenes%';

-- Consulta 6
SELECT film.film_id, film.title, actor.actor_id, CONCAT(actor.first_name, ' ', actor.last_name) AS actor_name
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE film.film_id = 369;

-- Consulta 7
SELECT film.title, film.description, film.release_year, film.rating, film.special_features, category.name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE film.rating = 'PG-13' AND film.rental_rate = 2.99 AND category.name = 'Drama';

-- Consulta 8
SELECT film.title, film.description, film.release_year, film.rating, film.special_features, category.name, CONCAT(actor.first_name, ' ', actor.last_name) AS actor_name
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Action' AND actor.first_name = 'Sandra' AND actor.last_name = 'Kilmer';

