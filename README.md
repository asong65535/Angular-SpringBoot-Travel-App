# Full Stack Hotel Website

## Stack

- Frontend: TypeScript (Angular)
- Backend: Java (Spring Boot)
- DB: SQL (MySQL)

## Instructions

1. Build target jar:

`mvn package`

2. Build container:

`docker build -t landon-an-sb-msql`

3. Run container:

`docker run -d -p 8080:8080 -p 4200:4200 --name "landon-hotel-fullstack" landon-an-sb-msql`

4. View website by entering into browser:

`localhost:4200`
