SUMMARY = "Development Files for liblightdm-qt5-3-0"
DESCRIPTION = "This package contains development files needed for developing \
Qt5-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-qt5-devel-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "d2c240a68045901afc123e6dd8989c68caebaaebe07456f3590bd1d3da2888eb13aa1348b40c9e07f445e8f8488aa817904091b02c6aee501a42fac45d18dfd0"

RPROVIDES:${PN} += "lightdm-qt-devel \
lightdm-qt5-devel \
lightdm-qt5-devel(aarch-64) \
pkgconfig(liblightdm-qt5-3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-qt5-3-0 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
