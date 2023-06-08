SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-sensorsquick-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "fbaad425f1d6bb696104769380ca420acad7e7e45901ad6f604121534e1e49f5fd9a9b90b6df6ed3ca7063d7984c87f1d5354d5b4e536cb7e4d8bbfaff876152"

RPROVIDES:${PN} += "cmake(Qt6SensorsQuick) pkgconfig(Qt6SensorsQuick) qt6-sensorsquick-devel qt6-sensorsquick-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Sensors) libQt6SensorsQuick6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6Sensors)"

inherit rpm
