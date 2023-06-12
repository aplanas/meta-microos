SUMMARY = "Development files for the Qt5 OpenGL library"
DESCRIPTION = "Development files for the Qt5 OpenGL library. \
 \
Warning: This module should not be used anymore for new code. Please \
use the corresponding OpenGL classes in Qt GUI."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5OpenGL-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "81e0f63aa2ce311a03245e06e394136d0f29d42fea705161c18cc486da5b0e9271192c4294213a11f6787cfa77cc44ed9dc2d83dfee005166ca3bf1411cc802d"

RPROVIDES:${PN} += "cmake(Qt5OpenGL) \
libQt5OpenGL-devel \
libQt5OpenGL-devel(aarch-64) \
pkgconfig(Qt5OpenGL)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libGLESv3-devel \
libQt5Core-devel \
libQt5Gui-devel \
libQt5OpenGL5 \
libQt5Widgets-devel \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui) \
pkgconfig(Qt5Widgets) \
pkgconfig(glesv2)"

inherit rpm
