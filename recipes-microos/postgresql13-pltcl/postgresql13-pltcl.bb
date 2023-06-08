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

PV = "13.10"

RPM_NAME = "postgresql13-pltcl-13.10-2.1.aarch64.rpm"
RPM_HASH = "fbc7eb4d9aaa7bd370d796bef65c848ecb918a2ca7373545710171c5fa509eecf63e7b8174d950f3227b99b57ebe3682ca072b567387a443f9a3b5297982ecee"

RPROVIDES:${PN} += "postgresql-pltcl-implementation postgresql13-pltcl postgresql13-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) postgresql-pltcl-noarch postgresql13-server tcl"

inherit rpm
