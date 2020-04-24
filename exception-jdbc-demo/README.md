Exceptions and JDBC Integration

Web app has features to show exception handling and jdbc integration.

Database Requirements

	Uses MySQL 8.x server and JDBC driver.
	CREATE TABLE news_user ( user_name varchar(40) PRIMARY KEY, mobile_no varchar(15), 
	email_id varchar(80), plan_name varchar(25));
	Configure MySQL server details like url, userid and password in DaoUtil.java 

Build and run project.Access using url http://localhost:8080/exception-jdbc-demo

Explore exception handling

	Click on ServerException. Observe in browser and tomcat console for errors.

	Click on Client Exception
		Observe error in browser

JDBC Integration

	Click on Registration Form and follow steps.
	Verify tomcat server console for any errors.
	Primary key values are unique.Every time give different user_name value.
  