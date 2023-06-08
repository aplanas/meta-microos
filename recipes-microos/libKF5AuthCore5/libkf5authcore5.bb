SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5AuthCore5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "1fc9a1808140628232ca5e0beb5c7fd32056dfacf6e406890d289002d3aa458cafdf58e642360a28a433226f003ce03bdb6238269ce5e43d9715a2e3d1e0045a"

RPROVIDES:${PN} += "libKF5AuthCore.so.5()(64bit) libKF5AuthCore5 libKF5AuthCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
