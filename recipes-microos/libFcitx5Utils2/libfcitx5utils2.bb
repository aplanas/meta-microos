SUMMARY = "Utility library for fcitx5"
DESCRIPTION = "This package provides utility libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.21"

RPM_NAME = "libFcitx5Utils2-5.0.21-1.3.aarch64.rpm"
RPM_HASH = "063f841af57e817ad7528c42870c3b6676bd5e4a739524ed9c7eff717a552b4af9b86500299c8376e5268613b879c2b1fd57931a94227934ed25b252d4fa46b5"

RPROVIDES:${PN} += "libFcitx5Utils.so.2()(64bit) libFcitx5Utils1 libFcitx5Utils2 libFcitx5Utils2(aarch-64) libfcitx-utils0"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_222)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit)"

inherit rpm
