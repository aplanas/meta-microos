SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-12.14-2.1.aarch64.rpm"
RPM_HASH = "8639b981ead433fdf2fd72a612a554a032e6e0cb1834649a097c4d1ba1904e313a454b74e3ec4eedc53fc9a939c58df0455e050a9961e7c7d63d48fe7726b74a"

RPROVIDES:${PN} += "postgresql postgresql-implementation postgresql12 postgresql12(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libpq5 libreadline.so.8()(64bit) libz.so.1()(64bit) postgresql-noarch"

inherit rpm
