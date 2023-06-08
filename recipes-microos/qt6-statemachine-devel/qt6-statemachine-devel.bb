SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-statemachine-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b62acda13860cff460ff900ecdc5526fa7b327a05def541a85ae408bbf648ae8a7a4875e6f1799901438557ede3f5d99fa3bfd66cdfbac817475e31f4ab58758"

RPROVIDES:${PN} += "cmake(Qt6StateMachine) pkgconfig(Qt6StateMachine) qt6-statemachine-devel qt6-statemachine-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6StateMachine6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
