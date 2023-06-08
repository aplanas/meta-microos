SUMMARY = "PostgreSQL development header files and libraries"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C applications which will directly interact with a PostgreSQL database \
management server and the ECPG Embedded C Postgres preprocessor. You \
need to install this package if you want to develop applications in C \
which will interact with a PostgreSQL server."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-devel-15-2.4.noarch.rpm"
RPM_HASH = "459ee74d5d2c179b59c623689e089225fab7f6620cf33f4b622eaf0cbee3ff7550534c40117323cf4261a9dfb03b75577769b9e8511bb51efb0bdfbad1726f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(libecpg) pkgconfig(libecpg_compat) pkgconfig(libpgtypes) pkgconfig(libpq) postgresql-devel postgresql-devel-noarch"
RDEPENDS:${PN} += "postgresql-devel-implementation"

inherit rpm
