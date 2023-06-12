SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3fb12258c2f9babc4ffd6afdfca213304693bc613c38d4adc6a628f8f2e47e718626d789b287503fa42ba2910374d0f610b489c991a460006a59d650c03041fc"

RPROVIDES:${PN} += "cmake(Qt6EglFSDeviceIntegrationPrivate) cmake(Qt6EglFsKmsGbmSupportPrivate) cmake(Qt6EglFsKmsSupportPrivate) cmake(Qt6XcbQpaPrivate) qt6-gui-private-devel qt6-gui-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6DeviceDiscoverySupportPrivate) cmake(Qt6FbSupportPrivate) cmake(Qt6InputSupportPrivate) libQt6Gui6 pkgconfig(xkbcommon) qt6-core-private-devel qt6-kmssupport-private-devel qt6-opengl-private-devel"

inherit rpm
