# Agent Instructions

## Project

This is a small Spring Boot practice project used to learn and validate Conventional Commits with an AI coding agent.

Tech stack:
- Java 25
- Spring Boot
- Maven
- JUnit 5
- Spring Boot Test

## Main goal

For every task, make a small focused change and create a git commit that follows Conventional Commits.

The agent must not create vague commits such as:
- update
- changes
- fix
- wip
- final
- misc

## Conventional Commit format

Use this format:

<type>[optional scope]: <description>

Examples:
- feat(time): add endpoint returning current server time
- fix(time): return time in ISO-8601 format
- test(time): add tests for current time endpoint
- docs(readme): document available API endpoints
- ci(gitlab): add basic pipeline for build and tests
- refactor(time): extract current time provider service
- chore(deps): update project dependencies

## Allowed commit types

Use only these commit types:

- feat: new user-facing or application functionality
- fix: bug fix
- docs: documentation-only changes
- test: adding or changing tests
- refactor: code restructuring without behavior change
- perf: performance improvement
- chore: maintenance task that does not affect application behavior
- ci: CI/CD pipeline changes
- build: build system or dependency changes
- style: formatting-only changes

## Scopes

Prefer meaningful technical scopes.

Good scopes:
- time
- health
- api
- docs
- test
- gitlab
- build
- config

Bad scopes:
- misc
- changes
- stuff
- update

## Commit rules

Before committing, the agent must:

1. Summarize what changed.
2. Run relevant tests when possible.
3. Show the exact commit message it will use.
4. Use a Conventional Commit message.
5. Keep one logical change per commit.

If the task contains multiple unrelated changes, split them into multiple commits.

## Commit message quality

The description must be:
- short
- imperative
- lower-case unless a proper noun is needed
- specific enough to understand the change

Good:
- feat(time): add current time endpoint
- test(time): cover current time endpoint
- docs(readme): document time endpoint

Bad:
- feat: changes
- fix: update
- chore: work
- update code
- WIP

## Testing

For Java changes, run the relevant test command before committing.

Use one of these depending on the project:

Maven:
./mvnw test

Gradle:
./gradlew test

If tests cannot be run, explain why before committing.

## Git behavior

The agent may create commits when explicitly asked.

The agent must not:
- rewrite existing git history unless explicitly asked
- amend previous commits unless explicitly asked
- create large unrelated commits
- commit generated build output
- commit IDE files unless they are intentionally part of the project

## Response format after work

After completing a task, respond with:

1. Summary
2. Tests run
3. Commit message used
4. Files changed