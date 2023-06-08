SUMMARY = "Development files for the Osmocom MTP library"
DESCRIPTION = "MTP is part of SS7 used for communication in Public Switched \
Telephone Networks. \
 \
This subpackage contains the development files for the Osmocom MTP \
library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-mtp-devel-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "701d35976b39c6f7820ee8da7d775d53e8c4cd2d3bcd8d11352b16b57f3f33d6a90aa95f9e43bf77f8c1da6ac16f06924005ded5d658c3fc7838a0e1c4a9b49f"

RPROVIDES:${PN} += "libosmo-mtp-devel libosmo-mtp-devel(aarch-64) pkgconfig(libosmo-mtp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-mtp-1_6_0"

inherit rpm
