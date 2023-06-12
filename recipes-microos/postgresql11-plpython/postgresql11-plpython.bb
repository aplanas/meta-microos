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

PV = "11.20"

RPM_NAME = "postgresql11-plpython-11.20-1.2.aarch64.rpm"
RPM_HASH = "349c53dd0c3f357e557014e5620c9df050fd39721e92dec7e3b71ba8723c5c542ad16657d02244c8e03b9b301c48b23dfb5ebe2b76f52a2f429d149d7f4bad0d"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql11-plpython postgresql11-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql11-server python3"

inherit rpm
