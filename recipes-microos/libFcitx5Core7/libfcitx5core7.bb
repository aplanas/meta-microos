SUMMARY = "Core library for fcitx5"
DESCRIPTION = "This package provides core libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.21"

RPM_NAME = "libFcitx5Core7-5.0.21-1.3.aarch64.rpm"
RPM_HASH = "196c0a2254c2aca508e760f5edbc79dbd1b9795aabe72cbadfae8c00ff8561eb97303273627a2476093ac5b54aa354d91c8772251038c2bd2a482d9ad7f75cae"

RPROVIDES:${PN} += "libFcitx5Core.so.7()(64bit) libFcitx5Core5 libFcitx5Core7 libFcitx5Core7(aarch-64) libfcitx-4_2_9 libfcitx-core0"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
