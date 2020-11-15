# CA3 Boilerplate for backend [![Build Status](https://travis-ci.com/Jean-Poul/3sem_CA3_backend.svg?branch=main)](https://travis-ci.com/Jean-Poul/3sem_CA3_backend)

## DATAMATIKER 3. SEMEMESTER  

### Steps for setup

1. In the pom.xml file go to <remote.server>http://jplm.dk/manager/text</remote.server> in line 19. Change to your own droplet.

2. Go to workbench and make your database. I have a table for my production and one for testing.

3. In the persistence.xml file go to <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/Ca3_boilerPlate?zeroDateTimeBehavior=CONVERT_TO_NULL"/> in line 21 and change Ca3_boilerPlate to point at your own database. Do the same in line 35 so you now point towards your test database.

4. Go to EMF_Creator.java. Change line 43 and 46 to point at your CONNECTION_STR name on your vitual machine. (Can be found on my virtual machine under docker-compose.yml as a environmental variable)

5. Clean and build the project and then run the file SetupTestUsers.java. This is to populate the production database before migrating it to my droplet (virtual machine).

6. Migrate the local table to the online table on your virtual machine.

7. Time to setup travis. Go to https://travis-ci.com/ and connect travis to your github account. Now give travis access to your repository on github so that travis can deploy your war file for you after each successful build. Remember to add user and password for your virtual machine since travis can't deploy without it. I've saved mine as environmental variables on my virtual machine.


### REST endpoints

Run your project local or online and test the following endpoints:

GET methods

1. https://www.jplm.dk/CA3_Boilerplate_Backend/api/jokes (JokeResource.java) will let you see what info Joke_CombinedDTO.java is holding.

2. https://www.jplm.dk/CA3_Boilerplate_Backend/api/scrape/sequential (ScrapeResource.java) will let you see info about 4 urls that is called sequentially

3. https://www.jplm.dk/CA3_Boilerplate_Backend/api/scrape/parallel (ScrapeResource.java) will let you see info about 4 urls that is called parallel

4. https://www.jplm.dk/CA3_Boilerplate_Backend/api/info/all (UserResource.java) will let you see how many users there are in the database

5. https://www.jplm.dk/CA3_Boilerplate_Backend/api/info/user (UserResource.java) will let you see if you can login with a user and a token you get from the POST method. Remember to add "x-access-token" with the token in the header and use a program like postman to make it work.

6. https://www.jplm.dk/CA3_Boilerplate_Backend/api/info/admin (UserResource.java) same steps as endpoint 5 but here you test login for an admin

7. https://www.jplm.dk/CA3_Boilerplate_Backend/api/cartoon/first (CartoonResource.java) will let you see the first character in the cartoon api for Rick and Morty

8. https://www.jplm.dk/CA3_Boilerplate_Backend/api/cartoon/{id} (CartoonResource.java) will let you see every character in the cartoon api for Rick and Morty. (ID has to be between 1-671)

POST method

1. https://www.jplm.dk/CA3_Boilerplate_Backend/api/login (LoginEndpoint.java) with this endpoint you can with a program like postmand create a user which will then send you a token in response. Remember to add a user and password to the body of the request (if using postman)
