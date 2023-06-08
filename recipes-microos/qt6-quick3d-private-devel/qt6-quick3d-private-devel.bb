SUMMARY = "Non-ABI stable API for the Qt 6 Quick3D library"
DESCRIPTION = "This package provides private headers of libQt6Quick3D that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3d-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "28e92882b36f3ca2aea2316f5c69eaf433ff631e49bf72aa636b63589505c6a0f6015c8013033e409e6c76df793173f34394d1d88f59d3b8b14d89cacc42254f"

RPROVIDES:${PN} += "qt6-quick3d-private-devel qt6-quick3d-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3D) qt6-core-private-devel qt6-gui-private-devel qt6-qml-private-devel qt6-quick-private-devel qt6-quick3druntimerender-private-devel"

inherit rpm
