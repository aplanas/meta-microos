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

PV = "13.10"

RPM_NAME = "postgresql13-plpython-13.10-2.1.aarch64.rpm"
RPM_HASH = "b4c7479b740b81178a7f48a171c5de5379f4db4453a1291c4825dda72daf343913571b35a87eebc8623c7e80f9721afdab6b6f4d42e108cad302d96775c820b2"

RPROVIDES:${PN} += "postgresql-plpython-implementation postgresql13-plpython postgresql13-plpython(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) postgresql-plpython-noarch postgresql13-server python3"

inherit rpm
