SUMMARY = "Examples for the qt6-webchannel modules"
DESCRIPTION = "Examples for the qt6-webchannel modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webchannel-examples-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "44069777af2631f30622e25e76fa8c2e09c3258025c7726409992c00f69a79a28534036448c28fe4e743c526e605b1aabc773ec587ae802eca29adb555eed34b"

RPROVIDES:${PN} += "qt6-webchannel-examples qt6-webchannel-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6WebChannel.so.6()(64bit) libQt6WebChannel.so.6(Qt_6)(64bit) libQt6WebSockets.so.6()(64bit) libQt6WebSockets.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
