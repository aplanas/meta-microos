SUMMARY = "Library for system monitoring plugins for KSystemStats"
DESCRIPTION = "This library is used by plugins for KSystemStats, a system monitoring daemon."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libKSysGuardSystemStats1-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "3925384289c95a10dbfef2d1895aa7ec902e77be6c8abf07fe1cbf5050c9a634d5a10f91e0d8737a110cad56706c1324bb16c4eccaf7cd8da01df379ab270fe3"

RPROVIDES:${PN} += "libKSysGuardSystemStats.so.1()(64bit) libKSysGuardSystemStats1 libKSysGuardSystemStats1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ksysguardsystemstats-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsensors.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
