SUMMARY = "Add contextual fetches to DBI"
DESCRIPTION = "It always struck me odd that DBI didn't take much advantage of Perl's \
context sensitivity. DBIx::ContextualFetch redefines some of the various \
fetch methods to fix this oversight. It also adds a few new methods for \
convenience (though not necessarily efficiency)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-DBIx-ContextualFetch-1.03-5.26.noarch.rpm"
RPM_HASH = "e3571cef17ab3caf546d37b639e7052b957dd4798a274e4179f076ed992b1d3e027d9e74fd49a21db1dba9310fbb705093a5833db67c65936cd20cf7d63d641a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::ContextualFetch) perl(DBIx::ContextualFetch::db) perl(DBIx::ContextualFetch::st) perl-DBIx-ContextualFetch"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(DBI)"

inherit rpm
