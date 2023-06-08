SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-server-15-2.4.noarch.rpm"
RPM_HASH = "b278d1a97f2bc9fe41dc95904d02edc36640e3144c5e69470c50e2bc29c0a65371a49352cb4906eac9710b97f6923d77106255e439bcb3965082797f14434e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(postgresql-server) group(postgres) postgresql-init postgresql-server postgresql-server-noarch user(postgres)"
RDEPENDS:${PN} += "/bin/sh postgresql postgresql-server-implementation systemd sysuser-shadow"

inherit rpm
