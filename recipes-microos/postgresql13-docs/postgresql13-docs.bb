SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql13/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "13.10"

RPM_NAME = "postgresql13-docs-13.10-2.1.noarch.rpm"
RPM_HASH = "2a9f541d80509777e47e6ab2a886c6f541af734e98804e6a8c74e9c3cce5959febb5c6cfc6f8893a67dd1e9c1a15e656ccd374275297417c9446c7c7681f3c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql13-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
