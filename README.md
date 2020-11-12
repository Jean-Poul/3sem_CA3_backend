# CA3 Boilerplate for backend

## DAT3SEM GRP. 8

**Members**

- Alexander Pihl
- Jean-Poul Leth-Møller
- Mick Larsen
- Morten Rasmussen
- Per Kringelbach

### Steps for setup

1. In the pom.xml file go to <remote.server>http://jplm.dk/manager/text</remote.server> in line 19. Change to your own droplet.

2. Go to workbench and make your database. I have a table for my production and one for testing.

3. In the persistence.xml file go to <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/Ca3_boilerPlate?zeroDateTimeBehavior=CONVERT_TO_NULL"/> in line 21 and change Ca3_boilerPlate to point at your own database. Do the same in line 35 so you now point towards your test database.

4. Go to EMF_Creator.java. Change line 43 and 46 to point at your CONNECTION_STR name on your vitual machine. (Can be found on my virtual machine under docker-compose.yml)

5. Clean and build the project and then run the file SetupTestUsers. This is to populate the production database before migrating it to my virtual machine.

6. Migrate the local table to the online table on your virtual machine.

7. Time to setup travis. Go to https://travis-ci.com/ and connect to your github account. Now give travis access to your repository on github so that travis can deploy your war file for you after each successful build. Remember to add user and password for your virtual machine since travis can't deploy without this. I've saved mine as environmental variables on my virtual machine.


### REST endpoints

Run your project local or online and test the following endpoints:

GET methods

1. http://localhost:8080/CA3_Boilerplate/api/jokes (JokeResource.java) will let you see what info Joke_CombinedDTO.java is holding.

2. http://localhost:8080/CA3_Boilerplate/api/scrape/sequential (ScrapeResource.java) will let you see info about 4 urls that is called sequentially

3. http://localhost:8080/CA3_Boilerplate/api/scrape/parallel (ScrapeResource.java) will let you see info about 4 urls that is called parallel

4. http://localhost:8080/CA3_Boilerplate/api/info/all (UserResource.java) will let you see how many users there are in your database

5. http://localhost:8080/CA3_Boilerplate/api/info/user (UserResource.java) will let you see if you can login with a user and token you get from the POST method. Remember to add "x-access-token" with the token in the header.

6. http://localhost:8080/CA3_Boilerplate/api/info/admin (UserResource.java) same steps as endpoint 5 but here you test login for an admin

POST method

1. http://localhost:8080/CA3_Boilerplate/api/login (LoginEndpoint.java) with this endpoint you can with a program like postmand create a user which will then send you a token in response. Remember to add a user and password to the body of the request (if using postman)
