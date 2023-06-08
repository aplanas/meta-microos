SUMMARY = "Development files for the Qt 6 OpenGL library"
DESCRIPTION = "Development files for the Qt 6 OpenGL library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-opengl-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "7bba80bcaed25f964af835c35e357fe761351fadabe87ea770b40b0cc76bb778ae9533f457d788f637ff1ca277ffb990f1094dffaccc52faabeeebb15d0621c9"

RPROVIDES:${PN} += "cmake(Qt6OpenGL) pkgconfig(Qt6OpenGL) qt6-opengl-devel qt6-opengl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libGLESv3-devel cmake(Qt6Core) cmake(Qt6Gui) libQt6OpenGL6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(glesv2)"

inherit rpm
