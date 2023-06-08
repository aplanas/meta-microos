SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dutils-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6e84416a3ee0e1cb4711edc927dc81f8011201b4da76e8673cb8bc2c1b8ded6b2945b149a0fabd10d0c608ed486d575c297e321c75626b40687c6e7d82080fb7"

RPROVIDES:${PN} += "qt6-quick3dutils-private-devel qt6-quick3dutils-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DUtils) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
