SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-contrib-15-2.4.noarch.rpm"
RPM_HASH = "298a7c7ac0135627b66ad7cbf7d7ba951d7b128a4caebc15c7f30c0fa472b3fba0e57677fb654ddf77f8922a28f0a163275890e4d2744d82914f813f2ad863be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-contrib postgresql-contrib-noarch"
RDEPENDS:${PN} += "postgresql-contrib-implementation"

inherit rpm
