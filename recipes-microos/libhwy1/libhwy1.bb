SUMMARY = "Efficient and performance-portable SIMD"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libhwy1-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "a19605d41b65ef137f0a6391d3f310402edf26ffe4cd78dbd511f3d7e938cdf7de1042ccfffbfe94e356ea79ee77a311ace1500c4606ffd6dc9ace7912390557"

RPROVIDES:${PN} += "libhwy.so.1()(64bit) libhwy.so.1(HWY_0)(64bit) libhwy1 libhwy1(aarch-64) libhwy_contrib.so.1()(64bit) libhwy_contrib.so.1(HWY_0)(64bit) libhwy_test.so.1()(64bit) libhwy_test.so.1(HWY_0)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.25)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit)"

inherit rpm
