#!/bin/sh

# Determine the Java command to use
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

# Find the project directory
APP_HOME="$(cd "$(dirname "$0")" && pwd)"

exec "$JAVACMD" -Xmx64m -Xms64m -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" "$@"
