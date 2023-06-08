SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5ConfigGui5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "98fd92c762ad218512a30cba9e0f4c4fe25a05364b54d7905aff7b5a8245244d636781737500288a85202c30ce20a8f63e3839154a0e336460735ac902717aab"

RPROVIDES:${PN} += "libKF5ConfigGui.so.5()(64bit) libKF5ConfigGui5 libKF5ConfigGui5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui5 libQt5Xml5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
