SUMMARY = "Development files for the Qt 6 GUI libraries"
DESCRIPTION = "Development files for the Qt 6 GUI libraries."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-gui-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "e8e470a6cc2bb196e769591586ef0cfbc4e2bb5e4fd12f18765254816d00bc5c2136df9cdb88af4d86f681387973172ea7982fbadd70d5fd43ee0822051f1c07"

RPROVIDES:${PN} += "cmake(Qt6Gui) cmake(Qt6GuiTools) pkgconfig(Qt6Gui) qt6-gui-devel qt6-gui-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel cmake(Qt6Core) cmake(Qt6DBus) libQt6Gui6 pkgconfig(Qt6Core) pkgconfig(atspi-2) pkgconfig(egl) pkgconfig(gbm) pkgconfig(glesv2) pkgconfig(libdrm) pkgconfig(vulkan) pkgconfig(xkbcommon)"

inherit rpm
