SUMMARY = "Development files for the Qt 6 Widgets library"
DESCRIPTION = "Development files for the Qt 6 Widgets library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-widgets-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "0ca146c0fd805efa0f99878d8e6879b264c23f997bb73e4311dd1b8cca4f03ace6a49fd57d7180811e4d87807657613e15ce6041737cc695966eb5de84da914d"

RPROVIDES:${PN} += "cmake(Qt6Widgets) cmake(Qt6WidgetsTools) pkgconfig(Qt6Widgets) qt6-widgets-devel qt6-widgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Gui) libQt6Widgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
