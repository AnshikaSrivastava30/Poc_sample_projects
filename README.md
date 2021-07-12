## The project directory structure
The project has build scripts in Maven and follows the standard directory structure 

## The TodoMVC application

The application we will be testing is a simple Todo list applicaton. You can find this application on the https://todomvc.com/examples/angular2/. In this exercise I have added tests on todomvc application.

# The packages

#src/main/java: 

#PageClasses -->LandingPage.java 
contains main page methods like 
todoAdd_SingleItem: For adding single item to do list.
todoAdd_MultipleItem: For adding multiple items to do list.
todo_Item_click: for selecting the item
clearCompletedToDoItem: for deleting selected item

#TestCases -->AddToDoTest.java, Negative_AddToDoTest.java
contains positive & negative tests.
You can run the tests by running the classes under TestCases package as RUNAS TestNG test.

#to_do_tests -->driver_factory_config.java, feeddata.java

contains base classes for driver initialization & browser closing methods
and also common operations of opening and closing todoMvc url, taking screen shots.

#Screenshots
stores screenshot according to timestamp (method used from src/main/java/utilities/DateUtil.java)

#Drivers
consists of driver exe file

#test-output
will store all reports file .
Can look into emailable-report.html for report view.




