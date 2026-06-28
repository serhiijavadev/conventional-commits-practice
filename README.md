# conventional-commits-practice

A Spring Boot practice project for learning Conventional Commits with an AI coding agent.

## Stack

- Java 25
- Spring Boot 3.5
- Maven

## Run the application

```bash
./mvnw spring-boot:run
```

The application starts on `http://localhost:8080`.

## Run tests

```bash
./mvnw test
```

## API

### GET /api/time

Returns the current server time.

**Response**

```json
{
  "currentTime": "2026-06-28T21:00:00.123456789+08:00"
}
```

| Field | Type | Description |
|-------|------|-------------|
| currentTime | string | Current server time in ISO-8601 format with offset |
