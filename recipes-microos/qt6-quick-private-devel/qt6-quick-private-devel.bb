SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quick-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "18d3d873eba54df7125b7705bc46bbd4f1561624b3e2b9f2cd2b96e759a472e0b8e53465d6cf1bdea16191860b74ee85610ef518720faba2447a735478e53d7a"

RPROVIDES:${PN} += "qt6-quick-private-devel qt6-quick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick) qt6-core-private-devel qt6-gui-private-devel qt6-qml-private-devel qt6-qmlmodels-private-devel"

inherit rpm
