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

PV = "11.19"

RPM_NAME = "postgresql11-11.19-2.1.aarch64.rpm"
RPM_HASH = "7aa2ffca5f0fc83c1340dce4720fa2abd338e7970edad546d3f78765a5d10b86379427241a06f9e242481abbb142bef52bd62f062530fceaace289cbf058ac96"

RPROVIDES:${PN} += "postgresql postgresql-implementation postgresql11 postgresql11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libpq5 libreadline.so.8()(64bit) libz.so.1()(64bit) postgresql-noarch"

inherit rpm
