SUMMARY = "C bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecppc3-2.7.0-2.12.aarch64.rpm"
RPM_HASH = "a50d351c3a92e22f4fa13ad8015f2d5d67c21cef32ce90896ad731fbe5f109819b38ff1dbc12a75db513dbe7e74dcb74d3a33a931336795042623f6eab53e3db"

RPROVIDES:${PN} += "libframecppc.so.3()(64bit) libframecppc3 libframecppc3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libframecpp.so.12()(64bit) libframecpp3.so.6()(64bit) libframecpp4.so.8()(64bit) libframecpp6.so.8()(64bit) libframecpp7.so.4()(64bit) libframecpp8.so.7()(64bit) libframecppcmn.so.11()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libldastoolsal.so.7()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
