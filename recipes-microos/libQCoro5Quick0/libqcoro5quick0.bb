SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libQCoro5Quick0-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "3a09ef71e8d8768d81f013090f196b7f9f50d187597f186d8a75f1730fe13a97b8eba454e76043cc2d6ada55600d9f636d60c299452f74f08cac002258fcc99d"

RPROVIDES:${PN} += "libQCoro5Quick.so.0()(64bit) libQCoro5Quick0 libQCoro5Quick0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
