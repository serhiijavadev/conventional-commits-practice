# Claude Project Instructions

Follow `AGENTS.md` for all tasks.

Key rules:
- Every commit must follow the format: `PRJ-<ticket> <type>[scope]: <description>`
- After completing a task: report what was done and STOP. Do not propose a commit.
- Only commit when the user explicitly asks. Then: run tests, propose the message via `AskUserQuestion`, wait for approval.
- If no ticket number is given, ask the user before committing.
