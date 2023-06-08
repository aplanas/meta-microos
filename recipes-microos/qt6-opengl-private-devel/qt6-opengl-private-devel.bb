SUMMARY = "Non-ABI stable API for the Qt 6 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt6OpenGL that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-opengl-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "a60c87336401b1111646477fe3fb6fc7b04e49cbc6b8cffa575716cf73fa62d232285c107e3444b72dc708d3b4cf3df3dd792d1c687fa2b9be755f4fc61b095f"

RPROVIDES:${PN} += "qt6-opengl-private-devel qt6-opengl-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6OpenGL) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
