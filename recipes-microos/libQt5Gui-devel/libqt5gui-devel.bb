SUMMARY = "Development files for the Qt5 GUI library"
DESCRIPTION = "Development files for the Qt5 GUI library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Gui-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "ad3958cdaf92b4b1f20c649d8abf2779d7e00c530478a90a62dd5a4e5c38a87deae6eafabb89890555320f1916cdf893e43d494e2d53ce283717ecd95e566256"

RPROVIDES:${PN} += "cmake(Qt5EglFSDeviceIntegration) cmake(Qt5EglFsKmsSupport) cmake(Qt5Gui) cmake(Qt5XcbQpa) libQt5Gui-devel libQt5Gui-devel(aarch-64) pkgconfig(Qt5Gui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel libQt5Core-devel libQt5Gui5 pkgconfig(Qt5Core) pkgconfig(egl) pkgconfig(gbm) pkgconfig(glesv2) pkgconfig(libdrm) vulkan-devel"

inherit rpm
