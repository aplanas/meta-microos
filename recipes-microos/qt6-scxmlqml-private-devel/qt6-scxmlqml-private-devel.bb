SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-scxmlqml-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "bce6948c2049bea7c579e814a1515d5cda9c4fa2573f847ef5c492ebbeead447862d6c1d8bfd8e9c829114924c9991d7aaa2808b2fbba141c73858c9195a0ac7"

RPROVIDES:${PN} += "qt6-scxmlqml-private-devel qt6-scxmlqml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6ScxmlQml)"

inherit rpm
