# The Weather App

This Weather application is a spring boot based rest api which enables user to fetch Weather report for the city selected.

## Getting Started

To start using it just download the source code and follow the build & deployment instructions.
Alternatively the archieve/jar could be downloaded to run on your machine.

### Prerequisites

- [x] Maven 3.3.9 or above
- [x] java 1.8
- [x] Any tool which could make a restfull api calls , maybe Postman rest service runner tool?

### Installing above softwares

Could be easily searched on web depending upon which operating system you are trying to run.

## Running the tests

This application is powered by Jacoco to generate reports for code coverage using Junits.
Junits are written using Mockito

They gel together quite well :)

Follow the steps below to generate reports for this application

*Run the command: mvn clean install
*Generated reports location : target/site/jacoco/index.html

## Deployment

Navigate to the home directory of the downloaded project and run the command below.

mvn spring-boot:svc

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Running the api

API Endpoint: /weather/{city}/{unit}

API Response: Json/UI

Sample request: http://localhost:8080/weather/London/Celsius

Sample response : 

{
    "weather": [
        {
            "id": 721,
            "main": "Haze",
            "description": "haze",
            "icon": "50d"
        }
    ],
    "temperaturedetails": {
        "temp": 18.25,
        "pressure": {
            "value": 1013,
            "unit": "hpa"
        },
        "humidity": {
            "value": 77,
            "unit": "%"
        },
        "temp_min": 15.989999999999952,
        "temp_max": 19.989999999999952,
        "unit": "Celsius"
    },
    "sun": {
        "sunrise": "2018-05-30T03:50:15.000+0000",
        "sunset": "2018-05-30T20:06:44.000+0000"
    },
    "id": 0,
    "name": "London",
    "cod": 200,
    "latestUpdate": "2018-05-30T15:20:00.000+0000"
}

## Authors

* **Navneen Kaur**



