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

RPM_NAME = "postgresql-devel-15-2.7.noarch.rpm"
RPM_HASH = "f8576d5764f6fe1b72147ae073c76d40043c3471ac2160ebce8527fec6a359cd9cf1b517fdf6330403e4c900857a46c402a4cf16cabb56db845cc5906c5e204b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig(libecpg) \
pkgconfig(libecpg_compat) \
pkgconfig(libpgtypes) \
pkgconfig(libpq) \
postgresql-devel \
postgresql-devel-noarch"
RDEPENDS:${PN} += "postgresql-devel-implementation"

inherit rpm
