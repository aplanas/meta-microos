SUMMARY = "Include headers and Qt Designer plugin for Qwt(Qt5)"
DESCRIPTION = "This package contains the header files of Qwt and its Qt designer plugin \
in order to create Qt applications using the Qwt(Qt5) widgets."
LICENSE = "SUSE-QWT-1.0"

PV = "6.2.0"

RPM_NAME = "qwt6-qt5-devel-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "b3aa7b606aa35017722d2fd518512dcc92c6c0645d02eb569925b7446c1122d1c81a3d628c54d2f2aed03aa512c9127a130995ff4ebc30665e842bbc783ce3a6"

RPROVIDES:${PN} += "pkgconfig(Qt5Qwt6) qwt-qt5-devel qwt6-qt5-devel qwt6-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config freetype2-devel gcc-c++ libqwt6-qt5-6_2 pkgconfig(Qt5Concurrent) pkgconfig(Qt5OpenGL) pkgconfig(Qt5PrintSupport) pkgconfig(Qt5Svg) pkgconfig(Qt5Widgets) pkgconfig(libpng)"

inherit rpm
