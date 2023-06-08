SUMMARY = "Qt interface for the SANE library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "libKSaneCore1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "63f5ee247e1c19d31923aa81a1f7c1143096d27c575f0647806cf182ea1c3d17bb3e2c0224545e0b6ed83384a918fef11d40b3a0a0691c4b4c4c920daf3e131a"

RPROVIDES:${PN} += "ksanecore libKSaneCore.so.1()(64bit) libKSaneCore1 libKSaneCore1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsane.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
