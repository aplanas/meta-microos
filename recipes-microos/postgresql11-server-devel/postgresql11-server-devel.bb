SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql11-devel package."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-server-devel-11.19-2.1.aarch64.rpm"
RPM_HASH = "6f0c71daba52de933a70bc6966c9c044b65d4bd4e85188863a1b3d57b21d0d75999cb2e3ace5048f690f5aae9221f0f6d8a7c5da4af92280db820e129e4a7cc6"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-exclusive postgresql-server-devel-implementation postgresql11-server-devel postgresql11-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux-devel libxslt-devel openssl-devel pam-devel pkgconfig(krb5) postgresql-server-devel-noarch postgresql11-devel postgresql11-server readline-devel zlib-devel"

inherit rpm
