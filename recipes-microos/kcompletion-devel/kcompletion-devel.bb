SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kcompletion-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "eae9c3fa0767ab80334f9c131d6dd5d2675c729517a3f48d8a9f62099925b4b96927299c9885de64a7ac9131dbfafe85f683f7db2d6f9c11410c5cbb55a9f3c9"

RPROVIDES:${PN} += "cmake(KF5Completion) kcompletion-devel kcompletion-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5Completion5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
