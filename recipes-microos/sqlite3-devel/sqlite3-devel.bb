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

PV = "3.41.2"

RPM_NAME = "sqlite3-devel-3.41.2-1.1.aarch64.rpm"
RPM_HASH = "ee54ab344ef18e0f7d30b7426108101a4b1a1504e8121d69539d26c788c1ede9fd7485f82c0c3448aa7d473eedeb2b1df7d8a0199ac013dd6277a57b4477231c"

RPROVIDES:${PN} += "pkgconfig(sqlite3) sqlite-devel sqlite3-devel sqlite3-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libsqlite3-0"

inherit rpm
