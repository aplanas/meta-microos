SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server; SQLite is the server. The SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command-line tool or via any \
application which supports the Qt database plug-ins."
LICENSE = "SUSE-Public-Domain"

PV = "3.42.0"

RPM_NAME = "sqlite3-devel-3.42.0-1.1.aarch64.rpm"
RPM_HASH = "a6f92b27f9ce4223cde96e884c0ecec1fc757bd138f1eb16bc72a3b2b6ccab1f6a96168143a48833843194baa2554a435ec1383f5a0e1b31e905aa1e90116f1d"

RPROVIDES:${PN} += "pkgconfig(sqlite3) \
sqlite-devel \
sqlite3-devel \
sqlite3-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsqlite3-0"

inherit rpm
