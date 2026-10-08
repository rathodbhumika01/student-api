# Student API: My First Spring Boot REST API

A very small web application that says hello.
When you open a link in your browser, it replies with a short message.

## What does it do?

You ask: "Hello!"
It answers: "Hello from Spring Boot!"

Think of it like a waiter in a restaurant:

- **You** (browser or Postman) ask the waiter for something.
- **The waiter** (the API) carries your request to the kitchen.
- **The kitchen** (the Java code) prepares the answer.
- **The waiter** brings the answer back to you.

The answer comes in a format called **JSON**, which is a simple way for programs to share data.

## Available links

| Link | What you get |
|---|---|
| `http://localhost:8080/api/hello` | `{"message":"Hello from Spring Boot!"}` |
| `http://localhost:8080/api/welcome` | `{"message":"Welcome, Bhumi Rathod!"}` |

## What you need before starting

- **Java 17 or newer** (check with `java -version`)
- **Git** (only if you want to download the project)
- A web browser or **Postman** to test

You do not need to install Maven. The project already includes it.

## How to run it

1. Download the project:

```
   git clone https://github.com/rathodbhumika01/student-api.git
   cd student-api
```

2. Start the app.

   On Windows:

```
   .\mvnw.cmd spring-boot:run
```

   On Mac or Linux:

```
   ./mvnw spring-boot:run
```

3. Wait until you see a line like `Started StudentApiApplication`.
   The first run takes a few minutes because it downloads libraries.

4. Open your browser and go to:

```
   http://localhost:8080/api/hello
```

5. To stop the app, press `Ctrl + C` in the terminal.

> `localhost` means "your own computer". The link only works while the app is running on your computer.

## What is inside the project?

```
src/main/java/com/sanjivani/student_api/
├── StudentApiApplication.java   -> starts the app
├── controller/
│   └── HelloController.java     -> decides what to reply for each link
└── model/
    └── Greeting.java            -> the small box that holds the message
```

## How it works, in simple words

1. You open `/api/hello` in the browser.
2. **Tomcat** (the web server built into the app) receives the request.
3. **Spring Boot** finds the right method in `HelloController`.
4. The method creates a `Greeting` object with the message.
5. **Jackson** turns that object into JSON.
6. The browser shows the JSON.

## Tools used

| Tool | What it does here |
|---|---|
| Java | The programming language |
| Spring Boot | Does most of the web setup for us |
| Maven | Downloads libraries and builds the project |
| Tomcat | The web server that receives requests |
| Jackson | Converts Java objects to JSON |
| Postman | Used to test the API |

## Author

Made by **Bhumika Rathod** as a learning project (Unit 4, Part 1: Spring Boot REST API basics).
