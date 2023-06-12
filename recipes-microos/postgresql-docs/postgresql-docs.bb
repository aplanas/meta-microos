SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-docs-15-2.7.noarch.rpm"
RPM_HASH = "a1230342eea2d322e0ca332b5cf912210bac68d0831a07919bc10855a8c968d0865cf10be5b4f9a83c0290b4f1c1a1efa643c0a22c2004658f59c9232721bcbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs \
postgresql-docs-noarch"
RDEPENDS:${PN} += "postgresql-docs-implementation"

inherit rpm
