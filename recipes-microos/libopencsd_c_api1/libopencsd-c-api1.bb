SUMMARY = "C API for the CoreSight Trace Decode library"
DESCRIPTION = "C API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd_c_api1-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "175a1199f37779f26d029e5512098828dc070908c36eec648bed40bb63a3474cfe23eaac209b5d00c7fd228a914afaa1c801dbe2eb09053c3af698e32b089618"

RPROVIDES:${PN} += "libopencsd_c_api.so.1()(64bit) libopencsd_c_api1 libopencsd_c_api1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libopencsd.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
