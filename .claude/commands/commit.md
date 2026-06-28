Commit the current changes following the project's Conventional Commits workflow.

## Arguments

$ARGUMENTS may contain the Jira ticket number (e.g. `PRJ-00005`).
If not provided, ask the user for it using AskUserQuestion before proceeding.

## Workflow

1. **Ticket** — extract from $ARGUMENTS or ask via AskUserQuestion
2. **Tests** — run `./mvnw test`; if they fail, report and stop
3. **Diff** — run `git diff HEAD` and `git status` to understand what changed
4. **Propose** — draft a commit message: `PRJ-<ticket> <type>[scope]: <description>`
5. **Approval** — show the message via AskUserQuestion ("Approve" / "Change it"); never commit without approval
6. **Commit** — run `git add` for changed files and `git commit` with the approved message

## Commit format

```
PRJ-<ticket> <type>[optional scope]: <description>
```

Types: `feat`, `fix`, `test`, `docs`, `refactor`, `chore`, `ci`, `build`, `perf`, `style`

Description: imperative, lowercase, no period at the end.
