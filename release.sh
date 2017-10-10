#!/usr/bin/env bash

# Update to release
mvn versions:set -DnewVersion=1.0.2

git add .
git commit -m 'Release 1.0.2'
git push

# Create tag and push
git tag 1.0.2
git push --tags

# Create next snapshot
mvn versions:set -DnewVersion=1.0.3-SNAPSHOT

git add .
git commit -m 'Prepare next release 1.0.3-SNAPSHOT'
git push