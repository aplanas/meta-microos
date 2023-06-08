SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-pltcl-11.19-2.1.aarch64.rpm"
RPM_HASH = "08cf31b08f33cead1c22d9fac67717b4f317392aa13be2f6fa47a75de371a391be1e2955e54f33518cbe0544d9107e6ff87e9ddc8ff1acdedc4a0970c584b56c"

RPROVIDES:${PN} += "postgresql-pltcl-implementation postgresql11-pltcl postgresql11-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) postgresql-pltcl-noarch postgresql11-server tcl"

inherit rpm
