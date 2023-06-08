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

PV = "15.2"

RPM_NAME = "postgresql15-pltcl-15.2-3.1.aarch64.rpm"
RPM_HASH = "e70627384c621fbaa80ba2d682224a7eb0fb8fea5f63e4946dca4c4cad989fcb84804886dc8ff2969ae03ea5eca0a8a82a0189ded8aebf1ce73b2ad5ab5f22f1"

RPROVIDES:${PN} += "postgresql-pltcl-implementation postgresql15-pltcl postgresql15-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) postgresql-pltcl-noarch postgresql15-server tcl"

inherit rpm
