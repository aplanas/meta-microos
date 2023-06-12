SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "145e27e719021e08024476bd0a89d39f6db0bd0f95f3adc59ad0c80775466895ab33e128d99458ccf8e419d2325dc8d83db4369f105c9cd67399bb8a0400b151"

RPROVIDES:${PN} += "cmake(Qt6PacketProtocolPrivate) \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-devel-static(aarch-64) \
qt6-packetprotocol-private-devel"
RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
