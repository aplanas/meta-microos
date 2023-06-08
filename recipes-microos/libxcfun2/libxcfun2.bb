SUMMARY = "Exchange-correlation functionals with arbitrary-order derivatives"
DESCRIPTION = "XCFun is a library of exchange-correlation (XC) functionals to be used in \
density-functional theory (DFT) codes."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "libxcfun2-2.1.1-1.10.aarch64.rpm"
RPM_HASH = "2cc67d024eeefa67c6d2df6c97c0599ebcaf4182190c4c6bbd0c4343979b4c608ed0477509d4b1e8ed904690a95633170d9fb45b1fbb8de594188cac2bf11914"

RPROVIDES:${PN} += "libxcfun.so.2()(64bit) libxcfun2 libxcfun2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
