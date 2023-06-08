SUMMARY = "Shared libraries for the Embeddable SQL Database Engine"
DESCRIPTION = "This package contains the shared libraries for the Embeddable SQL \
Database Engine. \
 \
SQLite is a C library that implements an embeddable SQL database \
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

RPM_NAME = "libsqlite3-0-3.41.2-1.1.aarch64.rpm"
RPM_HASH = "9c28168ac9feee8e9df524a9e7160ac49475c6c4b94072f4cf39eb0176cc7bd17b75c2623c1dd8814fd462a0114db743d733374ffd60d75cae975225e62f5827"

RPROVIDES:${PN} += "libsqlite3-0 libsqlite3-0(aarch-64) libsqlite3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
