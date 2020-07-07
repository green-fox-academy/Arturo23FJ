/*Exercise 1*/

SELECT title FROM Movie WHERE director = "Steven Spielberg";

/*Exercise 2*/

SELECT DISTINCT year FROM Movie INNER JOIN Rating ON Movie.mID = Rating.mID WHERE stars >= 4 ORDER BY year;

/*Exercise 3*/

SELECT title FROM Movie LEFT JOIN Rating ON Movie.mID = Rating.mID WHERE stars IS NULL;

/*Exercise 4*/

SELECT reviewer.name FROM rating INNER JOIN movie ON rating.mID = movie.mID INNER JOIN reviewer ON rating.rID = reviewer.rID WHERE rating.ratingDate IS NULL;

/*Exercise 5*/

SELECT reviewer.name, movie.title, rating.stars, rating.ratingDate FROM rating INNER JOIN movie ON rating.mID = movie.mID INNER JOIN reviewer ON rating.rID = reviewer.rID ORDER BY reviewer.name ASC, movie.title ASC, rating.stars ASC;

/*Exercise 6*/

SELECT reviewer.name, movie.title FROM Movie JOIN rating AS r1 ON r1.mID = movie.mID JOIN rating AS r2 ON r2.rID = r1.rID JOIN reviewer ON r1.rID = reviewer.rID WHERE r1.mID = r2.mID AND r1.ratingDate < r2.ratingDate AND r1.stars < r2.stars;