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

PV = "15.2"

RPM_NAME = "postgresql15-15.2-3.1.aarch64.rpm"
RPM_HASH = "2acf586efd96d7dfd6d5b7c38671290ea7c6ac80408006fc27a88e6be8a08a67a6c7ba75b05b7aad1a330b0ec9064b7388e6bd11860a1d2fe0c943e4e9e12a4c"

RPROVIDES:${PN} += "postgresql postgresql-implementation postgresql15 postgresql15(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) libpq5 libreadline.so.8()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) postgresql-noarch"

inherit rpm
