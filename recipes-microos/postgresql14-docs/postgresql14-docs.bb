SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql14/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-docs-14.7-2.1.noarch.rpm"
RPM_HASH = "ac7fec128dac8cb49a3481a2a98d51e732ed5ffbefd92a3dcfbfc0f4eec2c7c301528918448d99e4467efa7d2d5b93894c39dee02616c57596a1fc41caab1e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql14-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
