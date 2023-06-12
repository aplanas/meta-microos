SUMMARY = "Development package for kdb"
DESCRIPTION = "The development package for the database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-devel-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "9fc0a7fa2063be78d1cfeba9d6a36a1135af1e2debeea70d696524873cc438bf6bfea9f3cc5331b415e82c9798cdc683edc739bfef56336f526845bc8c3b6312"

RPROVIDES:${PN} += "cmake(KDb) kdb-devel kdb-devel(aarch-64)"
RDEPENDS:${PN} += "libKDb3-4"

inherit rpm
