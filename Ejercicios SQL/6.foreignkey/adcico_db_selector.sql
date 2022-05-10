SELECT 
    *
FROM
    country
        INNER JOIN
    city ON country.country_id = city.country_id
        INNER JOIN
    address ON city.city_id = address.address_id;