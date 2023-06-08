SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Pty5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "ef22db2e7e0e6818ca0385dee5346d79f30efdf28334d8896aad689ba82ead4e447b18d7a0a4f5774267f8e25f374ffbfe8df221f0007b84b3f6ec04bbcea98f"

RPROVIDES:${PN} += "libKF5Pty.so.5()(64bit) libKF5Pty5 libKF5Pty5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
