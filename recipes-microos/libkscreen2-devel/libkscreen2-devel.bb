SUMMARY = "KDE's screen management library (development package)"
DESCRIPTION = "Development files belonging to libkscreen, dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libkscreen2-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "0af7cc113be99b0171d02a660a154c5b61e2368c6bda376996acc0a89c7849671da3d194d9b62b03eba8f752486c19642e292f621e478aca2e9903f61e375e78"

RPROVIDES:${PN} += "cmake(KF5Screen) libkscreen2-devel libkscreen2-devel(aarch-64) pkgconfig(kscreen2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) libKF5Screen8 libKF5ScreenDpms8"

inherit rpm
