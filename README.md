# Hibernate Inheritance Mapping

Relational databases don’t have a straightforward way to map class hierarchies onto database tables.

To address this, the JPA specification provides several strategies:

 - <b><i>MappedSuperclass</i></b> – the parent classes, can’t be entities
 - <b><i>Single Table</i></b> – The entities from different classes with a common ancestor are placed in a single table.
 - <b><i>Joined Table</i></b> – Each class has its table, and querying a subclass entity requires joining the tables. [e.g](/src/main/java/com/example/hibernateinheritancemapping/tableinheritanceexamples/joinedclass)
 - <b><i>Table per Class</i></b> – All the properties of a class are in its table, so no join is required. [e.g](/src/main/java/com/example/hibernateinheritancemapping/tableinheritanceexamples/tableperclass)

Each strategy results in a different database structure.

<b>Entity inheritance means that we can use polymorphic queries for retrieving all the subclass entities when querying for a superclass.</b>

Since Hibernate is a JPA implementation, it contains all of the above as well as a few Hibernate-specific features related to inheritance.

For more details refer - [https://www.baeldung.com/hibernate-inheritance](https://www.baeldung.com/hibernate-inheritance)
