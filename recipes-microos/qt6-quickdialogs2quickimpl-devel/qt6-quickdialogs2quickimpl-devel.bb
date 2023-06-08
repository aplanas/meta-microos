SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "f9d0828445c82eb019404259d6f8b4fa2b054f5e0db20aabf60f1d67e98f9003dbb9d5104bfe659802f48b985ddb5cc39ff8e7810bc59cfbbfc6700b15136383"

RPROVIDES:${PN} += "cmake(Qt6QuickDialogs2QuickImpl) pkgconfig(Qt6QuickDialogs2QuickImpl) qt6-quickdialogs2quickimpl-devel qt6-quickdialogs2quickimpl-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6QuickDialogs2QuickImpl6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quickcontrols2impl-private-devel qt6-quickdialogs2utils-private-devel qt6-quicktemplates2-private-devel"

inherit rpm
