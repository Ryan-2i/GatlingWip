To run your newly generated testing framework use: 
mvn clean verify -Denvironment=default 
Environment config is setup in serenity.conf, the sample tests use the default env config.

To run specific tests using a cucumber tags use cucumber filtering, for example:
mvn clean verify -Dcucumber.filter.tags="@UITest" -Denvironment=default
To exclude specific tests use "not @"

