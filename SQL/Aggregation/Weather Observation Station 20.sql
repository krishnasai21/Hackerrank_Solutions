select 

round(sta.lat_n, 4) 

from station as sta 

where 

(select count(lat_n) from station where lat_n < sta.lat_n) = (select count(lat_n) from station where lat_n > sta.lat_n);
