SUMMARY = "libkdepim library"
DESCRIPTION = "The libkdepim library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Libkdepim5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0babbbb847c51689e6c71e74805c41a7dbac8d32169239f9b1bbc48cf65cac63566d17e9653c05ceabe14efe3132099d440048e030a4c97aa2ee468d88365de6"

RPROVIDES:${PN} += "libKPim5Libkdepim.so.5()(64bit) libKPim5Libkdepim5 libKPim5Libkdepim5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkdepim libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
