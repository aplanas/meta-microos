SUMMARY = "Development files for the Qt5 GUI library"
DESCRIPTION = "Development files for the Qt5 GUI library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Gui-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "cad2c828774ae2094d7a45e2f47a66967d588b17a956523fcf801fd8511c6e6bb22d258d30433386321e040e7244b668b531a77a97ba2944e9fb5b1e7a8601ca"

RPROVIDES:${PN} += "cmake(Qt5EglFSDeviceIntegration) cmake(Qt5EglFsKmsSupport) cmake(Qt5Gui) cmake(Qt5XcbQpa) libQt5Gui-devel libQt5Gui-devel(aarch-64) pkgconfig(Qt5Gui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel libQt5Core-devel libQt5Gui5 pkgconfig(Qt5Core) pkgconfig(egl) pkgconfig(gbm) pkgconfig(glesv2) pkgconfig(libdrm) vulkan-devel"

inherit rpm
