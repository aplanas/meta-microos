SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql11/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-docs-11.19-2.1.noarch.rpm"
RPM_HASH = "b64f02a3620ce73e90e66380506a777222b6bdd6ab6e32cbfca4751969a153ef1c6c4279978142e418f116bb2a880ee9816f875bde8911ee509c412cb78e4b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql11-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
