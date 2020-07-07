/*Exercise 1*/

SELECT title FROM Movie WHERE director = "Steven Spielberg";

/*Exercise 2*/

SELECT DISTINCT year FROM Movie INNER JOIN Rating ON Movie.mID = Rating.mID WHERE stars >= 4 ORDER BY year;

/*Exercise 3*/

SELECT title FROM Movie LEFT JOIN Rating ON Movie.mID = Rating.mID WHERE stars IS NULL;

/*Exercise 4*/

SELECT Reviewer.name FROM rating INNER JOIN Movie ON Rating.mID = Movie.mID INNER JOIN Reviewer ON Rating.rID = Reviewer.rID WHERE Rating.ratingDate IS NULL;

/*Exercise 5*/

SELECT Reviewer.name, Movie.title, Rating.stars, Rating.ratingDate FROM Rating INNER JOIN Movie ON Rating.mID = Movie.mID INNER JOIN Reviewer ON Rating.rID = Reviewer.rID ORDER BY Reviewer.name ASC, Movie.title ASC, Rating.stars ASC;

/*Exercise 6*/

SELECT Reviewer.name, Movie.title FROM Movie JOIN rating AS r1 ON r1.mID = Movie.mID JOIN Rating AS r2 ON r2.rID = r1.rID JOIN Reviewer ON r1.rID = Reviewer.rID WHERE r1.mID = r2.mID AND r1.ratingDate < r2.ratingDate AND r1.stars < r2.stars;