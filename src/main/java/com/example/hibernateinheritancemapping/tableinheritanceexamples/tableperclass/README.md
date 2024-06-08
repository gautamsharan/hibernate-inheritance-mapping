## Table Per Class

Separate table for each class both parent
and child. Here `User` is parent class and
all other class extends it.

### User (tpc_user)

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
### Mentor (tpc_mentor)

```angular2html
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| id           | bigint       | NO   | PRI | NULL    |       |
| email        | varchar(255) | YES  |     | NULL    |       |
| first_name   | varchar(255) | YES  |     | NULL    |       |
| last_name    | varchar(255) | YES  |     | NULL    |       |
| num_of_hours | bigint       | YES  |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
```

### TA (tpc_ta)
```angular2html
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | bigint       | NO   | PRI | NULL    |       |
| email      | varchar(255) | YES  |     | NULL    |       |
| first_name | varchar(255) | YES  |     | NULL    |       |
| last_name  | varchar(255) | YES  |     | NULL    |       |
| rating     | int          | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
```
### Instructor (tpc_instructor)
```angular2html
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | bigint       | NO   | PRI | NULL    |       |
| email      | varchar(255) | YES  |     | NULL    |       |
| first_name | varchar(255) | YES  |     | NULL    |       |
| last_name  | varchar(255) | YES  |     | NULL    |       |
| course     | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
```