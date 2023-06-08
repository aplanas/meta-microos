SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DPhysics library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DPhysics that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dphysics-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "359b96a685ab887c37fdb1a02a8937f67c98af7fc374cfb6c28b3602457d0d40b6a8957791161255c94472d705a48d0e785c856f417b58e1b03c6aeba99dfef0"

RPROVIDES:${PN} += "qt6-quick3dphysics-private-devel qt6-quick3dphysics-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DPhysics) qt6-gui-private-devel qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm
