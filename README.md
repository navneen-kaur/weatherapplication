# weatherapplication

This application has the API to show the current Weather report for the city selected

API Method name : getCurrentWeather(city)
Request Parameter : /weather/{city}
Response : display all the information retrieved from API call of openweathermap.org

Lombok Plugin is used to generate getters and setters in the POJO

http://openweathermap.org/help/city_list.txt

# The Weather App

This Weather application is a spring boot based rest api which enables user to fetch Weather report for the city selected.

## Getting Started

To start using it just download the source code and follow the build & deployment instructions.
Alternatively the archieve/jar could be downloaded to run on your machine.

### Prerequisites

- [x] Maven 3.3.9 or above
- [x] java 1.8
- [x] Any tool which could make a restfull api calls , may Postman rest service runner tool?

### Installing above softwares

Could be easily searched on web depending upon which operating system you are trying to run.

## Running the tests

This application is powered by Jacoco to generate reports for code coverage using Junits.
Junits are written using Mockito

They gel together quite well :)

Follow the steps below to generate reports for this application

-Run the command: mvn clean install
-Generated reports location : target/site/jacoco/index.html

### Break down into end to end tests

Explain what these tests test and why

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

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc




