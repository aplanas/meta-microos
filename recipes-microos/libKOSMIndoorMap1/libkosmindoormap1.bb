SUMMARY = "OSM multi-floor indoor map renderer"
DESCRIPTION = "OSM multi-floor indoor map renderer library."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.0"

RPM_NAME = "libKOSMIndoorMap1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e37f4e9cdd601e7993490b9e38d84fa5ee38879092f818c78205856621e52ba8f9c5500b863f4d10f48f90bb1dfe93371e4236d8a1419243dcb666029fc40670"

RPROVIDES:${PN} += "libKOSMIndoorMap.so.1()(64bit) libKOSMIndoorMap1 libKOSMIndoorMap1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKOSM.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
