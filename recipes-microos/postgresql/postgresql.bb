SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-15-2.4.noarch.rpm"
RPM_HASH = "ea8b80400807d04676b5c9ff527a23f2d39fea8bcfd177e8d5d1e5e2029dc632c942e3dfac3a5e39c08ceabeb4a291b217294eebd90a38089f46cc97ce1c7d24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql postgresql-noarch"
RDEPENDS:${PN} += "/bin/bash postgresql-implementation update-alternatives"

inherit rpm
