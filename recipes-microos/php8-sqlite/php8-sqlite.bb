SUMMARY = "SQLite database client for PHP"
DESCRIPTION = "This is an extension for the SQLite Embeddable SQL Database Engine. \
https://www.sqlite.org \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server. SQLite is the server. The SQLite library reads and writes \
directly to and from the database files on disk. \
 \
This package includes sqlite and pdo_sqlite modules for sqlite version \
2 and 3 respectively."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-sqlite-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "0ffedf875ccc84b82eef55b57489ff498795adc758eca3673fb75c14ac8c45cd1b77de4e48d600ba13627d2f380144a656b624794466448e92309944b80fecea"

RPROVIDES:${PN} += "config(php8-sqlite) php-pdo_sqlite php-sqlite php8-sqlite php8-sqlite(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) php php-pdo"

inherit rpm
