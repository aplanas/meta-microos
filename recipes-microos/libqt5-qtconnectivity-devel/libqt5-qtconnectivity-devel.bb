SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package, if you want to compile programs with qtsensors."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtconnectivity-devel-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "350b4a12b30a9848549b82b02f4f572418fd5241d74e1e2754c828cf391667dc2139529d71b7ed53f085668ad5d47c2a4a460bc03dc0d18b9403c9e0c8fb14f3"

RPROVIDES:${PN} += "cmake(Qt5Bluetooth) cmake(Qt5Nfc) libqt5-qtconnectivity-devel libqt5-qtconnectivity-devel(aarch-64) pkgconfig(Qt5Bluetooth) pkgconfig(Qt5Nfc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Bluetooth5 libQt5Nfc5 pkgconfig(Qt5Core)"

inherit rpm
