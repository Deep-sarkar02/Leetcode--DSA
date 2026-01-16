# Write your MySQL query statement below
# so we will find the length of the char of the tweets and if thay are >15 then it is invalid
select tweet_id from Tweets where char_length(content)>15;

