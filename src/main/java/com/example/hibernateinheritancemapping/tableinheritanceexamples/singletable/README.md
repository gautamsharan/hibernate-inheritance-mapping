## Single Table

The entities from different classes with a common ancestor are placed in a single table.

Only one table is created.

### User (st_user)

```angular2html
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| user_type    | int          | NO   |     | NULL    |       |
| id           | bigint       | NO   | PRI | NULL    |       |
| email        | varchar(255) | YES  |     | NULL    |       |
| first_name   | varchar(255) | YES  |     | NULL    |       |
| last_name    | varchar(255) | YES  |     | NULL    |       |
| course       | varchar(255) | YES  |     | NULL    |       |
| num_of_hours | bigint       | YES  |     | NULL    |       |
| rating       | int          | YES  |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
```
### Mentor (st_mentor)
Table not created. Field `num_of_hours` added in user table.
### TA (st_ta)
Table not created. Field `rating` added in user table.
### Instructor (st_instructor)
Table not created. Field `course` added in user table.