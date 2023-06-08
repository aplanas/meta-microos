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

PV = "12.14"

RPM_NAME = "postgresql12-pltcl-12.14-2.1.aarch64.rpm"
RPM_HASH = "8c344fac352fe4c47013dc108e483c79ba23ac0604c5f8ee4d6d44a012cc8787ff27fb476723d91dba61b4de63d2ae866f811dcba9b1035223a8f3efe3b2b1b8"

RPROVIDES:${PN} += "postgresql-pltcl-implementation postgresql12-pltcl postgresql12-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) postgresql-pltcl-noarch postgresql12-server tcl"

inherit rpm
