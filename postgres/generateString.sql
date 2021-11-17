--strings

select
string_agg(substr(characters, (random() * length(characters) + 0.5)::integer, 1), '') as random_word
from (values('ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789')) as symbols(characters)
-- length of word
join generate_series(1, 15) on 1 = 1
