SUMMARY = "Spawn processes but report exec() errors"
DESCRIPTION = "This module contains functions for synchronized process spawning with full \
error return. If the child's exec() call fails the reason for the failure \
is reported back to the parent."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-Proc-SyncExec-1.01-1.11.noarch.rpm"
RPM_HASH = "c6dd1f536542a82ca10cda4cef210e62c59b58c38f7ddfce64c587204323d8582fd19edb345aa6ee604cc442064aa1feb934171798edd007127abfff85c3cba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Proc::SyncExec) perl-Proc-SyncExec"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
