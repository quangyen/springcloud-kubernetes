#!/usr/bin/env bash
cat pom.xml | grep "^    <version>.*</version>$" | awk -F'[><]' '{print $3}'