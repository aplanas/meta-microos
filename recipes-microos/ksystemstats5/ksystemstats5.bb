SUMMARY = "Plugin based system monitoring daemon"
DESCRIPTION = "KSystemStats is a daemon that collects statistics about the running system."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "ksystemstats5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "950eb07b4911a389ce2ce8598d434bf9ab0708487aae24a0e66cd9cbf8a35728163820105299a3441fb53a4fe7a69e5af2d59a41da950f8c94711c66923020bf"

RPROVIDES:${PN} += "ksystemstats5 ksystemstats5(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5NetworkManagerQt.so.6()(64bit) libKF5Solid.so.5()(64bit) libKSysGuardFormatter.so.1()(64bit) libKSysGuardSystemStats.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit) libsensors.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
