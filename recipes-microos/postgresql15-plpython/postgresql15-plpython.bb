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

PV = "15.2"

RPM_NAME = "postgresql15-plpython-15.2-3.1.aarch64.rpm"
RPM_HASH = "e3923b70dd2c8748a2c3edbfe80dea0587c0e8318f7ef13d65a05113b2ebdbe15de6098712063a36b17c25ce7b6e5818e4501e05c36dba6efb9f2a3c7ea9dd39"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql15-plpython postgresql15-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql15-server python3"

inherit rpm
