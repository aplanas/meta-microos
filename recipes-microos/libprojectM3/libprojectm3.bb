SUMMARY = "Run-time library for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "libprojectM3-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "98b2d4fb91c55745939dfe41e7ae0d44f9cd478793a9a37ae7fd23261dda75c9dcf0d7c84d695b9525b8c4c91260f5e47825838b28b13634a32cd81473e8fd0c"

RPROVIDES:${PN} += "libprojectM-qt5-3 libprojectM.so.3()(64bit) libprojectM3 libprojectM3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
