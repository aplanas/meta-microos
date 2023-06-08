SUMMARY = "Qt6 QuickControlsTestUtils static library"
DESCRIPTION = "The Qt6 QuickControlsTestUtils static library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickcontrolstestutils-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "fe0d825333fe5fab148340ae9d6e8097ec7d6daa1b3744d0f87f80e7cbdb4d9a1f5259913aae4697d688564e7d40a686fa78498fe01ffbd1f5dde3b6393bafbd"

RPROVIDES:${PN} += "cmake(Qt6QuickControlsTestUtilsPrivate) qt6-quickcontrolstestutils-devel-static qt6-quickcontrolstestutils-devel-static(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Qml) cmake(Qt6Quick) cmake(Qt6QuickControls2) cmake(Qt6QuickTemplates2) cmake(Qt6QuickTestUtilsPrivate) cmake(Qt6Test) qt6-quickdialogs2quickimpl-private-devel"

inherit rpm
