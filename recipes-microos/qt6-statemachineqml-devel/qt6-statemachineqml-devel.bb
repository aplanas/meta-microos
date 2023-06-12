SUMMARY = "Qt 6 StateMachineQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 StateMachineQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-statemachineqml-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8d25248cd5cbf439f2d2d7be5afd11a2f42fa38ab0e3f0f17b7bfab663d4f7ccc52cec25c838432363a3a29dcae7f99afc637d19b9888edfdc44dfaabf335aa5"

RPROVIDES:${PN} += "cmake(Qt6StateMachineQml) \
pkgconfig(Qt6StateMachineQml) \
qt6-statemachineqml-devel \
qt6-statemachineqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6StateMachine) \
libQt6StateMachineQml6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6StateMachine)"

inherit rpm
