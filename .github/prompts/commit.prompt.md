---
mode: agent
description: Commit staged changes following the project Conventional Commits workflow
---

Follow these steps exactly. Do not skip any step.

## Step 1 — Ticket number

If the user provided a ticket number (e.g. `PRJ-00012`), use it.
Otherwise, ask: "What is the Jira ticket number for this commit? (e.g. PRJ-00012)"
Do not proceed without a ticket number.

## Step 2 — Run tests

Run `./mvnw test`. If tests fail, report the failure and stop.

## Step 3 — Inspect changes

Run `git diff HEAD` and `git status`. Understand every changed file before drafting the message.

## Step 4 — Propose commit message

Format: `PRJ-<ticket> <type>[optional scope]: <description>`

Show the proposed message to the user and ask explicitly for approval.
**Do not run `git commit` until the user explicitly approves.**

## Step 5 — Commit

After approval, stage only the relevant files (never `git add .`) and commit:
```
git add <specific files>
git commit -m "<approved message>"
```

See `AGENTS.md` for full type definitions, scopes, and examples.
