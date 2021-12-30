CREATE PROCEDURE `login` (
IN user varchar(255),
IN pass varchar(255))
BEGIN
SELECT * from logins 
WHERE username = user 
AND password = pass;
END
