SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "930252e771432dcb369ccfa66c488eedc4a1b45cf1f3396d5e2e200ff2653103d0c3ae68d00ac713feb4e9fca52231cd3c02e61077776b11173572eed5e4e867"

RPROVIDES:${PN} += "cmake(Qt6LabsSharedImage) pkgconfig(Qt6LabsSharedImage) qt6-labssharedimage-devel qt6-labssharedimage-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsSharedImage6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Quick) qt6-gui-private-devel qt6-quick-private-devel"

inherit rpm
