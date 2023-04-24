SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
INNER JOIN users AS users2 ON users2.id = friendships.friend_id;

-- Consulta 1
SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.friend_id AND users.first_name = 'Kermit'
INNER JOIN users AS users2 ON friendships.user_id = users2.id;

-- Consulta 2
SELECT COUNT(friendships.id) AS 'Number of Friendships'
FROM friendships;

-- Consulta 3 
SELECT users.first_name, users.last_name, COUNT(friendships.id) AS 'Number of Friends'
FROM users
JOIN friendships ON users.id = friendships.user_id
GROUP BY users.id
ORDER BY 'Number of Friends' DESC
LIMIT 1;

-- Consulta 4
insert into users (first_name, last_name)
values ("Brett", "Jory");
insert into friendships (user_id, friend_id)
values (6,2),(6,4),(6,5);

-- Consulta 5
SELECT users.first_name AS friend_first_name, users.last_name AS friend_last_name, users2.first_name, users2.last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
INNER JOIN users AS users2 ON friendships.friend_id = users2.id AND users2.first_name = 'Eli'
ORDER BY users.first_name ASC;

-- Consulta 6
SELECT users2.id AS 'id', users2.first_name AS 'first name', users2.last_name AS 'last name', users.first_name AS 'friend first', users.last_name AS 'friend last', friendships.friend_id
FROM users
LEFT JOIN friendships ON users.id = friendships.friend_id
AND users.first_name = 'Marky'
INNER JOIN users AS users2 ON friendships.user_id = users2.id
AND users2.first_name = 'Eli';
DELETE FROM friendships 
WHERE user_id = 2 AND friend_id = 5;

-- Consulta 7
SELECT users.first_name, users.last_name, users2.first_name AS friend_first_name, users2.last_name AS friend_last_name
FROM users
LEFT JOIN friendships ON users.id = friendships.user_id
INNER JOIN users AS users2 ON friendships.friend_id = users2.id;