#!/usr/bin/env bash

releaseVersion=1.0.3
nextVersion=1.0.4

# Update to release
mvn versions:set -DnewVersion="$releaseVersion"

git add .
git commit -m "Prepare release $releaseVersion"
git push https://`$1`:`$2`@github.com/openfact/sunat.git

# Create tag and push
git tag "$releaseVersion"
git push --tags

# Create next snapshot
mvn versions:set -DnewVersion="$nextVersion-SNAPSHOT"

git add .
git commit -m "Prepare next release $nextVersion-SNAPSHOT"
git push