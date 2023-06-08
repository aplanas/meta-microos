SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql14-devel package."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-server-devel-14.7-2.1.aarch64.rpm"
RPM_HASH = "0c8eb2ffb38aca690352e2ea47a3dd0b3e0de5f35a137fc83b57eeadc1e07aa05e62caea10c9a1bcbf7094fb26a3d94368809a2d76ee10b302dff07e213c50a0"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-exclusive postgresql-server-devel-implementation postgresql14-server-devel postgresql14-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpq.so.5()(64bit) libselinux-devel libxslt-devel openssl-devel pam-devel pkgconfig(krb5) postgresql-server-devel-noarch postgresql14-devel postgresql14-server readline-devel zlib-devel"

inherit rpm
