SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp7-4-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "acd0b895842cad85420e3b0d635735ddd287bd523f74b3a03337184278c415fd9623436edb664a89e7fd98ce8649fe540b6d3a2b7ada999012ed16d21c65dda1"

RPROVIDES:${PN} += "libframecpp7-4 libframecpp7-4(aarch-64) libframecpp7.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libframecpp3.so.6()(64bit) libframecpp4.so.8()(64bit) libframecpp6.so.8()(64bit) libframecppcmn.so.11()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libldastoolsal.so.7()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
