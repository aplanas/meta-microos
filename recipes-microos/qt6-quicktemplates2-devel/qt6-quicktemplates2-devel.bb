SUMMARY = "Qt6 QuickTemplates2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicktemplates2-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "ecee995c38686c6493cd8fa6c74c516e3d7a5df8fed7f0c4d5d2314b7beaa18c817384b5fda2d51119ec1803039847817e23b04b19c185961731ee31fcff04e2"

RPROVIDES:${PN} += "cmake(Qt6QuickTemplates2) pkgconfig(Qt6QuickTemplates2) qt6-quicktemplates2-devel qt6-quicktemplates2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6QmlModels) libQt6QuickTemplates2-6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6QmlModels) pkgconfig(Qt6Quick) qt6-qml-private-devel"

inherit rpm
