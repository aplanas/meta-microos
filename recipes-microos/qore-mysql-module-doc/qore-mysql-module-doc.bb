SUMMARY = "MySQL DBI module for Qore"
DESCRIPTION = "MySQL module for the Qore Programming Language. \
 \
This RPM provides API documentation, test and example programs"
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "qore-mysql-module-doc-2.1-1.5.aarch64.rpm"
RPM_HASH = "d8751913518edee5c8c8634c9d8e81a71131f8a0e1c2f73aa23d92188c5ba0b3c3a926a8957246fb29d5e5a7d56ec74fabe9bf8ad80e70859a94bd4582d09c61"

RPROVIDES:${PN} += "qore-mysql-module-doc qore-mysql-module-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
