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

Run:
```
./mvnw test
```

If tests fail, report the failure and stop. Do not proceed to commit.

## Step 3 — Inspect changes

Run:
```
git diff HEAD
git status
```

Understand every changed file before drafting the message.

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

**Do not run `git commit` until the user explicitly approves.**

## Step 5 — Commit

After approval, stage only the relevant files and commit:
```
git add <files>
git commit -m "<approved message>"
```

Do not use `git add .` or `git add -A` — be explicit about which files are staged.

---

## Format reference

```
PRJ-<ticket> <type>[optional scope]: <description>
```

Types: `feat` `fix` `test` `docs` `refactor` `chore` `ci` `build` `perf` `style`

Scopes: `time` `health` `api` `config` `deps` `gitlab` `claude`

Rules:
- Imperative, lowercase, no period at the end
- Never: `update`, `changes`, `fix`, `wip`, `final`, `misc`
- Breaking change: add `!` after scope + `BREAKING CHANGE:` footer
