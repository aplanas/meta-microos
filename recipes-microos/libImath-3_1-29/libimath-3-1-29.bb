SUMMARY = "Vector/matrix library for OpenEXR"
DESCRIPTION = "Vector/matrix library for OpenEXR."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "libImath-3_1-29-3.1.6-1.3.aarch64.rpm"
RPM_HASH = "d393c2fc4ca32051622f2682f9078be158914401772804f471239a4104d11a337a0621d9ad93a1d2ac28746df9aaeb0bd39bde1ad8e86fc10d1f056968d87c84"

RPROVIDES:${PN} += "libImath-3_1-29 libImath-3_1-29(aarch-64) libImath-3_1.so.29()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
