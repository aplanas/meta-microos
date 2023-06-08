SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-plpython-15-2.4.noarch.rpm"
RPM_HASH = "d2b5bc28b601dccf181dcd721a87673a3120a8f1cc4160839ff8ef85e2f5d0b3e82ac9a3ae5c9bb8a38902324e790d144a84ec6a9705170e093d749084e2c01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plpython postgresql-plpython-noarch"
RDEPENDS:${PN} += "postgresql-plpython-implementation"

inherit rpm
