## MappedSuperclass

The parent classes, can’t be entities.

### User 
Parent class so table is not created.
### Mentor (msc_mentor)

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

### TA (msc_ta)
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
### Instructor (msc_instructor)
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