SUMMARY = "YUV scaling and conversion library"
DESCRIPTION = "libyuv is an open source project that includes YUV scaling and conversion functionality."
LICENSE = "BSD-3-Clause"

PV = "20220920+f9fda6e"

RPM_NAME = "libyuv0-20220920+f9fda6e-1.3.aarch64.rpm"
RPM_HASH = "911c6a2f2af9141f6d719be3e10501631aa6af17a18e51b64e1e8c5353c63acac5d8ce441a5aaf1d343dfcb891bd21b5a7f4ccd500f7015422170c959054cc8d"

RPROVIDES:${PN} += "libyuv.so.0()(64bit) libyuv0 libyuv0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
