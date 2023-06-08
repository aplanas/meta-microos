SUMMARY = "Qt6 QuickTestUtils static library"
DESCRIPTION = "The Qt6 QuickTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicktestutils-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "b972b475b79b7671f6edd228f09051e674d0f06e98c655863bb102fa4e0b82a2083520f45af4b3590c0b544506e8ed8c417c3b1fc2d0fd6a462174699e008df3"

RPROVIDES:${PN} += "cmake(Qt6QuickTestUtilsPrivate) qt6-quicktestutils-devel-static qt6-quicktestutils-devel-static(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Qml) cmake(Qt6QuickTest) cmake(Qt6Test) qt6-quick-private-devel"

inherit rpm
