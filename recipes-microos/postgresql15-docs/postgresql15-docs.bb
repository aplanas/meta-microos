SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql15/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-docs-15.2-3.1.noarch.rpm"
RPM_HASH = "2dcdfc3e048f2008331957a5d76f7da62604eb6ea97f9e981652a56173d25550bebcf5791d0f320264eefbfb6af29a8f28db12de0b58323b085402c3a8a9f18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql15-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
