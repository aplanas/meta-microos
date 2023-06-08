SUMMARY = "PostgreSQL features for SQL::Abstract"
DESCRIPTION = "SQL::Abstract::Pg extends SQL::Abstract with a few PostgreSQL features used \
by Mojo::Pg."
LICENSE = "Artistic-2.0"

PV = "1.0"

RPM_NAME = "perl-SQL-Abstract-Pg-1.0-1.10.noarch.rpm"
RPM_HASH = "1743c77a1695243db03ec84658230ff3939c60729e13e017c086b6f6797c5360625771876f8671c7c2523c9d20f090410e173a62f0e25219d33fc8c1c91086ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(SQL::Abstract::Pg) perl-SQL-Abstract-Pg"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(SQL::Abstract)"

inherit rpm
