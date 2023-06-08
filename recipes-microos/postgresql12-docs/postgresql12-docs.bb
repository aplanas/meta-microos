SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql12/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-docs-12.14-2.1.noarch.rpm"
RPM_HASH = "82b22eacc64f669b72a35951c4a23b4857f263cd517d2fb21642aa349f71dde189d2a678a1aa020dd2e00e5cfa66fd1ceeb1ceffac2fa56779ed647272101179"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql12-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
