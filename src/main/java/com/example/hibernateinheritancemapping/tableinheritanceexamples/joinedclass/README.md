## Joined Tables

Each class has its table, and querying a subclass entity requires joining the tables.

### User (jc_user)

```angular2html
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | bigint       | NO   | PRI | NULL    |       |
| email      | varchar(255) | YES  |     | NULL    |       |
| first_name | varchar(255) | YES  |     | NULL    |       |
| last_name  | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
```
### Mentor (jc_mentor)

```angular2html
+--------------+--------+------+-----+---------+-------+
| Field        | Type   | Null | Key | Default | Extra |
+--------------+--------+------+-----+---------+-------+
| num_of_hours | bigint | YES  |     | NULL    |       |
| user_id      | bigint | NO   | PRI | NULL    |       |
+--------------+--------+------+-----+---------+-------+
```

### TA (jc_ta)
```angular2html
+---------+--------+------+-----+---------+-------+
| Field   | Type   | Null | Key | Default | Extra |
+---------+--------+------+-----+---------+-------+
| rating  | int    | YES  |     | NULL    |       |
| user_id | bigint | NO   | PRI | NULL    |       |
+---------+--------+------+-----+---------+-------+
```
### Instructor (jc_instructor)
```angular2html
+---------+--------------+------+-----+---------+-------+
| Field   | Type         | Null | Key | Default | Extra |
+---------+--------------+------+-----+---------+-------+
| course  | varchar(255) | YES  |     | NULL    |       |
| user_id | bigint       | NO   | PRI | NULL    |       |
+---------+--------------+------+-----+---------+-------+
```