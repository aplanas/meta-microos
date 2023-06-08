SUMMARY = "Boost.Math runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_math1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "511270cd331f7fdfefd7a8b7b9c6eaab96f676572f36106f27f4f07057943b6341ccd652044f41fb7d06b5153adb84e8595117dda5528dde00e5266d301a7b69"

RPROVIDES:${PN} += "libboost_math1_82_0 libboost_math1_82_0(aarch-64) libboost_math_c99.so.1.82.0()(64bit) libboost_math_c99f.so.1.82.0()(64bit) libboost_math_c99l.so.1.82.0()(64bit) libboost_math_tr1.so.1.82.0()(64bit) libboost_math_tr1f.so.1.82.0()(64bit) libboost_math_tr1l.so.1.82.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
