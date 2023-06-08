SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Perl procedural language for PostgreSQL. \
With this module one can use Perl to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-plperl-15-2.4.noarch.rpm"
RPM_HASH = "b78ee250bae2af845057c76b2847b7c4c36279fe3acd45567492affbf1ab9b6e26efdb31356727774847a2b88f13ccc0a44fbee8dd74a3f883628352095ef310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plperl postgresql-plperl-noarch"
RDEPENDS:${PN} += "postgresql-plperl-implementation"

inherit rpm
