SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qml-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "bf3bb0efce1899a2f3e451407c8661d3660406c314e78016c58323ea0dec1e94e661e113a3fd33f586a386d8201f20da3edda4dc8de4f2bd62966f7e7241d0af"

RPROVIDES:${PN} += "qt6-qml-private-devel qt6-qml-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Qml) qt6-core-private-devel"

inherit rpm
