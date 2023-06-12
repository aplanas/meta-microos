SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcompletion-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c933d61f6827379fda416accbd65d0077c6ba38e77a92872392f55e25c4bb88a9cc95d9ea5be6fff13c556d73a335a07e74d4af7d717c220ce4909b373794f8f"

RPROVIDES:${PN} += "cmake(KF5Completion) kcompletion-devel kcompletion-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5Completion5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
