SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-plpython-12.14-2.1.aarch64.rpm"
RPM_HASH = "d6a01737c6cd2cbd60e6dd53423a5e0483620854c6843e9f75aab7c5b705bae28ce19c2a43b943e94a9a1fc869f99652361f0519536ec7debbfbc48cf55700de"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql12-plpython postgresql12-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql12-server python3"

inherit rpm
