------------------------------------------------------------------------------------------------------------
13/04/21:
Achievement:
-At this point, we already created the model, repository and service classes for the User entity, using JPA
we are able to store rows of data on the table User.

Goals for next commit.
-Consume JSON (could be sent trough postman) and store the information of the customer in table User.

Optional:
-Produce JSON.
--------------------------------------------------------------------------------------------------------------
13/04/21:
Achievement:
-We were able to consume JSON sent trough a body of an HTTP POST Request, by using @RequestBody tag, which was
binded to an entity of the project model. Also the JSON data was saved as a row of the user table.

Goals for next commit.
-Working with different HTTP Requests.
-Adding more entities to the project model and being able to provide CRUD services.

Optional:
-Produce JSON.
---------------------------------------------------------------------------------------------------------------
16/04/21:
Achievement:
-Created whole Spring Rest Functional Crud Model for entity Rol.

Goals for next commit.
-Establish table relation so that everytime a new user is created a Role is assigned to the User.

Optional:
-Produce JSON.
---------------------------------------------------------------------------------------------------------------
19/04/21:
Achievement:
-Stablished one to one relation betwen model tables.

BUG TO FIX:
-When registering a row the id column from User id is REPLACED by the FK role_id as if it was the PK.


Optional:
-Produce JSON.
---------------------------------------------------------------------------------------------------------------


