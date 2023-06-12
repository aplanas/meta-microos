SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols-devel-static-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "3b6df658cf1336e9710db777d04523f8adea1cdabd5b5b26422a209d233b09b08246075aed7847c8e4725d85da8c3b8e74720ea5bf200cc273a9aaae4334924b"

RPROVIDES:${PN} += "libsmartcols-devel-static libsmartcols-devel-static(aarch-64)"
RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
