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

PV = "14.7"

RPM_NAME = "postgresql14-plpython-14.7-2.1.aarch64.rpm"
RPM_HASH = "d7079da03f97562f1e6b0fe6d7ff2429bb29c4f4d213a8f45208f5768fd01ff094b0ef52f85f46a7e5d5b759d040ba2d1e3d150be552586b9d2b5e7457c8b203"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql14-plpython postgresql14-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql14-server python3"

inherit rpm
