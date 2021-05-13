-- github.com/krishnasai21
SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;
