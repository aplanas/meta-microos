SUMMARY = "PostgreSQL DBI module for Qore"
DESCRIPTION = "PostgreSQL module for the Qore Programming Language. \
 \
This package provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "3.2.0"

RPM_NAME = "qore-pgsql-module-doc-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "dc8bbbd64d774dc1f5e2b5ef8516f5c6e37fb95fbe00d5ca33b537e54893458ed1c2c2bdb9d692ed12b141fa0e4fe5b04864744e2cc3a48755ad06888d5fcb7e"

RPROVIDES:${PN} += "qore-pgsql-module-doc qore-pgsql-module-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
