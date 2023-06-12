SUMMARY = "LeechCraft Task Progress Indicator Module"
DESCRIPTION = "This package provides a Task Progress Indicator quark plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tpi-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "79bfca4481cf5bcb155bc9cf7bca52c93c0fad601ef1006ab70101fccdf29a7fff85dadd2dc54e660397f2aa0d3cc293a3cbf1a8189069e1b0a812f81b2f4b3c"

RPROVIDES:${PN} += "leechcraft-tpi \
leechcraft-tpi(aarch-64) \
libleechcraft_tpi.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
