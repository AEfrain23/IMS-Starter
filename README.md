Coverage: 34%
# IMS-Starter Application

One Paragraph of project description goes here

This Project is called IMS-Starter. The objective is to build a working application that allows a user to Create, Read, Update and Delete Customer, Items and Orders into the system database. This would allow a user to keep track of their customers and their customers purchases. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

Project must be copied from GitHub. This can be done by the following commands on the terminal and ensuring you are in the file that you want the project to be uploaded to.

```
git clone https://github.com/QACTrainers/IMS-Starter
```

### Prerequisites

What things you need to install the software and how to install them

You will need to have the following installed.

- Java 			(JavaSE-1.8)
- Java Eclipse IDE	(Eclipse IDE 4.24.0)
- Apache Maven		(3.2.2)
- MySQL Workbench	(8.0.29)
- Junit			(5.8.2)

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Detailed for installing Maven are as follows. The steps are:
- Have a JDK installation on your system. Either set the JAVA_HOME environment variable pointing to your JDK installation or have the java executable on your PATH.
- Extract distribution archive in any directory

unzip apache-maven-3.8.6-bin.zip
or
tar xzvf apache-maven-3.8.6-bin.tar.gz

Alternatively use your preferred archive extraction tool.
- Add the bin directory of the created directory apache-maven-3.8.6 to the PATH environment variable
- Confirm with mvn -v in a new shell. The result should look similar to

Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: /opt/apache-maven-3.8.6
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.8.5", arch: "x86_64", family: "mac"
```

End with an example of getting some data out of the system or using it for a little demo

1. 	In order to get the system running you must first run the program through eclipse via the Runner class in the project file.
2. 	The console then prompts for an input of either CUSTOMER, ORDER, ITEM or STOP.
3. 	Enter ITEM.
4. 	The system then prompts another input this time asking for CREATE, READ, UPDATE, DELETE or RETURN.
5. 	Enter CREATE. This will allow the user to add a new item into the system.
6. 	Enter the item name.
7. 	Enter the item cost.
8. 	The item has been created. You can now view the item in the system by entering READ.
9. 	In order t delete an item from the system, note its item id from the READ section and then enter DELETE.
10.	Here you are asked to enter the item id of the item you want to delete. please enter the relevant item id.
11. 	Your item has been deleted.

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

In order to run the tests for each functionality, go into the relevant classes. i.e. 


### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
