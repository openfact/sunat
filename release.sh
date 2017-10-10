#!/usr/bin/env bash

echo "Configuring release \n"
read -s "Enter Release: " releaseVersion
echo "\n"
read -s "Enter Next Release: " nextVersion
echo "\n"
read -s "Enter Github Username: " username
echo "\n"
read -s -p "Enter Github Password: " password
echo "\n"

# Update to release
mvn versions:set -DnewVersion="$releaseVersion"

git add .
git commit -m "Prepare release $releaseVersion"
git push https://`$username`:`$password`@github.com/openfact/sunat.git

# Create tag and push
git tag "$releaseVersion"
git push https://`$username`:`$password`@github.com/openfact/sunat.git --tags

# Create next snapshot
mvn versions:set -DnewVersion="$nextVersion-SNAPSHOT"

git add .
git commit -m "Prepare next release $nextVersion-SNAPSHOT"
git push https://`$username`:`$password`@github.com/openfact/sunat.git