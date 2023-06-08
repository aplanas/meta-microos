SUMMARY = "Development files for the Qt 6 WebEngineWidgets library"
DESCRIPTION = "Development files for the Qt 6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-webenginewidgets-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "769a29fbbb9dcf4d11df71e832ece36857b105f2486b2f6ea5e740a7ee445df8923286c92e2087d6da5840d89f4857b1f8afe0df1bd8beac0454e57f578b308a"

RPROVIDES:${PN} += "cmake(Qt6WebEngineWidgets) pkgconfig(Qt6WebEngineWidgets) qt6-webenginewidgets-devel qt6-webenginewidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6PrintSupport) cmake(Qt6QuickWidgets) cmake(Qt6WebEngineCore) libQt6WebEngineWidgets6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6PrintSupport) pkgconfig(Qt6WebEngineCore) pkgconfig(Qt6Widgets) qt6-quick-private-devel"

inherit rpm
