# Spring Boot Rest API
It is a **maven** project and developed by **Intellij Idea**.
## REST APIs' are
- **GET** *localhost:PORT/**user***
	get all Users from the list.
	
- **POST** *localhost:PORT/**user***
	store user in the list (ArrayList)
	Request Format **JSON**
	```
	{
		"name":"a name"
	}
	```
	It will be **returned** current stored **user**.
	the **id** will be automatically generated by **UUID**
	
- **GET** *localhost:PORT/user/**id**/**name***
	to edit a user & return edited user.
	
- **DELETE** *localhost:PORT/user/**id***
	Delete user and return the deleted user.
	

## Specification
- Spring boot: 2.7
- Maven project
- JAVA: 17
- IDE: Intellij Idea
