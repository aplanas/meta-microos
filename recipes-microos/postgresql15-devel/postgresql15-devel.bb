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
postgresql15-server-devel package."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-devel-15.2-3.1.aarch64.rpm"
RPM_HASH = "08b5b875dff48ce415947b03779e928baf7a7955908399bc088590d0e0a9499e583b03de2b7488ee4379acdd4154eaa37017c268d843d5f8d28c71a52aeb5469"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-exclusive postgresql-devel-implementation postgresql15-devel postgresql15-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecpg6 libpq5 pkgconfig(libcrypto) pkgconfig(libecpg) pkgconfig(libpgtypes) pkgconfig(libpq) pkgconfig(libssl) postgresql-devel-noarch"

inherit rpm
