SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql12-devel package."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-server-devel-12.14-2.1.aarch64.rpm"
RPM_HASH = "b7a3aa1941674fb1c724081724313cb7cd31a7c343f73c8efa98cf4319870999375b5e2c34af8ac3649f81d8d259846007368ffc36ea6c310e103add79923836"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-exclusive postgresql-server-devel-implementation postgresql12-server-devel postgresql12-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux-devel libxslt-devel openssl-devel pam-devel pkgconfig(krb5) postgresql-server-devel-noarch postgresql12-devel postgresql12-server readline-devel zlib-devel"

inherit rpm
