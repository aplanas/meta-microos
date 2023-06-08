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

PV = "11.19"

RPM_NAME = "postgresql11-devel-11.19-2.1.aarch64.rpm"
RPM_HASH = "ba1329b83eea806049722c70dd69bcfac3f045d9a6deee288628dffa99ec83d5a0570cbd90b3a7e0559cc99c4069812d6d81726f7f950a99f9a89e97d971adfa"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-exclusive postgresql-devel-implementation postgresql11-devel postgresql11-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecpg6 libpq5 pkgconfig(libecpg) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel-noarch"

inherit rpm
