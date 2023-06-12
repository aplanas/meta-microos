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
postgresql11-server-devel package."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-devel-11.20-1.2.aarch64.rpm"
RPM_HASH = "ab987a1b6f4908d1608231fcdeb7ea054322212d72aceeb2b9949275b9368d237cad3c88b951256230939655200e8ed9a6dda2b18a8d4170f2f36f90a80bf9c9"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-exclusive postgresql-devel-implementation postgresql11-devel postgresql11-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecpg6 libpq5 pkgconfig(libecpg) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel-noarch"

inherit rpm
