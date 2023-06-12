SUMMARY = "YUV scaling and conversion library"
DESCRIPTION = "libyuv is a project for YUV image scaling and conversion."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv0-20230517+a377993-1.1.aarch64.rpm"
RPM_HASH = "141e2c27112b56af6f16e772d51d1e879b2722309e752bbcb406442fbc460274a625eb504a6d0fcf95b070ffa6abf110041646ff865ae8b12379d13fe6147a10"

RPROVIDES:${PN} += "libyuv.so.0()(64bit) libyuv0 libyuv0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
