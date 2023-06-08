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

PV = "14.7"

RPM_NAME = "postgresql14-14.7-2.1.aarch64.rpm"
RPM_HASH = "45e1a17ce72e22d4f8a9c3c6d2b976b51810bbe6c349a1cc5d2d5fe31c5ebd94423e020c5b3926fbd3415c926fb61725f4c1006b919972068fdb579b3e6cbd11"

RPROVIDES:${PN} += "postgresql postgresql-implementation postgresql14 postgresql14(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libpq5 libreadline.so.8()(64bit) libz.so.1()(64bit) postgresql-noarch"

inherit rpm
