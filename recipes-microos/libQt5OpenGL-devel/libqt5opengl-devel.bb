SUMMARY = "Development files for the Qt5 OpenGL library"
DESCRIPTION = "Development files for the Qt5 OpenGL library. \
 \
Warning: This module should not be used anymore for new code. Please \
use the corresponding OpenGL classes in Qt GUI."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5OpenGL-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "74ad1edfaa89901b7ee14e5855da328d57f115b1aac4861de5ff1013aa352731bc92ae75594a7332821435f98d4c52e48bf59e8e9ce471c6ba454744b3c64b61"

RPROVIDES:${PN} += "cmake(Qt5OpenGL) libQt5OpenGL-devel libQt5OpenGL-devel(aarch-64) pkgconfig(Qt5OpenGL)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel libQt5Core-devel libQt5Gui-devel libQt5OpenGL5 libQt5Widgets-devel pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Widgets) pkgconfig(glesv2)"

inherit rpm
