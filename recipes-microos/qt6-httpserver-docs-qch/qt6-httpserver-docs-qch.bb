SUMMARY = "Documentation for qt6-httpserver in QCH format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-httpserver-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "92d0b3f989b43708056c836b9d4790e171d45b96a16b069e80b0203765be8eac0720bee4c0d7c4f2dd70ebe7314137b9f78c84879ad1bd2476e836385930dc4c"

RPROVIDES:${PN} += "qt6-httpserver-docs-qch qt6-httpserver-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
