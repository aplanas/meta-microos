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

PV = "12.15"

RPM_NAME = "postgresql12-12.15-1.2.aarch64.rpm"
RPM_HASH = "532f472f0e2f3aecb848be7fd67c81ea5acf5323f427e074e4148ef3fec0e81c12e9a4f5cb8776611d117e24b0f470126a36a40297375ffcf53343d6d3810cb8"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql12 \
postgresql12(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
libpq5 \
libreadline.so.8()(64bit) \
libz.so.1()(64bit) \
postgresql-noarch"

inherit rpm
