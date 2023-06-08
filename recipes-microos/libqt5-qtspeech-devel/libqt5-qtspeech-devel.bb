SUMMARY = "Development files for the Qt5 Speech library"
DESCRIPTION = "You need this package if you want to compile programs with qtspeech."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-devel-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "9ff9984ff7cc0d54a1416769a64af3e1dd1f6c9147d40e32b67d64f1f8230615a43d94dacbdc0ebb5363cf037c8090e3493c92e7a8d507f5f3f31333eb6cd42e"

RPROVIDES:${PN} += "cmake(Qt5TextToSpeech) libqt5-qtspeech-devel libqt5-qtspeech-devel(aarch-64) pkgconfig(Qt5TextToSpeech)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5TextToSpeech5 pkgconfig(Qt5Core)"

inherit rpm
