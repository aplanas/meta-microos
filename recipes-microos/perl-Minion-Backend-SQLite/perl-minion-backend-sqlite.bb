SUMMARY = "SQLite backend for Minion job queue"
DESCRIPTION = "Minion::Backend::SQLite is a backend for Minion based on Mojo::SQLite. All \
necessary tables will be created automatically with a set of migrations \
named 'minion'. If no connection string or ':temp:' is provided, the \
database will be created in a temporary directory."
LICENSE = "Artistic-2.0"

PV = "5.0.7"

RPM_NAME = "perl-Minion-Backend-SQLite-5.0.7-1.2.noarch.rpm"
RPM_HASH = "bb894cb0be570774030379546432036e049753c8546a66a38c566d0dfded6bfa921e61277cfec3000e573ed3fa1c2b3f77a6479af5c77fcd7806954730b96e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Minion::Backend::SQLite) perl-Minion-Backend-SQLite"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Minion) perl(Mojo::SQLite) perl(Mojolicious)"

inherit rpm
