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

PV = "14.7"

RPM_NAME = "postgresql14-pltcl-14.7-2.1.aarch64.rpm"
RPM_HASH = "102f7cd34372d022e6a7a77008da751494eec7ceeb7e1d9e5b718f15e42c110c42f8f7c5436e6f35d03c1e8bfc60b38416ce520a15b8f619e52a540e9467d57e"

RPROVIDES:${PN} += "postgresql-pltcl-implementation postgresql14-pltcl postgresql14-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) postgresql-pltcl-noarch postgresql14-server tcl"

inherit rpm
