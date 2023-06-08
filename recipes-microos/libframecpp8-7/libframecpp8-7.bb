SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp8-7-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "e6b58905aa2488902e78b7d208cbf7fb6898bdaed1bfd22d6fc058e3adf2d8819f0498e850893e7b3927f62be39d8f9e51f93e28c16d274a7dd12ad706920c8f"

RPROVIDES:${PN} += "libframecpp8-7 libframecpp8-7(aarch-64) libframecpp8.so.7()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libframecpp3.so.6()(64bit) libframecpp4.so.8()(64bit) libframecpp6.so.8()(64bit) libframecpp7.so.4()(64bit) libframecppcmn.so.11()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libldastoolsal.so.7()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
