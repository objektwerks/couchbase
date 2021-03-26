Couchbase
---------
>Couchbase 2 feature tests.

Install
-------
>Options:
1. https://developer.couchbase.com/documentation/server/4.6/getting-started/do-a-quick-install.html
2. brew install couchbase-server-community

Migration
---------
>**Todo:** Migrate from Couchbase 2 to 3 ( https://docs.couchbase.com/java-sdk/current/project-docs/migrating-sdk-code-to-3.n.html ).

PreTest
-------
1. Start Couchbase server.

Test
----
1. sbt clean test

PostTest
--------
1. Stop Couchbase server.