SUMMARY = "PostgreSQL client development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server. \
 \
For building PostgreSQL server extensions, see the \
postgresql14-server-devel package."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-devel-14.7-2.1.aarch64.rpm"
RPM_HASH = "6b2841f2f0f9936e0207b940fbaa0eb6175a26a4014a4968eb7ca88f5b84eadb0ecd02e5e90c4ada5c498d69e702c24a4c519f190f1987c6bc347365f6cb64df"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-exclusive postgresql-devel-implementation postgresql14-devel postgresql14-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecpg6 libpq5 pkgconfig(libcrypto) pkgconfig(libecpg) pkgconfig(libpgtypes) pkgconfig(libpq) pkgconfig(libssl) postgresql-devel-noarch"

inherit rpm
