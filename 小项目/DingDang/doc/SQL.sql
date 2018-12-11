CREATE VIEW ScoreJoin AS
select t.name stuName, s.Sid , s.Cid, c.name as coursename,s.score, c.term
from stus as t ,scores as s, courses as c
where t.id=s.sid and c.id=s.cid;