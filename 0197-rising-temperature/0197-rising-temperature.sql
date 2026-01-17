# Write your MySQL query statement below
select w1.id from 
Weather w1 
join Weather w2 
# now we will check the prev date and the todays date diff is 1
on DATEDIFF(w1.recordDate , w2.recordDate) = 1
# so we will check the w1 and w2 ke bich me diff 1 ho
# w1 will be greater
where w1.temperature > w2.temperature;