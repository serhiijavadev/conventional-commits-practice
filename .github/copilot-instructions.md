# Copilot Instructions

## Project

Spring Boot practice project for learning Conventional Commits.
Stack: Java 25, Spring Boot 3, Maven, JUnit 5.

## Commit format

Every commit must follow this exact format:

```
PRJ-<ticket> <type>[optional scope]: <description>
```

- `PRJ-<ticket>` — Jira ticket number, always required (e.g. `PRJ-00012`)
- `<type>` — one of the types below
- `[scope]` — optional, use the module/feature name
- `<description>` — imperative mood, lowercase, no period

## Commit types

| Type       | Use when                              |
|------------|---------------------------------------|
| `feat`     | new functionality                     |
| `fix`      | bug fix                               |
| `test`     | adding or updating tests              |
| `docs`     | documentation only                    |
| `refactor` | restructuring without behavior change |
| `chore`    | maintenance, no behavior change       |
| `ci`       | CI/CD changes                         |
| `build`    | build system or dependencies          |
| `perf`     | performance improvement               |
| `style`    | formatting only                       |

## Scopes

Use the module or feature name: `time`, `health`, `api`, `config`, `deps`, `gitlab`, `claude`

## Examples

```
PRJ-1234 feat(time): add current time endpoint
PRJ-1234 fix(time): return time in ISO-8601 format
PRJ-1234 test(time): cover current time endpoint
PRJ-1234 refactor(time): extract time provider service
PRJ-1234 chore(deps): update spring boot version
PRJ-1234 ci(gitlab): add build pipeline
```

## Breaking changes

```
PRJ-1234 feat(api)!: remove v1 time endpoint

BREAKING CHANGE: /api/v1/time removed; use /api/v2/time
```

## Commit workflow — mandatory

1. If no ticket number is provided, **ask the user** before proceeding
2. Run `./mvnw test` — stop and report if tests fail
3. Inspect `git diff HEAD` and `git status`
4. **Propose** a commit message and wait for explicit user approval
5. Only after approval: stage relevant files and run `git commit`
6. **Never run `git commit` without the user approving the message first**

## After completing a task

Report what changed and stop. Do not propose a commit unprompted — wait for the user to ask.

## General rules

- One logical change per commit; split unrelated changes into separate commits
- Never amend or rewrite history unless explicitly asked
- Never commit build output, IDE files, or secrets
- Description must be specific — never use: `update`, `changes`, `fix`, `wip`, `final`, `misc`
