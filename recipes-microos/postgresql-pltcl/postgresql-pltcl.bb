SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-pltcl-15-2.4.noarch.rpm"
RPM_HASH = "fbe3388b1f178dcff34d0a95e9613322fc81fa41c9090c918a51bfad7b508d156498ed5d0b09e21d5ca8f7d74dd4b5cb773ed4760f11abbb24494d7c988f57bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-pltcl postgresql-pltcl-noarch"
RDEPENDS:${PN} += "postgresql-pltcl-implementation"

inherit rpm
