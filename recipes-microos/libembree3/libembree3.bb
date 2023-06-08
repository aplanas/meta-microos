SUMMARY = "Shared library providing Embree raytracing kernels"
DESCRIPTION = "Embree is a collection of ray tracing kernels. \
 \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "3.13.5"

RPM_NAME = "libembree3-3.13.5-2.3.aarch64.rpm"
RPM_HASH = "5a04ec0ecdbf64df5437576411fc6febc9da8bce3395402fdc343858abaee7d1d9fc32c975cd1fb3504957a03dd6077e57cfb2f60b3e1c6c291e381f53603ff5"

RPROVIDES:${PN} += "libembree3 libembree3(aarch-64) libembree3.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
