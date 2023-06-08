SUMMARY = "Development files for the Qt 6 OpenGLWidgets library"
DESCRIPTION = "Development files for the Qt 6 OpenGLWidgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-openglwidgets-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "498c15ee85676720c0f803ef8b423f22feb82aca129a7a4fa9b35ff5778d06f73e65ac8c613d0682bff28e012e39e5c7860ae99f338d43d3884d01f2756480e1"

RPROVIDES:${PN} += "cmake(Qt6OpenGLWidgets) pkgconfig(Qt6OpenGLWidgets) qt6-openglwidgets-devel qt6-openglwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel cmake(Qt6OpenGL) cmake(Qt6Widgets) libQt6OpenGLWidgets6 pkgconfig(Qt6OpenGL) pkgconfig(Qt6Widgets) pkgconfig(glesv2)"

inherit rpm
