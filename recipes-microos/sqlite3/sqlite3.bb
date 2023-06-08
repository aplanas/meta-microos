SUMMARY = "Embeddable SQL Database Engine"
DESCRIPTION = "SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process. \
 \
SQLite is not a client library used to connect to a big database \
server. SQLite is a server and the SQLite library reads and writes \
directly to and from the database files on disk. \
 \
SQLite can be used via the sqlite command line tool or via any \
application that supports the Qt database plug-ins."
LICENSE = "SUSE-Public-Domain"

PV = "3.41.2"

RPM_NAME = "sqlite3-3.41.2-1.1.aarch64.rpm"
RPM_HASH = "1956845c6bb78482719f738bc36b871f2bbf63f3fc8ac3aaef032c8e58ad942bde03e09949e1917f25118e605c8abfeb7ec7234394d57da67d84bf9d5045a673"

RPROVIDES:${PN} += "sqlite sqlite3 sqlite3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
