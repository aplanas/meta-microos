SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "90223b9848a564aeb210472d188196328d2fd2f723b658734c142510b0f631c745413571c1c411e3a79e4bb4a69199236be2b72858cedfae7c7412c7e8be0574"

RPROVIDES:${PN} += "cmake(Qt6PacketProtocolPrivate) qt6-packetprotocol-devel-static qt6-packetprotocol-devel-static(aarch-64) qt6-packetprotocol-private-devel"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
