SUMMARY = "C++ API for the CoreSight Trace Decode library"
DESCRIPTION = "C++ API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd1-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "4d2ba60a67b48d590b331db6a56397684f05c2db830191fd88d26e2b8fe04c6e7bd0bb9ed4f57cf551a771b49cebc16a0e4cbde4e6377999c5a7569d436983a3"

RPROVIDES:${PN} += "libopencsd.so.1()(64bit) libopencsd1 libopencsd1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
