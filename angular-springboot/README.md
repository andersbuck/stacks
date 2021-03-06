# Angular / Spring Boot - Stack Demo

A demo of a Angular / Spring Boot stack

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

* Gradle - [Installation](https://gradle.org/install/)
* Nodes.js - [Installation](https://nodejs.org/en/download/)
* Angular CLI - [Installation](https://angular.io/cli)

### Spring Boot

Run the build from the web-app directory.

```
gradle build
```

Start the server

```
gradle bootRun
```

Open endpoint from browser http://localhost:8080/web-app/home

### Angular

Start the Angular server from the web-app/client directory.

```
ng serve --open
```
Open page from browser http://localhost:4200/carvoyant

## Development

After starting the local server a gradle build will automatically restart the server any time there is a change to the source code same goes for Angular.

Debugging
```
gradle bootRun --debug-jvm
```

## Running the tests

To run tests.

```
gradle test
```

## References

* [Angular Material](https://material.angular.io/)
* [Angular Flex Layout](https://github.com/angular/flex-layout/wiki/API-Documentation/)
* [ModelMapper](http://modelmapper.org/getting-started/)

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Authors

* **Anderson Buckles** - *Initial work* - [AndersBuck GitHub](https://github.com/andersbuck)

## Acknowledgments

* The open source community!
