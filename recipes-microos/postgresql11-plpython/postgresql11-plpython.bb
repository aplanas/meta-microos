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

PV = "11.19"

RPM_NAME = "postgresql11-plpython-11.19-2.1.aarch64.rpm"
RPM_HASH = "b5a3ca1b096d13fd3da3150635194221513e9941a8cc51f7f0deed1268fedb729ba8b59cd2c7c684d5a157a253ae7672eb7f65764c166816caeb0865e2d5edc4"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql11-plpython postgresql11-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql11-server python3"

inherit rpm
