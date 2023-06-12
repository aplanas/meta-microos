SUMMARY = "Qt 6 StateMachine library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachine library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachine-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "36091a306ba875c0364358abb2d440791ec4dbb6f406098cd206b3fbc22c2c2eaf935a0a5b9b85991430919d2618f7c02362a4b23264ab4e875c4dd5aee7911c"

RPROVIDES:${PN} += "cmake(Qt6StateMachine) pkgconfig(Qt6StateMachine) qt6-statemachine-devel qt6-statemachine-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6StateMachine6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui)"

inherit rpm
