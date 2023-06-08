SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-statemachineqml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "10c625a0e7453a72037c88623e68a3b48fa492337439fa359b844ed7a46b5965902fe1d0180a211624914a726efd9a5c766c2129411c4a6c138b798c0ecef88b"

RPROVIDES:${PN} += "cmake(Qt6StateMachineQml) pkgconfig(Qt6StateMachineQml) qt6-statemachineqml-devel qt6-statemachineqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6StateMachine) libQt6StateMachineQml6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6StateMachine)"

inherit rpm
