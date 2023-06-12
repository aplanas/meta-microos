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

PV = "14.8"

RPM_NAME = "postgresql14-docs-14.8-1.2.noarch.rpm"
RPM_HASH = "ac156fe3c10c0b0d059a257026855d7883055a4175354b38c60062d91e45af6a5d92e818adc9903b8df6f3849b2451068f6a44e92504d4f3e293cf03bd660b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation postgresql14-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
