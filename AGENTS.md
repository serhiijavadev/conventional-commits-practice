# Agent Instructions

## Project

Spring Boot practice project for learning Conventional Commits.

Stack: Java 25, Spring Boot, Maven, JUnit 5

## Conventional Commits format

```
<type>[optional scope]: <description>
```

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
feat(time): add current time endpoint
fix(time): return time in ISO-8601 format
test(time): cover current time endpoint
docs(readme): document time endpoint
refactor(time): extract time provider service
chore(deps): update spring boot version
ci(gitlab): add build pipeline
```

## Breaking changes

Add `!` after type/scope, add `BREAKING CHANGE:` footer:

```
feat(api)!: remove v1 time endpoint

BREAKING CHANGE: /api/v1/time removed; use /api/v2/time
```

## Before every commit

1. Run `./mvnw test` — if tests fail, fix before committing
2. Show the exact commit message
3. One logical change per commit — split unrelated changes

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
