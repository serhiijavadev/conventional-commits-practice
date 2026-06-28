# Agent Instructions

## Project

Spring Boot practice project for learning Conventional Commits.

Stack: Java 25, Spring Boot, Maven, JUnit 5

## Commit format

```
PRJ-<ticket> <type>[optional scope]: <description>
```

Every commit must start with a Jira ticket reference. The project key is always `PRJ`.
If no ticket is provided in the task, ask the user before committing.

## Commit types

| Type | Use when |
|------|----------|
| feat | new functionality |
| fix | bug fix |
| test | adding or updating tests |
| docs | documentation only |
| refactor | restructuring without behavior change |
| chore | maintenance, no behavior change |
| ci | CI/CD changes |
| build | build system or dependencies |
| perf | performance improvement |
| style | formatting only |

## Scopes

Use the module or feature name: `time`, `health`, `api`, `config`, `deps`, `gitlab`

## Examples

```
PRJ-1234 feat(time): add current time endpoint
PRJ-1234 fix(time): return time in ISO-8601 format
PRJ-1234 test(time): cover current time endpoint
PRJ-1234 docs(readme): document time endpoint
PRJ-1234 refactor(time): extract time provider service
PRJ-1234 chore(deps): update spring boot version
PRJ-1234 ci(gitlab): add build pipeline
```

## Breaking changes

Add `!` after type/scope, add `BREAKING CHANGE:` footer:

```
PRJ-1234 feat(api)!: remove v1 time endpoint

BREAKING CHANGE: /api/v1/time removed; use /api/v2/time
```

## Before every commit

1. Run `./mvnw test` — if tests fail, fix before committing
2. Show the proposed commit message and ask for approval — never commit without it
3. Wait for explicit user confirmation (Approve) before running `git commit`
4. One logical change per commit — split unrelated changes

## Commit message rules

- Imperative, lowercase, no period at the end
- Specific enough to understand the change without reading the diff
- Never: `update`, `changes`, `fix`, `wip`, `final`, `misc`

## Git rules

- Never amend or rewrite history unless explicitly asked
- Never commit build output or IDE files

## After completing a task

1. What changed
2. Test result
3. Commit message used
4. Files changed
