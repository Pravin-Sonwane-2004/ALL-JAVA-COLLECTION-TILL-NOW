#!/bin/bash

# ✅ Navigate to your local Git repo directory (use POSIX path format)
cd "/c/ALL JAVA COLLECTION TILL NOW" || exit

# ✅ Git user configuration
git config user.name "Pravin-Sonwane-2004"
git config user.email "pravinson222@gmail.com"

# ✅ Stage all changes
git add .

# ✅ Commit with a timestamp (ignore if no changes)
git commit -m "Auto commit on $(date '+%Y-%m-%d %H:%M:%S')" 2>/dev/null

# ✅ Push to 'main' branch
git push origin main
