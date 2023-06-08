SUMMARY = "Qt OpenGLExtensions module"
DESCRIPTION = "Qt OpenGLExtensions module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5OpenGLExtensions-devel-static-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "25bec40c741a954601be1c627cb4d00abd1ebcf8ff157daca9f06545047a5e5932ca6bd28ccb9802ae381188f0bcf55a1ff902da2e4c5e65e25fa1d8f6b737e5"

RPROVIDES:${PN} += "cmake(Qt5OpenGLExtensions) libQt5OpenGLExtensions-devel-static libQt5OpenGLExtensions-devel-static(aarch-64) pkgconfig(Qt5OpenGLExtensions)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Gui-devel pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(gl)"

inherit rpm
