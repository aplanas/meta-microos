SUMMARY = "Qt 6 QmlModels library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlworkerscript-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "9acc845da49646dedbf6dce8e0c2ae26333becffe6179962db3da63e3e961f3a1dd6b6cceb5f7847e504769d190a6bbff4c57ae99adb8f96ad1260d1ffd47c53"

RPROVIDES:${PN} += "cmake(Qt6QmlWorkerScript) pkgconfig(Qt6QmlWorkerScript) qt6-qmlworkerscript-devel qt6-qmlworkerscript-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Qml) libQt6QmlWorkerScript6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml)"

inherit rpm
