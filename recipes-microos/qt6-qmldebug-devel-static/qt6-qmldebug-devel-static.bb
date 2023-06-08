SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "08d36669ce7ade9f19a6ad4cb1cd458c91ca51659d71a3497fe4a20b2b6abcd006b40eb70714fcbf930fc2b643d30d45bb4ac0f82ca981c97bbb237c820c7230"

RPROVIDES:${PN} += "cmake(Qt6QmlDebugPrivate) qt6-qmldebug-devel-static qt6-qmldebug-devel-static(aarch-64) qt6-qmldebug-private-devel"
RDEPENDS:${PN} += "cmake(Qt6Network) qt6-core-private-devel qt6-packetprotocol-devel-static qt6-qml-private-devel"

inherit rpm
