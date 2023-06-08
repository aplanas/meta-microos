SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "226e0b0ee8fcc842d1e06138ebd6b500a0c750aa4157e33a095831289d77cfe3c25fe53b6f476a9cc27a27e918de02fc94625ca4ac34aabe4d1bb6267d0d9af1"

RPROVIDES:${PN} += "cmake(Qt6QuickParticlesPrivate) qt6-quickparticles-devel qt6-quickparticles-private-devel qt6-quickparticles-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6QuickParticles6 qt6-gui-private-devel qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm
