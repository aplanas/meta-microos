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

PV = "13.10"

RPM_NAME = "postgresql13-13.10-2.1.aarch64.rpm"
RPM_HASH = "217eb1c2d48fc0c9fbc54ee12693490d9915248a6e45d02dabfe29f02d7608a2b7d7967d198ac51c89c7dfa49331142ca1ad00768381c911752a500dcc1b70ba"

RPROVIDES:${PN} += "postgresql postgresql-implementation postgresql13 postgresql13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libpq5 libreadline.so.8()(64bit) libz.so.1()(64bit) postgresql-noarch"

inherit rpm
