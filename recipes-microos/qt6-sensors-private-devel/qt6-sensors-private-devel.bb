SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6a0efcec9268984977412f51af50e8cfe5ca2f1e7a1a381b3dc79b524c5c7558eb3da915b220f09f00fc8e205468dff382b4b85eec3574c63a22abf55b99736b"

RPROVIDES:${PN} += "qt6-sensors-private-devel qt6-sensors-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Sensors)"

inherit rpm
