# micro-service-withspring-cloud
Small implementation of micro-service 

Department service include 2 api:
1. CREATE A DEPARTMENT
2. GET DEPARTMENT BY ID

Employee service include 2 api:
1. CERATE AN EMPLOYEE ASSOCIATED WITH DEPARTMENT
2. GET EMPLOYEE ALONG WITH DEPARTMENT


Employee service communicates with Department service to fetch related department.


Used eureka service registry, zuul api gateway and eureka client 
