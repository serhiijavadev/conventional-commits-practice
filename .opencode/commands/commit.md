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

Run:
```
./mvnw test
```

If tests fail, show the failure output and stop. Do not proceed to commit.

## Step 3 — Inspect changes

Run:
```
git diff HEAD
git status
```

Read every changed file carefully before drafting the commit message.

## Step 4 — Propose commit message

Draft a message using the project format:
```
PRJ-<ticket> <type>[optional scope]: <description>
```

Show it to the user and ask explicitly:
> "Proposed commit message:
> `PRJ-XXXXX type(scope): description`
>
> Approve, or suggest a change?"

**Do not run `git commit` until the user explicitly approves the message.**

## Step 5 — Commit

After approval, stage only the relevant changed files (never `git add .` or `git add -A`) and commit:
```
git add <specific files>
git commit -m "<approved message>"
```

---

## Format reference

```
PRJ-<ticket> <type>[optional scope]: <description>
```

| Type       | Use when                              |
|------------|---------------------------------------|
| feat       | new functionality                     |
| fix        | bug fix                               |
| test       | adding or updating tests              |
| docs       | documentation only                    |
| refactor   | restructuring without behavior change |
| chore      | maintenance, no behavior change       |
| ci         | CI/CD changes                         |
| build      | build system or dependencies          |
| perf       | performance improvement               |
| style      | formatting only                       |

Scopes: `time` `health` `api` `config` `deps` `gitlab` `claude`

Rules:
- Imperative, lowercase, no period at the end
- Never use: `update`, `changes`, `fix`, `wip`, `final`, `misc`
- Breaking change: add `!` after scope + `BREAKING CHANGE:` footer
