SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql13-devel package."
LICENSE = "PostgreSQL"

PV = "13.10"

RPM_NAME = "postgresql13-server-devel-13.10-2.1.aarch64.rpm"
RPM_HASH = "8c786faa30a8f5c96b424ecc5ec8296ed253bfed7c4218263a9d4611f77eaa6934161b0600c149d3d20a0d8003dc119abddce6dd6f289e5366fa147e8dd98b36"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-exclusive postgresql-server-devel-implementation postgresql13-server-devel postgresql13-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux-devel libxslt-devel openssl-devel pam-devel pkgconfig(krb5) postgresql-server-devel-noarch postgresql13-devel postgresql13-server readline-devel zlib-devel"

inherit rpm
