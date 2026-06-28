---
description: Commit changes following the project Conventional Commits workflow
---

Commit the current changes following the project's Conventional Commits workflow.

## Step 1 — Ticket number

Arguments provided: $ARGUMENTS

If $ARGUMENTS contains a ticket number like `PRJ-XXXXX`, use it.
Otherwise, ask the user: "What is the Jira ticket number? (e.g. PRJ-00012)"
Do not proceed without a ticket number.

## Step 2 — Run tests

Run `./mvnw test`. If tests fail, show the failure output and stop.

## Step 3 — Inspect changes

Run `git diff HEAD` and `git status`. Read every changed file before drafting the message.

## Step 4 — Propose commit message

Format: `PRJ-<ticket> <type>[optional scope]: <description>`

Show the proposed message to the user and ask explicitly for approval.
**Do not run `git commit` until the user explicitly approves the message.**

## Step 5 — Commit

After approval, stage only the relevant files (never `git add .`) and commit:
```
git add <specific files>
git commit -m "<approved message>"
```

See `AGENTS.md` for full type definitions, scopes, and examples.
