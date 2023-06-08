SUMMARY = "Qt 6 ChartsQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-chartsqml-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "9f97d876b1a2da876dcd0416cfb7842b5952300fee36d8a824017466026a56e7b3c985f69df21e563eb062362bccf3702a6ffbb63205b46ae4c591a4fe75d45e"

RPROVIDES:${PN} += "cmake(Qt6ChartsQml) pkgconfig(Qt6ChartsQml) qt6-chartsqml-devel qt6-chartsqml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Charts) cmake(Qt6OpenGL) cmake(Qt6Qml) cmake(Qt6Quick) libQt6ChartsQml6 pkgconfig(Qt6Charts) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6OpenGL) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
