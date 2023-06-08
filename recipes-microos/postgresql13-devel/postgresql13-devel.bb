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
postgresql13-server-devel package."
LICENSE = "PostgreSQL"

PV = "13.10"

RPM_NAME = "postgresql13-devel-13.10-2.1.aarch64.rpm"
RPM_HASH = "2642ff7ab7c345eba7c7d1eecf8ca5c527f834f01477e3baf9a17ad85dac2e768508c34355a51263e68af54f2bbf74b9b9784276ec34a9de7d4bdf755cdae04b"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-exclusive postgresql-devel-implementation postgresql13-devel postgresql13-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecpg6 libpq5 pkgconfig(libecpg) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel-noarch"

inherit rpm
