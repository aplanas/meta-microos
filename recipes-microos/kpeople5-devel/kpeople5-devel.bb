SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kpeople5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7a54975608918b5cd6834b7a94afdfd1284de2c6d3a8c784a2a71caff7bc8ed07b35234855280b031c09f362f85a1ce6998b556ada408d50867010b6248e38b6"

RPROVIDES:${PN} += "cmake(KF5People) kpeople5-devel kpeople5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) kpeople5"

inherit rpm
