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

RPM_NAME = "postgresql-docs-15-2.4.noarch.rpm"
RPM_HASH = "24a4ca0748f5a276c92f86a15c8e516e35e2719206360adc284d7044a600f03063a9d044b12ff7e0b347cd536f1ffaff0dfcfb1a46cf8900f7222a0faeb64278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs postgresql-docs-noarch"
RDEPENDS:${PN} += "postgresql-docs-implementation"

inherit rpm
