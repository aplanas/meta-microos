SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql15-devel package."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-server-devel-15.2-3.1.aarch64.rpm"
RPM_HASH = "9c51113d4e58c1d586b5baaa669f839ec4db2660f241f535023c44adfea9ea8e150e6025d88bacbbfae2bc1d250f366049fcfb64ac5d1b6f8998f8e34b1737cc"

RPROVIDES:${PN} += "postgresql-server-devel postgresql-server-devel-exclusive postgresql-server-devel-implementation postgresql15-server-devel postgresql15-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpq.so.5()(64bit) libselinux-devel libxslt-devel openssl-devel pam-devel pkgconfig(krb5) postgresql-server-devel-noarch postgresql15-devel postgresql15-server readline-devel zlib-devel"

inherit rpm
